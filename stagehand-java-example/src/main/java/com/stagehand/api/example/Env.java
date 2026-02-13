package com.stagehand.api.example;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

final class Env {
    private static final String[] REQUIRED_KEYS = {
        "STAGEHAND_API_URL", "MODEL_API_KEY", "BROWSERBASE_API_KEY", "BROWSERBASE_PROJECT_ID",
    };

    private Env() {}

    static void load() {
        java.nio.file.Path envPath = findEnvPath();
        if (envPath == null) {
            throw new IllegalStateException("Missing examples/.env (expected in repo examples/ directory).");
        }

        try {
            for (String line : Files.readAllLines(envPath)) {
                String trimmed = line.trim();
                if (trimmed.isEmpty() || trimmed.startsWith("#")) {
                    continue;
                }
                String[] parts = trimmed.split("=", 2);
                if (parts.length != 2) {
                    continue;
                }
                String key = parts[0];
                String value = parts[1];
                switch (key) {
                    case "BROWSERBASE_API_KEY":
                        System.setProperty("stagehand.browserbaseApiKey", value);
                        break;
                    case "BROWSERBASE_PROJECT_ID":
                        System.setProperty("stagehand.browserbaseProjectId", value);
                        break;
                    case "MODEL_API_KEY":
                        System.setProperty("stagehand.modelApiKey", value);
                        break;
                    case "STAGEHAND_API_URL":
                        System.setProperty("stagehand.baseUrl", value);
                        break;
                    default:
                        break;
                }
            }
        } catch (Exception e) {
            throw new IllegalStateException("Failed to read examples/.env: " + e.getMessage(), e);
        }

        List<String> missing = new ArrayList<>();
        for (String key : REQUIRED_KEYS) {
            if (System.getProperty(mapKey(key)) == null) {
                missing.add(key);
            }
        }
        if (!missing.isEmpty()) {
            throw new IllegalStateException(
                    "Missing required env vars: " + String.join(", ", missing) + " (from examples/.env)");
        }
    }

    private static String mapKey(String key) {
        switch (key) {
            case "BROWSERBASE_API_KEY":
                return "stagehand.browserbaseApiKey";
            case "BROWSERBASE_PROJECT_ID":
                return "stagehand.browserbaseProjectId";
            case "MODEL_API_KEY":
                return "stagehand.modelApiKey";
            case "STAGEHAND_API_URL":
                return "stagehand.baseUrl";
            default:
                return key;
        }
    }

    private static java.nio.file.Path findEnvPath() {
        java.nio.file.Path current = Paths.get(System.getProperty("user.dir"));
        while (true) {
            java.nio.file.Path candidate = current.resolve("examples").resolve(".env");
            if (Files.exists(candidate)) {
                return candidate;
            }
            java.nio.file.Path parent = current.getParent();
            if (parent == null) {
                return null;
            }
            current = parent;
        }
    }
}

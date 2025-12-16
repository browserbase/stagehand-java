plugins {
    `maven-publish`
    signing
}

configure<PublishingExtension> {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("Stagehand P2P Server API")
                description.set("HTTP API for remote Stagehand browser automation. This API allows clients to\nconnect to a Stagehand server and execute browser automation tasks remotely.\n\nAll endpoints except /sessions/start require an active session ID. Responses are\nstreamed using Server-Sent Events (SSE) when the `x-stream-response: true`\nheader is provided.")
                url.set("https://browserbase.com")

                licenses {
                    license {
                        name.set("Apache-2.0")
                    }
                }

                developers {
                    developer {
                        name.set("Stagehand")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/browserbase/stagehand-java.git")
                    developerConnection.set("scm:git:git://github.com/browserbase/stagehand-java.git")
                    url.set("https://github.com/browserbase/stagehand-java")
                }

                versionMapping {
                    allVariants {
                        fromResolutionResult()
                    }
                }
            }
        }
    }
}

signing {
    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")?.ifBlank { null }
    val signingKey = System.getenv("GPG_SIGNING_KEY")?.ifBlank { null }
    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")?.ifBlank { null }
    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(
            signingKeyId,
            signingKey,
            signingPassword,
        )
        sign(publishing.publications["maven"])
    }
}

tasks.named("publish") {
    dependsOn(":closeAndReleaseSonatypeStagingRepository")
}

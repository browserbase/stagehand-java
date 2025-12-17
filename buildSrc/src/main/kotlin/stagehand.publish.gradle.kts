plugins {
    `maven-publish`
    signing
}

configure<PublishingExtension> {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("Stagehand API")
                description.set("Stagehand SDK for AI browser automation [ALPHA].")
                url.set("https://docs.stagehand.dev")

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

import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.KotlinJvm
import com.vanniktech.maven.publish.MavenPublishBaseExtension
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("com.vanniktech.maven.publish")
}

publishing {
  repositories {
      if (project.hasProperty("publishLocal")) {
          maven {
              name = "LocalFileSystem"
              url = uri("${rootProject.layout.buildDirectory.get()}/local-maven-repo")
          }
      }
  }
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

extra["signingInMemoryKey"] = System.getenv("GPG_SIGNING_KEY")
extra["signingInMemoryKeyId"] = System.getenv("GPG_SIGNING_KEY_ID")
extra["signingInMemoryKeyPassword"] = System.getenv("GPG_SIGNING_PASSWORD")

configure<MavenPublishBaseExtension> {
    if (!project.hasProperty("publishLocal")) {
        signAllPublications()
        publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    }

    coordinates(project.group.toString(), project.name, project.version.toString())
    configure(
        KotlinJvm(
            javadocJar = JavadocJar.Dokka("dokkaJavadoc"),
            sourcesJar = true,
        )
    )

    pom {
        name.set("Stagehand API")
        description.set("Stagehand SDK for AI browser automation [ALPHA]. This API allows clients to\nexecute browser automation tasks remotely on the Browserbase cloud.\n\nAll endpoints except /sessions/start require an active session ID. Responses are\nstreamed using Server-Sent Events (SSE) when the `x-stream-response: true`\nheader is provided.\n\nThis SDK is currently ALPHA software and is not production ready! Please try it\nand give us your feedback, stay tuned for upcoming release announcements!")
        url.set("https://docs.stagehand.dev")

        licenses {
            license {
                name.set("MIT")
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
    }
}

tasks.withType<Zip>().configureEach {
    isZip64 = true
}

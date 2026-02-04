import dev.kord.x.emoji.EmojiPlugin

version = Library.version
group = Library.group

plugins {
    kotlin("jvm") version Versions.kotlin

    signing
    `maven-publish`
    id("com.vanniktech.maven.publish") version "0.36.0"
}

repositories {
    mavenCentral()
    maven("https://oss.sonatype.org/content/repositories/snapshots")

}

dependencies {
    implementation("dev.kord:kord-core:${Versions.kordRange}") {
        /*
        version {
            prefer("latest.integration")
        }
         */
    }

    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

kotlin {
    explicitApi()
}

apply<EmojiPlugin>()

val sourcesJar by tasks.registering(Jar::class) {
    archiveClassifier.set("sources")
    from(sourceSets.main.get().allSource)
}

val javadocJar by tasks.registering(Jar::class) {
    group = JavaBasePlugin.DOCUMENTATION_GROUP
    archiveClassifier.set("javadoc")
}

tasks.withType<PublishToMavenRepository>().configureEach {
    doFirst { require(!Library.isUndefined) { "No release/snapshot version found." } }
}

mavenPublishing {
    coordinates(Library.group, Library.name, Library.version)

    publishToMavenCentral()
    signAllPublications()

    pom {
        name = Library.name
        description = Library.description
        url = Library.projectUrl

        organization {
            name = "Kord"
            url = "https://github.com/kordlib"
        }

        developers {
            developer {
                name = "The Kord Team"
            }
        }

        issueManagement {
            system = "GitHub"
            url = "https://github.com/kordlib/kordx.emoji/issues"
        }

        licenses {
            license {
                name = "MIT"
                url = "https://opensource.org/license/MIT"
            }
        }

        scm {
            connection = "scm:git:ssh://github.com/kordlib/kordx.emoji.git"
            developerConnection = "scm:git:ssh://git@github.com:kordlib/kordx.emoji.git"
            url = Library.projectUrl
        }
    }
}

publishing {
    repositories {
        maven {
            url = uri("https://maven.pkg.github.com/kordlib.kordx.emoiji")

            credentials {
                username = System.getenv("GITHUB_USERNAME")
                password = System.getenv("GITHUB_PASSWORD")
            }
        }
    }
}
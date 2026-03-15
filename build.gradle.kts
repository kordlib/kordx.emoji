import dev.kord.x.emoji.EmojiPlugin

version = Library.version
group = Library.group

plugins {
    kotlin("jvm") version Versions.kotlin
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
    jvmToolchain(11)
}

apply<EmojiPlugin>()

mavenPublishing {
    coordinates(Library.group, Library.name, Library.version)

    publishToMavenCentral(automaticRelease = true)
    signAllPublications()

    pom {
        name.set(Library.name)
        description.set(Library.description)
        url.set(Library.projectUrl)

        organization {
            name.set("Kord")
            url.set(Library.projectUrl)
        }

        developers {
            developer {
                name.set("The Kord Team")
            }
        }

        issueManagement {
            system.set("GitHub")
            url.set("${Library.projectUrl}/issues")
        }

        licenses {
            license {
                name.set("MIT")
                url.set("https://opensource.org/licenses/MIT")
            }
        }
        scm {
            connection.set("scm:git:ssh://github.com/kordlib/kordx.emoji.git")
            developerConnection.set("scm:git:ssh://git@github.com:kordlib/kordx.emoji.git")
            url.set(Library.projectUrl)
        }
    }
}

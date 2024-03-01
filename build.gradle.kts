import java.util.*

version = Library.version
group = Library.group

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    signing
    `maven-publish`
    dev.kord.x.emoji
}

repositories {
    mavenCentral()
    maven("https://oss.sonatype.org/content/repositories/snapshots")
}

kotlin {
    explicitApi()
    jvm()
    js(IR) {
        nodejs()
    }
    jvmToolchain(8)

    linuxX64()

    mingwX64()

    macosArm64()
    macosX64()

    iosArm64()
    iosX64()
     iosSimulatorArm64()

    watchosArm64()
    watchosSimulatorArm64()

    tvosX64()
    tvosArm64()
    tvosSimulatorArm64()
}

publishing {
    publications {
        withType<MavenPublication> {
            pom {
                name = Library.name
                description = Library.description
                url = Library.description

                organization {
                    name = "Kord"
                    url = Library.projectUrl
                }

                developers {
                    developer {
                        name = "The Kord Team"
                    }
                }

                issueManagement {
                    system = "GitHub"
                    url = "${Library.projectUrl}/issues"
                }

                licenses {
                    license {
                        name = "MIT"
                        url = "https://opensource.org/licenses/MIT"
                    }
                }
                scm {
                    connection = "scm:git:ssh://github.com/kordlib/kordx.emoji.git"
                    developerConnection = "scm:git:ssh://git@github.com:kordlib/kord.emoji.git"
                    url = Library.projectUrl
                }
            }
        }

        repositories {
            maven {
                url = if (Library.isSnapshot) uri(Repo.snapshotsUrl)
                else uri(Repo.releasesUrl)

                credentials {
                    username = System.getenv("NEXUS_USER")
                    password = System.getenv("NEXUS_PASSWORD")
                }
            }
        }
    }
}

signing {
    val signingKey = findProperty("signingKey")?.toString()
    val signingPassword = findProperty("signingPassword")?.toString()
    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(
            Base64.getDecoder().decode(signingKey).decodeToString(),
            signingPassword
        )

        publishing.publications.withType<MavenPublication> {
            sign(this)
        }
    }
}

dependencies {
    commonMainImplementation(libs.kord.core) {
        exclude(module = "kord-ksp-annotations")
    }
    commonTestImplementation(kotlin("test"))
}

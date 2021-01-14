import dev.kord.x.emoji.EmojiPlugin
import org.apache.commons.codec.binary.Base64

version = Versions.project
group = Library.group

plugins {
    kotlin("jvm") version Versions.kotlin

    signing
    `maven-publish`
    id("io.codearte.nexus-staging") version "0.22.0"
}

repositories {
    mavenCentral()
    maven(url = "https://dl.bintray.com/kordlib/Kord")
}

dependencies {
    implementation("dev.kord:kord-core:${Versions.kordRange}") {
        version {
            prefer("latest.release")
        }
    }

    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

tasks.compileKotlin {
    kotlinOptions.jvmTarget = "1.8"
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

publishing {
    publications {
        create<MavenPublication>(Library.name) {
            from(components["kotlin"])
            groupId = Library.group
            artifactId = "kord-${project.name}"
            version = Library.version

            artifact(sourcesJar.get())

            pom {
                name.set(Library.name)
                description.set(Library.description)
                url.set(Library.description)

                organization {
                    name.set("Kord")
                    url.set(Library.url)
                }

                developers {
                    developer {
                        name.set("The Kord Team")
                    }
                }

                issueManagement {
                    system.set("GitHub")
                    url.set("${Library.url}/issues")
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
                    url.set(Library.url)
                }
            }

            if (!isJitPack) {
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
    }

}

if (!isJitPack && Library.isRelease) {
    signing {
        val signingKey = findProperty("signingKey")?.toString()
        val signingPassword = findProperty("signingPassword")?.toString()
        if (signingKey != null && signingPassword != null) {
            useInMemoryPgpKeys(String(Base64().decode(signingKey.toByteArray())), signingPassword)
        }
        sign(publishing.publications[Library.name])
    }
}


nexusStaging { }
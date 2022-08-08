import dev.kord.x.emoji.EmojiPlugin
import org.apache.commons.codec.binary.Base64

version = Library.version
group = Library.group

subprojects {
    apply(plugin = "org.jetbrains.dokka")
}
plugins {
    kotlin("jvm") version Versions.kotlin
    id("org.jetbrains.dokka") version "1.4.30"
    signing
    `maven-publish`
    id("io.codearte.nexus-staging") version "0.22.0"
}

repositories {
    mavenCentral()
    jcenter()
    maven("https://oss.sonatype.org/content/repositories/snapshots")

}

dependencies {
    implementation("dev.kord:kord-core:${Versions.kordRange}")

    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

tasks.compileKotlin {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.dokkaHtml.configure {
    this.outputDirectory.set(file("${project.projectDir}/dokka/kord/"))

    dokkaSourceSets {
        configureEach {
            platform.set(org.jetbrains.dokka.Platform.jvm)

            sourceLink {
                localDirectory.set(file("src/main/kotlin"))
                remoteUrl.set(uri("https://github.com/kordlib/kordx.emoji/tree/master/${project.name}/src/main/kotlin/").toURL())

                remoteLineSuffix.set("#L")
            }

            jdkVersion.set(8)
        }
    }
}

apply<EmojiPlugin>()

val sourcesJar by tasks.registering(Jar::class) {
    archiveClassifier.set("sources")
    from(sourceSets.main.get().allSource)
}

val dokkaJar by tasks.registering(Jar::class) {
    group = JavaBasePlugin.DOCUMENTATION_GROUP
    description = "Assembles Kotlin docs with Dokka"
    archiveClassifier.set("javadoc")
    from(tasks.dokkaHtml)
    dependsOn(tasks.dokkaHtml)
}

tasks.withType<PublishToMavenRepository>().configureEach {
    doFirst { require(!Library.isUndefined) { "No release/snapshot version found." } }
}

publishing {
    publications {
        create<MavenPublication>(Library.name) {
            from(components["kotlin"])
            groupId = Library.group
            artifactId = Library.name
            version = Library.version

            artifact(sourcesJar.get())
            artifact(dokkaJar.get())

            pom {
                name.set(Library.name)
                description.set(Library.description)
                url.set(Library.description)

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
tasks {
    val dokkaOutputDir = "${rootProject.projectDir}/dokka"

    val clean = getByName("clean", Delete::class) {
        delete(rootProject.buildDir)
        delete(dokkaOutputDir)
    }
}

nexusStaging { }

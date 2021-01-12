import dev.kord.x.emoji.EmojiPlugin
import org.apache.commons.codec.binary.Base64

version = Versions.project
group = Project.group

plugins {
    kotlin("jvm") version Versions.kotlin
    id("com.jfrog.bintray") version "1.8.5"
    id("com.github.johnrengelman.shadow") version "6.1.0"

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
        create<MavenPublication>(Project.name) {
            from(components["kotlin"])
            groupId = Project.group
            artifactId = Project.name
            version = Versions.project

            artifact(sourcesJar.get())
            artifact(javadocJar.get())

            pom {
                name.set(Project.name)
                description.set(Project.description)
                url.set(Project.description)

                organization {
                    name.set("Kord")
                    url.set(Project.url)
                }

                developers {
                    developer {
                        name.set("The Kord Team")
                    }
                }

                issueManagement {
                    system.set("GitHub")
                    url.set("${Project.url}/issues")
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
                    url.set(Project.url)
                }
            }
        }
    }
}

bintray {
    user = System.getenv("BINTRAY_USER")
    key = System.getenv("BINTRAY_KEY")
    setPublications("kordxemoji")
    publish = true

    pkg = PackageConfig().apply {
        repo = "Kord"
        name = "kordx.emoji"
        userOrg = "kordlib"
        setLicenses("MIT")
        vcsUrl = "${Project.url}.git"
        websiteUrl = Project.url
        issueTrackerUrl = "${Project.url}/issues"

        version = VersionConfig().apply {
            name = Versions.project
            desc = Project.description
            vcsTag = Versions.project
        }
    }
}

if (Versions.isRelease) {
    signing {
        val signingKey = findProperty("signingKey")?.toString()
        val signingPassword = findProperty("signingPassword")?.toString()
        if (signingKey != null && signingPassword != null) {
            useInMemoryPgpKeys(String(Base64().decode(signingKey.toByteArray())), signingPassword)
        }
        sign(publishing.publications[Project.name])
    }
}

nexusStaging { }
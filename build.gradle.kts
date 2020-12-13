import dev.kord.kordx.emoji.EmojiPlugin
import com.jfrog.bintray.gradle.*

version = Project.version
group = Project.group

buildscript {
    repositories {
        mavenCentral()
        maven(url = "https://plugins.gradle.org/m2/")
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}")
        classpath("com.jfrog.bintray.gradle:gradle-bintray-plugin:${Versions.bintray}")
        classpath("com.github.jengelman.gradle.plugins:shadow:6.1.0")
    }
}

plugins {
    kotlin("jvm") version Versions.kotlin
    `maven-publish`
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
apply<BintrayPlugin>()

val sourcesJar by tasks.registering(Jar::class) {
    archiveClassifier.set("sources")
    from(sourceSets.main.get().allSource)
}

configure<PublishingExtension> {
    publications {
        register("kordxemoji", MavenPublication::class) {
            from(components["kotlin"])
            groupId = Project.group
            artifactId = Project.name
            version = Project.version

            artifact(sourcesJar.get())
        }
    }
}

configure<BintrayExtension> {
    user = System.getenv("BINTRAY_USER")
    key = System.getenv("BINTRAY_KEY")
    setPublications("kordxemoji")
    publish = true

    pkg = PackageConfig().apply {
        repo = "Kord"
        name = "kordx.emoji"
        userOrg = "kordlib"
        setLicenses("MIT")
        vcsUrl = "https://gitlab.com/kordlib/kordx.emoji.git"
        websiteUrl = "https://gitlab.com/kordlib/kordx.emoji"
        issueTrackerUrl = "https://gitlab.com/kordlib/kordx.emoji/issues"

        version = VersionConfig().apply {
            name = Project.version
            desc = Project.description
            vcsTag = Project.version
        }
    }
}

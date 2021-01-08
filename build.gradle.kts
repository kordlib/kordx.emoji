import dev.kord.kordx.emoji.EmojiPlugin

version = Versions.project
group = Project.group

plugins {
    kotlin("jvm") version Versions.kotlin
    id("com.jfrog.bintray") version "1.8.5"
    id("com.github.johnrengelman.shadow") version "6.1.0"
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
            version = Versions.project

            artifact(sourcesJar.get())
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
        vcsUrl = "https://gitlab.com/kordlib/kordx.emoji.git"
        websiteUrl = "https://gitlab.com/kordlib/kordx.emoji"
        issueTrackerUrl = "https://gitlab.com/kordlib/kordx.emoji/issues"

        version = VersionConfig().apply {
            name = Versions.project
            desc = Project.description
            vcsTag = Versions.project
        }
    }
}

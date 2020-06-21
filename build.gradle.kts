import com.gitlab.kordlib.kordx.emoji.EmojiPlugin
import com.jfrog.bintray.gradle.BintrayExtension
import com.jfrog.bintray.gradle.BintrayPlugin
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import java.util.Date
import org.gradle.api.tasks.bundling.Jar

version = Project.version
group = Project.group

buildscript {
    repositories {
        jcenter()
        maven(url = "https://plugins.gradle.org/m2/")
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}")
        classpath("com.jfrog.bintray.gradle:gradle-bintray-plugin:${Versions.bintray}")
        classpath("com.github.jengelman.gradle.plugins:shadow:5.1.0")
    }
}

plugins {
    id("org.jetbrains.kotlin.jvm") version Versions.kotlin
    `maven-publish`
}

repositories {
    jcenter()
    maven(url = "https://jitpack.io")
    maven(url = "https://dl.bintray.com/kordlib/Kord")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.gitlab.kordlib.kord:kord-core:${Versions.kordRange}") {
        version {
            prefer("latest.release")
        }
    }

    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "1.8"
    }
}

apply<EmojiPlugin>()
apply<BintrayPlugin>()
apply<MavenPlugin>()

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

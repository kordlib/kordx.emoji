version = Library.version
group = Library.group

plugins {
    kotlin("multiplatform") version "1.8.20"
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

    sourceSets {
        commonMain {
            dependencies {
                implementation("dev.kord:kord-core:0.9.x-SNAPSHOT")
            }
        }
    }
}

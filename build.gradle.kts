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

    sourceSets {
        commonMain {
            dependencies {
                implementation(libs.kord.core)
            }
        }
    }
}

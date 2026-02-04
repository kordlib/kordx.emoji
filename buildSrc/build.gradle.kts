plugins {
    groovy
    `kotlin-dsl`
    kotlin("jvm") version "2.3.0"
    kotlin("plugin.serialization") version "2.3.0"
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.10.0")
    implementation("com.squareup:kotlinpoet:2.2.0")
    implementation("org.apache.commons:commons-text:1.15.0")
}

kotlin {
    //explicitApi()
    compilerOptions {
        freeCompilerArgs.add("-opt-in=kotlin.ExperimentalStdlibApi")
    }
}

import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    groovy
    `kotlin-dsl`
    kotlin("jvm") version "1.7.10"
    kotlin("plugin.serialization") version "1.7.10"
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.3")
    implementation("com.squareup:kotlinpoet:1.12.0")
    implementation("org.apache.commons:commons-text:1.9")
}

kotlin {
    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_1_8)
        freeCompilerArgs.set(listOf("-opt-in=kotlin.ExperimentalStdlibApi"))
    }
}

plugins {
    kotlin("jvm") version "2.3.10"
    kotlin("plugin.serialization") version "2.3.10"
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
    jvmToolchain(11)

    compilerOptions {
        freeCompilerArgs.set(listOf("-opt-in=kotlin.ExperimentalStdlibApi"))
    }
}

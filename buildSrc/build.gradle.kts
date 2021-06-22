plugins {
    groovy
    `kotlin-dsl`
    kotlin("jvm") version "1.5.10"
    kotlin("plugin.serialization") version "1.5.10"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.0.1")
    implementation("com.squareup:kotlinpoet:1.7.2")
    implementation("org.apache.commons:commons-text:1.8")
}

tasks.compileKotlin {
    kotlinOptions {
        jvmTarget = "1.8"
        freeCompilerArgs = listOf("-Xuse-experimental=kotlin.ExperimentalStdlibApi")
    }
}

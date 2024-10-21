plugins {
    `kotlin-dsl`
    alias(libs.plugins.kotlin.plugin.serialization)
}

repositories {
    gradlePluginPortal()
    mavenCentral()
    maven("https://oss.sonatype.org/content/repositories/snapshots/")
}

dependencies {
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.kotlinpoet)
    implementation(libs.codegen.kotlinpoet)
}

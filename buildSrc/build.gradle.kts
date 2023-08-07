plugins {
    `kotlin-dsl`
    alias(libs.plugins.kotlin.plugin.serialization)
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.kotlinpoet)
}

plugins {
    groovy
    `kotlin-dsl`
    kotlin("plugin.serialization") version "1.3.61"
}

repositories {
    jcenter()
}

dependencies {
    implementation(gradleApi())
    implementation(localGroovy())
    implementation(kotlin("gradle-plugin-api", version = "1.3.61"))
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime:0.14.0")
    implementation("com.squareup:kotlinpoet:1.5.0")
    implementation("org.apache.commons:commons-text:1.8")
}

plugins {
    groovy
    `kotlin-dsl`
    kotlin("plugin.serialization") version "1.3.72"
}

repositories {
    jcenter()
}

dependencies {
    implementation(gradleApi())
    implementation(localGroovy())
    implementation(kotlin("gradle-plugin-api", version = "1.3.72"))
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime:0.20.0")
    implementation("com.squareup:kotlinpoet:1.5.0")
    implementation("org.apache.commons:commons-text:1.8")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
        freeCompilerArgs = listOf("-Xuse-experimental=kotlin.ExperimentalStdlibApi")
    }
}

import org.jetbrains.kotlin.gradle.targets.native.tasks.KotlinNativeSimulatorTest
import org.jetbrains.kotlin.konan.target.Family

group = Library.group

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kord.gradle.plugin)
    alias(libs.plugins.maven.publish.plugin)
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

    linuxX64()

    mingwX64()

    macosArm64()
    macosX64()

    iosArm64()
    iosX64()
    iosSimulatorArm64()

    watchosArm64()
    watchosSimulatorArm64()

    tvosX64()
    tvosArm64()
    tvosSimulatorArm64()

    sourceSets {
        commonMain {
            kotlin.srcDir(layout.buildDirectory.dir("generated/commonMain/kotlin"))
        }
    }
}

tasks {
    // CI does not seem to like simulators
    withType<KotlinNativeSimulatorTest> {
        enabled = false
    }
}

mavenPublishing {
    coordinates(artifactId = Library.name)
    publishToMavenCentral()
    signAllPublications()

    pom {
        name = Library.name
        description = Library.description
        url = Library.description

        organization {
            name = "Kord"
            url = Library.projectUrl
        }

        developers {
            developer {
                name = "The Kord Team"
            }
        }

        issueManagement {
            system = "GitHub"
            url = "${Library.projectUrl}/issues"
        }

        licenses {
            license {
                name = "MIT"
                url = "https://opensource.org/licenses/MIT"
            }
        }
        scm {
            connection = "scm:git:ssh://github.com/kordlib/kordx.emoji.git"
            developerConnection = "scm:git:ssh://git@github.com:kordlib/kord.emoji.git"
            url = Library.projectUrl
        }
    }
}

kord {
    publicationName = "mavenCentral"
    metadataHost = Family.OSX
}

dependencies {
    commonMainImplementation(libs.kord.core)
    commonTestImplementation(kotlin("test"))
}

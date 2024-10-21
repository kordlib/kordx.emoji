import org.gradle.kotlin.dsl.assign
import org.gradle.kotlin.dsl.kord
import org.jetbrains.dokka.gradle.workers.ProcessIsolation
import org.jetbrains.kotlin.gradle.targets.native.tasks.KotlinNativeSimulatorTest
import org.jetbrains.kotlin.konan.target.Family
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

group = Library.group

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kord.gradle.plugin)
    alias(libs.plugins.maven.publish.plugin)
    alias(libs.plugins.dokka)
    dev.kord.x.emoji
}

repositories {
    mavenCentral()
    maven("https://oss.sonatype.org/content/repositories/snapshots")
}

kord {
    publicationName = "mavenCentral"
    metadataHost = Family.OSX
    jvmTarget = JvmTarget.JVM_1_8
}

dependencies {
    commonMainImplementation(libs.kord.core)
    commonTestImplementation(kotlin("test"))
}

kotlin {
    explicitApi()
    jvm()
    js(IR) {
        nodejs()
    }

    linuxX64()
    linuxArm64()

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

dokka {
    // Dokka runs out of memory with the default maxHeapSize when ProcessIsolation is used
    (dokkaGeneratorIsolation.get() as? ProcessIsolation)?.maxHeapSize = "1g"

    dokkaSourceSets.configureEach {
        sourceLink {
            localDirectory = project.file("src/main/kotlin")
            remoteUrl = project.uri("https://github.com/kordlib/kordx.emoji/tree/feature/mpp/src/$name/kotlin/")

            remoteLineSuffix = "#L"
        }
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

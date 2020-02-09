plugins {
    id("org.jetbrains.kotlin.jvm") version "1.3.61"
}

repositories {
    jcenter()
    maven(url = "https://jitpack.io")
    maven(url = "https://dl.bintray.com/kordlib/Kord")
}

dependencies {
    implementation("com.gitlab.kordlib.kord:kord-core") {
        version {
            strictly("[0.4.0,0.5.0[")
            prefer("latest.release")
        }
    }
}

allprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    dependencies {
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
        testImplementation("org.jetbrains.kotlin:kotlin-test")
        testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
    }

    tasks {
        withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
            kotlinOptions.jvmTarget = "1.8"
        }
    }

}



apply<com.gitlab.kordlib.kordx.emoji.EmojiPlugin>()
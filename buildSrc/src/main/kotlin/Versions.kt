object Versions {
    const val bintray = "1.8.1"
    const val kotlin = "1.4.21"
    const val kordRange = "0.7.+"
    const val project = "0.5.0-SNAPSHOT"

    val isRelease get() = !project.endsWith("-SNAPSHOT")
}

object Project {
    const val name = "kordx.emoji"
    const val group = "dev.kord"
    const val description = "Discord Emoji constants for Kord"
    const val url = "https://github.com/kordlib/kordx.emoji"
}
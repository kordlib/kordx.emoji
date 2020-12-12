object Versions {
    const val bintray = "1.8.1"
    const val kotlin = "1.4.21"
    const val kordRange = "0.6.+"
}

object Project {
    val version = System.getenv("RELEASE_TAG") ?: System.getenv("GITHUB_SHA") ?:  System.getenv("VERSION") ?: "undefined"
    const val name = "kordx.emoji"
    const val group = "com.gitlab.kordlib"
    const val description = "Discord Emoji constants for Kord"
}
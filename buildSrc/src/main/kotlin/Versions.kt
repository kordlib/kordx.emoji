object Versions {
    const val bintray = "1.8.1"
    const val kotlin = "1.3.61"
    const val kordRange = "[0.4.0,0.5.0["
}

object Project {
    val version = System.getenv("CI_COMMIT_TAG") ?: System.getenv("CI_COMMIT_SHA") ?: "undefined"
    const val name = "kordx.emoji"
    const val group = "com.gitlab.kordlib"
    const val description = "Discord Emoji constants for Kord"
}
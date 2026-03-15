object Versions {
    const val kotlin = "2.3.10"
    const val kordRange = "[0.8,)"
}

object Library {
    const val name = "emoji"
    const val group = "dev.kord.x"
    const val description = "Discord Emoji constants for Kord"
    const val projectUrl = "https://github.com/kordlib/kordx.emoji"

    val version: String
        get() {
            val tag = System.getenv("GITHUB_TAG_NAME")
            val branch = System.getenv("GITHUB_BRANCH_NAME")

            return when {
                !tag.isNullOrBlank() -> tag
                !branch.isNullOrBlank() && branch.startsWith("refs/heads/") ->
                    branch.substringAfter("refs/heads/").replace("/", "-") + "-SNAPSHOT"

                else -> "undefined"
            }
        }
}
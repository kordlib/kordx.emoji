object Library {
    const val name = "emoji"
    const val group = "dev.kord.x"
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
    val isSnapshot: Boolean get() = version.endsWith("-SNAPSHOT")
    const val description = "Discord Emoji constants for Kord"
    const val projectUrl = "https://github.com/kordlib/kordx.emoji"
    /**
     * Whether the current API is considered stable, and should be compared to the 'golden' API dump.
     */
    val isRelease: Boolean get() = !isSnapshot && !isUndefined

    val isUndefined get() = version == "undefined"
}

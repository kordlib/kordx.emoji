object Versions {
    const val bintray = "1.8.1"
    const val kotlin = "1.4.21"
    const val kordRange = "0.7.0-SNAPSHOT"
}

/**
 * whether the process has been invoked by JitPack
 */
val isJitPack get() = "true" == System.getenv("JITPACK")

object Library {
    private const val releaseVersion = "0.5.0-SNAPSHOT"
    val isSnapshot: Boolean get() = releaseVersion.endsWith("-SNAPSHOT")
    val isRelease: Boolean get() = !isSnapshot
    const val name = "emoji"
    const val group = "dev.kord.x"
    val version: String = if (isJitPack) System.getenv("RELEASE_TAG")
    else releaseVersion
    const val url = "https://github.com/kordlib/kordx.emoji"

    const val description = "Discord Emoji constants for Kord"
    const val projectUrl = "https://github.com/kordlib/kordx.emoji"

    val isStableApi: Boolean get() = !isSnapshot
}

object Repo {
    const val releasesUrl = "https://oss.sonatype.org/service/local/staging/deploy/maven2/"
    const val snapshotsUrl = "https://oss.sonatype.org/content/repositories/snapshots/"
}

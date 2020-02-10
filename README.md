# kordx.emoji

[![Discord](https://img.shields.io/discord/556525343595298817.svg?color=&label=Kord&logo=discord&style=for-the-badge)](https://discord.gg/6jcx5ev)
[ ![Download](https://img.shields.io/bintray/v/kordlib/Kord/kordx.emoji?color=&style=for-the-badge) ](https://bintray.com/kordlib/Kord/kordx.emoji/_latestVersion)

An extension library that adds a list of supported emojis to Kord.

```kotlin
suspend fun MessageCreateEvent.handle() {
    if (message.content != "!ping") return

    message.addReaction(Emojis.pingPong)

    message.channel.createMessage("${Emojis.stopwatch} gateway latency is:${kord.gateway.ping.toLongMilliseconds()} ms")
}
```

## Installation

Replace `{version}` with the latest version number on bintray. [ ![Download](https://img.shields.io/bintray/v/kordlib/Kord/kordx.emoji?color=&style=for-the-badge) ](https://bintray.com/kordlib/Kord/kordx.emoji/_latestVersion)

### Gradle

```kotlin
repositories {
 maven(url = "https://dl.bintray.com/kordlib/Kord")
}
```

```kotlin
dependencies {
    implementation("com.gitlab.kordlib:kordx.emoji:{version}")
}
```

### Maven

```xml
<repository>
    <id>bintray</id>
    <url>https://dl.bintray.com/kordlib/Kord</url>
</repository>
```

```xml
<dependency>
    <groupId>com.gitlab.kordlib</groupId>
    <artifactId>kordx.emoji</artifactId>
    <version>{version}</version>
</dependency>
```

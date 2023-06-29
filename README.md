# kordx.emoji

[![Discord](https://img.shields.io/discord/556525343595298817.svg?color=&label=Kord&logo=discord&style=for-the-badge)](https://discord.gg/6jcx5ev)

An extension library that adds a list of supported emojis to Kord.

```kotlin
suspend fun MessageCreateEvent.handle() {
    if (message.content != "!ping") return

    message.addReaction(Emojis.pingPong)

    message.channel.createMessage("${Emojis.stopwatch} gateway latency is:${kord.gateway.ping.toLongMilliseconds()} ms")
}
```

## Installation
Replace `{version}` with the desired version number.

### Gradle (groovy)
```groovy
dependencies {
    implementation 'dev.kord.x:kordx.emoji:{version}'
}
```

### Gradle (kotlin)
```kotlin
dependencies { 
    implementation("dev.kord.x:kordx.emoji:{version}")
}
```

### Maven
```xml
<dependency>
    <groupId>dev.kord.x</groupId>
    <artifactId>kordx.emoji</artifactId>
    <version>{version}</version>
</dependency>
```

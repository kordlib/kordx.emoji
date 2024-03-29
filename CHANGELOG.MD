# 0.6.0

## Dependencies

* kord: 0.7.x -> 0.8.x
* kotlin (and plugin.serialization): 1.5.10 -> 1.6.21
* nexus-staging: 0.22.0 -> 0.30.0
* kotlinx-serialization: 1.0.1 -> 1.3.3
* kotlinpoet: 1.7.2 -> 1.11.0
* commons-text: 1.8 -> 1.9
* bintray: 1.8.2 -> 1.8.5
* gradle: 6.8 -> 7.4.2

## Changes

* Cleanup un-needed visibility modifiers
* Suppress incorrect warnings

# 0.5.0

## Dependencies

* kord: 0.6.x -> 0.7.0
* kotlin: 1.4.10 -> 1.5.10

## Fixes

* Fixed equality checks between generic emojis.

# 0.4.0

## Additions

* Added `Emojis#get(unicode)` to get a `DiscordEmoji` from a unicode `String`.

## Fixes

* `DiscordEmoji.Diverse#withTone` now correctly returns a `DiscordEmoji.Diverse` instead of just a `DiscordEmoji`.

# 0.3.0

## Dependencies

* kord: 0.5.x -> 0.6.x
* kotlin: 1.3.72 -> 1.4.10

# 0.2.0

## Dependencies

* kord: 0.4.x -> 0.5.x
* kotlin: 1.3.61 -> 1.3.72

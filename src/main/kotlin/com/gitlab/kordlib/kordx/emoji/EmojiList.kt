package com.gitlab.kordlib.kordx.emoji

import kotlin.String
import kotlin.collections.Map

/**
 * List of all supported discord emojis.
 */
object Emojis {
  private val all: Map<String, DiscordEmoji> = mapOf(
              "\uD83D\uDE00" to `grinning`,
              "\uD83D\uDE03" to `smiley`,
              "\uD83D\uDE04" to `smile`,
              "\uD83D\uDE01" to `grin`,
              "\uD83D\uDE06" to `laughing`,
              "\uD83D\uDE05" to `sweatSmile`,
              "\uD83D\uDE02" to `joy`,
              "\uD83E\uDD23" to `rofl`,
              "\u263A\uFE0F" to `relaxed`,
              "\uD83D\uDE0A" to `blush`,
              "\uD83D\uDE07" to `innocent`,
              "\uD83D\uDE42" to `slightSmile`,
              "\uD83D\uDE43" to `upsideDown`,
              "\uD83D\uDE09" to `wink`,
              "\uD83D\uDE0C" to `relieved`,
              "\uD83D\uDE0D" to `heartEyes`,
              "\uD83E\uDD70" to `smilingFaceWith3Hearts`,
              "\uD83D\uDE18" to `kissingHeart`,
              "\uD83D\uDE17" to `kissing`,
              "\uD83D\uDE19" to `kissingSmilingEyes`,
              "\uD83D\uDE1A" to `kissingClosedEyes`,
              "\uD83D\uDE0B" to `yum`,
              "\uD83D\uDE1B" to `stuckOutTongue`,
              "\uD83D\uDE1D" to `stuckOutTongueClosedEyes`,
              "\uD83D\uDE1C" to `stuckOutTongueWinkingEye`,
              "\uD83E\uDD2A" to `zanyFace`,
              "\uD83E\uDD28" to `faceWithRaisedEyebrow`,
              "\uD83E\uDDD0" to `faceWithMonocle`,
              "\uD83E\uDD13" to `nerd`,
              "\uD83D\uDE0E" to `sunglasses`,
              "\uD83E\uDD29" to `starStruck`,
              "\uD83E\uDD73" to `partyingFace`,
              "\uD83D\uDE0F" to `smirk`,
              "\uD83D\uDE12" to `unamused`,
              "\uD83D\uDE1E" to `disappointed`,
              "\uD83D\uDE14" to `pensive`,
              "\uD83D\uDE1F" to `worried`,
              "\uD83D\uDE15" to `confused`,
              "\uD83D\uDE41" to `slightFrown`,
              "\u2639\uFE0F" to `frowning2`,
              "\uD83D\uDE23" to `persevere`,
              "\uD83D\uDE16" to `confounded`,
              "\uD83D\uDE2B" to `tiredFace`,
              "\uD83D\uDE29" to `weary`,
              "\uD83E\uDD7A" to `pleadingFace`,
              "\uD83D\uDE22" to `cry`,
              "\uD83D\uDE2D" to `sob`,
              "\uD83D\uDE24" to `triumph`,
              "\uD83D\uDE20" to `angry`,
              "\uD83D\uDE21" to `rage`,
              "\uD83E\uDD2C" to `faceWithSymbolsOverMouth`,
              "\uD83E\uDD2F" to `explodingHead`,
              "\uD83D\uDE33" to `flushed`,
              "\uD83E\uDD75" to `hotFace`,
              "\uD83E\uDD76" to `coldFace`,
              "\uD83D\uDE31" to `scream`,
              "\uD83D\uDE28" to `fearful`,
              "\uD83D\uDE30" to `coldSweat`,
              "\uD83D\uDE25" to `disappointedRelieved`,
              "\uD83D\uDE13" to `sweat`,
              "\uD83E\uDD17" to `hugging`,
              "\uD83E\uDD14" to `thinking`,
              "\uD83E\uDD2D" to `faceWithHandOverMouth`,
              "\uD83E\uDD71" to `yawningFace`,
              "\uD83E\uDD2B" to `shushingFace`,
              "\uD83E\uDD25" to `lyingFace`,
              "\uD83D\uDE36" to `noMouth`,
              "\uD83D\uDE10" to `neutralFace`,
              "\uD83D\uDE11" to `expressionless`,
              "\uD83D\uDE2C" to `grimacing`,
              "\uD83D\uDE44" to `rollingEyes`,
              "\uD83D\uDE2F" to `hushed`,
              "\uD83D\uDE26" to `frowning`,
              "\uD83D\uDE27" to `anguished`,
              "\uD83D\uDE2E" to `openMouth`,
              "\uD83D\uDE32" to `astonished`,
              "\uD83D\uDE34" to `sleeping`,
              "\uD83E\uDD24" to `droolingFace`,
              "\uD83D\uDE2A" to `sleepy`,
              "\uD83D\uDE35" to `dizzyFace`,
              "\uD83E\uDD10" to `zipperMouth`,
              "\uD83E\uDD74" to `woozyFace`,
              "\uD83E\uDD22" to `nauseatedFace`,
              "\uD83E\uDD2E" to `faceVomiting`,
              "\uD83E\uDD27" to `sneezingFace`,
              "\uD83D\uDE37" to `mask`,
              "\uD83E\uDD12" to `thermometerFace`,
              "\uD83E\uDD15" to `headBandage`,
              "\uD83E\uDD11" to `moneyMouth`,
              "\uD83E\uDD20" to `cowboy`,
              "\uD83D\uDE08" to `smilingImp`,
              "\uD83D\uDC7F" to `imp`,
              "\uD83D\uDC79" to `japaneseOgre`,
              "\uD83D\uDC7A" to `japaneseGoblin`,
              "\uD83E\uDD21" to `clown`,
              "\uD83D\uDCA9" to `poop`,
              "\uD83D\uDC7B" to `ghost`,
              "\uD83D\uDC80" to `skull`,
              "\u2620\uFE0F" to `skullCrossbones`,
              "\uD83D\uDC7D" to `alien`,
              "\uD83D\uDC7E" to `spaceInvader`,
              "\uD83E\uDD16" to `robot`,
              "\uD83C\uDF83" to `jackOLantern`,
              "\uD83D\uDE3A" to `smileyCat`,
              "\uD83D\uDE38" to `smileCat`,
              "\uD83D\uDE39" to `joyCat`,
              "\uD83D\uDE3B" to `heartEyesCat`,
              "\uD83D\uDE3C" to `smirkCat`,
              "\uD83D\uDE3D" to `kissingCat`,
              "\uD83D\uDE40" to `screamCat`,
              "\uD83D\uDE3F" to `cryingCatFace`,
              "\uD83D\uDE3E" to `poutingCat`,
              "\uD83E\uDD32" to `palmsUpTogether`,
              "\uD83D\uDC50" to `openHands`,
              "\uD83D\uDE4C" to `raisedHands`,
              "\uD83D\uDC4F" to `clap`,
              "\uD83E\uDD1D" to `handshake`,
              "\uD83D\uDC4D" to `thumbsup`,
              "\uD83D\uDC4E" to `thumbsdown`,
              "\uD83D\uDC4A" to `punch`,
              "\u270A" to `fist`,
              "\uD83E\uDD1B" to `leftFacingFist`,
              "\uD83E\uDD1C" to `rightFacingFist`,
              "\uD83E\uDD1E" to `fingersCrossed`,
              "\u270C\uFE0F" to `v`,
              "\uD83E\uDD1F" to `loveYouGesture`,
              "\uD83E\uDD18" to `metal`,
              "\uD83D\uDC4C" to `okHand`,
              "\uD83E\uDD0F" to `pinchingHand`,
              "\uD83D\uDC48" to `pointLeft`,
              "\uD83D\uDC49" to `pointRight`,
              "\uD83D\uDC46" to `pointUp2`,
              "\uD83D\uDC47" to `pointDown`,
              "\u261D\uFE0F" to `pointUp`,
              "\u270B" to `raisedHand`,
              "\uD83E\uDD1A" to `raisedBackOfHand`,
              "\uD83D\uDD90\uFE0F" to `handSplayed`,
              "\uD83D\uDD96" to `vulcan`,
              "\uD83D\uDC4B" to `wave`,
              "\uD83E\uDD19" to `callMe`,
              "\uD83D\uDCAA" to `muscle`,
              "\uD83E\uDDBE" to `mechanicalArm`,
              "\uD83D\uDD95" to `middleFinger`,
              "\u270D\uFE0F" to `writingHand`,
              "\uD83D\uDE4F" to `pray`,
              "\uD83E\uDDB6" to `foot`,
              "\uD83E\uDDB5" to `leg`,
              "\uD83E\uDDBF" to `mechanicalLeg`,
              "\uD83D\uDC84" to `lipstick`,
              "\uD83D\uDC8B" to `kiss`,
              "\uD83D\uDC44" to `lips`,
              "\uD83E\uDDB7" to `tooth`,
              "\uD83E\uDDB4" to `bone`,
              "\uD83D\uDC45" to `tongue`,
              "\uD83D\uDC42" to `ear`,
              "\uD83E\uDDBB" to `earWithHearingAid`,
              "\uD83D\uDC43" to `nose`,
              "\uD83D\uDC63" to `footprints`,
              "\uD83D\uDC41\uFE0F" to `eye`,
              "\uD83D\uDC40" to `eyes`,
              "\uD83E\uDDE0" to `brain`,
              "\uD83D\uDDE3\uFE0F" to `speakingHead`,
              "\uD83D\uDC64" to `bustInSilhouette`,
              "\uD83D\uDC65" to `bustsInSilhouette`,
              "\uD83D\uDC76" to `baby`,
              "\uD83D\uDC67" to `girl`,
              "\uD83E\uDDD2" to `child`,
              "\uD83D\uDC66" to `boy`,
              "\uD83D\uDC69" to `woman`,
              "\uD83E\uDDD1" to `adult`,
              "\uD83D\uDC68" to `man`,
              "\uD83D\uDC69\u200D\uD83E\uDDB1" to `womanCurlyHaired`,
              "\uD83D\uDC68\u200D\uD83E\uDDB1" to `manCurlyHaired`,
              "\uD83D\uDC69\u200D\uD83E\uDDB0" to `womanRedHaired`,
              "\uD83D\uDC68\u200D\uD83E\uDDB0" to `manRedHaired`,
              "\uD83D\uDC71\u200D\u2640\uFE0F" to `blondHairedWoman`,
              "\uD83D\uDC71" to `blondHairedPerson`,
              "\uD83D\uDC71\u200D\u2642\uFE0F" to `blondHairedMan`,
              "\uD83D\uDC69\u200D\uD83E\uDDB3" to `womanWhiteHaired`,
              "\uD83D\uDC68\u200D\uD83E\uDDB3" to `manWhiteHaired`,
              "\uD83D\uDC69\u200D\uD83E\uDDB2" to `womanBald`,
              "\uD83D\uDC68\u200D\uD83E\uDDB2" to `manBald`,
              "\uD83E\uDDD4" to `beardedPerson`,
              "\uD83D\uDC75" to `olderWoman`,
              "\uD83E\uDDD3" to `olderAdult`,
              "\uD83D\uDC74" to `olderMan`,
              "\uD83D\uDC72" to `manWithChineseCap`,
              "\uD83D\uDC73" to `personWearingTurban`,
              "\uD83D\uDC73\u200D\u2640\uFE0F" to `womanWearingTurban`,
              "\uD83D\uDC73\u200D\u2642\uFE0F" to `manWearingTurban`,
              "\uD83E\uDDD5" to `womanWithHeadscarf`,
              "\uD83D\uDC6E" to `policeOfficer`,
              "\uD83D\uDC6E\u200D\u2640\uFE0F" to `womanPoliceOfficer`,
              "\uD83D\uDC6E\u200D\u2642\uFE0F" to `manPoliceOfficer`,
              "\uD83D\uDC77" to `constructionWorker`,
              "\uD83D\uDC77\u200D\u2640\uFE0F" to `womanConstructionWorker`,
              "\uD83D\uDC77\u200D\u2642\uFE0F" to `manConstructionWorker`,
              "\uD83D\uDC82" to `guard`,
              "\uD83D\uDC82\u200D\u2640\uFE0F" to `womanGuard`,
              "\uD83D\uDC82\u200D\u2642\uFE0F" to `manGuard`,
              "\uD83D\uDD75\uFE0F" to `detective`,
              "\uD83D\uDD75\uFE0F\u200D\u2640\uFE0F" to `womanDetective`,
              "\uD83D\uDD75\uFE0F\u200D\u2642\uFE0F" to `manDetective`,
              "\uD83D\uDC69\u200D\u2695\uFE0F" to `womanHealthWorker`,
              "\uD83D\uDC68\u200D\u2695\uFE0F" to `manHealthWorker`,
              "\uD83D\uDC69\u200D\uD83C\uDF3E" to `womanFarmer`,
              "\uD83D\uDC68\u200D\uD83C\uDF3E" to `manFarmer`,
              "\uD83D\uDC69\u200D\uD83C\uDF73" to `womanCook`,
              "\uD83D\uDC68\u200D\uD83C\uDF73" to `manCook`,
              "\uD83D\uDC69\u200D\uD83C\uDF93" to `womanStudent`,
              "\uD83D\uDC68\u200D\uD83C\uDF93" to `manStudent`,
              "\uD83D\uDC69\u200D\uD83C\uDFA4" to `womanSinger`,
              "\uD83D\uDC68\u200D\uD83C\uDFA4" to `manSinger`,
              "\uD83D\uDC69\u200D\uD83C\uDFEB" to `womanTeacher`,
              "\uD83D\uDC68\u200D\uD83C\uDFEB" to `manTeacher`,
              "\uD83D\uDC69\u200D\uD83C\uDFED" to `womanFactoryWorker`,
              "\uD83D\uDC68\u200D\uD83C\uDFED" to `manFactoryWorker`,
              "\uD83D\uDC69\u200D\uD83D\uDCBB" to `womanTechnologist`,
              "\uD83D\uDC68\u200D\uD83D\uDCBB" to `manTechnologist`,
              "\uD83D\uDC69\u200D\uD83D\uDCBC" to `womanOfficeWorker`,
              "\uD83D\uDC68\u200D\uD83D\uDCBC" to `manOfficeWorker`,
              "\uD83D\uDC69\u200D\uD83D\uDD27" to `womanMechanic`,
              "\uD83D\uDC68\u200D\uD83D\uDD27" to `manMechanic`,
              "\uD83D\uDC69\u200D\uD83D\uDD2C" to `womanScientist`,
              "\uD83D\uDC68\u200D\uD83D\uDD2C" to `manScientist`,
              "\uD83D\uDC69\u200D\uD83C\uDFA8" to `womanArtist`,
              "\uD83D\uDC68\u200D\uD83C\uDFA8" to `manArtist`,
              "\uD83D\uDC69\u200D\uD83D\uDE92" to `womanFirefighter`,
              "\uD83D\uDC68\u200D\uD83D\uDE92" to `manFirefighter`,
              "\uD83D\uDC69\u200D\u2708\uFE0F" to `womanPilot`,
              "\uD83D\uDC68\u200D\u2708\uFE0F" to `manPilot`,
              "\uD83D\uDC69\u200D\uD83D\uDE80" to `womanAstronaut`,
              "\uD83D\uDC68\u200D\uD83D\uDE80" to `manAstronaut`,
              "\uD83D\uDC69\u200D\u2696\uFE0F" to `womanJudge`,
              "\uD83D\uDC68\u200D\u2696\uFE0F" to `manJudge`,
              "\uD83D\uDC70" to `brideWithVeil`,
              "\uD83E\uDD35" to `manInTuxedo`,
              "\uD83D\uDC78" to `princess`,
              "\uD83E\uDD34" to `prince`,
              "\uD83E\uDDB8" to `superhero`,
              "\uD83E\uDDB8\u200D\u2640\uFE0F" to `womanSuperhero`,
              "\uD83E\uDDB8\u200D\u2642\uFE0F" to `manSuperhero`,
              "\uD83E\uDDB9" to `supervillain`,
              "\uD83E\uDDB9\u200D\u2640\uFE0F" to `womanSupervillain`,
              "\uD83E\uDDB9\u200D\u2642\uFE0F" to `manSupervillain`,
              "\uD83E\uDD36" to `mrsClaus`,
              "\uD83C\uDF85" to `santa`,
              "\uD83E\uDDD9" to `mage`,
              "\uD83E\uDDD9\u200D\u2640\uFE0F" to `womanMage`,
              "\uD83E\uDDD9\u200D\u2642\uFE0F" to `manMage`,
              "\uD83E\uDDDD" to `elf`,
              "\uD83E\uDDDD\u200D\u2640\uFE0F" to `womanElf`,
              "\uD83E\uDDDD\u200D\u2642\uFE0F" to `manElf`,
              "\uD83E\uDDDB" to `vampire`,
              "\uD83E\uDDDB\u200D\u2640\uFE0F" to `womanVampire`,
              "\uD83E\uDDDB\u200D\u2642\uFE0F" to `manVampire`,
              "\uD83E\uDDDF" to `zombie`,
              "\uD83E\uDDDF\u200D\u2640\uFE0F" to `womanZombie`,
              "\uD83E\uDDDF\u200D\u2642\uFE0F" to `manZombie`,
              "\uD83E\uDDDE" to `genie`,
              "\uD83E\uDDDE\u200D\u2640\uFE0F" to `womanGenie`,
              "\uD83E\uDDDE\u200D\u2642\uFE0F" to `manGenie`,
              "\uD83E\uDDDC" to `merperson`,
              "\uD83E\uDDDC\u200D\u2640\uFE0F" to `mermaid`,
              "\uD83E\uDDDC\u200D\u2642\uFE0F" to `merman`,
              "\uD83E\uDDDA" to `fairy`,
              "\uD83E\uDDDA\u200D\u2640\uFE0F" to `womanFairy`,
              "\uD83E\uDDDA\u200D\u2642\uFE0F" to `manFairy`,
              "\uD83D\uDC7C" to `angel`,
              "\uD83E\uDD30" to `pregnantWoman`,
              "\uD83E\uDD31" to `breastFeeding`,
              "\uD83D\uDE47" to `personBowing`,
              "\uD83D\uDE47\u200D\u2640\uFE0F" to `womanBowing`,
              "\uD83D\uDE47\u200D\u2642\uFE0F" to `manBowing`,
              "\uD83D\uDC81" to `personTippingHand`,
              "\uD83D\uDC81\u200D\u2640\uFE0F" to `womanTippingHand`,
              "\uD83D\uDC81\u200D\u2642\uFE0F" to `manTippingHand`,
              "\uD83D\uDE45" to `personGesturingNo`,
              "\uD83D\uDE45\u200D\u2640\uFE0F" to `womanGesturingNo`,
              "\uD83D\uDE45\u200D\u2642\uFE0F" to `manGesturingNo`,
              "\uD83D\uDE46" to `personGesturingOk`,
              "\uD83D\uDE46\u200D\u2640\uFE0F" to `womanGesturingOk`,
              "\uD83D\uDE46\u200D\u2642\uFE0F" to `manGesturingOk`,
              "\uD83D\uDE4B" to `personRaisingHand`,
              "\uD83D\uDE4B\u200D\u2640\uFE0F" to `womanRaisingHand`,
              "\uD83D\uDE4B\u200D\u2642\uFE0F" to `manRaisingHand`,
              "\uD83E\uDDCF" to `deafPerson`,
              "\uD83E\uDDCF\u200D\u2640\uFE0F" to `deafWoman`,
              "\uD83E\uDDCF\u200D\u2642\uFE0F" to `deafMan`,
              "\uD83E\uDD26" to `personFacepalming`,
              "\uD83E\uDD26\u200D\u2640\uFE0F" to `womanFacepalming`,
              "\uD83E\uDD26\u200D\u2642\uFE0F" to `manFacepalming`,
              "\uD83E\uDD37" to `personShrugging`,
              "\uD83E\uDD37\u200D\u2640\uFE0F" to `womanShrugging`,
              "\uD83E\uDD37\u200D\u2642\uFE0F" to `manShrugging`,
              "\uD83D\uDE4E" to `personPouting`,
              "\uD83D\uDE4E\u200D\u2640\uFE0F" to `womanPouting`,
              "\uD83D\uDE4E\u200D\u2642\uFE0F" to `manPouting`,
              "\uD83D\uDE4D" to `personFrowning`,
              "\uD83D\uDE4D\u200D\u2640\uFE0F" to `womanFrowning`,
              "\uD83D\uDE4D\u200D\u2642\uFE0F" to `manFrowning`,
              "\uD83D\uDC87" to `personGettingHaircut`,
              "\uD83D\uDC87\u200D\u2640\uFE0F" to `womanGettingHaircut`,
              "\uD83D\uDC87\u200D\u2642\uFE0F" to `manGettingHaircut`,
              "\uD83D\uDC86" to `personGettingMassage`,
              "\uD83D\uDC86\u200D\u2640\uFE0F" to `womanGettingFaceMassage`,
              "\uD83D\uDC86\u200D\u2642\uFE0F" to `manGettingFaceMassage`,
              "\uD83E\uDDD6" to `personInSteamyRoom`,
              "\uD83E\uDDD6\u200D\u2640\uFE0F" to `womanInSteamyRoom`,
              "\uD83E\uDDD6\u200D\u2642\uFE0F" to `manInSteamyRoom`,
              "\uD83D\uDC85" to `nailCare`,
              "\uD83E\uDD33" to `selfie`,
              "\uD83D\uDC83" to `dancer`,
              "\uD83D\uDD7A" to `manDancing`,
              "\uD83D\uDC6F" to `peopleWithBunnyEarsPartying`,
              "\uD83D\uDC6F\u200D\u2640\uFE0F" to `womenWithBunnyEarsPartying`,
              "\uD83D\uDC6F\u200D\u2642\uFE0F" to `menWithBunnyEarsPartying`,
              "\uD83D\uDD74\uFE0F" to `levitate`,
              "\uD83D\uDEB6" to `personWalking`,
              "\uD83D\uDEB6\u200D\u2640\uFE0F" to `womanWalking`,
              "\uD83D\uDEB6\u200D\u2642\uFE0F" to `manWalking`,
              "\uD83C\uDFC3" to `personRunning`,
              "\uD83C\uDFC3\u200D\u2640\uFE0F" to `womanRunning`,
              "\uD83C\uDFC3\u200D\u2642\uFE0F" to `manRunning`,
              "\uD83E\uDDCD" to `personStanding`,
              "\uD83E\uDDCD\u200D\u2640\uFE0F" to `womanStanding`,
              "\uD83E\uDDCD\u200D\u2642\uFE0F" to `manStanding`,
              "\uD83E\uDDCE" to `personKneeling`,
              "\uD83E\uDDCE\u200D\u2640\uFE0F" to `womanKneeling`,
              "\uD83E\uDDCE\u200D\u2642\uFE0F" to `manKneeling`,
              "\uD83D\uDC69\u200D\uD83E\uDDAF" to `womanWithProbingCane`,
              "\uD83D\uDC68\u200D\uD83E\uDDAF" to `manWithProbingCane`,
              "\uD83D\uDC69\u200D\uD83E\uDDBC" to `womanInMotorizedWheelchair`,
              "\uD83D\uDC68\u200D\uD83E\uDDBC" to `manInMotorizedWheelchair`,
              "\uD83D\uDC69\u200D\uD83E\uDDBD" to `womanInManualWheelchair`,
              "\uD83D\uDC68\u200D\uD83E\uDDBD" to `manInManualWheelchair`,
              "\uD83E\uDDD1\u200D\uD83E\uDD1D\u200D\uD83E\uDDD1" to `peopleHoldingHands`,
              "\uD83D\uDC6B" to `couple`,
              "\uD83D\uDC6D" to `twoWomenHoldingHands`,
              "\uD83D\uDC6C" to `twoMenHoldingHands`,
              "\uD83D\uDC91" to `coupleWithHeart`,
              "\uD83D\uDC69\u200D\u2764\uFE0F\u200D\uD83D\uDC68" to `coupleWithHeartWomanMan`,
              "\uD83D\uDC69\u200D\u2764\uFE0F\u200D\uD83D\uDC69" to `coupleWw`,
              "\uD83D\uDC68\u200D\u2764\uFE0F\u200D\uD83D\uDC68" to `coupleMm`,
              "\uD83D\uDC8F" to `couplekiss`,
              "\uD83D\uDC69\u200D\u2764\uFE0F\u200D\uD83D\uDC8B\u200D\uD83D\uDC68" to
          `kissWomanMan`,
              "\uD83D\uDC69\u200D\u2764\uFE0F\u200D\uD83D\uDC8B\u200D\uD83D\uDC69" to `kissWw`,
              "\uD83D\uDC68\u200D\u2764\uFE0F\u200D\uD83D\uDC8B\u200D\uD83D\uDC68" to `kissMm`,
              "\uD83D\uDC6A" to `family`,
              "\uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC66" to `familyManWomanBoy`,
              "\uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC67" to `familyMwg`,
              "\uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC66" to `familyMwgb`,
              "\uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC66\u200D\uD83D\uDC66" to `familyMwbb`,
              "\uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC67" to `familyMwgg`,
              "\uD83D\uDC69\u200D\uD83D\uDC69\u200D\uD83D\uDC66" to `familyWwb`,
              "\uD83D\uDC69\u200D\uD83D\uDC69\u200D\uD83D\uDC67" to `familyWwg`,
              "\uD83D\uDC69\u200D\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC66" to `familyWwgb`,
              "\uD83D\uDC69\u200D\uD83D\uDC69\u200D\uD83D\uDC66\u200D\uD83D\uDC66" to `familyWwbb`,
              "\uD83D\uDC69\u200D\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC67" to `familyWwgg`,
              "\uD83D\uDC68\u200D\uD83D\uDC68\u200D\uD83D\uDC66" to `familyMmb`,
              "\uD83D\uDC68\u200D\uD83D\uDC68\u200D\uD83D\uDC67" to `familyMmg`,
              "\uD83D\uDC68\u200D\uD83D\uDC68\u200D\uD83D\uDC67\u200D\uD83D\uDC66" to `familyMmgb`,
              "\uD83D\uDC68\u200D\uD83D\uDC68\u200D\uD83D\uDC66\u200D\uD83D\uDC66" to `familyMmbb`,
              "\uD83D\uDC68\u200D\uD83D\uDC68\u200D\uD83D\uDC67\u200D\uD83D\uDC67" to `familyMmgg`,
              "\uD83D\uDC69\u200D\uD83D\uDC66" to `familyWomanBoy`,
              "\uD83D\uDC69\u200D\uD83D\uDC67" to `familyWomanGirl`,
              "\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC66" to `familyWomanGirlBoy`,
              "\uD83D\uDC69\u200D\uD83D\uDC66\u200D\uD83D\uDC66" to `familyWomanBoyBoy`,
              "\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC67" to `familyWomanGirlGirl`,
              "\uD83D\uDC68\u200D\uD83D\uDC66" to `familyManBoy`,
              "\uD83D\uDC68\u200D\uD83D\uDC67" to `familyManGirl`,
              "\uD83D\uDC68\u200D\uD83D\uDC67\u200D\uD83D\uDC66" to `familyManGirlBoy`,
              "\uD83D\uDC68\u200D\uD83D\uDC66\u200D\uD83D\uDC66" to `familyManBoyBoy`,
              "\uD83D\uDC68\u200D\uD83D\uDC67\u200D\uD83D\uDC67" to `familyManGirlGirl`,
              "\uD83E\uDDF6" to `yarn`,
              "\uD83E\uDDF5" to `thread`,
              "\uD83E\uDDE5" to `coat`,
              "\uD83E\uDD7C" to `labCoat`,
              "\uD83E\uDDBA" to `safetyVest`,
              "\uD83D\uDC5A" to `womansClothes`,
              "\uD83D\uDC55" to `shirt`,
              "\uD83D\uDC56" to `jeans`,
              "\uD83E\uDE73" to `shorts`,
              "\uD83D\uDC54" to `necktie`,
              "\uD83D\uDC57" to `dress`,
              "\uD83D\uDC59" to `bikini`,
              "\uD83E\uDE71" to `onePieceSwimsuit`,
              "\uD83D\uDC58" to `kimono`,
              "\uD83E\uDD7B" to `sari`,
              "\uD83E\uDD7F" to `womansFlatShoe`,
              "\uD83D\uDC60" to `highHeel`,
              "\uD83D\uDC61" to `sandal`,
              "\uD83D\uDC62" to `boot`,
              "\uD83E\uDE70" to `balletShoes`,
              "\uD83D\uDC5E" to `mansShoe`,
              "\uD83D\uDC5F" to `athleticShoe`,
              "\uD83E\uDD7E" to `hikingBoot`,
              "\uD83E\uDE72" to `briefs`,
              "\uD83E\uDDE6" to `socks`,
              "\uD83E\uDDE4" to `gloves`,
              "\uD83E\uDDE3" to `scarf`,
              "\uD83C\uDFA9" to `tophat`,
              "\uD83E\uDDE2" to `billedCap`,
              "\uD83D\uDC52" to `womansHat`,
              "\uD83C\uDF93" to `mortarBoard`,
              "\u26D1\uFE0F" to `helmetWithCross`,
              "\uD83D\uDC51" to `crown`,
              "\uD83D\uDC8D" to `ring`,
              "\uD83D\uDC5D" to `pouch`,
              "\uD83D\uDC5B" to `purse`,
              "\uD83D\uDC5C" to `handbag`,
              "\uD83D\uDCBC" to `briefcase`,
              "\uD83C\uDF92" to `schoolSatchel`,
              "\uD83E\uDDF3" to `luggage`,
              "\uD83D\uDC53" to `eyeglasses`,
              "\uD83D\uDD76\uFE0F" to `darkSunglasses`,
              "\uD83E\uDD7D" to `goggles`,
              "\uD83E\uDD3F" to `divingMask`,
              "\uD83C\uDF02" to `closedUmbrella`,
              "\uD83D\uDC36" to `dog`,
              "\uD83D\uDC31" to `cat`,
              "\uD83D\uDC2D" to `mouse`,
              "\uD83D\uDC39" to `hamster`,
              "\uD83D\uDC30" to `rabbit`,
              "\uD83E\uDD8A" to `fox`,
              "\uD83D\uDC3B" to `bear`,
              "\uD83D\uDC3C" to `pandaFace`,
              "\uD83D\uDC28" to `koala`,
              "\uD83D\uDC2F" to `tiger`,
              "\uD83E\uDD81" to `lionFace`,
              "\uD83D\uDC2E" to `cow`,
              "\uD83D\uDC37" to `pig`,
              "\uD83D\uDC3D" to `pigNose`,
              "\uD83D\uDC38" to `frog`,
              "\uD83D\uDC35" to `monkeyFace`,
              "\uD83D\uDE48" to `seeNoEvil`,
              "\uD83D\uDE49" to `hearNoEvil`,
              "\uD83D\uDE4A" to `speakNoEvil`,
              "\uD83D\uDC12" to `monkey`,
              "\uD83D\uDC14" to `chicken`,
              "\uD83D\uDC27" to `penguin`,
              "\uD83D\uDC26" to `bird`,
              "\uD83D\uDC24" to `babyChick`,
              "\uD83D\uDC23" to `hatchingChick`,
              "\uD83D\uDC25" to `hatchedChick`,
              "\uD83E\uDD86" to `duck`,
              "\uD83E\uDD85" to `eagle`,
              "\uD83E\uDD89" to `owl`,
              "\uD83E\uDD87" to `bat`,
              "\uD83D\uDC3A" to `wolf`,
              "\uD83D\uDC17" to `boar`,
              "\uD83D\uDC34" to `horse`,
              "\uD83E\uDD84" to `unicorn`,
              "\uD83D\uDC1D" to `bee`,
              "\uD83D\uDC1B" to `bug`,
              "\uD83E\uDD8B" to `butterfly`,
              "\uD83D\uDC0C" to `snail`,
              "\uD83D\uDC1A" to `shell`,
              "\uD83D\uDC1E" to `beetle`,
              "\uD83D\uDC1C" to `ant`,
              "\uD83E\uDD9F" to `mosquito`,
              "\uD83E\uDD97" to `cricket`,
              "\uD83D\uDD77\uFE0F" to `spider`,
              "\uD83D\uDD78\uFE0F" to `spiderWeb`,
              "\uD83E\uDD82" to `scorpion`,
              "\uD83D\uDC22" to `turtle`,
              "\uD83D\uDC0D" to `snake`,
              "\uD83E\uDD8E" to `lizard`,
              "\uD83E\uDD96" to `tRex`,
              "\uD83E\uDD95" to `sauropod`,
              "\uD83D\uDC19" to `octopus`,
              "\uD83E\uDD91" to `squid`,
              "\uD83E\uDD90" to `shrimp`,
              "\uD83E\uDD9E" to `lobster`,
              "\uD83E\uDDAA" to `oyster`,
              "\uD83E\uDD80" to `crab`,
              "\uD83D\uDC21" to `blowfish`,
              "\uD83D\uDC20" to `tropicalFish`,
              "\uD83D\uDC1F" to `fish`,
              "\uD83D\uDC2C" to `dolphin`,
              "\uD83D\uDC33" to `whale`,
              "\uD83D\uDC0B" to `whale2`,
              "\uD83E\uDD88" to `shark`,
              "\uD83D\uDC0A" to `crocodile`,
              "\uD83D\uDC05" to `tiger2`,
              "\uD83D\uDC06" to `leopard`,
              "\uD83E\uDD93" to `zebra`,
              "\uD83E\uDD8D" to `gorilla`,
              "\uD83E\uDDA7" to `orangutan`,
              "\uD83D\uDC18" to `elephant`,
              "\uD83E\uDD9B" to `hippopotamus`,
              "\uD83E\uDD8F" to `rhino`,
              "\uD83D\uDC2A" to `dromedaryCamel`,
              "\uD83D\uDC2B" to `camel`,
              "\uD83E\uDD92" to `giraffe`,
              "\uD83E\uDD98" to `kangaroo`,
              "\uD83D\uDC03" to `waterBuffalo`,
              "\uD83D\uDC02" to `ox`,
              "\uD83D\uDC04" to `cow2`,
              "\uD83D\uDC0E" to `racehorse`,
              "\uD83D\uDC16" to `pig2`,
              "\uD83D\uDC0F" to `ram`,
              "\uD83E\uDD99" to `llama`,
              "\uD83D\uDC11" to `sheep`,
              "\uD83D\uDC10" to `goat`,
              "\uD83E\uDD8C" to `deer`,
              "\uD83D\uDC15" to `dog2`,
              "\uD83E\uDDAE" to `guideDog`,
              "\uD83D\uDC15\u200D\uD83E\uDDBA" to `serviceDog`,
              "\uD83D\uDC29" to `poodle`,
              "\uD83D\uDC08" to `cat2`,
              "\uD83D\uDC13" to `rooster`,
              "\uD83E\uDD83" to `turkey`,
              "\uD83E\uDD9A" to `peacock`,
              "\uD83E\uDD9C" to `parrot`,
              "\uD83E\uDDA2" to `swan`,
              "\uD83E\uDDA9" to `flamingo`,
              "\uD83D\uDD4A\uFE0F" to `dove`,
              "\uD83D\uDC07" to `rabbit2`,
              "\uD83E\uDDA5" to `sloth`,
              "\uD83E\uDDA6" to `otter`,
              "\uD83E\uDDA8" to `skunk`,
              "\uD83E\uDD9D" to `raccoon`,
              "\uD83E\uDDA1" to `badger`,
              "\uD83D\uDC01" to `mouse2`,
              "\uD83D\uDC00" to `rat`,
              "\uD83D\uDC3F\uFE0F" to `chipmunk`,
              "\uD83E\uDD94" to `hedgehog`,
              "\uD83D\uDC3E" to `feet`,
              "\uD83D\uDC09" to `dragon`,
              "\uD83D\uDC32" to `dragonFace`,
              "\uD83C\uDF35" to `cactus`,
              "\uD83C\uDF84" to `christmasTree`,
              "\uD83C\uDF32" to `evergreenTree`,
              "\uD83C\uDF33" to `deciduousTree`,
              "\uD83C\uDF34" to `palmTree`,
              "\uD83C\uDF31" to `seedling`,
              "\uD83C\uDF3F" to `herb`,
              "\u2618\uFE0F" to `shamrock`,
              "\uD83C\uDF40" to `fourLeafClover`,
              "\uD83C\uDF8D" to `bamboo`,
              "\uD83C\uDF8B" to `tanabataTree`,
              "\uD83C\uDF43" to `leaves`,
              "\uD83C\uDF42" to `fallenLeaf`,
              "\uD83C\uDF41" to `mapleLeaf`,
              "\uD83C\uDF44" to `mushroom`,
              "\uD83C\uDF3E" to `earOfRice`,
              "\uD83D\uDC90" to `bouquet`,
              "\uD83C\uDF37" to `tulip`,
              "\uD83C\uDF39" to `rose`,
              "\uD83E\uDD40" to `wiltedRose`,
              "\uD83C\uDF3A" to `hibiscus`,
              "\uD83C\uDF38" to `cherryBlossom`,
              "\uD83C\uDF3C" to `blossom`,
              "\uD83C\uDF3B" to `sunflower`,
              "\uD83C\uDF1E" to `sunWithFace`,
              "\uD83C\uDF1D" to `fullMoonWithFace`,
              "\uD83C\uDF1B" to `firstQuarterMoonWithFace`,
              "\uD83C\uDF1C" to `lastQuarterMoonWithFace`,
              "\uD83C\uDF1A" to `newMoonWithFace`,
              "\uD83C\uDF15" to `fullMoon`,
              "\uD83C\uDF16" to `waningGibbousMoon`,
              "\uD83C\uDF17" to `lastQuarterMoon`,
              "\uD83C\uDF18" to `waningCrescentMoon`,
              "\uD83C\uDF11" to `newMoon`,
              "\uD83C\uDF12" to `waxingCrescentMoon`,
              "\uD83C\uDF13" to `firstQuarterMoon`,
              "\uD83C\uDF14" to `waxingGibbousMoon`,
              "\uD83C\uDF19" to `crescentMoon`,
              "\uD83C\uDF0E" to `earthAmericas`,
              "\uD83C\uDF0D" to `earthAfrica`,
              "\uD83C\uDF0F" to `earthAsia`,
              "\uD83E\uDE90" to `ringedPlanet`,
              "\uD83D\uDCAB" to `dizzy`,
              "\u2B50" to `star`,
              "\uD83C\uDF1F" to `star2`,
              "\u2728" to `sparkles`,
              "\u26A1" to `zap`,
              "\u2604\uFE0F" to `comet`,
              "\uD83D\uDCA5" to `boom`,
              "\uD83D\uDD25" to `fire`,
              "\uD83C\uDF2A\uFE0F" to `cloudTornado`,
              "\uD83C\uDF08" to `rainbow`,
              "\u2600\uFE0F" to `sunny`,
              "\uD83C\uDF24\uFE0F" to `whiteSunSmallCloud`,
              "\u26C5" to `partlySunny`,
              "\uD83C\uDF25\uFE0F" to `whiteSunCloud`,
              "\u2601\uFE0F" to `cloud`,
              "\uD83C\uDF26\uFE0F" to `whiteSunRainCloud`,
              "\uD83C\uDF27\uFE0F" to `cloudRain`,
              "\u26C8\uFE0F" to `thunderCloudRain`,
              "\uD83C\uDF29\uFE0F" to `cloudLightning`,
              "\uD83C\uDF28\uFE0F" to `cloudSnow`,
              "\u2744\uFE0F" to `snowflake`,
              "\u2603\uFE0F" to `snowman2`,
              "\u26C4" to `snowman`,
              "\uD83C\uDF2C\uFE0F" to `windBlowingFace`,
              "\uD83D\uDCA8" to `dash`,
              "\uD83D\uDCA7" to `droplet`,
              "\uD83D\uDCA6" to `sweatDrops`,
              "\u2614" to `umbrella`,
              "\u2602\uFE0F" to `umbrella2`,
              "\uD83C\uDF0A" to `ocean`,
              "\uD83C\uDF2B\uFE0F" to `fog`,
              "\uD83C\uDF4F" to `greenApple`,
              "\uD83C\uDF4E" to `apple`,
              "\uD83C\uDF50" to `pear`,
              "\uD83C\uDF4A" to `tangerine`,
              "\uD83C\uDF4B" to `lemon`,
              "\uD83C\uDF4C" to `banana`,
              "\uD83C\uDF49" to `watermelon`,
              "\uD83C\uDF47" to `grapes`,
              "\uD83C\uDF53" to `strawberry`,
              "\uD83C\uDF48" to `melon`,
              "\uD83C\uDF52" to `cherries`,
              "\uD83C\uDF51" to `peach`,
              "\uD83E\uDD6D" to `mango`,
              "\uD83C\uDF4D" to `pineapple`,
              "\uD83E\uDD65" to `coconut`,
              "\uD83E\uDD5D" to `kiwi`,
              "\uD83C\uDF45" to `tomato`,
              "\uD83C\uDF46" to `eggplant`,
              "\uD83E\uDD51" to `avocado`,
              "\uD83E\uDD66" to `broccoli`,
              "\uD83E\uDD6C" to `leafyGreen`,
              "\uD83E\uDD52" to `cucumber`,
              "\uD83C\uDF36\uFE0F" to `hotPepper`,
              "\uD83C\uDF3D" to `corn`,
              "\uD83E\uDD55" to `carrot`,
              "\uD83E\uDDC5" to `onion`,
              "\uD83E\uDDC4" to `garlic`,
              "\uD83E\uDD54" to `potato`,
              "\uD83C\uDF60" to `sweetPotato`,
              "\uD83E\uDD50" to `croissant`,
              "\uD83E\uDD6F" to `bagel`,
              "\uD83C\uDF5E" to `bread`,
              "\uD83E\uDD56" to `frenchBread`,
              "\uD83E\uDD68" to `pretzel`,
              "\uD83E\uDDC0" to `cheese`,
              "\uD83E\uDD5A" to `egg`,
              "\uD83C\uDF73" to `cooking`,
              "\uD83E\uDD5E" to `pancakes`,
              "\uD83E\uDDC7" to `waffle`,
              "\uD83E\uDD53" to `bacon`,
              "\uD83E\uDD69" to `cutOfMeat`,
              "\uD83C\uDF57" to `poultryLeg`,
              "\uD83C\uDF56" to `meatOnBone`,
              "\uD83C\uDF2D" to `hotdog`,
              "\uD83C\uDF54" to `hamburger`,
              "\uD83C\uDF5F" to `fries`,
              "\uD83C\uDF55" to `pizza`,
              "\uD83E\uDD6A" to `sandwich`,
              "\uD83E\uDDC6" to `falafel`,
              "\uD83E\uDD59" to `stuffedFlatbread`,
              "\uD83C\uDF2E" to `taco`,
              "\uD83C\uDF2F" to `burrito`,
              "\uD83E\uDD57" to `salad`,
              "\uD83E\uDD58" to `shallowPanOfFood`,
              "\uD83E\uDD6B" to `cannedFood`,
              "\uD83C\uDF5D" to `spaghetti`,
              "\uD83C\uDF5C" to `ramen`,
              "\uD83C\uDF72" to `stew`,
              "\uD83C\uDF5B" to `curry`,
              "\uD83C\uDF63" to `sushi`,
              "\uD83C\uDF71" to `bento`,
              "\uD83E\uDD5F" to `dumpling`,
              "\uD83C\uDF64" to `friedShrimp`,
              "\uD83C\uDF59" to `riceBall`,
              "\uD83C\uDF5A" to `rice`,
              "\uD83C\uDF58" to `riceCracker`,
              "\uD83C\uDF65" to `fishCake`,
              "\uD83E\uDD60" to `fortuneCookie`,
              "\uD83E\uDD6E" to `moonCake`,
              "\uD83C\uDF62" to `oden`,
              "\uD83C\uDF61" to `dango`,
              "\uD83C\uDF67" to `shavedIce`,
              "\uD83C\uDF68" to `iceCream`,
              "\uD83C\uDF66" to `icecream`,
              "\uD83E\uDD67" to `pie`,
              "\uD83E\uDDC1" to `cupcake`,
              "\uD83C\uDF70" to `cake`,
              "\uD83C\uDF82" to `birthday`,
              "\uD83C\uDF6E" to `custard`,
              "\uD83C\uDF6D" to `lollipop`,
              "\uD83C\uDF6C" to `candy`,
              "\uD83C\uDF6B" to `chocolateBar`,
              "\uD83C\uDF7F" to `popcorn`,
              "\uD83C\uDF69" to `doughnut`,
              "\uD83C\uDF6A" to `cookie`,
              "\uD83C\uDF30" to `chestnut`,
              "\uD83E\uDD5C" to `peanuts`,
              "\uD83C\uDF6F" to `honeyPot`,
              "\uD83E\uDDC8" to `butter`,
              "\uD83E\uDD5B" to `milk`,
              "\uD83C\uDF7C" to `babyBottle`,
              "\u2615" to `coffee`,
              "\uD83C\uDF75" to `tea`,
              "\uD83E\uDDC9" to `mate`,
              "\uD83E\uDD64" to `cupWithStraw`,
              "\uD83E\uDDC3" to `beverageBox`,
              "\uD83E\uDDCA" to `iceCube`,
              "\uD83C\uDF76" to `sake`,
              "\uD83C\uDF7A" to `beer`,
              "\uD83C\uDF7B" to `beers`,
              "\uD83E\uDD42" to `champagneGlass`,
              "\uD83C\uDF77" to `wineGlass`,
              "\uD83E\uDD43" to `tumblerGlass`,
              "\uD83C\uDF78" to `cocktail`,
              "\uD83C\uDF79" to `tropicalDrink`,
              "\uD83C\uDF7E" to `champagne`,
              "\uD83E\uDD44" to `spoon`,
              "\uD83C\uDF74" to `forkAndKnife`,
              "\uD83C\uDF7D\uFE0F" to `forkKnifePlate`,
              "\uD83E\uDD63" to `bowlWithSpoon`,
              "\uD83E\uDD61" to `takeoutBox`,
              "\uD83E\uDD62" to `chopsticks`,
              "\uD83E\uDDC2" to `salt`,
              "\u26BD" to `soccer`,
              "\uD83C\uDFC0" to `basketball`,
              "\uD83C\uDFC8" to `football`,
              "\u26BE" to `baseball`,
              "\uD83E\uDD4E" to `softball`,
              "\uD83C\uDFBE" to `tennis`,
              "\uD83C\uDFD0" to `volleyball`,
              "\uD83C\uDFC9" to `rugbyFootball`,
              "\uD83E\uDD4F" to `flyingDisc`,
              "\uD83C\uDFB1" to `8ball`,
              "\uD83C\uDFD3" to `pingPong`,
              "\uD83C\uDFF8" to `badminton`,
              "\uD83C\uDFD2" to `hockey`,
              "\uD83C\uDFD1" to `fieldHockey`,
              "\uD83E\uDD4D" to `lacrosse`,
              "\uD83C\uDFCF" to `cricketGame`,
              "\uD83E\uDD45" to `goal`,
              "\u26F3" to `golf`,
              "\uD83C\uDFF9" to `bowAndArrow`,
              "\uD83C\uDFA3" to `fishingPoleAndFish`,
              "\uD83E\uDD4A" to `boxingGlove`,
              "\uD83E\uDD4B" to `martialArtsUniform`,
              "\uD83C\uDFBD" to `runningShirtWithSash`,
              "\uD83D\uDEF9" to `skateboard`,
              "\uD83D\uDEF7" to `sled`,
              "\uD83E\uDE82" to `parachute`,
              "\u26F8\uFE0F" to `iceSkate`,
              "\uD83E\uDD4C" to `curlingStone`,
              "\uD83C\uDFBF" to `ski`,
              "\u26F7\uFE0F" to `skier`,
              "\uD83C\uDFC2" to `snowboarder`,
              "\uD83C\uDFCB\uFE0F" to `personLiftingWeights`,
              "\uD83C\uDFCB\uFE0F\u200D\u2640\uFE0F" to `womanLiftingWeights`,
              "\uD83C\uDFCB\uFE0F\u200D\u2642\uFE0F" to `manLiftingWeights`,
              "\uD83E\uDD3C" to `peopleWrestling`,
              "\uD83E\uDD3C\u200D\u2640\uFE0F" to `womenWrestling`,
              "\uD83E\uDD3C\u200D\u2642\uFE0F" to `menWrestling`,
              "\uD83E\uDD38" to `personDoingCartwheel`,
              "\uD83E\uDD38\u200D\u2640\uFE0F" to `womanCartwheeling`,
              "\uD83E\uDD38\u200D\u2642\uFE0F" to `manCartwheeling`,
              "\u26F9\uFE0F" to `personBouncingBall`,
              "\u26F9\uFE0F\u200D\u2640\uFE0F" to `womanBouncingBall`,
              "\u26F9\uFE0F\u200D\u2642\uFE0F" to `manBouncingBall`,
              "\uD83E\uDD3A" to `personFencing`,
              "\uD83E\uDD3E" to `personPlayingHandball`,
              "\uD83E\uDD3E\u200D\u2640\uFE0F" to `womanPlayingHandball`,
              "\uD83E\uDD3E\u200D\u2642\uFE0F" to `manPlayingHandball`,
              "\uD83C\uDFCC\uFE0F" to `personGolfing`,
              "\uD83C\uDFCC\uFE0F\u200D\u2640\uFE0F" to `womanGolfing`,
              "\uD83C\uDFCC\uFE0F\u200D\u2642\uFE0F" to `manGolfing`,
              "\uD83C\uDFC7" to `horseRacing`,
              "\uD83E\uDDD8" to `personInLotusPosition`,
              "\uD83E\uDDD8\u200D\u2640\uFE0F" to `womanInLotusPosition`,
              "\uD83E\uDDD8\u200D\u2642\uFE0F" to `manInLotusPosition`,
              "\uD83C\uDFC4" to `personSurfing`,
              "\uD83C\uDFC4\u200D\u2640\uFE0F" to `womanSurfing`,
              "\uD83C\uDFC4\u200D\u2642\uFE0F" to `manSurfing`,
              "\uD83C\uDFCA" to `personSwimming`,
              "\uD83C\uDFCA\u200D\u2640\uFE0F" to `womanSwimming`,
              "\uD83C\uDFCA\u200D\u2642\uFE0F" to `manSwimming`,
              "\uD83E\uDD3D" to `personPlayingWaterPolo`,
              "\uD83E\uDD3D\u200D\u2640\uFE0F" to `womanPlayingWaterPolo`,
              "\uD83E\uDD3D\u200D\u2642\uFE0F" to `manPlayingWaterPolo`,
              "\uD83D\uDEA3" to `personRowingBoat`,
              "\uD83D\uDEA3\u200D\u2640\uFE0F" to `womanRowingBoat`,
              "\uD83D\uDEA3\u200D\u2642\uFE0F" to `manRowingBoat`,
              "\uD83E\uDDD7" to `personClimbing`,
              "\uD83E\uDDD7\u200D\u2640\uFE0F" to `womanClimbing`,
              "\uD83E\uDDD7\u200D\u2642\uFE0F" to `manClimbing`,
              "\uD83D\uDEB5" to `personMountainBiking`,
              "\uD83D\uDEB5\u200D\u2640\uFE0F" to `womanMountainBiking`,
              "\uD83D\uDEB5\u200D\u2642\uFE0F" to `manMountainBiking`,
              "\uD83D\uDEB4" to `personBiking`,
              "\uD83D\uDEB4\u200D\u2640\uFE0F" to `womanBiking`,
              "\uD83D\uDEB4\u200D\u2642\uFE0F" to `manBiking`,
              "\uD83C\uDFC6" to `trophy`,
              "\uD83E\uDD47" to `firstPlace`,
              "\uD83E\uDD48" to `secondPlace`,
              "\uD83E\uDD49" to `thirdPlace`,
              "\uD83C\uDFC5" to `medal`,
              "\uD83C\uDF96\uFE0F" to `militaryMedal`,
              "\uD83C\uDFF5\uFE0F" to `rosette`,
              "\uD83C\uDF97\uFE0F" to `reminderRibbon`,
              "\uD83C\uDFAB" to `ticket`,
              "\uD83C\uDF9F\uFE0F" to `tickets`,
              "\uD83C\uDFAA" to `circusTent`,
              "\uD83E\uDD39" to `personJuggling`,
              "\uD83E\uDD39\u200D\u2640\uFE0F" to `womanJuggling`,
              "\uD83E\uDD39\u200D\u2642\uFE0F" to `manJuggling`,
              "\uD83C\uDFAD" to `performingArts`,
              "\uD83C\uDFA8" to `art`,
              "\uD83C\uDFAC" to `clapper`,
              "\uD83C\uDFA4" to `microphone`,
              "\uD83C\uDFA7" to `headphones`,
              "\uD83C\uDFBC" to `musicalScore`,
              "\uD83C\uDFB9" to `musicalKeyboard`,
              "\uD83E\uDD41" to `drum`,
              "\uD83C\uDFB7" to `saxophone`,
              "\uD83C\uDFBA" to `trumpet`,
              "\uD83E\uDE95" to `banjo`,
              "\uD83C\uDFB8" to `guitar`,
              "\uD83C\uDFBB" to `violin`,
              "\uD83C\uDFB2" to `gameDie`,
              "\u265F\uFE0F" to `chessPawn`,
              "\uD83C\uDFAF" to `dart`,
              "\uD83E\uDE81" to `kite`,
              "\uD83E\uDE80" to `yoYo`,
              "\uD83C\uDFB3" to `bowling`,
              "\uD83C\uDFAE" to `videoGame`,
              "\uD83C\uDFB0" to `slotMachine`,
              "\uD83E\uDDE9" to `jigsaw`,
              "\uD83D\uDE97" to `redCar`,
              "\uD83D\uDE95" to `taxi`,
              "\uD83D\uDE99" to `blueCar`,
              "\uD83D\uDE8C" to `bus`,
              "\uD83D\uDE8E" to `trolleybus`,
              "\uD83C\uDFCE\uFE0F" to `raceCar`,
              "\uD83D\uDE93" to `policeCar`,
              "\uD83D\uDE91" to `ambulance`,
              "\uD83D\uDE92" to `fireEngine`,
              "\uD83D\uDE90" to `minibus`,
              "\uD83D\uDE9A" to `truck`,
              "\uD83D\uDE9B" to `articulatedLorry`,
              "\uD83D\uDE9C" to `tractor`,
              "\uD83D\uDEFA" to `autoRickshaw`,
              "\uD83D\uDEF5" to `motorScooter`,
              "\uD83C\uDFCD\uFE0F" to `motorcycle`,
              "\uD83D\uDEF4" to `scooter`,
              "\uD83D\uDEB2" to `bike`,
              "\uD83E\uDDBC" to `motorizedWheelchair`,
              "\uD83E\uDDBD" to `manualWheelchair`,
              "\uD83D\uDEA8" to `rotatingLight`,
              "\uD83D\uDE94" to `oncomingPoliceCar`,
              "\uD83D\uDE8D" to `oncomingBus`,
              "\uD83D\uDE98" to `oncomingAutomobile`,
              "\uD83D\uDE96" to `oncomingTaxi`,
              "\uD83D\uDEA1" to `aerialTramway`,
              "\uD83D\uDEA0" to `mountainCableway`,
              "\uD83D\uDE9F" to `suspensionRailway`,
              "\uD83D\uDE83" to `railwayCar`,
              "\uD83D\uDE8B" to `train`,
              "\uD83D\uDE9E" to `mountainRailway`,
              "\uD83D\uDE9D" to `monorail`,
              "\uD83D\uDE84" to `bullettrainSide`,
              "\uD83D\uDE85" to `bullettrainFront`,
              "\uD83D\uDE88" to `lightRail`,
              "\uD83D\uDE82" to `steamLocomotive`,
              "\uD83D\uDE86" to `train2`,
              "\uD83D\uDE87" to `metro`,
              "\uD83D\uDE8A" to `tram`,
              "\uD83D\uDE89" to `station`,
              "\u2708\uFE0F" to `airplane`,
              "\uD83D\uDEEB" to `airplaneDeparture`,
              "\uD83D\uDEEC" to `airplaneArriving`,
              "\uD83D\uDEE9\uFE0F" to `airplaneSmall`,
              "\uD83D\uDCBA" to `seat`,
              "\uD83D\uDEF0\uFE0F" to `satelliteOrbital`,
              "\uD83D\uDE80" to `rocket`,
              "\uD83D\uDEF8" to `flyingSaucer`,
              "\uD83D\uDE81" to `helicopter`,
              "\uD83D\uDEF6" to `canoe`,
              "\u26F5" to `sailboat`,
              "\uD83D\uDEA4" to `speedboat`,
              "\uD83D\uDEE5\uFE0F" to `motorboat`,
              "\uD83D\uDEF3\uFE0F" to `cruiseShip`,
              "\u26F4\uFE0F" to `ferry`,
              "\uD83D\uDEA2" to `ship`,
              "\u2693" to `anchor`,
              "\u26FD" to `fuelpump`,
              "\uD83D\uDEA7" to `construction`,
              "\uD83D\uDEA6" to `verticalTrafficLight`,
              "\uD83D\uDEA5" to `trafficLight`,
              "\uD83D\uDE8F" to `busstop`,
              "\uD83D\uDDFA\uFE0F" to `map`,
              "\uD83D\uDDFF" to `moyai`,
              "\uD83D\uDDFD" to `statueOfLiberty`,
              "\uD83D\uDDFC" to `tokyoTower`,
              "\uD83C\uDFF0" to `europeanCastle`,
              "\uD83C\uDFEF" to `japaneseCastle`,
              "\uD83C\uDFDF\uFE0F" to `stadium`,
              "\uD83C\uDFA1" to `ferrisWheel`,
              "\uD83C\uDFA2" to `rollerCoaster`,
              "\uD83C\uDFA0" to `carouselHorse`,
              "\u26F2" to `fountain`,
              "\u26F1\uFE0F" to `beachUmbrella`,
              "\uD83C\uDFD6\uFE0F" to `beach`,
              "\uD83C\uDFDD\uFE0F" to `island`,
              "\uD83C\uDFDC\uFE0F" to `desert`,
              "\uD83C\uDF0B" to `volcano`,
              "\u26F0\uFE0F" to `mountain`,
              "\uD83C\uDFD4\uFE0F" to `mountainSnow`,
              "\uD83D\uDDFB" to `mountFuji`,
              "\uD83C\uDFD5\uFE0F" to `camping`,
              "\u26FA" to `tent`,
              "\uD83C\uDFE0" to `house`,
              "\uD83C\uDFE1" to `houseWithGarden`,
              "\uD83C\uDFD8\uFE0F" to `homes`,
              "\uD83C\uDFDA\uFE0F" to `houseAbandoned`,
              "\uD83C\uDFD7\uFE0F" to `constructionSite`,
              "\uD83C\uDFED" to `factory`,
              "\uD83C\uDFE2" to `office`,
              "\uD83C\uDFEC" to `departmentStore`,
              "\uD83C\uDFE3" to `postOffice`,
              "\uD83C\uDFE4" to `europeanPostOffice`,
              "\uD83C\uDFE5" to `hospital`,
              "\uD83C\uDFE6" to `bank`,
              "\uD83C\uDFE8" to `hotel`,
              "\uD83C\uDFEA" to `convenienceStore`,
              "\uD83C\uDFEB" to `school`,
              "\uD83C\uDFE9" to `loveHotel`,
              "\uD83D\uDC92" to `wedding`,
              "\uD83C\uDFDB\uFE0F" to `classicalBuilding`,
              "\u26EA" to `church`,
              "\uD83D\uDD4C" to `mosque`,
              "\uD83D\uDED5" to `hinduTemple`,
              "\uD83D\uDD4D" to `synagogue`,
              "\uD83D\uDD4B" to `kaaba`,
              "\u26E9\uFE0F" to `shintoShrine`,
              "\uD83D\uDEE4\uFE0F" to `railwayTrack`,
              "\uD83D\uDEE3\uFE0F" to `motorway`,
              "\uD83D\uDDFE" to `japan`,
              "\uD83C\uDF91" to `riceScene`,
              "\uD83C\uDFDE\uFE0F" to `park`,
              "\uD83C\uDF05" to `sunrise`,
              "\uD83C\uDF04" to `sunriseOverMountains`,
              "\uD83C\uDF20" to `stars`,
              "\uD83C\uDF87" to `sparkler`,
              "\uD83C\uDF86" to `fireworks`,
              "\uD83C\uDF07" to `citySunset`,
              "\uD83C\uDF06" to `cityDusk`,
              "\uD83C\uDFD9\uFE0F" to `cityscape`,
              "\uD83C\uDF03" to `nightWithStars`,
              "\uD83C\uDF0C" to `milkyWay`,
              "\uD83C\uDF09" to `bridgeAtNight`,
              "\uD83C\uDF01" to `foggy`,
              "\u231A" to `watch`,
              "\uD83D\uDCF1" to `iphone`,
              "\uD83D\uDCF2" to `calling`,
              "\uD83D\uDCBB" to `computer`,
              "\u2328\uFE0F" to `keyboard`,
              "\uD83D\uDDA5\uFE0F" to `desktop`,
              "\uD83D\uDDA8\uFE0F" to `printer`,
              "\uD83D\uDDB1\uFE0F" to `mouseThreeButton`,
              "\uD83D\uDDB2\uFE0F" to `trackball`,
              "\uD83D\uDD79\uFE0F" to `joystick`,
              "\uD83D\uDDDC\uFE0F" to `compression`,
              "\uD83D\uDCBD" to `minidisc`,
              "\uD83D\uDCBE" to `floppyDisk`,
              "\uD83D\uDCBF" to `cd`,
              "\uD83D\uDCC0" to `dvd`,
              "\uD83D\uDCFC" to `vhs`,
              "\uD83D\uDCF7" to `camera`,
              "\uD83D\uDCF8" to `cameraWithFlash`,
              "\uD83D\uDCF9" to `videoCamera`,
              "\uD83C\uDFA5" to `movieCamera`,
              "\uD83D\uDCFD\uFE0F" to `projector`,
              "\uD83C\uDF9E\uFE0F" to `filmFrames`,
              "\uD83D\uDCDE" to `telephoneReceiver`,
              "\u260E\uFE0F" to `telephone`,
              "\uD83D\uDCDF" to `pager`,
              "\uD83D\uDCE0" to `fax`,
              "\uD83D\uDCFA" to `tv`,
              "\uD83D\uDCFB" to `radio`,
              "\uD83C\uDF99\uFE0F" to `microphone2`,
              "\uD83C\uDF9A\uFE0F" to `levelSlider`,
              "\uD83C\uDF9B\uFE0F" to `controlKnobs`,
              "\uD83E\uDDED" to `compass`,
              "\u23F1\uFE0F" to `stopwatch`,
              "\u23F2\uFE0F" to `timer`,
              "\u23F0" to `alarmClock`,
              "\uD83D\uDD70\uFE0F" to `clock`,
              "\u231B" to `hourglass`,
              "\u23F3" to `hourglassFlowingSand`,
              "\uD83D\uDCE1" to `satellite`,
              "\uD83D\uDD0B" to `battery`,
              "\uD83D\uDD0C" to `electricPlug`,
              "\uD83D\uDCA1" to `bulb`,
              "\uD83D\uDD26" to `flashlight`,
              "\uD83D\uDD6F\uFE0F" to `candle`,
              "\uD83E\uDDEF" to `fireExtinguisher`,
              "\uD83D\uDEE2\uFE0F" to `oil`,
              "\uD83D\uDCB8" to `moneyWithWings`,
              "\uD83D\uDCB5" to `dollar`,
              "\uD83D\uDCB4" to `yen`,
              "\uD83D\uDCB6" to `euro`,
              "\uD83D\uDCB7" to `pound`,
              "\uD83D\uDCB0" to `moneybag`,
              "\uD83D\uDCB3" to `creditCard`,
              "\uD83D\uDC8E" to `gem`,
              "\u2696\uFE0F" to `scales`,
              "\uD83E\uDDF0" to `toolbox`,
              "\uD83D\uDD27" to `wrench`,
              "\uD83D\uDD28" to `hammer`,
              "\u2692\uFE0F" to `hammerPick`,
              "\uD83D\uDEE0\uFE0F" to `tools`,
              "\u26CF\uFE0F" to `pick`,
              "\uD83D\uDD29" to `nutAndBolt`,
              "\u2699\uFE0F" to `gear`,
              "\uD83E\uDDF1" to `bricks`,
              "\u26D3\uFE0F" to `chains`,
              "\uD83E\uDDF2" to `magnet`,
              "\uD83D\uDD2B" to `gun`,
              "\uD83D\uDCA3" to `bomb`,
              "\uD83E\uDDE8" to `firecracker`,
              "\uD83E\uDE93" to `axe`,
              "\uD83E\uDE92" to `razor`,
              "\uD83D\uDD2A" to `knife`,
              "\uD83D\uDDE1\uFE0F" to `dagger`,
              "\u2694\uFE0F" to `crossedSwords`,
              "\uD83D\uDEE1\uFE0F" to `shield`,
              "\uD83D\uDEAC" to `smoking`,
              "\u26B0\uFE0F" to `coffin`,
              "\u26B1\uFE0F" to `urn`,
              "\uD83C\uDFFA" to `amphora`,
              "\uD83E\uDE94" to `diyaLamp`,
              "\uD83D\uDD2E" to `crystalBall`,
              "\uD83D\uDCFF" to `prayerBeads`,
              "\uD83E\uDDFF" to `nazarAmulet`,
              "\uD83D\uDC88" to `barber`,
              "\u2697\uFE0F" to `alembic`,
              "\uD83D\uDD2D" to `telescope`,
              "\uD83D\uDD2C" to `microscope`,
              "\uD83D\uDD73\uFE0F" to `hole`,
              "\uD83E\uDDAF" to `probingCane`,
              "\uD83E\uDE7A" to `stethoscope`,
              "\uD83E\uDE79" to `adhesiveBandage`,
              "\uD83D\uDC8A" to `pill`,
              "\uD83D\uDC89" to `syringe`,
              "\uD83E\uDE78" to `dropOfBlood`,
              "\uD83E\uDDEC" to `dna`,
              "\uD83E\uDDA0" to `microbe`,
              "\uD83E\uDDEB" to `petriDish`,
              "\uD83E\uDDEA" to `testTube`,
              "\uD83C\uDF21\uFE0F" to `thermometer`,
              "\uD83E\uDE91" to `chair`,
              "\uD83E\uDDF9" to `broom`,
              "\uD83E\uDDFA" to `basket`,
              "\uD83E\uDDFB" to `rollOfPaper`,
              "\uD83D\uDEBD" to `toilet`,
              "\uD83D\uDEB0" to `potableWater`,
              "\uD83D\uDEBF" to `shower`,
              "\uD83D\uDEC1" to `bathtub`,
              "\uD83D\uDEC0" to `bath`,
              "\uD83E\uDDFC" to `soap`,
              "\uD83E\uDDFD" to `sponge`,
              "\uD83E\uDDF4" to `squeezeBottle`,
              "\uD83D\uDECE\uFE0F" to `bellhop`,
              "\uD83D\uDD11" to `key`,
              "\uD83D\uDDDD\uFE0F" to `key2`,
              "\uD83D\uDEAA" to `door`,
              "\uD83D\uDECB\uFE0F" to `couch`,
              "\uD83D\uDECF\uFE0F" to `bed`,
              "\uD83D\uDECC" to `sleepingAccommodation`,
              "\uD83E\uDDF8" to `teddyBear`,
              "\uD83D\uDDBC\uFE0F" to `framePhoto`,
              "\uD83D\uDECD\uFE0F" to `shoppingBags`,
              "\uD83D\uDED2" to `shoppingCart`,
              "\uD83C\uDF81" to `gift`,
              "\uD83C\uDF88" to `balloon`,
              "\uD83C\uDF8F" to `flags`,
              "\uD83C\uDF80" to `ribbon`,
              "\uD83C\uDF8A" to `confettiBall`,
              "\uD83C\uDF89" to `tada`,
              "\uD83C\uDF8E" to `dolls`,
              "\uD83C\uDFEE" to `izakayaLantern`,
              "\uD83C\uDF90" to `windChime`,
              "\uD83E\uDDE7" to `redEnvelope`,
              "\u2709\uFE0F" to `envelope`,
              "\uD83D\uDCE9" to `envelopeWithArrow`,
              "\uD83D\uDCE8" to `incomingEnvelope`,
              "\uD83D\uDCE7" to `eMail`,
              "\uD83D\uDC8C" to `loveLetter`,
              "\uD83D\uDCE5" to `inboxTray`,
              "\uD83D\uDCE4" to `outboxTray`,
              "\uD83D\uDCE6" to `package`,
              "\uD83C\uDFF7\uFE0F" to `label`,
              "\uD83D\uDCEA" to `mailboxClosed`,
              "\uD83D\uDCEB" to `mailbox`,
              "\uD83D\uDCEC" to `mailboxWithMail`,
              "\uD83D\uDCED" to `mailboxWithNoMail`,
              "\uD83D\uDCEE" to `postbox`,
              "\uD83D\uDCEF" to `postalHorn`,
              "\uD83D\uDCDC" to `scroll`,
              "\uD83D\uDCC3" to `pageWithCurl`,
              "\uD83D\uDCC4" to `pageFacingUp`,
              "\uD83D\uDCD1" to `bookmarkTabs`,
              "\uD83E\uDDFE" to `receipt`,
              "\uD83D\uDCCA" to `barChart`,
              "\uD83D\uDCC8" to `chartWithUpwardsTrend`,
              "\uD83D\uDCC9" to `chartWithDownwardsTrend`,
              "\uD83D\uDDD2\uFE0F" to `notepadSpiral`,
              "\uD83D\uDDD3\uFE0F" to `calendarSpiral`,
              "\uD83D\uDCC6" to `calendar`,
              "\uD83D\uDCC5" to `date`,
              "\uD83D\uDDD1\uFE0F" to `wastebasket`,
              "\uD83D\uDCC7" to `cardIndex`,
              "\uD83D\uDDC3\uFE0F" to `cardBox`,
              "\uD83D\uDDF3\uFE0F" to `ballotBox`,
              "\uD83D\uDDC4\uFE0F" to `fileCabinet`,
              "\uD83D\uDCCB" to `clipboard`,
              "\uD83D\uDCC1" to `fileFolder`,
              "\uD83D\uDCC2" to `openFileFolder`,
              "\uD83D\uDDC2\uFE0F" to `dividers`,
              "\uD83D\uDDDE\uFE0F" to `newspaper2`,
              "\uD83D\uDCF0" to `newspaper`,
              "\uD83D\uDCD3" to `notebook`,
              "\uD83D\uDCD4" to `notebookWithDecorativeCover`,
              "\uD83D\uDCD2" to `ledger`,
              "\uD83D\uDCD5" to `closedBook`,
              "\uD83D\uDCD7" to `greenBook`,
              "\uD83D\uDCD8" to `blueBook`,
              "\uD83D\uDCD9" to `orangeBook`,
              "\uD83D\uDCDA" to `books`,
              "\uD83D\uDCD6" to `book`,
              "\uD83D\uDD16" to `bookmark`,
              "\uD83E\uDDF7" to `safetyPin`,
              "\uD83D\uDD17" to `link`,
              "\uD83D\uDCCE" to `paperclip`,
              "\uD83D\uDD87\uFE0F" to `paperclips`,
              "\uD83D\uDCD0" to `triangularRuler`,
              "\uD83D\uDCCF" to `straightRuler`,
              "\uD83E\uDDEE" to `abacus`,
              "\uD83D\uDCCC" to `pushpin`,
              "\uD83D\uDCCD" to `roundPushpin`,
              "\u2702\uFE0F" to `scissors`,
              "\uD83D\uDD8A\uFE0F" to `penBallpoint`,
              "\uD83D\uDD8B\uFE0F" to `penFountain`,
              "\u2712\uFE0F" to `blackNib`,
              "\uD83D\uDD8C\uFE0F" to `paintbrush`,
              "\uD83D\uDD8D\uFE0F" to `crayon`,
              "\uD83D\uDCDD" to `pencil`,
              "\u270F\uFE0F" to `pencil2`,
              "\uD83D\uDD0D" to `mag`,
              "\uD83D\uDD0E" to `magRight`,
              "\uD83D\uDD0F" to `lockWithInkPen`,
              "\uD83D\uDD10" to `closedLockWithKey`,
              "\uD83D\uDD12" to `lock`,
              "\uD83D\uDD13" to `unlock`,
              "\u2764\uFE0F" to `heart`,
              "\uD83E\uDDE1" to `orangeHeart`,
              "\uD83D\uDC9B" to `yellowHeart`,
              "\uD83D\uDC9A" to `greenHeart`,
              "\uD83D\uDC99" to `blueHeart`,
              "\uD83D\uDC9C" to `purpleHeart`,
              "\uD83D\uDDA4" to `blackHeart`,
              "\uD83E\uDD0E" to `brownHeart`,
              "\uD83E\uDD0D" to `whiteHeart`,
              "\uD83D\uDC94" to `brokenHeart`,
              "\u2763\uFE0F" to `heartExclamation`,
              "\uD83D\uDC95" to `twoHearts`,
              "\uD83D\uDC9E" to `revolvingHearts`,
              "\uD83D\uDC93" to `heartbeat`,
              "\uD83D\uDC97" to `heartpulse`,
              "\uD83D\uDC96" to `sparklingHeart`,
              "\uD83D\uDC98" to `cupid`,
              "\uD83D\uDC9D" to `giftHeart`,
              "\uD83D\uDC9F" to `heartDecoration`,
              "\u262E\uFE0F" to `peace`,
              "\u271D\uFE0F" to `cross`,
              "\u262A\uFE0F" to `starAndCrescent`,
              "\uD83D\uDD49\uFE0F" to `omSymbol`,
              "\u2638\uFE0F" to `wheelOfDharma`,
              "\u2721\uFE0F" to `starOfDavid`,
              "\uD83D\uDD2F" to `sixPointedStar`,
              "\uD83D\uDD4E" to `menorah`,
              "\u262F\uFE0F" to `yinYang`,
              "\u2626\uFE0F" to `orthodoxCross`,
              "\uD83D\uDED0" to `placeOfWorship`,
              "\u26CE" to `ophiuchus`,
              "\u2648" to `aries`,
              "\u2649" to `taurus`,
              "\u264A" to `gemini`,
              "\u264B" to `cancer`,
              "\u264C" to `leo`,
              "\u264D" to `virgo`,
              "\u264E" to `libra`,
              "\u264F" to `scorpius`,
              "\u2650" to `sagittarius`,
              "\u2651" to `capricorn`,
              "\u2652" to `aquarius`,
              "\u2653" to `pisces`,
              "\uD83C\uDD94" to `id`,
              "\u269B\uFE0F" to `atom`,
              "\uD83C\uDE51" to `accept`,
              "\u2622\uFE0F" to `radioactive`,
              "\u2623\uFE0F" to `biohazard`,
              "\uD83D\uDCF4" to `mobilePhoneOff`,
              "\uD83D\uDCF3" to `vibrationMode`,
              "\uD83C\uDE36" to `u6709`,
              "\uD83C\uDE1A" to `u7121`,
              "\uD83C\uDE38" to `u7533`,
              "\uD83C\uDE3A" to `u55b6`,
              "\uD83C\uDE37\uFE0F" to `u6708`,
              "\u2734\uFE0F" to `eightPointedBlackStar`,
              "\uD83C\uDD9A" to `vs`,
              "\uD83D\uDCAE" to `whiteFlower`,
              "\uD83C\uDE50" to `ideographAdvantage`,
              "\u3299\uFE0F" to `secret`,
              "\u3297\uFE0F" to `congratulations`,
              "\uD83C\uDE34" to `u5408`,
              "\uD83C\uDE35" to `u6e80`,
              "\uD83C\uDE39" to `u5272`,
              "\uD83C\uDE32" to `u7981`,
              "\uD83C\uDD70\uFE0F" to `a`,
              "\uD83C\uDD71\uFE0F" to `b`,
              "\uD83C\uDD8E" to `ab`,
              "\uD83C\uDD91" to `cl`,
              "\uD83C\uDD7E\uFE0F" to `o2`,
              "\uD83C\uDD98" to `sos`,
              "\u274C" to `x`,
              "\u2B55" to `o`,
              "\uD83D\uDED1" to `octagonalSign`,
              "\u26D4" to `noEntry`,
              "\uD83D\uDCDB" to `nameBadge`,
              "\uD83D\uDEAB" to `noEntrySign`,
              "\uD83D\uDCAF" to `100`,
              "\uD83D\uDCA2" to `anger`,
              "\u2668\uFE0F" to `hotsprings`,
              "\uD83D\uDEB7" to `noPedestrians`,
              "\uD83D\uDEAF" to `doNotLitter`,
              "\uD83D\uDEB3" to `noBicycles`,
              "\uD83D\uDEB1" to `nonPotableWater`,
              "\uD83D\uDD1E" to `underage`,
              "\uD83D\uDCF5" to `noMobilePhones`,
              "\uD83D\uDEAD" to `noSmoking`,
              "\u2757" to `exclamation`,
              "\u2755" to `greyExclamation`,
              "\u2753" to `question`,
              "\u2754" to `greyQuestion`,
              "\u203C\uFE0F" to `bangbang`,
              "\u2049\uFE0F" to `interrobang`,
              "\uD83D\uDD05" to `lowBrightness`,
              "\uD83D\uDD06" to `highBrightness`,
              "\u303D\uFE0F" to `partAlternationMark`,
              "\u26A0\uFE0F" to `warning`,
              "\uD83D\uDEB8" to `childrenCrossing`,
              "\uD83D\uDD31" to `trident`,
              "\u269C\uFE0F" to `fleurDeLis`,
              "\uD83D\uDD30" to `beginner`,
              "\u267B\uFE0F" to `recycle`,
              "\u2705" to `whiteCheckMark`,
              "\uD83C\uDE2F" to `u6307`,
              "\uD83D\uDCB9" to `chart`,
              "\u2747\uFE0F" to `sparkle`,
              "\u2733\uFE0F" to `eightSpokedAsterisk`,
              "\u274E" to `negativeSquaredCrossMark`,
              "\uD83C\uDF10" to `globeWithMeridians`,
              "\uD83D\uDCA0" to `diamondShapeWithADotInside`,
              "\u24C2\uFE0F" to `m`,
              "\uD83C\uDF00" to `cyclone`,
              "\uD83D\uDCA4" to `zzz`,
              "\uD83C\uDFE7" to `atm`,
              "\uD83D\uDEBE" to `wc`,
              "\u267F" to `wheelchair`,
              "\uD83C\uDD7F\uFE0F" to `parking`,
              "\uD83C\uDE33" to `u7a7a`,
              "\uD83C\uDE02\uFE0F" to `sa`,
              "\uD83D\uDEC2" to `passportControl`,
              "\uD83D\uDEC3" to `customs`,
              "\uD83D\uDEC4" to `baggageClaim`,
              "\uD83D\uDEC5" to `leftLuggage`,
              "\uD83D\uDEB9" to `mens`,
              "\uD83D\uDEBA" to `womens`,
              "\uD83D\uDEBC" to `babySymbol`,
              "\uD83D\uDEBB" to `restroom`,
              "\uD83D\uDEAE" to `putLitterInItsPlace`,
              "\uD83C\uDFA6" to `cinema`,
              "\uD83D\uDCF6" to `signalStrength`,
              "\uD83C\uDE01" to `koko`,
              "\uD83D\uDD23" to `symbols`,
              "\u2139\uFE0F" to `informationSource`,
              "\uD83D\uDD24" to `abc`,
              "\uD83D\uDD21" to `abcd`,
              "\uD83D\uDD20" to `capitalAbcd`,
              "\uD83C\uDD96" to `ng`,
              "\uD83C\uDD97" to `ok`,
              "\uD83C\uDD99" to `up`,
              "\uD83C\uDD92" to `cool`,
              "\uD83C\uDD95" to `new`,
              "\uD83C\uDD93" to `free`,
              "0\uFE0F\u20E3" to `zero`,
              "1\uFE0F\u20E3" to `one`,
              "2\uFE0F\u20E3" to `two`,
              "3\uFE0F\u20E3" to `three`,
              "4\uFE0F\u20E3" to `four`,
              "5\uFE0F\u20E3" to `five`,
              "6\uFE0F\u20E3" to `six`,
              "7\uFE0F\u20E3" to `seven`,
              "8\uFE0F\u20E3" to `eight`,
              "9\uFE0F\u20E3" to `nine`,
              "\uD83D\uDD1F" to `keycapTen`,
              "\uD83D\uDD22" to `1234`,
              "#\uFE0F\u20E3" to `hash`,
              "*\uFE0F\u20E3" to `asterisk`,
              "\u23CF\uFE0F" to `eject`,
              "\u25B6\uFE0F" to `arrowForward`,
              "\u23F8\uFE0F" to `pauseButton`,
              "\u23EF\uFE0F" to `playPause`,
              "\u23F9\uFE0F" to `stopButton`,
              "\u23FA\uFE0F" to `recordButton`,
              "\u23ED\uFE0F" to `trackNext`,
              "\u23EE\uFE0F" to `trackPrevious`,
              "\u23E9" to `fastForward`,
              "\u23EA" to `rewind`,
              "\u23EB" to `arrowDoubleUp`,
              "\u23EC" to `arrowDoubleDown`,
              "\u25C0\uFE0F" to `arrowBackward`,
              "\uD83D\uDD3C" to `arrowUpSmall`,
              "\uD83D\uDD3D" to `arrowDownSmall`,
              "\u27A1\uFE0F" to `arrowRight`,
              "\u2B05\uFE0F" to `arrowLeft`,
              "\u2B06\uFE0F" to `arrowUp`,
              "\u2B07\uFE0F" to `arrowDown`,
              "\u2197\uFE0F" to `arrowUpperRight`,
              "\u2198\uFE0F" to `arrowLowerRight`,
              "\u2199\uFE0F" to `arrowLowerLeft`,
              "\u2196\uFE0F" to `arrowUpperLeft`,
              "\u2195\uFE0F" to `arrowUpDown`,
              "\u2194\uFE0F" to `leftRightArrow`,
              "\u21AA\uFE0F" to `arrowRightHook`,
              "\u21A9\uFE0F" to `leftwardsArrowWithHook`,
              "\u2934\uFE0F" to `arrowHeadingUp`,
              "\u2935\uFE0F" to `arrowHeadingDown`,
              "\uD83D\uDD00" to `twistedRightwardsArrows`,
              "\uD83D\uDD01" to `repeat`,
              "\uD83D\uDD02" to `repeatOne`,
              "\uD83D\uDD04" to `arrowsCounterclockwise`,
              "\uD83D\uDD03" to `arrowsClockwise`,
              "\uD83C\uDFB5" to `musicalNote`,
              "\uD83C\uDFB6" to `notes`,
              "\u2795" to `heavyPlusSign`,
              "\u2796" to `heavyMinusSign`,
              "\u2797" to `heavyDivisionSign`,
              "\u2716\uFE0F" to `heavyMultiplicationX`,
              "\u267E\uFE0F" to `infinity`,
              "\uD83D\uDCB2" to `heavyDollarSign`,
              "\uD83D\uDCB1" to `currencyExchange`,
              "\u2122\uFE0F" to `tm`,
              "\u00A9\uFE0F" to `copyright`,
              "\u00AE\uFE0F" to `registered`,
              "\u3030\uFE0F" to `wavyDash`,
              "\u27B0" to `curlyLoop`,
              "\u27BF" to `loop`,
              "\uD83D\uDD1A" to `end`,
              "\uD83D\uDD19" to `back`,
              "\uD83D\uDD1B" to `on`,
              "\uD83D\uDD1D" to `top`,
              "\uD83D\uDD1C" to `soon`,
              "\u2714\uFE0F" to `heavyCheckMark`,
              "\u2611\uFE0F" to `ballotBoxWithCheck`,
              "\uD83D\uDD18" to `radioButton`,
              "\u26AA" to `whiteCircle`,
              "\u26AB" to `blackCircle`,
              "\uD83D\uDD34" to `redCircle`,
              "\uD83D\uDD35" to `blueCircle`,
              "\uD83D\uDFE4" to `brownCircle`,
              "\uD83D\uDFE3" to `purpleCircle`,
              "\uD83D\uDFE2" to `greenCircle`,
              "\uD83D\uDFE1" to `yellowCircle`,
              "\uD83D\uDFE0" to `orangeCircle`,
              "\uD83D\uDD3A" to `smallRedTriangle`,
              "\uD83D\uDD3B" to `smallRedTriangleDown`,
              "\uD83D\uDD38" to `smallOrangeDiamond`,
              "\uD83D\uDD39" to `smallBlueDiamond`,
              "\uD83D\uDD36" to `largeOrangeDiamond`,
              "\uD83D\uDD37" to `largeBlueDiamond`,
              "\uD83D\uDD33" to `whiteSquareButton`,
              "\uD83D\uDD32" to `blackSquareButton`,
              "\u25AA\uFE0F" to `blackSmallSquare`,
              "\u25AB\uFE0F" to `whiteSmallSquare`,
              "\u25FE" to `blackMediumSmallSquare`,
              "\u25FD" to `whiteMediumSmallSquare`,
              "\u25FC\uFE0F" to `blackMediumSquare`,
              "\u25FB\uFE0F" to `whiteMediumSquare`,
              "\u2B1B" to `blackLargeSquare`,
              "\u2B1C" to `whiteLargeSquare`,
              "\uD83D\uDFE7" to `orangeSquare`,
              "\uD83D\uDFE6" to `blueSquare`,
              "\uD83D\uDFE5" to `redSquare`,
              "\uD83D\uDFEB" to `brownSquare`,
              "\uD83D\uDFEA" to `purpleSquare`,
              "\uD83D\uDFE9" to `greenSquare`,
              "\uD83D\uDFE8" to `yellowSquare`,
              "\uD83D\uDD08" to `speaker`,
              "\uD83D\uDD07" to `mute`,
              "\uD83D\uDD09" to `sound`,
              "\uD83D\uDD0A" to `loudSound`,
              "\uD83D\uDD14" to `bell`,
              "\uD83D\uDD15" to `noBell`,
              "\uD83D\uDCE3" to `mega`,
              "\uD83D\uDCE2" to `loudspeaker`,
              "\uD83D\uDDE8\uFE0F" to `speechLeft`,
              "\uD83D\uDC41\u200D\uD83D\uDDE8" to `eyeInSpeechBubble`,
              "\uD83D\uDCAC" to `speechBalloon`,
              "\uD83D\uDCAD" to `thoughtBalloon`,
              "\uD83D\uDDEF\uFE0F" to `angerRight`,
              "\u2660\uFE0F" to `spades`,
              "\u2663\uFE0F" to `clubs`,
              "\u2665\uFE0F" to `hearts`,
              "\u2666\uFE0F" to `diamonds`,
              "\uD83C\uDCCF" to `blackJoker`,
              "\uD83C\uDFB4" to `flowerPlayingCards`,
              "\uD83C\uDC04" to `mahjong`,
              "\uD83D\uDD50" to `clock1`,
              "\uD83D\uDD51" to `clock2`,
              "\uD83D\uDD52" to `clock3`,
              "\uD83D\uDD53" to `clock4`,
              "\uD83D\uDD54" to `clock5`,
              "\uD83D\uDD55" to `clock6`,
              "\uD83D\uDD56" to `clock7`,
              "\uD83D\uDD57" to `clock8`,
              "\uD83D\uDD58" to `clock9`,
              "\uD83D\uDD59" to `clock10`,
              "\uD83D\uDD5A" to `clock11`,
              "\uD83D\uDD5B" to `clock12`,
              "\uD83D\uDD5C" to `clock130`,
              "\uD83D\uDD5D" to `clock230`,
              "\uD83D\uDD5E" to `clock330`,
              "\uD83D\uDD5F" to `clock430`,
              "\uD83D\uDD60" to `clock530`,
              "\uD83D\uDD61" to `clock630`,
              "\uD83D\uDD62" to `clock730`,
              "\uD83D\uDD63" to `clock830`,
              "\uD83D\uDD64" to `clock930`,
              "\uD83D\uDD65" to `clock1030`,
              "\uD83D\uDD66" to `clock1130`,
              "\uD83D\uDD67" to `clock1230`,
              "\u2640\uFE0F" to `femaleSign`,
              "\u2642\uFE0F" to `maleSign`,
              "\u2695\uFE0F" to `medicalSymbol`,
              "\uD83C\uDDFF" to `regionalIndicatorZ`,
              "\uD83C\uDDFE" to `regionalIndicatorY`,
              "\uD83C\uDDFD" to `regionalIndicatorX`,
              "\uD83C\uDDFC" to `regionalIndicatorW`,
              "\uD83C\uDDFB" to `regionalIndicatorV`,
              "\uD83C\uDDFA" to `regionalIndicatorU`,
              "\uD83C\uDDF9" to `regionalIndicatorT`,
              "\uD83C\uDDF8" to `regionalIndicatorS`,
              "\uD83C\uDDF7" to `regionalIndicatorR`,
              "\uD83C\uDDF6" to `regionalIndicatorQ`,
              "\uD83C\uDDF5" to `regionalIndicatorP`,
              "\uD83C\uDDF4" to `regionalIndicatorO`,
              "\uD83C\uDDF3" to `regionalIndicatorN`,
              "\uD83C\uDDF2" to `regionalIndicatorM`,
              "\uD83C\uDDF1" to `regionalIndicatorL`,
              "\uD83C\uDDF0" to `regionalIndicatorK`,
              "\uD83C\uDDEF" to `regionalIndicatorJ`,
              "\uD83C\uDDEE" to `regionalIndicatorI`,
              "\uD83C\uDDED" to `regionalIndicatorH`,
              "\uD83C\uDDEC" to `regionalIndicatorG`,
              "\uD83C\uDDEB" to `regionalIndicatorF`,
              "\uD83C\uDDEA" to `regionalIndicatorE`,
              "\uD83C\uDDE9" to `regionalIndicatorD`,
              "\uD83C\uDDE8" to `regionalIndicatorC`,
              "\uD83C\uDDE7" to `regionalIndicatorB`,
              "\uD83C\uDDE6" to `regionalIndicatorA`,
              "\uD83C\uDFF3\uFE0F" to `flagWhite`,
              "\uD83C\uDFF4" to `flagBlack`,
              "\uD83C\uDFC1" to `checkeredFlag`,
              "\uD83D\uDEA9" to `triangularFlagOnPost`,
              "\uD83C\uDFF3\uFE0F\u200D\uD83C\uDF08" to `rainbowFlag`,
              "\uD83C\uDFF4\u200D\u2620\uFE0F" to `pirateFlag`,
              "\uD83C\uDDE6\uD83C\uDDEB" to `flagAf`,
              "\uD83C\uDDE6\uD83C\uDDFD" to `flagAx`,
              "\uD83C\uDDE6\uD83C\uDDF1" to `flagAl`,
              "\uD83C\uDDE9\uD83C\uDDFF" to `flagDz`,
              "\uD83C\uDDE6\uD83C\uDDF8" to `flagAs`,
              "\uD83C\uDDE6\uD83C\uDDE9" to `flagAd`,
              "\uD83C\uDDE6\uD83C\uDDF4" to `flagAo`,
              "\uD83C\uDDE6\uD83C\uDDEE" to `flagAi`,
              "\uD83C\uDDE6\uD83C\uDDF6" to `flagAq`,
              "\uD83C\uDDE6\uD83C\uDDEC" to `flagAg`,
              "\uD83C\uDDE6\uD83C\uDDF7" to `flagAr`,
              "\uD83C\uDDE6\uD83C\uDDF2" to `flagAm`,
              "\uD83C\uDDE6\uD83C\uDDFC" to `flagAw`,
              "\uD83C\uDDE6\uD83C\uDDFA" to `flagAu`,
              "\uD83C\uDDE6\uD83C\uDDF9" to `flagAt`,
              "\uD83C\uDDE6\uD83C\uDDFF" to `flagAz`,
              "\uD83C\uDDE7\uD83C\uDDF8" to `flagBs`,
              "\uD83C\uDDE7\uD83C\uDDED" to `flagBh`,
              "\uD83C\uDDE7\uD83C\uDDE9" to `flagBd`,
              "\uD83C\uDDE7\uD83C\uDDE7" to `flagBb`,
              "\uD83C\uDDE7\uD83C\uDDFE" to `flagBy`,
              "\uD83C\uDDE7\uD83C\uDDEA" to `flagBe`,
              "\uD83C\uDDE7\uD83C\uDDFF" to `flagBz`,
              "\uD83C\uDDE7\uD83C\uDDEF" to `flagBj`,
              "\uD83C\uDDE7\uD83C\uDDF2" to `flagBm`,
              "\uD83C\uDDE7\uD83C\uDDF9" to `flagBt`,
              "\uD83C\uDDE7\uD83C\uDDF4" to `flagBo`,
              "\uD83C\uDDE7\uD83C\uDDE6" to `flagBa`,
              "\uD83C\uDDE7\uD83C\uDDFC" to `flagBw`,
              "\uD83C\uDDE7\uD83C\uDDF7" to `flagBr`,
              "\uD83C\uDDEE\uD83C\uDDF4" to `flagIo`,
              "\uD83C\uDDFB\uD83C\uDDEC" to `flagVg`,
              "\uD83C\uDDE7\uD83C\uDDF3" to `flagBn`,
              "\uD83C\uDDE7\uD83C\uDDEC" to `flagBg`,
              "\uD83C\uDDE7\uD83C\uDDEB" to `flagBf`,
              "\uD83C\uDDE7\uD83C\uDDEE" to `flagBi`,
              "\uD83C\uDDF0\uD83C\uDDED" to `flagKh`,
              "\uD83C\uDDE8\uD83C\uDDF2" to `flagCm`,
              "\uD83C\uDDE8\uD83C\uDDE6" to `flagCa`,
              "\uD83C\uDDEE\uD83C\uDDE8" to `flagIc`,
              "\uD83C\uDDE8\uD83C\uDDFB" to `flagCv`,
              "\uD83C\uDDE7\uD83C\uDDF6" to `flagBq`,
              "\uD83C\uDDF0\uD83C\uDDFE" to `flagKy`,
              "\uD83C\uDDE8\uD83C\uDDEB" to `flagCf`,
              "\uD83C\uDDF9\uD83C\uDDE9" to `flagTd`,
              "\uD83C\uDDE8\uD83C\uDDF1" to `flagCl`,
              "\uD83C\uDDE8\uD83C\uDDF3" to `flagCn`,
              "\uD83C\uDDE8\uD83C\uDDFD" to `flagCx`,
              "\uD83C\uDDE8\uD83C\uDDE8" to `flagCc`,
              "\uD83C\uDDE8\uD83C\uDDF4" to `flagCo`,
              "\uD83C\uDDF0\uD83C\uDDF2" to `flagKm`,
              "\uD83C\uDDE8\uD83C\uDDEC" to `flagCg`,
              "\uD83C\uDDE8\uD83C\uDDE9" to `flagCd`,
              "\uD83C\uDDE8\uD83C\uDDF0" to `flagCk`,
              "\uD83C\uDDE8\uD83C\uDDF7" to `flagCr`,
              "\uD83C\uDDE8\uD83C\uDDEE" to `flagCi`,
              "\uD83C\uDDED\uD83C\uDDF7" to `flagHr`,
              "\uD83C\uDDE8\uD83C\uDDFA" to `flagCu`,
              "\uD83C\uDDE8\uD83C\uDDFC" to `flagCw`,
              "\uD83C\uDDE8\uD83C\uDDFE" to `flagCy`,
              "\uD83C\uDDE8\uD83C\uDDFF" to `flagCz`,
              "\uD83C\uDDE9\uD83C\uDDF0" to `flagDk`,
              "\uD83C\uDDE9\uD83C\uDDEF" to `flagDj`,
              "\uD83C\uDDE9\uD83C\uDDF2" to `flagDm`,
              "\uD83C\uDDE9\uD83C\uDDF4" to `flagDo`,
              "\uD83C\uDDEA\uD83C\uDDE8" to `flagEc`,
              "\uD83C\uDDEA\uD83C\uDDEC" to `flagEg`,
              "\uD83C\uDDF8\uD83C\uDDFB" to `flagSv`,
              "\uD83C\uDDEC\uD83C\uDDF6" to `flagGq`,
              "\uD83C\uDDEA\uD83C\uDDF7" to `flagEr`,
              "\uD83C\uDDEA\uD83C\uDDEA" to `flagEe`,
              "\uD83C\uDDEA\uD83C\uDDF9" to `flagEt`,
              "\uD83C\uDDEA\uD83C\uDDFA" to `flagEu`,
              "\uD83C\uDDEB\uD83C\uDDF0" to `flagFk`,
              "\uD83C\uDDEB\uD83C\uDDF4" to `flagFo`,
              "\uD83C\uDDEB\uD83C\uDDEF" to `flagFj`,
              "\uD83C\uDDEB\uD83C\uDDEE" to `flagFi`,
              "\uD83C\uDDEB\uD83C\uDDF7" to `flagFr`,
              "\uD83C\uDDEC\uD83C\uDDEB" to `flagGf`,
              "\uD83C\uDDF5\uD83C\uDDEB" to `flagPf`,
              "\uD83C\uDDF9\uD83C\uDDEB" to `flagTf`,
              "\uD83C\uDDEC\uD83C\uDDE6" to `flagGa`,
              "\uD83C\uDDEC\uD83C\uDDF2" to `flagGm`,
              "\uD83C\uDDEC\uD83C\uDDEA" to `flagGe`,
              "\uD83C\uDDE9\uD83C\uDDEA" to `flagDe`,
              "\uD83C\uDDEC\uD83C\uDDED" to `flagGh`,
              "\uD83C\uDDEC\uD83C\uDDEE" to `flagGi`,
              "\uD83C\uDDEC\uD83C\uDDF7" to `flagGr`,
              "\uD83C\uDDEC\uD83C\uDDF1" to `flagGl`,
              "\uD83C\uDDEC\uD83C\uDDE9" to `flagGd`,
              "\uD83C\uDDEC\uD83C\uDDF5" to `flagGp`,
              "\uD83C\uDDEC\uD83C\uDDFA" to `flagGu`,
              "\uD83C\uDDEC\uD83C\uDDF9" to `flagGt`,
              "\uD83C\uDDEC\uD83C\uDDEC" to `flagGg`,
              "\uD83C\uDDEC\uD83C\uDDF3" to `flagGn`,
              "\uD83C\uDDEC\uD83C\uDDFC" to `flagGw`,
              "\uD83C\uDDEC\uD83C\uDDFE" to `flagGy`,
              "\uD83C\uDDED\uD83C\uDDF9" to `flagHt`,
              "\uD83C\uDDED\uD83C\uDDF3" to `flagHn`,
              "\uD83C\uDDED\uD83C\uDDF0" to `flagHk`,
              "\uD83C\uDDED\uD83C\uDDFA" to `flagHu`,
              "\uD83C\uDDEE\uD83C\uDDF8" to `flagIs`,
              "\uD83C\uDDEE\uD83C\uDDF3" to `flagIn`,
              "\uD83C\uDDEE\uD83C\uDDE9" to `flagId`,
              "\uD83C\uDDEE\uD83C\uDDF7" to `flagIr`,
              "\uD83C\uDDEE\uD83C\uDDF6" to `flagIq`,
              "\uD83C\uDDEE\uD83C\uDDEA" to `flagIe`,
              "\uD83C\uDDEE\uD83C\uDDF2" to `flagIm`,
              "\uD83C\uDDEE\uD83C\uDDF1" to `flagIl`,
              "\uD83C\uDDEE\uD83C\uDDF9" to `flagIt`,
              "\uD83C\uDDEF\uD83C\uDDF2" to `flagJm`,
              "\uD83C\uDDEF\uD83C\uDDF5" to `flagJp`,
              "\uD83C\uDF8C" to `crossedFlags`,
              "\uD83C\uDDEF\uD83C\uDDEA" to `flagJe`,
              "\uD83C\uDDEF\uD83C\uDDF4" to `flagJo`,
              "\uD83C\uDDF0\uD83C\uDDFF" to `flagKz`,
              "\uD83C\uDDF0\uD83C\uDDEA" to `flagKe`,
              "\uD83C\uDDF0\uD83C\uDDEE" to `flagKi`,
              "\uD83C\uDDFD\uD83C\uDDF0" to `flagXk`,
              "\uD83C\uDDF0\uD83C\uDDFC" to `flagKw`,
              "\uD83C\uDDF0\uD83C\uDDEC" to `flagKg`,
              "\uD83C\uDDF1\uD83C\uDDE6" to `flagLa`,
              "\uD83C\uDDF1\uD83C\uDDFB" to `flagLv`,
              "\uD83C\uDDF1\uD83C\uDDE7" to `flagLb`,
              "\uD83C\uDDF1\uD83C\uDDF8" to `flagLs`,
              "\uD83C\uDDF1\uD83C\uDDF7" to `flagLr`,
              "\uD83C\uDDF1\uD83C\uDDFE" to `flagLy`,
              "\uD83C\uDDF1\uD83C\uDDEE" to `flagLi`,
              "\uD83C\uDDF1\uD83C\uDDF9" to `flagLt`,
              "\uD83C\uDDF1\uD83C\uDDFA" to `flagLu`,
              "\uD83C\uDDF2\uD83C\uDDF4" to `flagMo`,
              "\uD83C\uDDF2\uD83C\uDDF0" to `flagMk`,
              "\uD83C\uDDF2\uD83C\uDDEC" to `flagMg`,
              "\uD83C\uDDF2\uD83C\uDDFC" to `flagMw`,
              "\uD83C\uDDF2\uD83C\uDDFE" to `flagMy`,
              "\uD83C\uDDF2\uD83C\uDDFB" to `flagMv`,
              "\uD83C\uDDF2\uD83C\uDDF1" to `flagMl`,
              "\uD83C\uDDF2\uD83C\uDDF9" to `flagMt`,
              "\uD83C\uDDF2\uD83C\uDDED" to `flagMh`,
              "\uD83C\uDDF2\uD83C\uDDF6" to `flagMq`,
              "\uD83C\uDDF2\uD83C\uDDF7" to `flagMr`,
              "\uD83C\uDDF2\uD83C\uDDFA" to `flagMu`,
              "\uD83C\uDDFE\uD83C\uDDF9" to `flagYt`,
              "\uD83C\uDDF2\uD83C\uDDFD" to `flagMx`,
              "\uD83C\uDDEB\uD83C\uDDF2" to `flagFm`,
              "\uD83C\uDDF2\uD83C\uDDE9" to `flagMd`,
              "\uD83C\uDDF2\uD83C\uDDE8" to `flagMc`,
              "\uD83C\uDDF2\uD83C\uDDF3" to `flagMn`,
              "\uD83C\uDDF2\uD83C\uDDEA" to `flagMe`,
              "\uD83C\uDDF2\uD83C\uDDF8" to `flagMs`,
              "\uD83C\uDDF2\uD83C\uDDE6" to `flagMa`,
              "\uD83C\uDDF2\uD83C\uDDFF" to `flagMz`,
              "\uD83C\uDDF2\uD83C\uDDF2" to `flagMm`,
              "\uD83C\uDDF3\uD83C\uDDE6" to `flagNa`,
              "\uD83C\uDDF3\uD83C\uDDF7" to `flagNr`,
              "\uD83C\uDDF3\uD83C\uDDF5" to `flagNp`,
              "\uD83C\uDDF3\uD83C\uDDF1" to `flagNl`,
              "\uD83C\uDDF3\uD83C\uDDE8" to `flagNc`,
              "\uD83C\uDDF3\uD83C\uDDFF" to `flagNz`,
              "\uD83C\uDDF3\uD83C\uDDEE" to `flagNi`,
              "\uD83C\uDDF3\uD83C\uDDEA" to `flagNe`,
              "\uD83C\uDDF3\uD83C\uDDEC" to `flagNg`,
              "\uD83C\uDDF3\uD83C\uDDFA" to `flagNu`,
              "\uD83C\uDDF3\uD83C\uDDEB" to `flagNf`,
              "\uD83C\uDDF0\uD83C\uDDF5" to `flagKp`,
              "\uD83C\uDDF2\uD83C\uDDF5" to `flagMp`,
              "\uD83C\uDDF3\uD83C\uDDF4" to `flagNo`,
              "\uD83C\uDDF4\uD83C\uDDF2" to `flagOm`,
              "\uD83C\uDDF5\uD83C\uDDF0" to `flagPk`,
              "\uD83C\uDDF5\uD83C\uDDFC" to `flagPw`,
              "\uD83C\uDDF5\uD83C\uDDF8" to `flagPs`,
              "\uD83C\uDDF5\uD83C\uDDE6" to `flagPa`,
              "\uD83C\uDDF5\uD83C\uDDEC" to `flagPg`,
              "\uD83C\uDDF5\uD83C\uDDFE" to `flagPy`,
              "\uD83C\uDDF5\uD83C\uDDEA" to `flagPe`,
              "\uD83C\uDDF5\uD83C\uDDED" to `flagPh`,
              "\uD83C\uDDF5\uD83C\uDDF3" to `flagPn`,
              "\uD83C\uDDF5\uD83C\uDDF1" to `flagPl`,
              "\uD83C\uDDF5\uD83C\uDDF9" to `flagPt`,
              "\uD83C\uDDF5\uD83C\uDDF7" to `flagPr`,
              "\uD83C\uDDF6\uD83C\uDDE6" to `flagQa`,
              "\uD83C\uDDF7\uD83C\uDDEA" to `flagRe`,
              "\uD83C\uDDF7\uD83C\uDDF4" to `flagRo`,
              "\uD83C\uDDF7\uD83C\uDDFA" to `flagRu`,
              "\uD83C\uDDF7\uD83C\uDDFC" to `flagRw`,
              "\uD83C\uDDFC\uD83C\uDDF8" to `flagWs`,
              "\uD83C\uDDF8\uD83C\uDDF2" to `flagSm`,
              "\uD83C\uDDF8\uD83C\uDDF9" to `flagSt`,
              "\uD83C\uDDF8\uD83C\uDDE6" to `flagSa`,
              "\uD83C\uDDF8\uD83C\uDDF3" to `flagSn`,
              "\uD83C\uDDF7\uD83C\uDDF8" to `flagRs`,
              "\uD83C\uDDF8\uD83C\uDDE8" to `flagSc`,
              "\uD83C\uDDF8\uD83C\uDDF1" to `flagSl`,
              "\uD83C\uDDF8\uD83C\uDDEC" to `flagSg`,
              "\uD83C\uDDF8\uD83C\uDDFD" to `flagSx`,
              "\uD83C\uDDF8\uD83C\uDDF0" to `flagSk`,
              "\uD83C\uDDF8\uD83C\uDDEE" to `flagSi`,
              "\uD83C\uDDEC\uD83C\uDDF8" to `flagGs`,
              "\uD83C\uDDF8\uD83C\uDDE7" to `flagSb`,
              "\uD83C\uDDF8\uD83C\uDDF4" to `flagSo`,
              "\uD83C\uDDFF\uD83C\uDDE6" to `flagZa`,
              "\uD83C\uDDF0\uD83C\uDDF7" to `flagKr`,
              "\uD83C\uDDF8\uD83C\uDDF8" to `flagSs`,
              "\uD83C\uDDEA\uD83C\uDDF8" to `flagEs`,
              "\uD83C\uDDF1\uD83C\uDDF0" to `flagLk`,
              "\uD83C\uDDE7\uD83C\uDDF1" to `flagBl`,
              "\uD83C\uDDF8\uD83C\uDDED" to `flagSh`,
              "\uD83C\uDDF0\uD83C\uDDF3" to `flagKn`,
              "\uD83C\uDDF1\uD83C\uDDE8" to `flagLc`,
              "\uD83C\uDDF5\uD83C\uDDF2" to `flagPm`,
              "\uD83C\uDDFB\uD83C\uDDE8" to `flagVc`,
              "\uD83C\uDDF8\uD83C\uDDE9" to `flagSd`,
              "\uD83C\uDDF8\uD83C\uDDF7" to `flagSr`,
              "\uD83C\uDDF8\uD83C\uDDFF" to `flagSz`,
              "\uD83C\uDDF8\uD83C\uDDEA" to `flagSe`,
              "\uD83C\uDDE8\uD83C\uDDED" to `flagCh`,
              "\uD83C\uDDF8\uD83C\uDDFE" to `flagSy`,
              "\uD83C\uDDF9\uD83C\uDDFC" to `flagTw`,
              "\uD83C\uDDF9\uD83C\uDDEF" to `flagTj`,
              "\uD83C\uDDF9\uD83C\uDDFF" to `flagTz`,
              "\uD83C\uDDF9\uD83C\uDDED" to `flagTh`,
              "\uD83C\uDDF9\uD83C\uDDF1" to `flagTl`,
              "\uD83C\uDDF9\uD83C\uDDEC" to `flagTg`,
              "\uD83C\uDDF9\uD83C\uDDF0" to `flagTk`,
              "\uD83C\uDDF9\uD83C\uDDF4" to `flagTo`,
              "\uD83C\uDDF9\uD83C\uDDF9" to `flagTt`,
              "\uD83C\uDDF9\uD83C\uDDF3" to `flagTn`,
              "\uD83C\uDDF9\uD83C\uDDF7" to `flagTr`,
              "\uD83C\uDDF9\uD83C\uDDF2" to `flagTm`,
              "\uD83C\uDDF9\uD83C\uDDE8" to `flagTc`,
              "\uD83C\uDDFB\uD83C\uDDEE" to `flagVi`,
              "\uD83C\uDDF9\uD83C\uDDFB" to `flagTv`,
              "\uD83C\uDDFA\uD83C\uDDEC" to `flagUg`,
              "\uD83C\uDDFA\uD83C\uDDE6" to `flagUa`,
              "\uD83C\uDDE6\uD83C\uDDEA" to `flagAe`,
              "\uD83C\uDDEC\uD83C\uDDE7" to `flagGb`,
              "\uD83C\uDFF4\uDB40\uDC67\uDB40\uDC62\uDB40\uDC65\uDB40\uDC6E\uDB40\uDC67\uDB40\uDC7F"
          to `england`,
              "\uD83C\uDFF4\uDB40\uDC67\uDB40\uDC62\uDB40\uDC73\uDB40\uDC63\uDB40\uDC74\uDB40\uDC7F"
          to `scotland`,
              "\uD83C\uDFF4\uDB40\uDC67\uDB40\uDC62\uDB40\uDC77\uDB40\uDC6C\uDB40\uDC73\uDB40\uDC7F"
          to `wales`,
              "\uD83C\uDDFA\uD83C\uDDF8" to `flagUs`,
              "\uD83C\uDDFA\uD83C\uDDFE" to `flagUy`,
              "\uD83C\uDDFA\uD83C\uDDFF" to `flagUz`,
              "\uD83C\uDDFB\uD83C\uDDFA" to `flagVu`,
              "\uD83C\uDDFB\uD83C\uDDE6" to `flagVa`,
              "\uD83C\uDDFB\uD83C\uDDEA" to `flagVe`,
              "\uD83C\uDDFB\uD83C\uDDF3" to `flagVn`,
              "\uD83C\uDDFC\uD83C\uDDEB" to `flagWf`,
              "\uD83C\uDDEA\uD83C\uDDED" to `flagEh`,
              "\uD83C\uDDFE\uD83C\uDDEA" to `flagYe`,
              "\uD83C\uDDFF\uD83C\uDDF2" to `flagZm`,
              "\uD83C\uDDFF\uD83C\uDDFC" to `flagZw`,
              "\uD83C\uDDE6\uD83C\uDDE8" to `flagAc`,
              "\uD83C\uDDE7\uD83C\uDDFB" to `flagBv`,
              "\uD83C\uDDE8\uD83C\uDDF5" to `flagCp`,
              "\uD83C\uDDEA\uD83C\uDDE6" to `flagEa`,
              "\uD83C\uDDE9\uD83C\uDDEC" to `flagDg`,
              "\uD83C\uDDED\uD83C\uDDF2" to `flagHm`,
              "\uD83C\uDDF2\uD83C\uDDEB" to `flagMf`,
              "\uD83C\uDDF8\uD83C\uDDEF" to `flagSj`,
              "\uD83C\uDDF9\uD83C\uDDE6" to `flagTa`,
              "\uD83C\uDDFA\uD83C\uDDF2" to `flagUm`,
              "\uD83C\uDDFA\uD83C\uDDF3" to `unitedNations`    
      )

  val grinning: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE00")

  val smiley: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE03")

  val smile: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE04")

  val grin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE01")

  val laughing: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE06")

  val satisfied: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE06")

  val sweatSmile: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE05")

  val joy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE02")

  val rofl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD23")

  val rollingOnTheFloorLaughing: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD23")

  val relaxed: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u263A\uFE0F")

  val blush: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE0A")

  val innocent: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE07")

  val slightSmile: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE42")

  val slightlySmilingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE42")

  val upsideDown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE43")

  val upsideDownFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE43")

  val wink: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE09")

  val relieved: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE0C")

  val heartEyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE0D")

  val smilingFaceWith3Hearts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD70")

  val kissingHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE18")

  val kissing: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE17")

  val kissingSmilingEyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE19")

  val kissingClosedEyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE1A")

  val yum: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE0B")

  val stuckOutTongue: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE1B")

  val stuckOutTongueClosedEyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE1D")

  val stuckOutTongueWinkingEye: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE1C")

  val zanyFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD2A")

  val faceWithRaisedEyebrow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD28")

  val faceWithMonocle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDD0")

  val nerd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD13")

  val nerdFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD13")

  val sunglasses: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE0E")

  val starStruck: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD29")

  val partyingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD73")

  val smirk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE0F")

  val unamused: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE12")

  val disappointed: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE1E")

  val pensive: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE14")

  val worried: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE1F")

  val confused: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE15")

  val slightFrown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE41")

  val slightlyFrowningFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE41")

  val frowning2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2639\uFE0F")

  val whiteFrowningFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2639\uFE0F")

  val persevere: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE23")

  val confounded: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE16")

  val tiredFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE2B")

  val weary: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE29")

  val pleadingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD7A")

  val cry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE22")

  val sob: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE2D")

  val triumph: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE24")

  val angry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE20")

  val rage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE21")

  val faceWithSymbolsOverMouth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD2C")

  val explodingHead: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD2F")

  val flushed: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE33")

  val hotFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD75")

  val coldFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD76")

  val scream: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE31")

  val fearful: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE28")

  val coldSweat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE30")

  val disappointedRelieved: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE25")

  val sweat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE13")

  val hugging: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD17")

  val huggingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD17")

  val thinking: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD14")

  val thinkingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD14")

  val faceWithHandOverMouth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD2D")

  val yawningFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD71")

  val shushingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD2B")

  val lyingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD25")

  val liar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD25")

  val noMouth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE36")

  val neutralFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE10")

  val expressionless: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE11")

  val grimacing: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE2C")

  val rollingEyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE44")

  val faceWithRollingEyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE44")

  val hushed: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE2F")

  val frowning: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE26")

  val anguished: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE27")

  val openMouth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE2E")

  val astonished: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE32")

  val sleeping: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE34")

  val droolingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD24")

  val drool: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD24")

  val sleepy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE2A")

  val dizzyFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE35")

  val zipperMouth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD10")

  val zipperMouthFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD10")

  val woozyFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD74")

  val nauseatedFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD22")

  val sick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD22")

  val faceVomiting: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD2E")

  val sneezingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD27")

  val sneeze: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD27")

  val mask: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE37")

  val thermometerFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD12")

  val faceWithThermometer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD12")

  val headBandage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD15")

  val faceWithHeadBandage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD15")

  val moneyMouth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD11")

  val moneyMouthFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD11")

  val cowboy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD20")

  val faceWithCowboyHat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD20")

  val smilingImp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE08")

  val imp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC7F")

  val japaneseOgre: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC79")

  val japaneseGoblin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC7A")

  val clown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD21")

  val clownFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD21")

  val poop: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCA9")

  val shit: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCA9")

  val hankey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCA9")

  val poo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCA9")

  val ghost: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC7B")

  val skull: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC80")

  val skeleton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC80")

  val skullCrossbones: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2620\uFE0F")

  val skullAndCrossbones: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2620\uFE0F")

  val alien: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC7D")

  val spaceInvader: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC7E")

  val robot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD16")

  val robotFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD16")

  val jackOLantern: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF83")

  val smileyCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE3A")

  val smileCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE38")

  val joyCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE39")

  val heartEyesCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE3B")

  val smirkCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE3C")

  val kissingCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE3D")

  val screamCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE40")

  val cryingCatFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE3F")

  val poutingCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE3E")

  val palmsUpTogether: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD32")

  val openHands: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC50")

  val raisedHands: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE4C")

  val clap: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC4F")

  val handshake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD1D")

  val shakingHands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD1D")

  val thumbsup: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC4D")

  val `+1`: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC4D")

  val thumbup: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC4D")

  val thumbsdown: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC4E")

  val `-1`: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC4E")

  val thumbdown: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC4E")

  val punch: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC4A")

  val fist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\u270A")

  val leftFacingFist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD1B")

  val leftFist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD1B")

  val rightFacingFist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD1C")

  val rightFist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD1C")

  val fingersCrossed: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD1E")

  val handWithIndexAndMiddleFingerCrossed: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD1E")

  val v: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\u270C\uFE0F")

  val loveYouGesture: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD1F")

  val metal: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD18")

  val signOfTheHorns: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD18")

  val okHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC4C")

  val pinchingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD0F")

  val pointLeft: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC48")

  val pointRight: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC49")

  val pointUp2: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC46")

  val pointDown: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC47")

  val pointUp: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\u261D\uFE0F")

  val raisedHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\u270B")

  val raisedBackOfHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD1A")

  val backOfHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD1A")

  val handSplayed: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDD90\uFE0F")

  val raisedHandWithFingersSplayed: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDD90\uFE0F")

  val vulcan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDD96")

  val raisedHandWithPartBetweenMiddleAndRingFingers: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDD96")

  val wave: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC4B")

  val callMe: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD19")

  val callMeHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD19")

  val muscle: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDCAA")

  val mechanicalArm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDBE")

  val middleFinger: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDD95")

  val reversedHandWithMiddleFingerExtended: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDD95")

  val writingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\u270D\uFE0F")

  val pray: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE4F")

  val foot: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDB6")

  val leg: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDB5")

  val mechanicalLeg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDBF")

  val lipstick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC84")

  val kiss: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC8B")

  val lips: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC44")

  val tooth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDB7")

  val bone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDB4")

  val tongue: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC45")

  val ear: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC42")

  val earWithHearingAid: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDBB")

  val nose: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC43")

  val footprints: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC63")

  val eye: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC41\uFE0F")

  val eyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC40")

  val brain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDE0")

  val speakingHead: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDE3\uFE0F")

  val speakingHeadInSilhouette: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDE3\uFE0F")

  val bustInSilhouette: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC64")

  val bustsInSilhouette: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC65")

  val baby: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC76")

  val girl: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC67")

  val child: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD2")

  val boy: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC66")

  val woman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69")

  val adult: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD1")

  val man: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68")

  val womanCurlyHaired: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83E\uDDB1")

  val manCurlyHaired: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83E\uDDB1")

  val womanRedHaired: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83E\uDDB0")

  val manRedHaired: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83E\uDDB0")

  val blondHairedWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC71\u200D\u2640\uFE0F")

  val blondHairedPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC71")

  val personWithBlondHair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC71")

  val blondHairedMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC71\u200D\u2642\uFE0F")

  val womanWhiteHaired: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83E\uDDB3")

  val manWhiteHaired: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83E\uDDB3")

  val womanBald: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83E\uDDB2")

  val manBald: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83E\uDDB2")

  val beardedPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD4")

  val olderWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC75")

  val grandma: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC75")

  val olderAdult: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD3")

  val olderMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC74")

  val manWithChineseCap: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC72")

  val manWithGuaPiMao: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC72")

  val personWearingTurban: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC73")

  val manWithTurban: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC73")

  val womanWearingTurban: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC73\u200D\u2640\uFE0F")

  val manWearingTurban: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC73\u200D\u2642\uFE0F")

  val womanWithHeadscarf: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD5")

  val policeOfficer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC6E")

  val cop: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC6E")

  val womanPoliceOfficer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC6E\u200D\u2640\uFE0F")

  val manPoliceOfficer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC6E\u200D\u2642\uFE0F")

  val constructionWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC77")

  val womanConstructionWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC77\u200D\u2640\uFE0F")

  val manConstructionWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC77\u200D\u2642\uFE0F")

  val guard: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC82")

  val guardsman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC82")

  val womanGuard: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC82\u200D\u2640\uFE0F")

  val manGuard: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC82\u200D\u2642\uFE0F")

  val detective: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDD75\uFE0F")

  val spy: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDD75\uFE0F")

  val sleuthOrSpy: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDD75\uFE0F")

  val womanDetective: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDD75\uFE0F\u200D\u2640\uFE0F")

  val manDetective: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDD75\uFE0F\u200D\u2642\uFE0F")

  val womanHealthWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\u2695\uFE0F")

  val manHealthWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\u2695\uFE0F")

  val womanFarmer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83C\uDF3E")

  val manFarmer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83C\uDF3E")

  val womanCook: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83C\uDF73")

  val manCook: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83C\uDF73")

  val womanStudent: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83C\uDF93")

  val manStudent: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83C\uDF93")

  val womanSinger: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83C\uDFA4")

  val manSinger: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83C\uDFA4")

  val womanTeacher: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83C\uDFEB")

  val manTeacher: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83C\uDFEB")

  val womanFactoryWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83C\uDFED")

  val manFactoryWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83C\uDFED")

  val womanTechnologist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83D\uDCBB")

  val manTechnologist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83D\uDCBB")

  val womanOfficeWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83D\uDCBC")

  val manOfficeWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83D\uDCBC")

  val womanMechanic: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83D\uDD27")

  val manMechanic: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83D\uDD27")

  val womanScientist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83D\uDD2C")

  val manScientist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83D\uDD2C")

  val womanArtist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83C\uDFA8")

  val manArtist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83C\uDFA8")

  val womanFirefighter: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83D\uDE92")

  val manFirefighter: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83D\uDE92")

  val womanPilot: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\u2708\uFE0F")

  val manPilot: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\u2708\uFE0F")

  val womanAstronaut: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83D\uDE80")

  val manAstronaut: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83D\uDE80")

  val womanJudge: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\u2696\uFE0F")

  val manJudge: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\u2696\uFE0F")

  val brideWithVeil: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC70")

  val manInTuxedo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD35")

  val princess: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC78")

  val prince: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD34")

  val superhero: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDB8")

  val womanSuperhero: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDB8\u200D\u2640\uFE0F")

  val manSuperhero: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDB8\u200D\u2642\uFE0F")

  val supervillain: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDB9")

  val womanSupervillain: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDB9\u200D\u2640\uFE0F")

  val manSupervillain: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDB9\u200D\u2642\uFE0F")

  val mrsClaus: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD36")

  val motherChristmas: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD36")

  val santa: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDF85")

  val mage: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD9")

  val womanMage: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD9\u200D\u2640\uFE0F")

  val manMage: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD9\u200D\u2642\uFE0F")

  val elf: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDDD")

  val womanElf: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDDD\u200D\u2640\uFE0F")

  val manElf: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDDD\u200D\u2642\uFE0F")

  val vampire: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDDB")

  val womanVampire: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDDB\u200D\u2640\uFE0F")

  val manVampire: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDDB\u200D\u2642\uFE0F")

  val zombie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDDF")

  val womanZombie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDDF\u200D\u2640\uFE0F")

  val manZombie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDDF\u200D\u2642\uFE0F")

  val genie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDDE")

  val womanGenie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDDE\u200D\u2640\uFE0F")

  val manGenie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDDE\u200D\u2642\uFE0F")

  val merperson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDDC")

  val mermaid: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDDC\u200D\u2640\uFE0F")

  val merman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDDC\u200D\u2642\uFE0F")

  val fairy: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDDA")

  val womanFairy: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDDA\u200D\u2640\uFE0F")

  val manFairy: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDDA\u200D\u2642\uFE0F")

  val angel: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC7C")

  val pregnantWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD30")

  val expectingWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD30")

  val breastFeeding: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD31")

  val personBowing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE47")

  val bow: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE47")

  val womanBowing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE47\u200D\u2640\uFE0F")

  val manBowing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE47\u200D\u2642\uFE0F")

  val personTippingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC81")

  val informationDeskPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC81")

  val womanTippingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC81\u200D\u2640\uFE0F")

  val manTippingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC81\u200D\u2642\uFE0F")

  val personGesturingNo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE45")

  val noGood: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE45")

  val womanGesturingNo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE45\u200D\u2640\uFE0F")

  val manGesturingNo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE45\u200D\u2642\uFE0F")

  val personGesturingOk: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE46")

  val okWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE46")

  val womanGesturingOk: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE46\u200D\u2640\uFE0F")

  val manGesturingOk: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE46\u200D\u2642\uFE0F")

  val personRaisingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE4B")

  val raisingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE4B")

  val womanRaisingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE4B\u200D\u2640\uFE0F")

  val manRaisingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE4B\u200D\u2642\uFE0F")

  val deafPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDCF")

  val deafWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDCF\u200D\u2640\uFE0F")

  val deafMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDCF\u200D\u2642\uFE0F")

  val personFacepalming: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD26")

  val facePalm: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD26")

  val facepalm: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD26")

  val womanFacepalming: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD26\u200D\u2640\uFE0F")

  val manFacepalming: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD26\u200D\u2642\uFE0F")

  val personShrugging: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD37")

  val shrug: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD37")

  val womanShrugging: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD37\u200D\u2640\uFE0F")

  val manShrugging: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD37\u200D\u2642\uFE0F")

  val personPouting: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE4E")

  val personWithPoutingFace: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE4E")

  val womanPouting: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE4E\u200D\u2640\uFE0F")

  val manPouting: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE4E\u200D\u2642\uFE0F")

  val personFrowning: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE4D")

  val womanFrowning: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE4D\u200D\u2640\uFE0F")

  val manFrowning: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE4D\u200D\u2642\uFE0F")

  val personGettingHaircut: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC87")

  val haircut: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC87")

  val womanGettingHaircut: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC87\u200D\u2640\uFE0F")

  val manGettingHaircut: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC87\u200D\u2642\uFE0F")

  val personGettingMassage: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC86")

  val massage: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC86")

  val womanGettingFaceMassage: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC86\u200D\u2640\uFE0F")

  val manGettingFaceMassage: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC86\u200D\u2642\uFE0F")

  val personInSteamyRoom: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD6")

  val womanInSteamyRoom: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD6\u200D\u2640\uFE0F")

  val manInSteamyRoom: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD6\u200D\u2642\uFE0F")

  val nailCare: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC85")

  val selfie: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD33")

  val dancer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC83")

  val manDancing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDD7A")

  val maleDancer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDD7A")

  val peopleWithBunnyEarsPartying: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC6F")

  val dancers: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC6F")

  val womenWithBunnyEarsPartying: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC6F\u200D\u2640\uFE0F")

  val menWithBunnyEarsPartying: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC6F\u200D\u2642\uFE0F")

  val levitate: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDD74\uFE0F")

  val manInBusinessSuitLevitating: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDD74\uFE0F")

  val personWalking: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEB6")

  val walking: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEB6")

  val womanWalking: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEB6\u200D\u2640\uFE0F")

  val manWalking: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEB6\u200D\u2642\uFE0F")

  val personRunning: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFC3")

  val runner: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFC3")

  val womanRunning: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFC3\u200D\u2640\uFE0F")

  val manRunning: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFC3\u200D\u2642\uFE0F")

  val personStanding: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDCD")

  val womanStanding: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDCD\u200D\u2640\uFE0F")

  val manStanding: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDCD\u200D\u2642\uFE0F")

  val personKneeling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDCE")

  val womanKneeling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDCE\u200D\u2640\uFE0F")

  val manKneeling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDCE\u200D\u2642\uFE0F")

  val womanWithProbingCane: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83E\uDDAF")

  val manWithProbingCane: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83E\uDDAF")

  val womanInMotorizedWheelchair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83E\uDDBC")

  val manInMotorizedWheelchair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83E\uDDBC")

  val womanInManualWheelchair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83E\uDDBD")

  val manInManualWheelchair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83E\uDDBD")

  val peopleHoldingHands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDD1\u200D\uD83E\uDD1D\u200D\uD83E\uDDD1")

  val couple: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC6B")

  val twoWomenHoldingHands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC6D")

  val twoMenHoldingHands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC6C")

  val coupleWithHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC91")

  val coupleWithHeartWomanMan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC69\u200D\u2764\uFE0F\u200D\uD83D\uDC68")

  val coupleWw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC69\u200D\u2764\uFE0F\u200D\uD83D\uDC69")

  val coupleWithHeartWw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC69\u200D\u2764\uFE0F\u200D\uD83D\uDC69")

  val coupleMm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC68\u200D\u2764\uFE0F\u200D\uD83D\uDC68")

  val coupleWithHeartMm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC68\u200D\u2764\uFE0F\u200D\uD83D\uDC68")

  val couplekiss: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC8F")

  val kissWomanMan: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83D\uDC69\u200D\u2764\uFE0F\u200D\uD83D\uDC8B\u200D\uD83D\uDC68")

  val kissWw: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83D\uDC69\u200D\u2764\uFE0F\u200D\uD83D\uDC8B\u200D\uD83D\uDC69")

  val couplekissWw: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83D\uDC69\u200D\u2764\uFE0F\u200D\uD83D\uDC8B\u200D\uD83D\uDC69")

  val kissMm: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83D\uDC68\u200D\u2764\uFE0F\u200D\uD83D\uDC8B\u200D\uD83D\uDC68")

  val couplekissMm: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83D\uDC68\u200D\u2764\uFE0F\u200D\uD83D\uDC8B\u200D\uD83D\uDC68")

  val family: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC6A")

  val familyManWomanBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC66")

  val familyMwg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC67")

  val familyMwgb: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC66")

  val familyMwbb: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC66\u200D\uD83D\uDC66")

  val familyMwgg: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC67")

  val familyWwb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC69\u200D\uD83D\uDC69\u200D\uD83D\uDC66")

  val familyWwg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC69\u200D\uD83D\uDC69\u200D\uD83D\uDC67")

  val familyWwgb: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83D\uDC69\u200D\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC66")

  val familyWwbb: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83D\uDC69\u200D\uD83D\uDC69\u200D\uD83D\uDC66\u200D\uD83D\uDC66")

  val familyWwgg: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83D\uDC69\u200D\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC67")

  val familyMmb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC68\u200D\uD83D\uDC68\u200D\uD83D\uDC66")

  val familyMmg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC68\u200D\uD83D\uDC68\u200D\uD83D\uDC67")

  val familyMmgb: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83D\uDC68\u200D\uD83D\uDC68\u200D\uD83D\uDC67\u200D\uD83D\uDC66")

  val familyMmbb: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83D\uDC68\u200D\uD83D\uDC68\u200D\uD83D\uDC66\u200D\uD83D\uDC66")

  val familyMmgg: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83D\uDC68\u200D\uD83D\uDC68\u200D\uD83D\uDC67\u200D\uD83D\uDC67")

  val familyWomanBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC69\u200D\uD83D\uDC66")

  val familyWomanGirl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC69\u200D\uD83D\uDC67")

  val familyWomanGirlBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC66")

  val familyWomanBoyBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC69\u200D\uD83D\uDC66\u200D\uD83D\uDC66")

  val familyWomanGirlGirl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC67")

  val familyManBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC68\u200D\uD83D\uDC66")

  val familyManGirl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC68\u200D\uD83D\uDC67")

  val familyManGirlBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC68\u200D\uD83D\uDC67\u200D\uD83D\uDC66")

  val familyManBoyBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC68\u200D\uD83D\uDC66\u200D\uD83D\uDC66")

  val familyManGirlGirl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC68\u200D\uD83D\uDC67\u200D\uD83D\uDC67")

  val yarn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDF6")

  val thread: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDF5")

  val coat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDE5")

  val labCoat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD7C")

  val safetyVest: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDBA")

  val womansClothes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC5A")

  val shirt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC55")

  val jeans: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC56")

  val shorts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDE73")

  val necktie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC54")

  val dress: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC57")

  val bikini: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC59")

  val onePieceSwimsuit: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDE71")

  val kimono: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC58")

  val sari: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD7B")

  val womansFlatShoe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD7F")

  val highHeel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC60")

  val sandal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC61")

  val boot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC62")

  val balletShoes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDE70")

  val mansShoe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC5E")

  val athleticShoe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC5F")

  val hikingBoot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD7E")

  val briefs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDE72")

  val socks: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDE6")

  val gloves: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDE4")

  val scarf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDE3")

  val tophat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFA9")

  val billedCap: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDE2")

  val womansHat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC52")

  val mortarBoard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF93")

  val helmetWithCross: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26D1\uFE0F")

  val helmetWithWhiteCross: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26D1\uFE0F")

  val crown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC51")

  val ring: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC8D")

  val pouch: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC5D")

  val purse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC5B")

  val handbag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC5C")

  val briefcase: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCBC")

  val schoolSatchel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF92")

  val luggage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDF3")

  val eyeglasses: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC53")

  val darkSunglasses: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD76\uFE0F")

  val goggles: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD7D")

  val divingMask: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD3F")

  val closedUmbrella: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF02")

  val dog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC36")

  val cat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC31")

  val mouse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC2D")

  val hamster: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC39")

  val rabbit: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC30")

  val fox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD8A")

  val foxFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD8A")

  val bear: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC3B")

  val pandaFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC3C")

  val koala: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC28")

  val tiger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC2F")

  val lionFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD81")

  val lion: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD81")

  val cow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC2E")

  val pig: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC37")

  val pigNose: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC3D")

  val frog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC38")

  val monkeyFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC35")

  val seeNoEvil: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE48")

  val hearNoEvil: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE49")

  val speakNoEvil: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE4A")

  val monkey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC12")

  val chicken: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC14")

  val penguin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC27")

  val bird: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC26")

  val babyChick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC24")

  val hatchingChick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC23")

  val hatchedChick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC25")

  val duck: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD86")

  val eagle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD85")

  val owl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD89")

  val bat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD87")

  val wolf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC3A")

  val boar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC17")

  val horse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC34")

  val unicorn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD84")

  val unicornFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD84")

  val bee: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC1D")

  val bug: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC1B")

  val butterfly: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD8B")

  val snail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC0C")

  val shell: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC1A")

  val beetle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC1E")

  val ant: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC1C")

  val mosquito: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD9F")

  val cricket: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD97")

  val spider: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD77\uFE0F")

  val spiderWeb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD78\uFE0F")

  val scorpion: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD82")

  val turtle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC22")

  val snake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC0D")

  val lizard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD8E")

  val tRex: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD96")

  val sauropod: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD95")

  val octopus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC19")

  val squid: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD91")

  val shrimp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD90")

  val lobster: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD9E")

  val oyster: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDAA")

  val crab: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD80")

  val blowfish: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC21")

  val tropicalFish: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC20")

  val fish: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC1F")

  val dolphin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC2C")

  val whale: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC33")

  val whale2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC0B")

  val shark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD88")

  val crocodile: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC0A")

  val tiger2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC05")

  val leopard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC06")

  val zebra: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD93")

  val gorilla: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD8D")

  val orangutan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDA7")

  val elephant: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC18")

  val hippopotamus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD9B")

  val rhino: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD8F")

  val rhinoceros: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD8F")

  val dromedaryCamel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC2A")

  val camel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC2B")

  val giraffe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD92")

  val kangaroo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD98")

  val waterBuffalo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC03")

  val ox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC02")

  val cow2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC04")

  val racehorse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC0E")

  val pig2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC16")

  val ram: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC0F")

  val llama: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD99")

  val sheep: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC11")

  val goat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC10")

  val deer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD8C")

  val dog2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC15")

  val guideDog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDAE")

  val serviceDog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC15\u200D\uD83E\uDDBA")

  val poodle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC29")

  val cat2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC08")

  val rooster: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC13")

  val turkey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD83")

  val peacock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD9A")

  val parrot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD9C")

  val swan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDA2")

  val flamingo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDA9")

  val dove: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD4A\uFE0F")

  val doveOfPeace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD4A\uFE0F")

  val rabbit2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC07")

  val sloth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDA5")

  val otter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDA6")

  val skunk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDA8")

  val raccoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD9D")

  val badger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDA1")

  val mouse2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC01")

  val rat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC00")

  val chipmunk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC3F\uFE0F")

  val hedgehog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD94")

  val feet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC3E")

  val pawPrints: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC3E")

  val dragon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC09")

  val dragonFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC32")

  val cactus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF35")

  val christmasTree: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF84")

  val evergreenTree: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF32")

  val deciduousTree: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF33")

  val palmTree: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF34")

  val seedling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF31")

  val herb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF3F")

  val shamrock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2618\uFE0F")

  val fourLeafClover: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF40")

  val bamboo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF8D")

  val tanabataTree: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF8B")

  val leaves: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF43")

  val fallenLeaf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF42")

  val mapleLeaf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF41")

  val mushroom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF44")

  val earOfRice: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF3E")

  val bouquet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC90")

  val tulip: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF37")

  val rose: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF39")

  val wiltedRose: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD40")

  val wiltedFlower: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD40")

  val hibiscus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF3A")

  val cherryBlossom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF38")

  val blossom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF3C")

  val sunflower: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF3B")

  val sunWithFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF1E")

  val fullMoonWithFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF1D")

  val firstQuarterMoonWithFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF1B")

  val lastQuarterMoonWithFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF1C")

  val newMoonWithFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF1A")

  val fullMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF15")

  val waningGibbousMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF16")

  val lastQuarterMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF17")

  val waningCrescentMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF18")

  val newMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF11")

  val waxingCrescentMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF12")

  val firstQuarterMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF13")

  val waxingGibbousMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF14")

  val crescentMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF19")

  val earthAmericas: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF0E")

  val earthAfrica: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF0D")

  val earthAsia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF0F")

  val ringedPlanet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDE90")

  val dizzy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCAB")

  val star: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2B50")

  val star2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF1F")

  val sparkles: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2728")

  val zap: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26A1")

  val comet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2604\uFE0F")

  val boom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCA5")

  val fire: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD25")

  val flame: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD25")

  val cloudTornado: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF2A\uFE0F")

  val cloudWithTornado: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF2A\uFE0F")

  val rainbow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF08")

  val sunny: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2600\uFE0F")

  val whiteSunSmallCloud: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF24\uFE0F")

  val whiteSunWithSmallCloud: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF24\uFE0F")

  val partlySunny: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26C5")

  val whiteSunCloud: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF25\uFE0F")

  val whiteSunBehindCloud: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF25\uFE0F")

  val cloud: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2601\uFE0F")

  val whiteSunRainCloud: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF26\uFE0F")

  val whiteSunBehindCloudWithRain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF26\uFE0F")

  val cloudRain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF27\uFE0F")

  val cloudWithRain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF27\uFE0F")

  val thunderCloudRain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26C8\uFE0F")

  val thunderCloudAndRain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26C8\uFE0F")

  val cloudLightning: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF29\uFE0F")

  val cloudWithLightning: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF29\uFE0F")

  val cloudSnow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF28\uFE0F")

  val cloudWithSnow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF28\uFE0F")

  val snowflake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2744\uFE0F")

  val snowman2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2603\uFE0F")

  val snowman: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26C4")

  val windBlowingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF2C\uFE0F")

  val dash: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCA8")

  val droplet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCA7")

  val sweatDrops: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCA6")

  val umbrella: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2614")

  val umbrella2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2602\uFE0F")

  val ocean: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF0A")

  val fog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF2B\uFE0F")

  val greenApple: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF4F")

  val apple: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF4E")

  val pear: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF50")

  val tangerine: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF4A")

  val lemon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF4B")

  val banana: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF4C")

  val watermelon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF49")

  val grapes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF47")

  val strawberry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF53")

  val melon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF48")

  val cherries: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF52")

  val peach: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF51")

  val mango: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD6D")

  val pineapple: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF4D")

  val coconut: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD65")

  val kiwi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD5D")

  val kiwifruit: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD5D")

  val tomato: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF45")

  val eggplant: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF46")

  val avocado: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD51")

  val broccoli: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD66")

  val leafyGreen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD6C")

  val cucumber: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD52")

  val hotPepper: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF36\uFE0F")

  val corn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF3D")

  val carrot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD55")

  val onion: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDC5")

  val garlic: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDC4")

  val potato: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD54")

  val sweetPotato: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF60")

  val croissant: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD50")

  val bagel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD6F")

  val bread: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF5E")

  val frenchBread: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD56")

  val baguetteBread: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD56")

  val pretzel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD68")

  val cheese: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDC0")

  val cheeseWedge: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDC0")

  val egg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD5A")

  val cooking: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF73")

  val pancakes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD5E")

  val waffle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDC7")

  val bacon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD53")

  val cutOfMeat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD69")

  val poultryLeg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF57")

  val meatOnBone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF56")

  val hotdog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF2D")

  val hotDog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF2D")

  val hamburger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF54")

  val fries: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF5F")

  val pizza: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF55")

  val sandwich: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD6A")

  val falafel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDC6")

  val stuffedFlatbread: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD59")

  val stuffedPita: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD59")

  val taco: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF2E")

  val burrito: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF2F")

  val salad: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD57")

  val greenSalad: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD57")

  val shallowPanOfFood: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD58")

  val paella: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD58")

  val cannedFood: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD6B")

  val spaghetti: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF5D")

  val ramen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF5C")

  val stew: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF72")

  val curry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF5B")

  val sushi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF63")

  val bento: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF71")

  val dumpling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD5F")

  val friedShrimp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF64")

  val riceBall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF59")

  val rice: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF5A")

  val riceCracker: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF58")

  val fishCake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF65")

  val fortuneCookie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD60")

  val moonCake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD6E")

  val oden: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF62")

  val dango: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF61")

  val shavedIce: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF67")

  val iceCream: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF68")

  val icecream: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF66")

  val pie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD67")

  val cupcake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDC1")

  val cake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF70")

  val birthday: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF82")

  val custard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF6E")

  val pudding: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF6E")

  val flan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF6E")

  val lollipop: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF6D")

  val candy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF6C")

  val chocolateBar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF6B")

  val popcorn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF7F")

  val doughnut: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF69")

  val cookie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF6A")

  val chestnut: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF30")

  val peanuts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD5C")

  val shelledPeanut: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD5C")

  val honeyPot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF6F")

  val butter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDC8")

  val milk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD5B")

  val glassOfMilk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD5B")

  val babyBottle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF7C")

  val coffee: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2615")

  val tea: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF75")

  val mate: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDC9")

  val cupWithStraw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD64")

  val beverageBox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDC3")

  val iceCube: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDCA")

  val sake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF76")

  val beer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF7A")

  val beers: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF7B")

  val champagneGlass: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD42")

  val clinkingGlass: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD42")

  val wineGlass: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF77")

  val tumblerGlass: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD43")

  val whisky: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD43")

  val cocktail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF78")

  val tropicalDrink: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF79")

  val champagne: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF7E")

  val bottleWithPoppingCork: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF7E")

  val spoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD44")

  val forkAndKnife: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF74")

  val forkKnifePlate: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF7D\uFE0F")

  val forkAndKnifeWithPlate: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF7D\uFE0F")

  val bowlWithSpoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD63")

  val takeoutBox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD61")

  val chopsticks: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD62")

  val salt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDC2")

  val soccer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26BD")

  val basketball: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFC0")

  val football: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFC8")

  val baseball: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26BE")

  val softball: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD4E")

  val tennis: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFBE")

  val volleyball: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFD0")

  val rugbyFootball: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFC9")

  val flyingDisc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD4F")

  val `8ball`: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFB1")

  val pingPong: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFD3")

  val tableTennis: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFD3")

  val badminton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFF8")

  val hockey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFD2")

  val fieldHockey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFD1")

  val lacrosse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD4D")

  val cricketGame: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFCF")

  val cricketBatBall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFCF")

  val goal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD45")

  val goalNet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD45")

  val golf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26F3")

  val bowAndArrow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFF9")

  val archery: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFF9")

  val fishingPoleAndFish: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFA3")

  val boxingGlove: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD4A")

  val boxingGloves: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD4A")

  val martialArtsUniform: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD4B")

  val karateUniform: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD4B")

  val runningShirtWithSash: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFBD")

  val skateboard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEF9")

  val sled: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEF7")

  val parachute: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDE82")

  val iceSkate: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26F8\uFE0F")

  val curlingStone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD4C")

  val ski: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFBF")

  val skier: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26F7\uFE0F")

  val snowboarder: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFC2")

  val personLiftingWeights: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFCB\uFE0F")

  val lifter: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFCB\uFE0F")

  val weightLifter: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFCB\uFE0F")

  val womanLiftingWeights: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFCB\uFE0F\u200D\u2640\uFE0F")

  val manLiftingWeights: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFCB\uFE0F\u200D\u2642\uFE0F")

  val peopleWrestling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD3C")

  val wrestlers: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD3C")

  val wrestling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD3C")

  val womenWrestling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD3C\u200D\u2640\uFE0F")

  val menWrestling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD3C\u200D\u2642\uFE0F")

  val personDoingCartwheel: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD38")

  val cartwheel: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD38")

  val womanCartwheeling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD38\u200D\u2640\uFE0F")

  val manCartwheeling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD38\u200D\u2642\uFE0F")

  val personBouncingBall: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\u26F9\uFE0F")

  val basketballPlayer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\u26F9\uFE0F")

  val personWithBall: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\u26F9\uFE0F")

  val womanBouncingBall: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\u26F9\uFE0F\u200D\u2640\uFE0F")

  val manBouncingBall: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\u26F9\uFE0F\u200D\u2642\uFE0F")

  val personFencing: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD3A")

  val fencer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD3A")

  val fencing: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD3A")

  val personPlayingHandball: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD3E")

  val handball: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD3E")

  val womanPlayingHandball: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD3E\u200D\u2640\uFE0F")

  val manPlayingHandball: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD3E\u200D\u2642\uFE0F")

  val personGolfing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFCC\uFE0F")

  val golfer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFCC\uFE0F")

  val womanGolfing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFCC\uFE0F\u200D\u2640\uFE0F")

  val manGolfing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFCC\uFE0F\u200D\u2642\uFE0F")

  val horseRacing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFC7")

  val personInLotusPosition: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD8")

  val womanInLotusPosition: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD8\u200D\u2640\uFE0F")

  val manInLotusPosition: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD8\u200D\u2642\uFE0F")

  val personSurfing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFC4")

  val surfer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFC4")

  val womanSurfing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFC4\u200D\u2640\uFE0F")

  val manSurfing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFC4\u200D\u2642\uFE0F")

  val personSwimming: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFCA")

  val swimmer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFCA")

  val womanSwimming: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFCA\u200D\u2640\uFE0F")

  val manSwimming: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFCA\u200D\u2642\uFE0F")

  val personPlayingWaterPolo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD3D")

  val waterPolo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD3D")

  val womanPlayingWaterPolo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD3D\u200D\u2640\uFE0F")

  val manPlayingWaterPolo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD3D\u200D\u2642\uFE0F")

  val personRowingBoat: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEA3")

  val rowboat: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEA3")

  val womanRowingBoat: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEA3\u200D\u2640\uFE0F")

  val manRowingBoat: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEA3\u200D\u2642\uFE0F")

  val personClimbing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD7")

  val womanClimbing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD7\u200D\u2640\uFE0F")

  val manClimbing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD7\u200D\u2642\uFE0F")

  val personMountainBiking: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEB5")

  val mountainBicyclist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEB5")

  val womanMountainBiking: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEB5\u200D\u2640\uFE0F")

  val manMountainBiking: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEB5\u200D\u2642\uFE0F")

  val personBiking: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEB4")

  val bicyclist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEB4")

  val womanBiking: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEB4\u200D\u2640\uFE0F")

  val manBiking: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEB4\u200D\u2642\uFE0F")

  val trophy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFC6")

  val firstPlace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD47")

  val firstPlaceMedal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD47")

  val secondPlace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD48")

  val secondPlaceMedal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD48")

  val thirdPlace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD49")

  val thirdPlaceMedal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD49")

  val medal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFC5")

  val sportsMedal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFC5")

  val militaryMedal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF96\uFE0F")

  val rosette: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFF5\uFE0F")

  val reminderRibbon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF97\uFE0F")

  val ticket: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFAB")

  val tickets: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF9F\uFE0F")

  val admissionTickets: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF9F\uFE0F")

  val circusTent: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFAA")

  val personJuggling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD39")

  val juggling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD39")

  val juggler: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD39")

  val womanJuggling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD39\u200D\u2640\uFE0F")

  val manJuggling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD39\u200D\u2642\uFE0F")

  val performingArts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFAD")

  val art: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFA8")

  val clapper: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFAC")

  val microphone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFA4")

  val headphones: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFA7")

  val musicalScore: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFBC")

  val musicalKeyboard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFB9")

  val drum: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD41")

  val drumWithDrumsticks: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD41")

  val saxophone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFB7")

  val trumpet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFBA")

  val banjo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDE95")

  val guitar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFB8")

  val violin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFBB")

  val gameDie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFB2")

  val chessPawn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u265F\uFE0F")

  val dart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFAF")

  val kite: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDE81")

  val yoYo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDE80")

  val bowling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFB3")

  val videoGame: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFAE")

  val slotMachine: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFB0")

  val jigsaw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDE9")

  val redCar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE97")

  val taxi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE95")

  val blueCar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE99")

  val bus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE8C")

  val trolleybus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE8E")

  val raceCar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFCE\uFE0F")

  val racingCar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFCE\uFE0F")

  val policeCar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE93")

  val ambulance: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE91")

  val fireEngine: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE92")

  val minibus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE90")

  val truck: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE9A")

  val articulatedLorry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE9B")

  val tractor: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE9C")

  val autoRickshaw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEFA")

  val motorScooter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEF5")

  val motorbike: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEF5")

  val motorcycle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFCD\uFE0F")

  val racingMotorcycle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFCD\uFE0F")

  val scooter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEF4")

  val bike: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEB2")

  val motorizedWheelchair: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDBC")

  val manualWheelchair: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDBD")

  val rotatingLight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEA8")

  val oncomingPoliceCar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE94")

  val oncomingBus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE8D")

  val oncomingAutomobile: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE98")

  val oncomingTaxi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE96")

  val aerialTramway: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEA1")

  val mountainCableway: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEA0")

  val suspensionRailway: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE9F")

  val railwayCar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE83")

  val train: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE8B")

  val mountainRailway: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE9E")

  val monorail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE9D")

  val bullettrainSide: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE84")

  val bullettrainFront: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE85")

  val lightRail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE88")

  val steamLocomotive: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE82")

  val train2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE86")

  val metro: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE87")

  val tram: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE8A")

  val station: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE89")

  val airplane: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2708\uFE0F")

  val airplaneDeparture: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEEB")

  val airplaneArriving: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEEC")

  val airplaneSmall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEE9\uFE0F")

  val smallAirplane: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEE9\uFE0F")

  val seat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCBA")

  val satelliteOrbital: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEF0\uFE0F")

  val rocket: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE80")

  val flyingSaucer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEF8")

  val helicopter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE81")

  val canoe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEF6")

  val kayak: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEF6")

  val sailboat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26F5")

  val speedboat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEA4")

  val motorboat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEE5\uFE0F")

  val cruiseShip: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEF3\uFE0F")

  val passengerShip: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEF3\uFE0F")

  val ferry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26F4\uFE0F")

  val ship: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEA2")

  val anchor: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2693")

  val fuelpump: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26FD")

  val construction: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEA7")

  val verticalTrafficLight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEA6")

  val trafficLight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEA5")

  val busstop: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE8F")

  val map: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDFA\uFE0F")

  val worldMap: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDFA\uFE0F")

  val moyai: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDFF")

  val statueOfLiberty: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDFD")

  val tokyoTower: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDFC")

  val europeanCastle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFF0")

  val japaneseCastle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFEF")

  val stadium: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFDF\uFE0F")

  val ferrisWheel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFA1")

  val rollerCoaster: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFA2")

  val carouselHorse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFA0")

  val fountain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26F2")

  val beachUmbrella: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26F1\uFE0F")

  val umbrellaOnGround: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26F1\uFE0F")

  val beach: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFD6\uFE0F")

  val beachWithUmbrella: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFD6\uFE0F")

  val island: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFDD\uFE0F")

  val desertIsland: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFDD\uFE0F")

  val desert: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFDC\uFE0F")

  val volcano: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF0B")

  val mountain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26F0\uFE0F")

  val mountainSnow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFD4\uFE0F")

  val snowCappedMountain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFD4\uFE0F")

  val mountFuji: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDFB")

  val camping: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFD5\uFE0F")

  val tent: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26FA")

  val house: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFE0")

  val houseWithGarden: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFE1")

  val homes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFD8\uFE0F")

  val houseBuildings: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFD8\uFE0F")

  val houseAbandoned: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFDA\uFE0F")

  val derelictHouseBuilding: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFDA\uFE0F")

  val constructionSite: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFD7\uFE0F")

  val buildingConstruction: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFD7\uFE0F")

  val factory: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFED")

  val office: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFE2")

  val departmentStore: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFEC")

  val postOffice: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFE3")

  val europeanPostOffice: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFE4")

  val hospital: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFE5")

  val bank: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFE6")

  val hotel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFE8")

  val convenienceStore: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFEA")

  val school: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFEB")

  val loveHotel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFE9")

  val wedding: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC92")

  val classicalBuilding: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFDB\uFE0F")

  val church: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26EA")

  val mosque: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD4C")

  val hinduTemple: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDED5")

  val synagogue: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD4D")

  val kaaba: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD4B")

  val shintoShrine: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26E9\uFE0F")

  val railwayTrack: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEE4\uFE0F")

  val railroadTrack: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEE4\uFE0F")

  val motorway: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEE3\uFE0F")

  val japan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDFE")

  val riceScene: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF91")

  val park: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFDE\uFE0F")

  val nationalPark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFDE\uFE0F")

  val sunrise: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF05")

  val sunriseOverMountains: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF04")

  val stars: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF20")

  val sparkler: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF87")

  val fireworks: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF86")

  val citySunset: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF07")

  val citySunrise: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF07")

  val cityDusk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF06")

  val cityscape: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFD9\uFE0F")

  val nightWithStars: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF03")

  val milkyWay: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF0C")

  val bridgeAtNight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF09")

  val foggy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF01")

  val watch: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u231A")

  val iphone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCF1")

  val calling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCF2")

  val computer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCBB")

  val keyboard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2328\uFE0F")

  val desktop: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDA5\uFE0F")

  val desktopComputer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDA5\uFE0F")

  val printer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDA8\uFE0F")

  val mouseThreeButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDB1\uFE0F")

  val threeButtonMouse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDB1\uFE0F")

  val trackball: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDB2\uFE0F")

  val joystick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD79\uFE0F")

  val compression: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDDC\uFE0F")

  val minidisc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCBD")

  val floppyDisk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCBE")

  val cd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCBF")

  val dvd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCC0")

  val vhs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCFC")

  val camera: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCF7")

  val cameraWithFlash: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCF8")

  val videoCamera: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCF9")

  val movieCamera: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFA5")

  val projector: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCFD\uFE0F")

  val filmProjector: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCFD\uFE0F")

  val filmFrames: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF9E\uFE0F")

  val telephoneReceiver: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCDE")

  val telephone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u260E\uFE0F")

  val pager: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCDF")

  val fax: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCE0")

  val tv: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCFA")

  val radio: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCFB")

  val microphone2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF99\uFE0F")

  val studioMicrophone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF99\uFE0F")

  val levelSlider: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF9A\uFE0F")

  val controlKnobs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF9B\uFE0F")

  val compass: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDED")

  val stopwatch: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23F1\uFE0F")

  val timer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23F2\uFE0F")

  val timerClock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23F2\uFE0F")

  val alarmClock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23F0")

  val clock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD70\uFE0F")

  val mantlepieceClock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD70\uFE0F")

  val hourglass: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u231B")

  val hourglassFlowingSand: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23F3")

  val satellite: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCE1")

  val battery: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD0B")

  val electricPlug: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD0C")

  val bulb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCA1")

  val flashlight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD26")

  val candle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD6F\uFE0F")

  val fireExtinguisher: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDEF")

  val oil: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEE2\uFE0F")

  val oilDrum: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEE2\uFE0F")

  val moneyWithWings: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCB8")

  val dollar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCB5")

  val yen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCB4")

  val euro: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCB6")

  val pound: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCB7")

  val moneybag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCB0")

  val creditCard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCB3")

  val gem: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC8E")

  val scales: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2696\uFE0F")

  val toolbox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDF0")

  val wrench: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD27")

  val hammer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD28")

  val hammerPick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2692\uFE0F")

  val hammerAndPick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2692\uFE0F")

  val tools: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEE0\uFE0F")

  val hammerAndWrench: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEE0\uFE0F")

  val pick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26CF\uFE0F")

  val nutAndBolt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD29")

  val gear: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2699\uFE0F")

  val bricks: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDF1")

  val chains: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26D3\uFE0F")

  val magnet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDF2")

  val gun: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD2B")

  val bomb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCA3")

  val firecracker: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDE8")

  val axe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDE93")

  val razor: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDE92")

  val knife: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD2A")

  val dagger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDE1\uFE0F")

  val daggerKnife: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDE1\uFE0F")

  val crossedSwords: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2694\uFE0F")

  val shield: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEE1\uFE0F")

  val smoking: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEAC")

  val coffin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26B0\uFE0F")

  val urn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26B1\uFE0F")

  val funeralUrn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26B1\uFE0F")

  val amphora: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFFA")

  val diyaLamp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDE94")

  val crystalBall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD2E")

  val prayerBeads: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCFF")

  val nazarAmulet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDFF")

  val barber: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC88")

  val alembic: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2697\uFE0F")

  val telescope: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD2D")

  val microscope: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD2C")

  val hole: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD73\uFE0F")

  val probingCane: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDAF")

  val stethoscope: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDE7A")

  val adhesiveBandage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDE79")

  val pill: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC8A")

  val syringe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC89")

  val dropOfBlood: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDE78")

  val dna: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDEC")

  val microbe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDA0")

  val petriDish: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDEB")

  val testTube: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDEA")

  val thermometer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF21\uFE0F")

  val chair: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDE91")

  val broom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDF9")

  val basket: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDFA")

  val rollOfPaper: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDFB")

  val toilet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEBD")

  val potableWater: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEB0")

  val shower: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEBF")

  val bathtub: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEC1")

  val bath: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEC0")

  val soap: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDFC")

  val sponge: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDFD")

  val squeezeBottle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDF4")

  val bellhop: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDECE\uFE0F")

  val bellhopBell: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDECE\uFE0F")

  val key: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD11")

  val key2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDDD\uFE0F")

  val oldKey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDDD\uFE0F")

  val door: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEAA")

  val couch: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDECB\uFE0F")

  val couchAndLamp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDECB\uFE0F")

  val bed: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDECF\uFE0F")

  val sleepingAccommodation: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDECC")

  val teddyBear: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDF8")

  val framePhoto: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDBC\uFE0F")

  val frameWithPicture: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDBC\uFE0F")

  val shoppingBags: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDECD\uFE0F")

  val shoppingCart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDED2")

  val shoppingTrolley: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDED2")

  val gift: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF81")

  val balloon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF88")

  val flags: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF8F")

  val ribbon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF80")

  val confettiBall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF8A")

  val tada: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF89")

  val dolls: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF8E")

  val izakayaLantern: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFEE")

  val windChime: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF90")

  val redEnvelope: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDE7")

  val envelope: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2709\uFE0F")

  val envelopeWithArrow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCE9")

  val incomingEnvelope: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCE8")

  val eMail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCE7")

  val email: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCE7")

  val loveLetter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC8C")

  val inboxTray: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCE5")

  val outboxTray: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCE4")

  val `package`: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCE6")

  val label: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFF7\uFE0F")

  val mailboxClosed: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCEA")

  val mailbox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCEB")

  val mailboxWithMail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCEC")

  val mailboxWithNoMail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCED")

  val postbox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCEE")

  val postalHorn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCEF")

  val scroll: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCDC")

  val pageWithCurl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCC3")

  val pageFacingUp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCC4")

  val bookmarkTabs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCD1")

  val receipt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDFE")

  val barChart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCCA")

  val chartWithUpwardsTrend: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCC8")

  val chartWithDownwardsTrend: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCC9")

  val notepadSpiral: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDD2\uFE0F")

  val spiralNotePad: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDD2\uFE0F")

  val calendarSpiral: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDD3\uFE0F")

  val spiralCalendarPad: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDD3\uFE0F")

  val calendar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCC6")

  val date: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCC5")

  val wastebasket: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDD1\uFE0F")

  val cardIndex: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCC7")

  val cardBox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDC3\uFE0F")

  val cardFileBox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDC3\uFE0F")

  val ballotBox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDF3\uFE0F")

  val ballotBoxWithBallot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDF3\uFE0F")

  val fileCabinet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDC4\uFE0F")

  val clipboard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCCB")

  val fileFolder: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCC1")

  val openFileFolder: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCC2")

  val dividers: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDC2\uFE0F")

  val cardIndexDividers: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDC2\uFE0F")

  val newspaper2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDDE\uFE0F")

  val rolledUpNewspaper: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDDE\uFE0F")

  val newspaper: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCF0")

  val notebook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCD3")

  val notebookWithDecorativeCover: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCD4")

  val ledger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCD2")

  val closedBook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCD5")

  val greenBook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCD7")

  val blueBook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCD8")

  val orangeBook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCD9")

  val books: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCDA")

  val book: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCD6")

  val bookmark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD16")

  val safetyPin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDF7")

  val link: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD17")

  val paperclip: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCCE")

  val paperclips: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD87\uFE0F")

  val linkedPaperclips: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD87\uFE0F")

  val triangularRuler: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCD0")

  val straightRuler: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCCF")

  val abacus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDEE")

  val pushpin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCCC")

  val roundPushpin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCCD")

  val scissors: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2702\uFE0F")

  val penBallpoint: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD8A\uFE0F")

  val lowerLeftBallpointPen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD8A\uFE0F")

  val penFountain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD8B\uFE0F")

  val lowerLeftFountainPen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD8B\uFE0F")

  val blackNib: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2712\uFE0F")

  val paintbrush: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD8C\uFE0F")

  val lowerLeftPaintbrush: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD8C\uFE0F")

  val crayon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD8D\uFE0F")

  val lowerLeftCrayon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD8D\uFE0F")

  val pencil: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCDD")

  val memo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCDD")

  val pencil2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u270F\uFE0F")

  val mag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD0D")

  val magRight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD0E")

  val lockWithInkPen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD0F")

  val closedLockWithKey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD10")

  val lock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD12")

  val unlock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD13")

  val heart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2764\uFE0F")

  val orangeHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDE1")

  val yellowHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC9B")

  val greenHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC9A")

  val blueHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC99")

  val purpleHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC9C")

  val blackHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDA4")

  val brownHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD0E")

  val whiteHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD0D")

  val brokenHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC94")

  val heartExclamation: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2763\uFE0F")

  val heavyHeartExclamationMarkOrnament: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2763\uFE0F")

  val twoHearts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC95")

  val revolvingHearts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC9E")

  val heartbeat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC93")

  val heartpulse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC97")

  val sparklingHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC96")

  val cupid: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC98")

  val giftHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC9D")

  val heartDecoration: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC9F")

  val peace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u262E\uFE0F")

  val peaceSymbol: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u262E\uFE0F")

  val cross: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u271D\uFE0F")

  val latinCross: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u271D\uFE0F")

  val starAndCrescent: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u262A\uFE0F")

  val omSymbol: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD49\uFE0F")

  val wheelOfDharma: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2638\uFE0F")

  val starOfDavid: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2721\uFE0F")

  val sixPointedStar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD2F")

  val menorah: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD4E")

  val yinYang: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u262F\uFE0F")

  val orthodoxCross: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2626\uFE0F")

  val placeOfWorship: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDED0")

  val worshipSymbol: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDED0")

  val ophiuchus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26CE")

  val aries: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2648")

  val taurus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2649")

  val gemini: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u264A")

  val cancer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u264B")

  val leo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u264C")

  val virgo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u264D")

  val libra: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u264E")

  val scorpius: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u264F")

  val sagittarius: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2650")

  val capricorn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2651")

  val aquarius: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2652")

  val pisces: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2653")

  val id: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDD94")

  val atom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u269B\uFE0F")

  val atomSymbol: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u269B\uFE0F")

  val accept: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDE51")

  val radioactive: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2622\uFE0F")

  val radioactiveSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2622\uFE0F")

  val biohazard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2623\uFE0F")

  val biohazardSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2623\uFE0F")

  val mobilePhoneOff: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCF4")

  val vibrationMode: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCF3")

  val u6709: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDE36")

  val u7121: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDE1A")

  val u7533: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDE38")

  val u55b6: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDE3A")

  val u6708: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDE37\uFE0F")

  val eightPointedBlackStar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2734\uFE0F")

  val vs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDD9A")

  val whiteFlower: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCAE")

  val ideographAdvantage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDE50")

  val secret: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u3299\uFE0F")

  val congratulations: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u3297\uFE0F")

  val u5408: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDE34")

  val u6e80: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDE35")

  val u5272: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDE39")

  val u7981: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDE32")

  val a: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDD70\uFE0F")

  val b: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDD71\uFE0F")

  val ab: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDD8E")

  val cl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDD91")

  val o2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDD7E\uFE0F")

  val sos: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDD98")

  val x: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u274C")

  val o: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2B55")

  val octagonalSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDED1")

  val stopSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDED1")

  val noEntry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26D4")

  val nameBadge: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCDB")

  val noEntrySign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEAB")

  val `100`: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCAF")

  val anger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCA2")

  val hotsprings: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2668\uFE0F")

  val noPedestrians: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEB7")

  val doNotLitter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEAF")

  val noBicycles: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEB3")

  val nonPotableWater: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEB1")

  val underage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD1E")

  val noMobilePhones: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCF5")

  val noSmoking: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEAD")

  val exclamation: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2757")

  val greyExclamation: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2755")

  val question: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2753")

  val greyQuestion: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2754")

  val bangbang: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u203C\uFE0F")

  val interrobang: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2049\uFE0F")

  val lowBrightness: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD05")

  val highBrightness: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD06")

  val partAlternationMark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u303D\uFE0F")

  val warning: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26A0\uFE0F")

  val childrenCrossing: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEB8")

  val trident: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD31")

  val fleurDeLis: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u269C\uFE0F")

  val beginner: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD30")

  val recycle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u267B\uFE0F")

  val whiteCheckMark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2705")

  val u6307: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDE2F")

  val chart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCB9")

  val sparkle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2747\uFE0F")

  val eightSpokedAsterisk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2733\uFE0F")

  val negativeSquaredCrossMark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u274E")

  val globeWithMeridians: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF10")

  val diamondShapeWithADotInside: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCA0")

  val m: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u24C2\uFE0F")

  val cyclone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF00")

  val zzz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCA4")

  val atm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFE7")

  val wc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEBE")

  val wheelchair: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u267F")

  val parking: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDD7F\uFE0F")

  val u7a7a: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDE33")

  val sa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDE02\uFE0F")

  val passportControl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEC2")

  val customs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEC3")

  val baggageClaim: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEC4")

  val leftLuggage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEC5")

  val mens: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEB9")

  val womens: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEBA")

  val babySymbol: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEBC")

  val restroom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEBB")

  val putLitterInItsPlace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEAE")

  val cinema: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFA6")

  val signalStrength: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCF6")

  val koko: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDE01")

  val symbols: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD23")

  val informationSource: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2139\uFE0F")

  val abc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD24")

  val abcd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD21")

  val capitalAbcd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD20")

  val ng: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDD96")

  val ok: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDD97")

  val up: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDD99")

  val cool: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDD92")

  val new: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDD95")

  val free: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDD93")

  val zero: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("0\uFE0F\u20E3")

  val one: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("1\uFE0F\u20E3")

  val two: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("2\uFE0F\u20E3")

  val three: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("3\uFE0F\u20E3")

  val four: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("4\uFE0F\u20E3")

  val five: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("5\uFE0F\u20E3")

  val six: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("6\uFE0F\u20E3")

  val seven: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("7\uFE0F\u20E3")

  val eight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("8\uFE0F\u20E3")

  val nine: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("9\uFE0F\u20E3")

  val keycapTen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD1F")

  val `1234`: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD22")

  val hash: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("#\uFE0F\u20E3")

  val asterisk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("*\uFE0F\u20E3")

  val keycapAsterisk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("*\uFE0F\u20E3")

  val eject: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23CF\uFE0F")

  val ejectSymbol: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23CF\uFE0F")

  val arrowForward: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u25B6\uFE0F")

  val pauseButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23F8\uFE0F")

  val doubleVerticalBar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23F8\uFE0F")

  val playPause: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23EF\uFE0F")

  val stopButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23F9\uFE0F")

  val recordButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23FA\uFE0F")

  val trackNext: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23ED\uFE0F")

  val nextTrack: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23ED\uFE0F")

  val trackPrevious: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23EE\uFE0F")

  val previousTrack: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23EE\uFE0F")

  val fastForward: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23E9")

  val rewind: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23EA")

  val arrowDoubleUp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23EB")

  val arrowDoubleDown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23EC")

  val arrowBackward: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u25C0\uFE0F")

  val arrowUpSmall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD3C")

  val arrowDownSmall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD3D")

  val arrowRight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u27A1\uFE0F")

  val arrowLeft: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2B05\uFE0F")

  val arrowUp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2B06\uFE0F")

  val arrowDown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2B07\uFE0F")

  val arrowUpperRight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2197\uFE0F")

  val arrowLowerRight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2198\uFE0F")

  val arrowLowerLeft: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2199\uFE0F")

  val arrowUpperLeft: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2196\uFE0F")

  val arrowUpDown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2195\uFE0F")

  val leftRightArrow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2194\uFE0F")

  val arrowRightHook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u21AA\uFE0F")

  val leftwardsArrowWithHook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u21A9\uFE0F")

  val arrowHeadingUp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2934\uFE0F")

  val arrowHeadingDown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2935\uFE0F")

  val twistedRightwardsArrows: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD00")

  val repeat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD01")

  val repeatOne: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD02")

  val arrowsCounterclockwise: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD04")

  val arrowsClockwise: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD03")

  val musicalNote: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFB5")

  val notes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFB6")

  val heavyPlusSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2795")

  val heavyMinusSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2796")

  val heavyDivisionSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2797")

  val heavyMultiplicationX: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2716\uFE0F")

  val infinity: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u267E\uFE0F")

  val heavyDollarSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCB2")

  val currencyExchange: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCB1")

  val tm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2122\uFE0F")

  val copyright: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u00A9\uFE0F")

  val registered: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u00AE\uFE0F")

  val wavyDash: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u3030\uFE0F")

  val curlyLoop: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u27B0")

  val loop: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u27BF")

  val end: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD1A")

  val back: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD19")

  val on: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD1B")

  val top: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD1D")

  val soon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD1C")

  val heavyCheckMark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2714\uFE0F")

  val ballotBoxWithCheck: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2611\uFE0F")

  val radioButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD18")

  val whiteCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26AA")

  val blackCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26AB")

  val redCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD34")

  val blueCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD35")

  val brownCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDFE4")

  val purpleCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDFE3")

  val greenCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDFE2")

  val yellowCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDFE1")

  val orangeCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDFE0")

  val smallRedTriangle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD3A")

  val smallRedTriangleDown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD3B")

  val smallOrangeDiamond: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD38")

  val smallBlueDiamond: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD39")

  val largeOrangeDiamond: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD36")

  val largeBlueDiamond: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD37")

  val whiteSquareButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD33")

  val blackSquareButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD32")

  val blackSmallSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u25AA\uFE0F")

  val whiteSmallSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u25AB\uFE0F")

  val blackMediumSmallSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u25FE")

  val whiteMediumSmallSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u25FD")

  val blackMediumSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u25FC\uFE0F")

  val whiteMediumSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u25FB\uFE0F")

  val blackLargeSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2B1B")

  val whiteLargeSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2B1C")

  val orangeSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDFE7")

  val blueSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDFE6")

  val redSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDFE5")

  val brownSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDFEB")

  val purpleSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDFEA")

  val greenSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDFE9")

  val yellowSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDFE8")

  val speaker: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD08")

  val mute: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD07")

  val sound: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD09")

  val loudSound: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD0A")

  val bell: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD14")

  val noBell: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD15")

  val mega: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCE3")

  val loudspeaker: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCE2")

  val speechLeft: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDE8\uFE0F")

  val leftSpeechBubble: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDE8\uFE0F")

  val eyeInSpeechBubble: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC41\u200D\uD83D\uDDE8")

  val speechBalloon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCAC")

  val thoughtBalloon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCAD")

  val angerRight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDEF\uFE0F")

  val rightAngerBubble: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDEF\uFE0F")

  val spades: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2660\uFE0F")

  val clubs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2663\uFE0F")

  val hearts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2665\uFE0F")

  val diamonds: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2666\uFE0F")

  val blackJoker: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDCCF")

  val flowerPlayingCards: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFB4")

  val mahjong: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDC04")

  val clock1: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD50")

  val clock2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD51")

  val clock3: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD52")

  val clock4: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD53")

  val clock5: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD54")

  val clock6: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD55")

  val clock7: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD56")

  val clock8: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD57")

  val clock9: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD58")

  val clock10: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD59")

  val clock11: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD5A")

  val clock12: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD5B")

  val clock130: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD5C")

  val clock230: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD5D")

  val clock330: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD5E")

  val clock430: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD5F")

  val clock530: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD60")

  val clock630: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD61")

  val clock730: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD62")

  val clock830: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD63")

  val clock930: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD64")

  val clock1030: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD65")

  val clock1130: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD66")

  val clock1230: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD67")

  val femaleSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2640\uFE0F")

  val maleSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2642\uFE0F")

  val medicalSymbol: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2695\uFE0F")

  val regionalIndicatorZ: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFF")

  val regionalIndicatorY: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFE")

  val regionalIndicatorX: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFD")

  val regionalIndicatorW: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFC")

  val regionalIndicatorV: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFB")

  val regionalIndicatorU: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFA")

  val regionalIndicatorT: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9")

  val regionalIndicatorS: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8")

  val regionalIndicatorR: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF7")

  val regionalIndicatorQ: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF6")

  val regionalIndicatorP: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF5")

  val regionalIndicatorO: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF4")

  val regionalIndicatorN: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF3")

  val regionalIndicatorM: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2")

  val regionalIndicatorL: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF1")

  val regionalIndicatorK: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF0")

  val regionalIndicatorJ: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEF")

  val regionalIndicatorI: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEE")

  val regionalIndicatorH: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDED")

  val regionalIndicatorG: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC")

  val regionalIndicatorF: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEB")

  val regionalIndicatorE: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEA")

  val regionalIndicatorD: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE9")

  val regionalIndicatorC: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8")

  val regionalIndicatorB: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7")

  val regionalIndicatorA: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6")

  val flagWhite: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFF3\uFE0F")

  val flagBlack: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFF4")

  val checkeredFlag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFC1")

  val triangularFlagOnPost: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEA9")

  val rainbowFlag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFF3\uFE0F\u200D\uD83C\uDF08")

  val gayPrideFlag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFF3\uFE0F\u200D\uD83C\uDF08")

  val pirateFlag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFF4\u200D\u2620\uFE0F")

  val flagAf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDEB")

  val flagAx: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDFD")

  val flagAl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDF1")

  val flagDz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE9\uD83C\uDDFF")

  val flagAs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDF8")

  val flagAd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDE9")

  val flagAo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDF4")

  val flagAi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDEE")

  val flagAq: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDF6")

  val flagAg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDEC")

  val flagAr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDF7")

  val flagAm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDF2")

  val flagAw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDFC")

  val flagAu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDFA")

  val flagAt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDF9")

  val flagAz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDFF")

  val flagBs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDF8")

  val flagBh: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDED")

  val flagBd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDE9")

  val flagBb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDE7")

  val flagBy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDFE")

  val flagBe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDEA")

  val flagBz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDFF")

  val flagBj: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDEF")

  val flagBm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDF2")

  val flagBt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDF9")

  val flagBo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDF4")

  val flagBa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDE6")

  val flagBw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDFC")

  val flagBr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDF7")

  val flagIo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEE\uD83C\uDDF4")

  val flagVg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFB\uD83C\uDDEC")

  val flagBn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDF3")

  val flagBg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDEC")

  val flagBf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDEB")

  val flagBi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDEE")

  val flagKh: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF0\uD83C\uDDED")

  val flagCm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDF2")

  val flagCa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDE6")

  val flagIc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEE\uD83C\uDDE8")

  val flagCv: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDFB")

  val flagBq: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDF6")

  val flagKy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF0\uD83C\uDDFE")

  val flagCf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDEB")

  val flagTd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDE9")

  val flagCl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDF1")

  val flagCn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDF3")

  val flagCx: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDFD")

  val flagCc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDE8")

  val flagCo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDF4")

  val flagKm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF0\uD83C\uDDF2")

  val flagCg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDEC")

  val flagCd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDE9")

  val flagCk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDF0")

  val flagCr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDF7")

  val flagCi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDEE")

  val flagHr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDED\uD83C\uDDF7")

  val flagCu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDFA")

  val flagCw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDFC")

  val flagCy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDFE")

  val flagCz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDFF")

  val flagDk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE9\uD83C\uDDF0")

  val flagDj: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE9\uD83C\uDDEF")

  val flagDm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE9\uD83C\uDDF2")

  val flagDo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE9\uD83C\uDDF4")

  val flagEc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEA\uD83C\uDDE8")

  val flagEg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEA\uD83C\uDDEC")

  val flagSv: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDFB")

  val flagGq: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDF6")

  val flagEr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEA\uD83C\uDDF7")

  val flagEe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEA\uD83C\uDDEA")

  val flagEt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEA\uD83C\uDDF9")

  val flagEu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEA\uD83C\uDDFA")

  val flagFk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEB\uD83C\uDDF0")

  val flagFo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEB\uD83C\uDDF4")

  val flagFj: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEB\uD83C\uDDEF")

  val flagFi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEB\uD83C\uDDEE")

  val flagFr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEB\uD83C\uDDF7")

  val flagGf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDEB")

  val flagPf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF5\uD83C\uDDEB")

  val flagTf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDEB")

  val flagGa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDE6")

  val flagGm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDF2")

  val flagGe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDEA")

  val flagDe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE9\uD83C\uDDEA")

  val flagGh: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDED")

  val flagGi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDEE")

  val flagGr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDF7")

  val flagGl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDF1")

  val flagGd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDE9")

  val flagGp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDF5")

  val flagGu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDFA")

  val flagGt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDF9")

  val flagGg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDEC")

  val flagGn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDF3")

  val flagGw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDFC")

  val flagGy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDFE")

  val flagHt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDED\uD83C\uDDF9")

  val flagHn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDED\uD83C\uDDF3")

  val flagHk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDED\uD83C\uDDF0")

  val flagHu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDED\uD83C\uDDFA")

  val flagIs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEE\uD83C\uDDF8")

  val flagIn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEE\uD83C\uDDF3")

  val flagId: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEE\uD83C\uDDE9")

  val flagIr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEE\uD83C\uDDF7")

  val flagIq: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEE\uD83C\uDDF6")

  val flagIe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEE\uD83C\uDDEA")

  val flagIm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEE\uD83C\uDDF2")

  val flagIl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEE\uD83C\uDDF1")

  val flagIt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEE\uD83C\uDDF9")

  val flagJm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEF\uD83C\uDDF2")

  val flagJp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEF\uD83C\uDDF5")

  val crossedFlags: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF8C")

  val flagJe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEF\uD83C\uDDEA")

  val flagJo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEF\uD83C\uDDF4")

  val flagKz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF0\uD83C\uDDFF")

  val flagKe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF0\uD83C\uDDEA")

  val flagKi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF0\uD83C\uDDEE")

  val flagXk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFD\uD83C\uDDF0")

  val flagKw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF0\uD83C\uDDFC")

  val flagKg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF0\uD83C\uDDEC")

  val flagLa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF1\uD83C\uDDE6")

  val flagLv: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF1\uD83C\uDDFB")

  val flagLb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF1\uD83C\uDDE7")

  val flagLs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF1\uD83C\uDDF8")

  val flagLr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF1\uD83C\uDDF7")

  val flagLy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF1\uD83C\uDDFE")

  val flagLi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF1\uD83C\uDDEE")

  val flagLt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF1\uD83C\uDDF9")

  val flagLu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF1\uD83C\uDDFA")

  val flagMo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDF4")

  val flagMk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDF0")

  val flagMg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDEC")

  val flagMw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDFC")

  val flagMy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDFE")

  val flagMv: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDFB")

  val flagMl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDF1")

  val flagMt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDF9")

  val flagMh: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDED")

  val flagMq: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDF6")

  val flagMr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDF7")

  val flagMu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDFA")

  val flagYt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFE\uD83C\uDDF9")

  val flagMx: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDFD")

  val flagFm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEB\uD83C\uDDF2")

  val flagMd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDE9")

  val flagMc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDE8")

  val flagMn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDF3")

  val flagMe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDEA")

  val flagMs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDF8")

  val flagMa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDE6")

  val flagMz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDFF")

  val flagMm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDF2")

  val flagNa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF3\uD83C\uDDE6")

  val flagNr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF3\uD83C\uDDF7")

  val flagNp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF3\uD83C\uDDF5")

  val flagNl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF3\uD83C\uDDF1")

  val flagNc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF3\uD83C\uDDE8")

  val flagNz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF3\uD83C\uDDFF")

  val flagNi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF3\uD83C\uDDEE")

  val flagNe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF3\uD83C\uDDEA")

  val flagNg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF3\uD83C\uDDEC")

  val flagNu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF3\uD83C\uDDFA")

  val flagNf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF3\uD83C\uDDEB")

  val flagKp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF0\uD83C\uDDF5")

  val flagMp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDF5")

  val flagNo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF3\uD83C\uDDF4")

  val flagOm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF4\uD83C\uDDF2")

  val flagPk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF5\uD83C\uDDF0")

  val flagPw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF5\uD83C\uDDFC")

  val flagPs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF5\uD83C\uDDF8")

  val flagPa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF5\uD83C\uDDE6")

  val flagPg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF5\uD83C\uDDEC")

  val flagPy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF5\uD83C\uDDFE")

  val flagPe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF5\uD83C\uDDEA")

  val flagPh: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF5\uD83C\uDDED")

  val flagPn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF5\uD83C\uDDF3")

  val flagPl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF5\uD83C\uDDF1")

  val flagPt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF5\uD83C\uDDF9")

  val flagPr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF5\uD83C\uDDF7")

  val flagQa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF6\uD83C\uDDE6")

  val flagRe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF7\uD83C\uDDEA")

  val flagRo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF7\uD83C\uDDF4")

  val flagRu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF7\uD83C\uDDFA")

  val flagRw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF7\uD83C\uDDFC")

  val flagWs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFC\uD83C\uDDF8")

  val flagSm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDF2")

  val flagSt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDF9")

  val flagSa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDE6")

  val flagSn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDF3")

  val flagRs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF7\uD83C\uDDF8")

  val flagSc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDE8")

  val flagSl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDF1")

  val flagSg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDEC")

  val flagSx: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDFD")

  val flagSk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDF0")

  val flagSi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDEE")

  val flagGs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDF8")

  val flagSb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDE7")

  val flagSo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDF4")

  val flagZa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFF\uD83C\uDDE6")

  val flagKr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF0\uD83C\uDDF7")

  val flagSs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDF8")

  val flagEs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEA\uD83C\uDDF8")

  val flagLk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF1\uD83C\uDDF0")

  val flagBl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDF1")

  val flagSh: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDED")

  val flagKn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF0\uD83C\uDDF3")

  val flagLc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF1\uD83C\uDDE8")

  val flagPm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF5\uD83C\uDDF2")

  val flagVc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFB\uD83C\uDDE8")

  val flagSd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDE9")

  val flagSr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDF7")

  val flagSz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDFF")

  val flagSe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDEA")

  val flagCh: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDED")

  val flagSy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDFE")

  val flagTw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDFC")

  val flagTj: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDEF")

  val flagTz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDFF")

  val flagTh: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDED")

  val flagTl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDF1")

  val flagTg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDEC")

  val flagTk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDF0")

  val flagTo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDF4")

  val flagTt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDF9")

  val flagTn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDF3")

  val flagTr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDF7")

  val flagTm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDF2")

  val flagTc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDE8")

  val flagVi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFB\uD83C\uDDEE")

  val flagTv: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDFB")

  val flagUg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFA\uD83C\uDDEC")

  val flagUa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFA\uD83C\uDDE6")

  val flagAe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDEA")

  val flagGb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDE7")

  val england: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83C\uDFF4\uDB40\uDC67\uDB40\uDC62\uDB40\uDC65\uDB40\uDC6E\uDB40\uDC67\uDB40\uDC7F")

  val scotland: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83C\uDFF4\uDB40\uDC67\uDB40\uDC62\uDB40\uDC73\uDB40\uDC63\uDB40\uDC74\uDB40\uDC7F")

  val wales: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83C\uDFF4\uDB40\uDC67\uDB40\uDC62\uDB40\uDC77\uDB40\uDC6C\uDB40\uDC73\uDB40\uDC7F")

  val flagUs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFA\uD83C\uDDF8")

  val flagUy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFA\uD83C\uDDFE")

  val flagUz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFA\uD83C\uDDFF")

  val flagVu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFB\uD83C\uDDFA")

  val flagVa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFB\uD83C\uDDE6")

  val flagVe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFB\uD83C\uDDEA")

  val flagVn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFB\uD83C\uDDF3")

  val flagWf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFC\uD83C\uDDEB")

  val flagEh: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEA\uD83C\uDDED")

  val flagYe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFE\uD83C\uDDEA")

  val flagZm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFF\uD83C\uDDF2")

  val flagZw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFF\uD83C\uDDFC")

  val flagAc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDE8")

  val flagBv: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDFB")

  val flagCp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDF5")

  val flagEa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEA\uD83C\uDDE6")

  val flagDg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE9\uD83C\uDDEC")

  val flagHm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDED\uD83C\uDDF2")

  val flagMf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDEB")

  val flagSj: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDEF")

  val flagTa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDE6")

  val flagUm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFA\uD83C\uDDF2")

  val unitedNations: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFA\uD83C\uDDF3")

  /**
   * Gets a discord emoji with the given [unicode].
   */
  operator fun get(unicode: String): DiscordEmoji? {
    val tone = unicode.toSkinTone()
    val withoutTone = unicode.removeTone()
    val emoji = Emojis.all[withoutTone]

    return if (emoji is DiscordEmoji.Diverse) emoji.copy(tone = tone!!) else emoji
  }
}

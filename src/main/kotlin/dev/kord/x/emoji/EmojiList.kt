package dev.kord.x.emoji

import kotlin.String
import kotlin.Suppress
import kotlin.collections.Map

/**
 * List of all supported discord emojis.
 */
@Suppress(
  "RemoveRedundantBackticks",
  "RedundantVisibilityModifier",
  "MemberVisibilityCanBePrivate",
  "unused",
)
public object Emojis {
  val all: Map<String, DiscordEmoji> = mapOf(
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

  public val grinning: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE00")

  public val smiley: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE03")

  public val smile: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE04")

  public val grin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE01")

  public val laughing: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE06")

  public val satisfied: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE06")

  public val sweatSmile: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE05")

  public val joy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE02")

  public val rofl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD23")

  public val rollingOnTheFloorLaughing: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD23")

  public val relaxed: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u263A\uFE0F")

  public val blush: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE0A")

  public val innocent: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE07")

  public val slightSmile: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE42")

  public val slightlySmilingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE42")

  public val upsideDown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE43")

  public val upsideDownFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE43")

  public val wink: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE09")

  public val relieved: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE0C")

  public val heartEyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE0D")

  public val smilingFaceWith3Hearts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD70")

  public val kissingHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE18")

  public val kissing: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE17")

  public val kissingSmilingEyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE19")

  public val kissingClosedEyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE1A")

  public val yum: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE0B")

  public val stuckOutTongue: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE1B")

  public val stuckOutTongueClosedEyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE1D")

  public val stuckOutTongueWinkingEye: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE1C")

  public val zanyFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD2A")

  public val faceWithRaisedEyebrow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD28")

  public val faceWithMonocle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDD0")

  public val nerd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD13")

  public val nerdFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD13")

  public val sunglasses: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE0E")

  public val starStruck: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD29")

  public val partyingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD73")

  public val smirk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE0F")

  public val unamused: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE12")

  public val disappointed: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE1E")

  public val pensive: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE14")

  public val worried: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE1F")

  public val confused: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE15")

  public val slightFrown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE41")

  public val slightlyFrowningFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE41")

  public val frowning2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2639\uFE0F")

  public val whiteFrowningFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2639\uFE0F")

  public val persevere: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE23")

  public val confounded: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE16")

  public val tiredFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE2B")

  public val weary: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE29")

  public val pleadingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD7A")

  public val cry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE22")

  public val sob: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE2D")

  public val triumph: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE24")

  public val angry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE20")

  public val rage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE21")

  public val faceWithSymbolsOverMouth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD2C")

  public val explodingHead: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD2F")

  public val flushed: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE33")

  public val hotFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD75")

  public val coldFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD76")

  public val scream: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE31")

  public val fearful: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE28")

  public val coldSweat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE30")

  public val disappointedRelieved: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE25")

  public val sweat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE13")

  public val hugging: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD17")

  public val huggingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD17")

  public val thinking: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD14")

  public val thinkingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD14")

  public val faceWithHandOverMouth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD2D")

  public val yawningFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD71")

  public val shushingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD2B")

  public val lyingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD25")

  public val liar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD25")

  public val noMouth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE36")

  public val neutralFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE10")

  public val expressionless: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE11")

  public val grimacing: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE2C")

  public val rollingEyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE44")

  public val faceWithRollingEyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE44")

  public val hushed: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE2F")

  public val frowning: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE26")

  public val anguished: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE27")

  public val openMouth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE2E")

  public val astonished: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE32")

  public val sleeping: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE34")

  public val droolingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD24")

  public val drool: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD24")

  public val sleepy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE2A")

  public val dizzyFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE35")

  public val zipperMouth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD10")

  public val zipperMouthFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD10")

  public val woozyFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD74")

  public val nauseatedFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD22")

  public val sick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD22")

  public val faceVomiting: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD2E")

  public val sneezingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD27")

  public val sneeze: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD27")

  public val mask: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE37")

  public val thermometerFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD12")

  public val faceWithThermometer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD12")

  public val headBandage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD15")

  public val faceWithHeadBandage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD15")

  public val moneyMouth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD11")

  public val moneyMouthFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD11")

  public val cowboy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD20")

  public val faceWithCowboyHat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD20")

  public val smilingImp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE08")

  public val imp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC7F")

  public val japaneseOgre: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC79")

  public val japaneseGoblin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC7A")

  public val clown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD21")

  public val clownFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD21")

  public val poop: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCA9")

  public val shit: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCA9")

  public val hankey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCA9")

  public val poo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCA9")

  public val ghost: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC7B")

  public val skull: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC80")

  public val skeleton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC80")

  public val skullCrossbones: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2620\uFE0F")

  public val skullAndCrossbones: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2620\uFE0F")

  public val alien: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC7D")

  public val spaceInvader: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC7E")

  public val robot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD16")

  public val robotFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD16")

  public val jackOLantern: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF83")

  public val smileyCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE3A")

  public val smileCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE38")

  public val joyCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE39")

  public val heartEyesCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE3B")

  public val smirkCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE3C")

  public val kissingCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE3D")

  public val screamCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE40")

  public val cryingCatFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE3F")

  public val poutingCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE3E")

  public val palmsUpTogether: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD32")

  public val openHands: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC50")

  public val raisedHands: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE4C")

  public val clap: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC4F")

  public val handshake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD1D")

  public val shakingHands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD1D")

  public val thumbsup: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC4D")

  public val `+1`: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC4D")

  public val thumbup: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC4D")

  public val thumbsdown: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC4E")

  public val `-1`: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC4E")

  public val thumbdown: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC4E")

  public val punch: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC4A")

  public val fist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\u270A")

  public val leftFacingFist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD1B")

  public val leftFist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD1B")

  public val rightFacingFist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD1C")

  public val rightFist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD1C")

  public val fingersCrossed: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD1E")

  public val handWithIndexAndMiddleFingerCrossed: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD1E")

  public val v: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\u270C\uFE0F")

  public val loveYouGesture: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD1F")

  public val metal: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD18")

  public val signOfTheHorns: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD18")

  public val okHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC4C")

  public val pinchingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD0F")

  public val pointLeft: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC48")

  public val pointRight: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC49")

  public val pointUp2: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC46")

  public val pointDown: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC47")

  public val pointUp: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\u261D\uFE0F")

  public val raisedHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\u270B")

  public val raisedBackOfHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD1A")

  public val backOfHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD1A")

  public val handSplayed: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDD90\uFE0F")

  public val raisedHandWithFingersSplayed: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDD90\uFE0F")

  public val vulcan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDD96")

  public val raisedHandWithPartBetweenMiddleAndRingFingers: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDD96")

  public val wave: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC4B")

  public val callMe: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD19")

  public val callMeHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD19")

  public val muscle: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDCAA")

  public val mechanicalArm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDBE")

  public val middleFinger: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDD95")

  public val reversedHandWithMiddleFingerExtended: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDD95")

  public val writingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\u270D\uFE0F")

  public val pray: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE4F")

  public val foot: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDB6")

  public val leg: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDB5")

  public val mechanicalLeg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDBF")

  public val lipstick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC84")

  public val kiss: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC8B")

  public val lips: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC44")

  public val tooth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDB7")

  public val bone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDB4")

  public val tongue: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC45")

  public val ear: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC42")

  public val earWithHearingAid: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDBB")

  public val nose: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC43")

  public val footprints: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC63")

  public val eye: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC41\uFE0F")

  public val eyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC40")

  public val brain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDE0")

  public val speakingHead: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDE3\uFE0F")

  public val speakingHeadInSilhouette: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDE3\uFE0F")

  public val bustInSilhouette: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC64")

  public val bustsInSilhouette: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC65")

  public val baby: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC76")

  public val girl: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC67")

  public val child: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD2")

  public val boy: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC66")

  public val woman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69")

  public val adult: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD1")

  public val man: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68")

  public val womanCurlyHaired: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83E\uDDB1")

  public val manCurlyHaired: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83E\uDDB1")

  public val womanRedHaired: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83E\uDDB0")

  public val manRedHaired: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83E\uDDB0")

  public val blondHairedWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC71\u200D\u2640\uFE0F")

  public val blondHairedPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC71")

  public val personWithBlondHair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC71")

  public val blondHairedMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC71\u200D\u2642\uFE0F")

  public val womanWhiteHaired: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83E\uDDB3")

  public val manWhiteHaired: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83E\uDDB3")

  public val womanBald: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83E\uDDB2")

  public val manBald: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83E\uDDB2")

  public val beardedPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD4")

  public val olderWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC75")

  public val grandma: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC75")

  public val olderAdult: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD3")

  public val olderMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC74")

  public val manWithChineseCap: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC72")

  public val manWithGuaPiMao: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC72")

  public val personWearingTurban: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC73")

  public val manWithTurban: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC73")

  public val womanWearingTurban: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC73\u200D\u2640\uFE0F")

  public val manWearingTurban: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC73\u200D\u2642\uFE0F")

  public val womanWithHeadscarf: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD5")

  public val policeOfficer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC6E")

  public val cop: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC6E")

  public val womanPoliceOfficer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC6E\u200D\u2640\uFE0F")

  public val manPoliceOfficer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC6E\u200D\u2642\uFE0F")

  public val constructionWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC77")

  public val womanConstructionWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC77\u200D\u2640\uFE0F")

  public val manConstructionWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC77\u200D\u2642\uFE0F")

  public val guard: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC82")

  public val guardsman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC82")

  public val womanGuard: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC82\u200D\u2640\uFE0F")

  public val manGuard: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC82\u200D\u2642\uFE0F")

  public val detective: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDD75\uFE0F")

  public val spy: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDD75\uFE0F")

  public val sleuthOrSpy: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDD75\uFE0F")

  public val womanDetective: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDD75\uFE0F\u200D\u2640\uFE0F")

  public val manDetective: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDD75\uFE0F\u200D\u2642\uFE0F")

  public val womanHealthWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\u2695\uFE0F")

  public val manHealthWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\u2695\uFE0F")

  public val womanFarmer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83C\uDF3E")

  public val manFarmer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83C\uDF3E")

  public val womanCook: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83C\uDF73")

  public val manCook: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83C\uDF73")

  public val womanStudent: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83C\uDF93")

  public val manStudent: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83C\uDF93")

  public val womanSinger: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83C\uDFA4")

  public val manSinger: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83C\uDFA4")

  public val womanTeacher: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83C\uDFEB")

  public val manTeacher: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83C\uDFEB")

  public val womanFactoryWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83C\uDFED")

  public val manFactoryWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83C\uDFED")

  public val womanTechnologist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83D\uDCBB")

  public val manTechnologist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83D\uDCBB")

  public val womanOfficeWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83D\uDCBC")

  public val manOfficeWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83D\uDCBC")

  public val womanMechanic: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83D\uDD27")

  public val manMechanic: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83D\uDD27")

  public val womanScientist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83D\uDD2C")

  public val manScientist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83D\uDD2C")

  public val womanArtist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83C\uDFA8")

  public val manArtist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83C\uDFA8")

  public val womanFirefighter: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83D\uDE92")

  public val manFirefighter: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83D\uDE92")

  public val womanPilot: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\u2708\uFE0F")

  public val manPilot: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\u2708\uFE0F")

  public val womanAstronaut: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83D\uDE80")

  public val manAstronaut: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83D\uDE80")

  public val womanJudge: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\u2696\uFE0F")

  public val manJudge: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\u2696\uFE0F")

  public val brideWithVeil: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC70")

  public val manInTuxedo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD35")

  public val princess: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC78")

  public val prince: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD34")

  public val superhero: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDB8")

  public val womanSuperhero: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDB8\u200D\u2640\uFE0F")

  public val manSuperhero: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDB8\u200D\u2642\uFE0F")

  public val supervillain: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDB9")

  public val womanSupervillain: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDB9\u200D\u2640\uFE0F")

  public val manSupervillain: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDB9\u200D\u2642\uFE0F")

  public val mrsClaus: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD36")

  public val motherChristmas: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD36")

  public val santa: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDF85")

  public val mage: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD9")

  public val womanMage: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD9\u200D\u2640\uFE0F")

  public val manMage: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD9\u200D\u2642\uFE0F")

  public val elf: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDDD")

  public val womanElf: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDDD\u200D\u2640\uFE0F")

  public val manElf: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDDD\u200D\u2642\uFE0F")

  public val vampire: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDDB")

  public val womanVampire: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDDB\u200D\u2640\uFE0F")

  public val manVampire: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDDB\u200D\u2642\uFE0F")

  public val zombie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDDF")

  public val womanZombie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDDF\u200D\u2640\uFE0F")

  public val manZombie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDDF\u200D\u2642\uFE0F")

  public val genie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDDE")

  public val womanGenie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDDE\u200D\u2640\uFE0F")

  public val manGenie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDDE\u200D\u2642\uFE0F")

  public val merperson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDDC")

  public val mermaid: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDDC\u200D\u2640\uFE0F")

  public val merman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDDC\u200D\u2642\uFE0F")

  public val fairy: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDDA")

  public val womanFairy: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDDA\u200D\u2640\uFE0F")

  public val manFairy: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDDA\u200D\u2642\uFE0F")

  public val angel: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC7C")

  public val pregnantWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD30")

  public val expectingWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD30")

  public val breastFeeding: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD31")

  public val personBowing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE47")

  public val bow: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE47")

  public val womanBowing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE47\u200D\u2640\uFE0F")

  public val manBowing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE47\u200D\u2642\uFE0F")

  public val personTippingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC81")

  public val informationDeskPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC81")

  public val womanTippingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC81\u200D\u2640\uFE0F")

  public val manTippingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC81\u200D\u2642\uFE0F")

  public val personGesturingNo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE45")

  public val noGood: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE45")

  public val womanGesturingNo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE45\u200D\u2640\uFE0F")

  public val manGesturingNo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE45\u200D\u2642\uFE0F")

  public val personGesturingOk: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE46")

  public val okWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE46")

  public val womanGesturingOk: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE46\u200D\u2640\uFE0F")

  public val manGesturingOk: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE46\u200D\u2642\uFE0F")

  public val personRaisingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE4B")

  public val raisingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE4B")

  public val womanRaisingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE4B\u200D\u2640\uFE0F")

  public val manRaisingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE4B\u200D\u2642\uFE0F")

  public val deafPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDCF")

  public val deafWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDCF\u200D\u2640\uFE0F")

  public val deafMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDCF\u200D\u2642\uFE0F")

  public val personFacepalming: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD26")

  public val facePalm: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD26")

  public val facepalm: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD26")

  public val womanFacepalming: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD26\u200D\u2640\uFE0F")

  public val manFacepalming: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD26\u200D\u2642\uFE0F")

  public val personShrugging: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD37")

  public val shrug: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD37")

  public val womanShrugging: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD37\u200D\u2640\uFE0F")

  public val manShrugging: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD37\u200D\u2642\uFE0F")

  public val personPouting: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE4E")

  public val personWithPoutingFace: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE4E")

  public val womanPouting: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE4E\u200D\u2640\uFE0F")

  public val manPouting: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE4E\u200D\u2642\uFE0F")

  public val personFrowning: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE4D")

  public val womanFrowning: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE4D\u200D\u2640\uFE0F")

  public val manFrowning: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDE4D\u200D\u2642\uFE0F")

  public val personGettingHaircut: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC87")

  public val haircut: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC87")

  public val womanGettingHaircut: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC87\u200D\u2640\uFE0F")

  public val manGettingHaircut: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC87\u200D\u2642\uFE0F")

  public val personGettingMassage: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC86")

  public val massage: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC86")

  public val womanGettingFaceMassage: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC86\u200D\u2640\uFE0F")

  public val manGettingFaceMassage: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC86\u200D\u2642\uFE0F")

  public val personInSteamyRoom: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD6")

  public val womanInSteamyRoom: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD6\u200D\u2640\uFE0F")

  public val manInSteamyRoom: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD6\u200D\u2642\uFE0F")

  public val nailCare: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC85")

  public val selfie: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD33")

  public val dancer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC83")

  public val manDancing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDD7A")

  public val maleDancer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDD7A")

  public val peopleWithBunnyEarsPartying: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC6F")

  public val dancers: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC6F")

  public val womenWithBunnyEarsPartying: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC6F\u200D\u2640\uFE0F")

  public val menWithBunnyEarsPartying: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC6F\u200D\u2642\uFE0F")

  public val levitate: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDD74\uFE0F")

  public val manInBusinessSuitLevitating: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDD74\uFE0F")

  public val personWalking: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEB6")

  public val walking: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEB6")

  public val womanWalking: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEB6\u200D\u2640\uFE0F")

  public val manWalking: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEB6\u200D\u2642\uFE0F")

  public val personRunning: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFC3")

  public val runner: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFC3")

  public val womanRunning: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFC3\u200D\u2640\uFE0F")

  public val manRunning: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFC3\u200D\u2642\uFE0F")

  public val personStanding: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDCD")

  public val womanStanding: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDCD\u200D\u2640\uFE0F")

  public val manStanding: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDCD\u200D\u2642\uFE0F")

  public val personKneeling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDCE")

  public val womanKneeling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDCE\u200D\u2640\uFE0F")

  public val manKneeling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDCE\u200D\u2642\uFE0F")

  public val womanWithProbingCane: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83E\uDDAF")

  public val manWithProbingCane: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83E\uDDAF")

  public val womanInMotorizedWheelchair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83E\uDDBC")

  public val manInMotorizedWheelchair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83E\uDDBC")

  public val womanInManualWheelchair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC69\u200D\uD83E\uDDBD")

  public val manInManualWheelchair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDC68\u200D\uD83E\uDDBD")

  public val peopleHoldingHands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDD1\u200D\uD83E\uDD1D\u200D\uD83E\uDDD1")

  public val couple: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC6B")

  public val twoWomenHoldingHands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC6D")

  public val twoMenHoldingHands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC6C")

  public val coupleWithHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC91")

  public val coupleWithHeartWomanMan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC69\u200D\u2764\uFE0F\u200D\uD83D\uDC68")

  public val coupleWw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC69\u200D\u2764\uFE0F\u200D\uD83D\uDC69")

  public val coupleWithHeartWw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC69\u200D\u2764\uFE0F\u200D\uD83D\uDC69")

  public val coupleMm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC68\u200D\u2764\uFE0F\u200D\uD83D\uDC68")

  public val coupleWithHeartMm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC68\u200D\u2764\uFE0F\u200D\uD83D\uDC68")

  public val couplekiss: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC8F")

  public val kissWomanMan: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83D\uDC69\u200D\u2764\uFE0F\u200D\uD83D\uDC8B\u200D\uD83D\uDC68")

  public val kissWw: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83D\uDC69\u200D\u2764\uFE0F\u200D\uD83D\uDC8B\u200D\uD83D\uDC69")

  public val couplekissWw: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83D\uDC69\u200D\u2764\uFE0F\u200D\uD83D\uDC8B\u200D\uD83D\uDC69")

  public val kissMm: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83D\uDC68\u200D\u2764\uFE0F\u200D\uD83D\uDC8B\u200D\uD83D\uDC68")

  public val couplekissMm: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83D\uDC68\u200D\u2764\uFE0F\u200D\uD83D\uDC8B\u200D\uD83D\uDC68")

  public val family: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC6A")

  public val familyManWomanBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC66")

  public val familyMwg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC67")

  public val familyMwgb: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC66")

  public val familyMwbb: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC66\u200D\uD83D\uDC66")

  public val familyMwgg: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC67")

  public val familyWwb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC69\u200D\uD83D\uDC69\u200D\uD83D\uDC66")

  public val familyWwg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC69\u200D\uD83D\uDC69\u200D\uD83D\uDC67")

  public val familyWwgb: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83D\uDC69\u200D\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC66")

  public val familyWwbb: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83D\uDC69\u200D\uD83D\uDC69\u200D\uD83D\uDC66\u200D\uD83D\uDC66")

  public val familyWwgg: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83D\uDC69\u200D\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC67")

  public val familyMmb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC68\u200D\uD83D\uDC68\u200D\uD83D\uDC66")

  public val familyMmg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC68\u200D\uD83D\uDC68\u200D\uD83D\uDC67")

  public val familyMmgb: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83D\uDC68\u200D\uD83D\uDC68\u200D\uD83D\uDC67\u200D\uD83D\uDC66")

  public val familyMmbb: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83D\uDC68\u200D\uD83D\uDC68\u200D\uD83D\uDC66\u200D\uD83D\uDC66")

  public val familyMmgg: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83D\uDC68\u200D\uD83D\uDC68\u200D\uD83D\uDC67\u200D\uD83D\uDC67")

  public val familyWomanBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC69\u200D\uD83D\uDC66")

  public val familyWomanGirl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC69\u200D\uD83D\uDC67")

  public val familyWomanGirlBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC66")

  public val familyWomanBoyBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC69\u200D\uD83D\uDC66\u200D\uD83D\uDC66")

  public val familyWomanGirlGirl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC67")

  public val familyManBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC68\u200D\uD83D\uDC66")

  public val familyManGirl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC68\u200D\uD83D\uDC67")

  public val familyManGirlBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC68\u200D\uD83D\uDC67\u200D\uD83D\uDC66")

  public val familyManBoyBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC68\u200D\uD83D\uDC66\u200D\uD83D\uDC66")

  public val familyManGirlGirl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC68\u200D\uD83D\uDC67\u200D\uD83D\uDC67")

  public val yarn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDF6")

  public val thread: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDF5")

  public val coat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDE5")

  public val labCoat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD7C")

  public val safetyVest: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDBA")

  public val womansClothes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC5A")

  public val shirt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC55")

  public val jeans: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC56")

  public val shorts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDE73")

  public val necktie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC54")

  public val dress: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC57")

  public val bikini: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC59")

  public val onePieceSwimsuit: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDE71")

  public val kimono: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC58")

  public val sari: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD7B")

  public val womansFlatShoe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD7F")

  public val highHeel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC60")

  public val sandal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC61")

  public val boot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC62")

  public val balletShoes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDE70")

  public val mansShoe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC5E")

  public val athleticShoe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC5F")

  public val hikingBoot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD7E")

  public val briefs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDE72")

  public val socks: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDE6")

  public val gloves: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDE4")

  public val scarf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDE3")

  public val tophat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFA9")

  public val billedCap: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDE2")

  public val womansHat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC52")

  public val mortarBoard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF93")

  public val helmetWithCross: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26D1\uFE0F")

  public val helmetWithWhiteCross: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26D1\uFE0F")

  public val crown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC51")

  public val ring: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC8D")

  public val pouch: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC5D")

  public val purse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC5B")

  public val handbag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC5C")

  public val briefcase: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCBC")

  public val schoolSatchel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF92")

  public val luggage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDF3")

  public val eyeglasses: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC53")

  public val darkSunglasses: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD76\uFE0F")

  public val goggles: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD7D")

  public val divingMask: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD3F")

  public val closedUmbrella: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF02")

  public val dog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC36")

  public val cat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC31")

  public val mouse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC2D")

  public val hamster: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC39")

  public val rabbit: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC30")

  public val fox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD8A")

  public val foxFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD8A")

  public val bear: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC3B")

  public val pandaFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC3C")

  public val koala: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC28")

  public val tiger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC2F")

  public val lionFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD81")

  public val lion: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD81")

  public val cow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC2E")

  public val pig: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC37")

  public val pigNose: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC3D")

  public val frog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC38")

  public val monkeyFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC35")

  public val seeNoEvil: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE48")

  public val hearNoEvil: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE49")

  public val speakNoEvil: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE4A")

  public val monkey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC12")

  public val chicken: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC14")

  public val penguin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC27")

  public val bird: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC26")

  public val babyChick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC24")

  public val hatchingChick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC23")

  public val hatchedChick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC25")

  public val duck: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD86")

  public val eagle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD85")

  public val owl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD89")

  public val bat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD87")

  public val wolf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC3A")

  public val boar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC17")

  public val horse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC34")

  public val unicorn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD84")

  public val unicornFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD84")

  public val bee: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC1D")

  public val bug: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC1B")

  public val butterfly: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD8B")

  public val snail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC0C")

  public val shell: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC1A")

  public val beetle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC1E")

  public val ant: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC1C")

  public val mosquito: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD9F")

  public val cricket: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD97")

  public val spider: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD77\uFE0F")

  public val spiderWeb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD78\uFE0F")

  public val scorpion: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD82")

  public val turtle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC22")

  public val snake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC0D")

  public val lizard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD8E")

  public val tRex: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD96")

  public val sauropod: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD95")

  public val octopus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC19")

  public val squid: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD91")

  public val shrimp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD90")

  public val lobster: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD9E")

  public val oyster: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDAA")

  public val crab: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD80")

  public val blowfish: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC21")

  public val tropicalFish: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC20")

  public val fish: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC1F")

  public val dolphin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC2C")

  public val whale: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC33")

  public val whale2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC0B")

  public val shark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD88")

  public val crocodile: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC0A")

  public val tiger2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC05")

  public val leopard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC06")

  public val zebra: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD93")

  public val gorilla: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD8D")

  public val orangutan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDA7")

  public val elephant: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC18")

  public val hippopotamus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD9B")

  public val rhino: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD8F")

  public val rhinoceros: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD8F")

  public val dromedaryCamel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC2A")

  public val camel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC2B")

  public val giraffe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD92")

  public val kangaroo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD98")

  public val waterBuffalo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC03")

  public val ox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC02")

  public val cow2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC04")

  public val racehorse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC0E")

  public val pig2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC16")

  public val ram: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC0F")

  public val llama: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD99")

  public val sheep: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC11")

  public val goat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC10")

  public val deer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD8C")

  public val dog2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC15")

  public val guideDog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDAE")

  public val serviceDog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC15\u200D\uD83E\uDDBA")

  public val poodle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC29")

  public val cat2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC08")

  public val rooster: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC13")

  public val turkey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD83")

  public val peacock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD9A")

  public val parrot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD9C")

  public val swan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDA2")

  public val flamingo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDA9")

  public val dove: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD4A\uFE0F")

  public val doveOfPeace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD4A\uFE0F")

  public val rabbit2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC07")

  public val sloth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDA5")

  public val otter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDA6")

  public val skunk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDA8")

  public val raccoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD9D")

  public val badger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDA1")

  public val mouse2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC01")

  public val rat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC00")

  public val chipmunk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC3F\uFE0F")

  public val hedgehog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD94")

  public val feet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC3E")

  public val pawPrints: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC3E")

  public val dragon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC09")

  public val dragonFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC32")

  public val cactus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF35")

  public val christmasTree: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF84")

  public val evergreenTree: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF32")

  public val deciduousTree: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF33")

  public val palmTree: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF34")

  public val seedling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF31")

  public val herb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF3F")

  public val shamrock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2618\uFE0F")

  public val fourLeafClover: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF40")

  public val bamboo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF8D")

  public val tanabataTree: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF8B")

  public val leaves: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF43")

  public val fallenLeaf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF42")

  public val mapleLeaf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF41")

  public val mushroom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF44")

  public val earOfRice: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF3E")

  public val bouquet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC90")

  public val tulip: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF37")

  public val rose: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF39")

  public val wiltedRose: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD40")

  public val wiltedFlower: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD40")

  public val hibiscus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF3A")

  public val cherryBlossom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF38")

  public val blossom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF3C")

  public val sunflower: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF3B")

  public val sunWithFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF1E")

  public val fullMoonWithFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF1D")

  public val firstQuarterMoonWithFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF1B")

  public val lastQuarterMoonWithFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF1C")

  public val newMoonWithFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF1A")

  public val fullMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF15")

  public val waningGibbousMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF16")

  public val lastQuarterMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF17")

  public val waningCrescentMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF18")

  public val newMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF11")

  public val waxingCrescentMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF12")

  public val firstQuarterMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF13")

  public val waxingGibbousMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF14")

  public val crescentMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF19")

  public val earthAmericas: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF0E")

  public val earthAfrica: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF0D")

  public val earthAsia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF0F")

  public val ringedPlanet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDE90")

  public val dizzy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCAB")

  public val star: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2B50")

  public val star2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF1F")

  public val sparkles: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2728")

  public val zap: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26A1")

  public val comet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2604\uFE0F")

  public val boom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCA5")

  public val fire: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD25")

  public val flame: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD25")

  public val cloudTornado: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF2A\uFE0F")

  public val cloudWithTornado: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF2A\uFE0F")

  public val rainbow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF08")

  public val sunny: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2600\uFE0F")

  public val whiteSunSmallCloud: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF24\uFE0F")

  public val whiteSunWithSmallCloud: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF24\uFE0F")

  public val partlySunny: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26C5")

  public val whiteSunCloud: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF25\uFE0F")

  public val whiteSunBehindCloud: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF25\uFE0F")

  public val cloud: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2601\uFE0F")

  public val whiteSunRainCloud: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF26\uFE0F")

  public val whiteSunBehindCloudWithRain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF26\uFE0F")

  public val cloudRain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF27\uFE0F")

  public val cloudWithRain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF27\uFE0F")

  public val thunderCloudRain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26C8\uFE0F")

  public val thunderCloudAndRain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26C8\uFE0F")

  public val cloudLightning: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF29\uFE0F")

  public val cloudWithLightning: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF29\uFE0F")

  public val cloudSnow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF28\uFE0F")

  public val cloudWithSnow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF28\uFE0F")

  public val snowflake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2744\uFE0F")

  public val snowman2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2603\uFE0F")

  public val snowman: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26C4")

  public val windBlowingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF2C\uFE0F")

  public val dash: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCA8")

  public val droplet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCA7")

  public val sweatDrops: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCA6")

  public val umbrella: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2614")

  public val umbrella2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2602\uFE0F")

  public val ocean: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF0A")

  public val fog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF2B\uFE0F")

  public val greenApple: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF4F")

  public val apple: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF4E")

  public val pear: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF50")

  public val tangerine: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF4A")

  public val lemon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF4B")

  public val banana: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF4C")

  public val watermelon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF49")

  public val grapes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF47")

  public val strawberry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF53")

  public val melon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF48")

  public val cherries: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF52")

  public val peach: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF51")

  public val mango: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD6D")

  public val pineapple: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF4D")

  public val coconut: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD65")

  public val kiwi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD5D")

  public val kiwifruit: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD5D")

  public val tomato: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF45")

  public val eggplant: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF46")

  public val avocado: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD51")

  public val broccoli: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD66")

  public val leafyGreen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD6C")

  public val cucumber: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD52")

  public val hotPepper: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF36\uFE0F")

  public val corn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF3D")

  public val carrot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD55")

  public val onion: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDC5")

  public val garlic: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDC4")

  public val potato: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD54")

  public val sweetPotato: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF60")

  public val croissant: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD50")

  public val bagel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD6F")

  public val bread: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF5E")

  public val frenchBread: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD56")

  public val baguetteBread: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD56")

  public val pretzel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD68")

  public val cheese: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDC0")

  public val cheeseWedge: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDC0")

  public val egg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD5A")

  public val cooking: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF73")

  public val pancakes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD5E")

  public val waffle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDC7")

  public val bacon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD53")

  public val cutOfMeat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD69")

  public val poultryLeg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF57")

  public val meatOnBone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF56")

  public val hotdog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF2D")

  public val hotDog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF2D")

  public val hamburger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF54")

  public val fries: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF5F")

  public val pizza: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF55")

  public val sandwich: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD6A")

  public val falafel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDC6")

  public val stuffedFlatbread: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD59")

  public val stuffedPita: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD59")

  public val taco: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF2E")

  public val burrito: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF2F")

  public val salad: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD57")

  public val greenSalad: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD57")

  public val shallowPanOfFood: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD58")

  public val paella: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD58")

  public val cannedFood: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD6B")

  public val spaghetti: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF5D")

  public val ramen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF5C")

  public val stew: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF72")

  public val curry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF5B")

  public val sushi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF63")

  public val bento: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF71")

  public val dumpling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD5F")

  public val friedShrimp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF64")

  public val riceBall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF59")

  public val rice: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF5A")

  public val riceCracker: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF58")

  public val fishCake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF65")

  public val fortuneCookie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD60")

  public val moonCake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD6E")

  public val oden: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF62")

  public val dango: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF61")

  public val shavedIce: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF67")

  public val iceCream: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF68")

  public val icecream: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF66")

  public val pie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD67")

  public val cupcake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDC1")

  public val cake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF70")

  public val birthday: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF82")

  public val custard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF6E")

  public val pudding: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF6E")

  public val flan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF6E")

  public val lollipop: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF6D")

  public val candy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF6C")

  public val chocolateBar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF6B")

  public val popcorn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF7F")

  public val doughnut: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF69")

  public val cookie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF6A")

  public val chestnut: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF30")

  public val peanuts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD5C")

  public val shelledPeanut: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD5C")

  public val honeyPot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF6F")

  public val butter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDC8")

  public val milk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD5B")

  public val glassOfMilk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD5B")

  public val babyBottle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF7C")

  public val coffee: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2615")

  public val tea: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF75")

  public val mate: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDC9")

  public val cupWithStraw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD64")

  public val beverageBox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDC3")

  public val iceCube: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDCA")

  public val sake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF76")

  public val beer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF7A")

  public val beers: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF7B")

  public val champagneGlass: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD42")

  public val clinkingGlass: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD42")

  public val wineGlass: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF77")

  public val tumblerGlass: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD43")

  public val whisky: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD43")

  public val cocktail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF78")

  public val tropicalDrink: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF79")

  public val champagne: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF7E")

  public val bottleWithPoppingCork: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF7E")

  public val spoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD44")

  public val forkAndKnife: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF74")

  public val forkKnifePlate: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF7D\uFE0F")

  public val forkAndKnifeWithPlate: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF7D\uFE0F")

  public val bowlWithSpoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD63")

  public val takeoutBox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD61")

  public val chopsticks: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD62")

  public val salt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDC2")

  public val soccer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26BD")

  public val basketball: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFC0")

  public val football: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFC8")

  public val baseball: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26BE")

  public val softball: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD4E")

  public val tennis: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFBE")

  public val volleyball: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFD0")

  public val rugbyFootball: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFC9")

  public val flyingDisc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD4F")

  public val `8ball`: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFB1")

  public val pingPong: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFD3")

  public val tableTennis: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFD3")

  public val badminton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFF8")

  public val hockey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFD2")

  public val fieldHockey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFD1")

  public val lacrosse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD4D")

  public val cricketGame: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFCF")

  public val cricketBatBall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFCF")

  public val goal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD45")

  public val goalNet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD45")

  public val golf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26F3")

  public val bowAndArrow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFF9")

  public val archery: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFF9")

  public val fishingPoleAndFish: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFA3")

  public val boxingGlove: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD4A")

  public val boxingGloves: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD4A")

  public val martialArtsUniform: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD4B")

  public val karateUniform: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD4B")

  public val runningShirtWithSash: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFBD")

  public val skateboard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEF9")

  public val sled: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEF7")

  public val parachute: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDE82")

  public val iceSkate: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26F8\uFE0F")

  public val curlingStone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD4C")

  public val ski: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFBF")

  public val skier: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26F7\uFE0F")

  public val snowboarder: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFC2")

  public val personLiftingWeights: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFCB\uFE0F")

  public val lifter: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFCB\uFE0F")

  public val weightLifter: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFCB\uFE0F")

  public val womanLiftingWeights: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFCB\uFE0F\u200D\u2640\uFE0F")

  public val manLiftingWeights: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFCB\uFE0F\u200D\u2642\uFE0F")

  public val peopleWrestling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD3C")

  public val wrestlers: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD3C")

  public val wrestling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD3C")

  public val womenWrestling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD3C\u200D\u2640\uFE0F")

  public val menWrestling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD3C\u200D\u2642\uFE0F")

  public val personDoingCartwheel: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD38")

  public val cartwheel: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD38")

  public val womanCartwheeling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD38\u200D\u2640\uFE0F")

  public val manCartwheeling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD38\u200D\u2642\uFE0F")

  public val personBouncingBall: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\u26F9\uFE0F")

  public val basketballPlayer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\u26F9\uFE0F")

  public val personWithBall: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\u26F9\uFE0F")

  public val womanBouncingBall: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\u26F9\uFE0F\u200D\u2640\uFE0F")

  public val manBouncingBall: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\u26F9\uFE0F\u200D\u2642\uFE0F")

  public val personFencing: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD3A")

  public val fencer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD3A")

  public val fencing: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD3A")

  public val personPlayingHandball: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD3E")

  public val handball: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD3E")

  public val womanPlayingHandball: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD3E\u200D\u2640\uFE0F")

  public val manPlayingHandball: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD3E\u200D\u2642\uFE0F")

  public val personGolfing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFCC\uFE0F")

  public val golfer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFCC\uFE0F")

  public val womanGolfing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFCC\uFE0F\u200D\u2640\uFE0F")

  public val manGolfing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFCC\uFE0F\u200D\u2642\uFE0F")

  public val horseRacing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFC7")

  public val personInLotusPosition: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD8")

  public val womanInLotusPosition: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD8\u200D\u2640\uFE0F")

  public val manInLotusPosition: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD8\u200D\u2642\uFE0F")

  public val personSurfing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFC4")

  public val surfer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFC4")

  public val womanSurfing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFC4\u200D\u2640\uFE0F")

  public val manSurfing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFC4\u200D\u2642\uFE0F")

  public val personSwimming: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFCA")

  public val swimmer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFCA")

  public val womanSwimming: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFCA\u200D\u2640\uFE0F")

  public val manSwimming: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83C\uDFCA\u200D\u2642\uFE0F")

  public val personPlayingWaterPolo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD3D")

  public val waterPolo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD3D")

  public val womanPlayingWaterPolo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD3D\u200D\u2640\uFE0F")

  public val manPlayingWaterPolo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD3D\u200D\u2642\uFE0F")

  public val personRowingBoat: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEA3")

  public val rowboat: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEA3")

  public val womanRowingBoat: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEA3\u200D\u2640\uFE0F")

  public val manRowingBoat: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEA3\u200D\u2642\uFE0F")

  public val personClimbing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD7")

  public val womanClimbing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD7\u200D\u2640\uFE0F")

  public val manClimbing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDDD7\u200D\u2642\uFE0F")

  public val personMountainBiking: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEB5")

  public val mountainBicyclist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEB5")

  public val womanMountainBiking: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEB5\u200D\u2640\uFE0F")

  public val manMountainBiking: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEB5\u200D\u2642\uFE0F")

  public val personBiking: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEB4")

  public val bicyclist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEB4")

  public val womanBiking: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEB4\u200D\u2640\uFE0F")

  public val manBiking: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEB4\u200D\u2642\uFE0F")

  public val trophy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFC6")

  public val firstPlace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD47")

  public val firstPlaceMedal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD47")

  public val secondPlace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD48")

  public val secondPlaceMedal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD48")

  public val thirdPlace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD49")

  public val thirdPlaceMedal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD49")

  public val medal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFC5")

  public val sportsMedal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFC5")

  public val militaryMedal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF96\uFE0F")

  public val rosette: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFF5\uFE0F")

  public val reminderRibbon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF97\uFE0F")

  public val ticket: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFAB")

  public val tickets: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF9F\uFE0F")

  public val admissionTickets: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF9F\uFE0F")

  public val circusTent: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFAA")

  public val personJuggling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD39")

  public val juggling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD39")

  public val juggler: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD39")

  public val womanJuggling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD39\u200D\u2640\uFE0F")

  public val manJuggling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83E\uDD39\u200D\u2642\uFE0F")

  public val performingArts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFAD")

  public val art: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFA8")

  public val clapper: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFAC")

  public val microphone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFA4")

  public val headphones: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFA7")

  public val musicalScore: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFBC")

  public val musicalKeyboard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFB9")

  public val drum: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD41")

  public val drumWithDrumsticks: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD41")

  public val saxophone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFB7")

  public val trumpet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFBA")

  public val banjo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDE95")

  public val guitar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFB8")

  public val violin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFBB")

  public val gameDie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFB2")

  public val chessPawn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u265F\uFE0F")

  public val dart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFAF")

  public val kite: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDE81")

  public val yoYo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDE80")

  public val bowling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFB3")

  public val videoGame: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFAE")

  public val slotMachine: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFB0")

  public val jigsaw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDE9")

  public val redCar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE97")

  public val taxi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE95")

  public val blueCar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE99")

  public val bus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE8C")

  public val trolleybus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE8E")

  public val raceCar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFCE\uFE0F")

  public val racingCar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFCE\uFE0F")

  public val policeCar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE93")

  public val ambulance: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE91")

  public val fireEngine: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE92")

  public val minibus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE90")

  public val truck: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE9A")

  public val articulatedLorry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE9B")

  public val tractor: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE9C")

  public val autoRickshaw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEFA")

  public val motorScooter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEF5")

  public val motorbike: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEF5")

  public val motorcycle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFCD\uFE0F")

  public val racingMotorcycle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFCD\uFE0F")

  public val scooter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEF4")

  public val bike: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEB2")

  public val motorizedWheelchair: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDBC")

  public val manualWheelchair: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDBD")

  public val rotatingLight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEA8")

  public val oncomingPoliceCar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE94")

  public val oncomingBus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE8D")

  public val oncomingAutomobile: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE98")

  public val oncomingTaxi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE96")

  public val aerialTramway: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEA1")

  public val mountainCableway: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEA0")

  public val suspensionRailway: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE9F")

  public val railwayCar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE83")

  public val train: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE8B")

  public val mountainRailway: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE9E")

  public val monorail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE9D")

  public val bullettrainSide: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE84")

  public val bullettrainFront: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE85")

  public val lightRail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE88")

  public val steamLocomotive: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE82")

  public val train2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE86")

  public val metro: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE87")

  public val tram: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE8A")

  public val station: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE89")

  public val airplane: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2708\uFE0F")

  public val airplaneDeparture: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEEB")

  public val airplaneArriving: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEEC")

  public val airplaneSmall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEE9\uFE0F")

  public val smallAirplane: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEE9\uFE0F")

  public val seat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCBA")

  public val satelliteOrbital: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEF0\uFE0F")

  public val rocket: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE80")

  public val flyingSaucer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEF8")

  public val helicopter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE81")

  public val canoe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEF6")

  public val kayak: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEF6")

  public val sailboat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26F5")

  public val speedboat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEA4")

  public val motorboat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEE5\uFE0F")

  public val cruiseShip: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEF3\uFE0F")

  public val passengerShip: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEF3\uFE0F")

  public val ferry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26F4\uFE0F")

  public val ship: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEA2")

  public val anchor: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2693")

  public val fuelpump: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26FD")

  public val construction: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEA7")

  public val verticalTrafficLight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEA6")

  public val trafficLight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEA5")

  public val busstop: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDE8F")

  public val map: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDFA\uFE0F")

  public val worldMap: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDFA\uFE0F")

  public val moyai: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDFF")

  public val statueOfLiberty: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDFD")

  public val tokyoTower: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDFC")

  public val europeanCastle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFF0")

  public val japaneseCastle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFEF")

  public val stadium: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFDF\uFE0F")

  public val ferrisWheel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFA1")

  public val rollerCoaster: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFA2")

  public val carouselHorse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFA0")

  public val fountain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26F2")

  public val beachUmbrella: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26F1\uFE0F")

  public val umbrellaOnGround: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26F1\uFE0F")

  public val beach: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFD6\uFE0F")

  public val beachWithUmbrella: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFD6\uFE0F")

  public val island: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFDD\uFE0F")

  public val desertIsland: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFDD\uFE0F")

  public val desert: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFDC\uFE0F")

  public val volcano: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF0B")

  public val mountain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26F0\uFE0F")

  public val mountainSnow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFD4\uFE0F")

  public val snowCappedMountain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFD4\uFE0F")

  public val mountFuji: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDFB")

  public val camping: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFD5\uFE0F")

  public val tent: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26FA")

  public val house: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFE0")

  public val houseWithGarden: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFE1")

  public val homes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFD8\uFE0F")

  public val houseBuildings: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFD8\uFE0F")

  public val houseAbandoned: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFDA\uFE0F")

  public val derelictHouseBuilding: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFDA\uFE0F")

  public val constructionSite: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFD7\uFE0F")

  public val buildingConstruction: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFD7\uFE0F")

  public val factory: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFED")

  public val office: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFE2")

  public val departmentStore: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFEC")

  public val postOffice: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFE3")

  public val europeanPostOffice: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFE4")

  public val hospital: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFE5")

  public val bank: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFE6")

  public val hotel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFE8")

  public val convenienceStore: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFEA")

  public val school: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFEB")

  public val loveHotel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFE9")

  public val wedding: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC92")

  public val classicalBuilding: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFDB\uFE0F")

  public val church: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26EA")

  public val mosque: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD4C")

  public val hinduTemple: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDED5")

  public val synagogue: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD4D")

  public val kaaba: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD4B")

  public val shintoShrine: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26E9\uFE0F")

  public val railwayTrack: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEE4\uFE0F")

  public val railroadTrack: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEE4\uFE0F")

  public val motorway: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEE3\uFE0F")

  public val japan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDFE")

  public val riceScene: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF91")

  public val park: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFDE\uFE0F")

  public val nationalPark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFDE\uFE0F")

  public val sunrise: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF05")

  public val sunriseOverMountains: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF04")

  public val stars: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF20")

  public val sparkler: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF87")

  public val fireworks: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF86")

  public val citySunset: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF07")

  public val citySunrise: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF07")

  public val cityDusk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF06")

  public val cityscape: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFD9\uFE0F")

  public val nightWithStars: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF03")

  public val milkyWay: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF0C")

  public val bridgeAtNight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF09")

  public val foggy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF01")

  public val watch: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u231A")

  public val iphone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCF1")

  public val calling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCF2")

  public val computer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCBB")

  public val keyboard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2328\uFE0F")

  public val desktop: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDA5\uFE0F")

  public val desktopComputer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDA5\uFE0F")

  public val printer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDA8\uFE0F")

  public val mouseThreeButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDB1\uFE0F")

  public val threeButtonMouse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDB1\uFE0F")

  public val trackball: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDB2\uFE0F")

  public val joystick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD79\uFE0F")

  public val compression: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDDC\uFE0F")

  public val minidisc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCBD")

  public val floppyDisk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCBE")

  public val cd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCBF")

  public val dvd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCC0")

  public val vhs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCFC")

  public val camera: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCF7")

  public val cameraWithFlash: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCF8")

  public val videoCamera: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCF9")

  public val movieCamera: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFA5")

  public val projector: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCFD\uFE0F")

  public val filmProjector: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCFD\uFE0F")

  public val filmFrames: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF9E\uFE0F")

  public val telephoneReceiver: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCDE")

  public val telephone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u260E\uFE0F")

  public val pager: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCDF")

  public val fax: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCE0")

  public val tv: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCFA")

  public val radio: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCFB")

  public val microphone2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF99\uFE0F")

  public val studioMicrophone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF99\uFE0F")

  public val levelSlider: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF9A\uFE0F")

  public val controlKnobs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF9B\uFE0F")

  public val compass: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDED")

  public val stopwatch: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23F1\uFE0F")

  public val timer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23F2\uFE0F")

  public val timerClock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23F2\uFE0F")

  public val alarmClock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23F0")

  public val clock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD70\uFE0F")

  public val mantlepieceClock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD70\uFE0F")

  public val hourglass: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u231B")

  public val hourglassFlowingSand: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23F3")

  public val satellite: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCE1")

  public val battery: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD0B")

  public val electricPlug: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD0C")

  public val bulb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCA1")

  public val flashlight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD26")

  public val candle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD6F\uFE0F")

  public val fireExtinguisher: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDEF")

  public val oil: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEE2\uFE0F")

  public val oilDrum: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEE2\uFE0F")

  public val moneyWithWings: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCB8")

  public val dollar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCB5")

  public val yen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCB4")

  public val euro: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCB6")

  public val pound: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCB7")

  public val moneybag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCB0")

  public val creditCard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCB3")

  public val gem: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC8E")

  public val scales: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2696\uFE0F")

  public val toolbox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDF0")

  public val wrench: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD27")

  public val hammer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD28")

  public val hammerPick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2692\uFE0F")

  public val hammerAndPick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2692\uFE0F")

  public val tools: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEE0\uFE0F")

  public val hammerAndWrench: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEE0\uFE0F")

  public val pick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26CF\uFE0F")

  public val nutAndBolt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD29")

  public val gear: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2699\uFE0F")

  public val bricks: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDF1")

  public val chains: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26D3\uFE0F")

  public val magnet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDF2")

  public val gun: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD2B")

  public val bomb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCA3")

  public val firecracker: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDE8")

  public val axe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDE93")

  public val razor: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDE92")

  public val knife: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD2A")

  public val dagger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDE1\uFE0F")

  public val daggerKnife: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDE1\uFE0F")

  public val crossedSwords: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2694\uFE0F")

  public val shield: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEE1\uFE0F")

  public val smoking: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEAC")

  public val coffin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26B0\uFE0F")

  public val urn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26B1\uFE0F")

  public val funeralUrn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26B1\uFE0F")

  public val amphora: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFFA")

  public val diyaLamp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDE94")

  public val crystalBall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD2E")

  public val prayerBeads: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCFF")

  public val nazarAmulet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDFF")

  public val barber: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC88")

  public val alembic: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2697\uFE0F")

  public val telescope: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD2D")

  public val microscope: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD2C")

  public val hole: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD73\uFE0F")

  public val probingCane: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDAF")

  public val stethoscope: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDE7A")

  public val adhesiveBandage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDE79")

  public val pill: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC8A")

  public val syringe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC89")

  public val dropOfBlood: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDE78")

  public val dna: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDEC")

  public val microbe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDA0")

  public val petriDish: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDEB")

  public val testTube: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDEA")

  public val thermometer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF21\uFE0F")

  public val chair: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDE91")

  public val broom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDF9")

  public val basket: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDFA")

  public val rollOfPaper: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDFB")

  public val toilet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEBD")

  public val potableWater: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEB0")

  public val shower: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEBF")

  public val bathtub: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEC1")

  public val bath: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDEC0")

  public val soap: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDFC")

  public val sponge: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDFD")

  public val squeezeBottle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDF4")

  public val bellhop: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDECE\uFE0F")

  public val bellhopBell: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDECE\uFE0F")

  public val key: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD11")

  public val key2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDDD\uFE0F")

  public val oldKey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDDD\uFE0F")

  public val door: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEAA")

  public val couch: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDECB\uFE0F")

  public val couchAndLamp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDECB\uFE0F")

  public val bed: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDECF\uFE0F")

  public val sleepingAccommodation: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("\uD83D\uDECC")

  public val teddyBear: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDF8")

  public val framePhoto: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDBC\uFE0F")

  public val frameWithPicture: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDBC\uFE0F")

  public val shoppingBags: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDECD\uFE0F")

  public val shoppingCart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDED2")

  public val shoppingTrolley: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDED2")

  public val gift: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF81")

  public val balloon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF88")

  public val flags: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF8F")

  public val ribbon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF80")

  public val confettiBall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF8A")

  public val tada: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF89")

  public val dolls: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF8E")

  public val izakayaLantern: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFEE")

  public val windChime: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF90")

  public val redEnvelope: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDE7")

  public val envelope: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2709\uFE0F")

  public val envelopeWithArrow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCE9")

  public val incomingEnvelope: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCE8")

  public val eMail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCE7")

  public val email: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCE7")

  public val loveLetter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC8C")

  public val inboxTray: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCE5")

  public val outboxTray: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCE4")

  public val `package`: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCE6")

  public val label: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFF7\uFE0F")

  public val mailboxClosed: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCEA")

  public val mailbox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCEB")

  public val mailboxWithMail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCEC")

  public val mailboxWithNoMail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCED")

  public val postbox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCEE")

  public val postalHorn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCEF")

  public val scroll: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCDC")

  public val pageWithCurl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCC3")

  public val pageFacingUp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCC4")

  public val bookmarkTabs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCD1")

  public val receipt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDFE")

  public val barChart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCCA")

  public val chartWithUpwardsTrend: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCC8")

  public val chartWithDownwardsTrend: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCC9")

  public val notepadSpiral: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDD2\uFE0F")

  public val spiralNotePad: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDD2\uFE0F")

  public val calendarSpiral: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDD3\uFE0F")

  public val spiralCalendarPad: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDD3\uFE0F")

  public val calendar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCC6")

  public val date: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCC5")

  public val wastebasket: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDD1\uFE0F")

  public val cardIndex: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCC7")

  public val cardBox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDC3\uFE0F")

  public val cardFileBox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDC3\uFE0F")

  public val ballotBox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDF3\uFE0F")

  public val ballotBoxWithBallot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDF3\uFE0F")

  public val fileCabinet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDC4\uFE0F")

  public val clipboard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCCB")

  public val fileFolder: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCC1")

  public val openFileFolder: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCC2")

  public val dividers: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDC2\uFE0F")

  public val cardIndexDividers: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDC2\uFE0F")

  public val newspaper2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDDE\uFE0F")

  public val rolledUpNewspaper: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDDE\uFE0F")

  public val newspaper: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCF0")

  public val notebook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCD3")

  public val notebookWithDecorativeCover: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCD4")

  public val ledger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCD2")

  public val closedBook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCD5")

  public val greenBook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCD7")

  public val blueBook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCD8")

  public val orangeBook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCD9")

  public val books: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCDA")

  public val book: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCD6")

  public val bookmark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD16")

  public val safetyPin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDF7")

  public val link: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD17")

  public val paperclip: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCCE")

  public val paperclips: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD87\uFE0F")

  public val linkedPaperclips: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD87\uFE0F")

  public val triangularRuler: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCD0")

  public val straightRuler: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCCF")

  public val abacus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDEE")

  public val pushpin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCCC")

  public val roundPushpin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCCD")

  public val scissors: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2702\uFE0F")

  public val penBallpoint: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD8A\uFE0F")

  public val lowerLeftBallpointPen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD8A\uFE0F")

  public val penFountain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD8B\uFE0F")

  public val lowerLeftFountainPen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD8B\uFE0F")

  public val blackNib: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2712\uFE0F")

  public val paintbrush: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD8C\uFE0F")

  public val lowerLeftPaintbrush: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD8C\uFE0F")

  public val crayon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD8D\uFE0F")

  public val lowerLeftCrayon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD8D\uFE0F")

  public val pencil: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCDD")

  public val memo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCDD")

  public val pencil2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u270F\uFE0F")

  public val mag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD0D")

  public val magRight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD0E")

  public val lockWithInkPen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD0F")

  public val closedLockWithKey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD10")

  public val lock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD12")

  public val unlock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD13")

  public val heart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2764\uFE0F")

  public val orangeHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDDE1")

  public val yellowHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC9B")

  public val greenHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC9A")

  public val blueHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC99")

  public val purpleHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC9C")

  public val blackHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDA4")

  public val brownHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD0E")

  public val whiteHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83E\uDD0D")

  public val brokenHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC94")

  public val heartExclamation: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2763\uFE0F")

  public val heavyHeartExclamationMarkOrnament: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2763\uFE0F")

  public val twoHearts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC95")

  public val revolvingHearts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC9E")

  public val heartbeat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC93")

  public val heartpulse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC97")

  public val sparklingHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC96")

  public val cupid: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC98")

  public val giftHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC9D")

  public val heartDecoration: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC9F")

  public val peace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u262E\uFE0F")

  public val peaceSymbol: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u262E\uFE0F")

  public val cross: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u271D\uFE0F")

  public val latinCross: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u271D\uFE0F")

  public val starAndCrescent: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u262A\uFE0F")

  public val omSymbol: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD49\uFE0F")

  public val wheelOfDharma: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2638\uFE0F")

  public val starOfDavid: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2721\uFE0F")

  public val sixPointedStar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD2F")

  public val menorah: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD4E")

  public val yinYang: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u262F\uFE0F")

  public val orthodoxCross: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2626\uFE0F")

  public val placeOfWorship: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDED0")

  public val worshipSymbol: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDED0")

  public val ophiuchus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26CE")

  public val aries: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2648")

  public val taurus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2649")

  public val gemini: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u264A")

  public val cancer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u264B")

  public val leo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u264C")

  public val virgo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u264D")

  public val libra: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u264E")

  public val scorpius: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u264F")

  public val sagittarius: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2650")

  public val capricorn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2651")

  public val aquarius: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2652")

  public val pisces: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2653")

  public val id: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDD94")

  public val atom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u269B\uFE0F")

  public val atomSymbol: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u269B\uFE0F")

  public val accept: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDE51")

  public val radioactive: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2622\uFE0F")

  public val radioactiveSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2622\uFE0F")

  public val biohazard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2623\uFE0F")

  public val biohazardSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2623\uFE0F")

  public val mobilePhoneOff: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCF4")

  public val vibrationMode: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCF3")

  public val u6709: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDE36")

  public val u7121: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDE1A")

  public val u7533: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDE38")

  public val u55b6: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDE3A")

  public val u6708: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDE37\uFE0F")

  public val eightPointedBlackStar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2734\uFE0F")

  public val vs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDD9A")

  public val whiteFlower: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCAE")

  public val ideographAdvantage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDE50")

  public val secret: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u3299\uFE0F")

  public val congratulations: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u3297\uFE0F")

  public val u5408: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDE34")

  public val u6e80: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDE35")

  public val u5272: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDE39")

  public val u7981: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDE32")

  public val a: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDD70\uFE0F")

  public val b: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDD71\uFE0F")

  public val ab: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDD8E")

  public val cl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDD91")

  public val o2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDD7E\uFE0F")

  public val sos: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDD98")

  public val x: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u274C")

  public val o: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2B55")

  public val octagonalSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDED1")

  public val stopSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDED1")

  public val noEntry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26D4")

  public val nameBadge: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCDB")

  public val noEntrySign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEAB")

  public val `100`: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCAF")

  public val anger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCA2")

  public val hotsprings: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2668\uFE0F")

  public val noPedestrians: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEB7")

  public val doNotLitter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEAF")

  public val noBicycles: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEB3")

  public val nonPotableWater: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEB1")

  public val underage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD1E")

  public val noMobilePhones: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCF5")

  public val noSmoking: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEAD")

  public val exclamation: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2757")

  public val greyExclamation: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2755")

  public val question: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2753")

  public val greyQuestion: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2754")

  public val bangbang: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u203C\uFE0F")

  public val interrobang: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2049\uFE0F")

  public val lowBrightness: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD05")

  public val highBrightness: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD06")

  public val partAlternationMark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u303D\uFE0F")

  public val warning: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26A0\uFE0F")

  public val childrenCrossing: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEB8")

  public val trident: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD31")

  public val fleurDeLis: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u269C\uFE0F")

  public val beginner: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD30")

  public val recycle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u267B\uFE0F")

  public val whiteCheckMark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2705")

  public val u6307: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDE2F")

  public val chart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCB9")

  public val sparkle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2747\uFE0F")

  public val eightSpokedAsterisk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2733\uFE0F")

  public val negativeSquaredCrossMark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u274E")

  public val globeWithMeridians: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF10")

  public val diamondShapeWithADotInside: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCA0")

  public val m: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u24C2\uFE0F")

  public val cyclone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF00")

  public val zzz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCA4")

  public val atm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFE7")

  public val wc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEBE")

  public val wheelchair: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u267F")

  public val parking: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDD7F\uFE0F")

  public val u7a7a: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDE33")

  public val sa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDE02\uFE0F")

  public val passportControl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEC2")

  public val customs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEC3")

  public val baggageClaim: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEC4")

  public val leftLuggage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEC5")

  public val mens: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEB9")

  public val womens: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEBA")

  public val babySymbol: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEBC")

  public val restroom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEBB")

  public val putLitterInItsPlace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEAE")

  public val cinema: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFA6")

  public val signalStrength: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCF6")

  public val koko: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDE01")

  public val symbols: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD23")

  public val informationSource: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2139\uFE0F")

  public val abc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD24")

  public val abcd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD21")

  public val capitalAbcd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD20")

  public val ng: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDD96")

  public val ok: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDD97")

  public val up: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDD99")

  public val cool: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDD92")

  public val new: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDD95")

  public val free: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDD93")

  public val zero: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("0\uFE0F\u20E3")

  public val one: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("1\uFE0F\u20E3")

  public val two: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("2\uFE0F\u20E3")

  public val three: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("3\uFE0F\u20E3")

  public val four: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("4\uFE0F\u20E3")

  public val five: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("5\uFE0F\u20E3")

  public val six: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("6\uFE0F\u20E3")

  public val seven: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("7\uFE0F\u20E3")

  public val eight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("8\uFE0F\u20E3")

  public val nine: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("9\uFE0F\u20E3")

  public val keycapTen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD1F")

  public val `1234`: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD22")

  public val hash: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("#\uFE0F\u20E3")

  public val asterisk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("*\uFE0F\u20E3")

  public val keycapAsterisk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("*\uFE0F\u20E3")

  public val eject: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23CF\uFE0F")

  public val ejectSymbol: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23CF\uFE0F")

  public val arrowForward: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u25B6\uFE0F")

  public val pauseButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23F8\uFE0F")

  public val doubleVerticalBar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23F8\uFE0F")

  public val playPause: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23EF\uFE0F")

  public val stopButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23F9\uFE0F")

  public val recordButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23FA\uFE0F")

  public val trackNext: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23ED\uFE0F")

  public val nextTrack: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23ED\uFE0F")

  public val trackPrevious: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23EE\uFE0F")

  public val previousTrack: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23EE\uFE0F")

  public val fastForward: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23E9")

  public val rewind: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23EA")

  public val arrowDoubleUp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23EB")

  public val arrowDoubleDown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u23EC")

  public val arrowBackward: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u25C0\uFE0F")

  public val arrowUpSmall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD3C")

  public val arrowDownSmall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD3D")

  public val arrowRight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u27A1\uFE0F")

  public val arrowLeft: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2B05\uFE0F")

  public val arrowUp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2B06\uFE0F")

  public val arrowDown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2B07\uFE0F")

  public val arrowUpperRight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2197\uFE0F")

  public val arrowLowerRight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2198\uFE0F")

  public val arrowLowerLeft: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2199\uFE0F")

  public val arrowUpperLeft: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2196\uFE0F")

  public val arrowUpDown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2195\uFE0F")

  public val leftRightArrow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2194\uFE0F")

  public val arrowRightHook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u21AA\uFE0F")

  public val leftwardsArrowWithHook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u21A9\uFE0F")

  public val arrowHeadingUp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2934\uFE0F")

  public val arrowHeadingDown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2935\uFE0F")

  public val twistedRightwardsArrows: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD00")

  public val repeat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD01")

  public val repeatOne: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD02")

  public val arrowsCounterclockwise: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD04")

  public val arrowsClockwise: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD03")

  public val musicalNote: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFB5")

  public val notes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFB6")

  public val heavyPlusSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2795")

  public val heavyMinusSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2796")

  public val heavyDivisionSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2797")

  public val heavyMultiplicationX: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2716\uFE0F")

  public val infinity: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u267E\uFE0F")

  public val heavyDollarSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCB2")

  public val currencyExchange: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCB1")

  public val tm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2122\uFE0F")

  public val copyright: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u00A9\uFE0F")

  public val registered: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u00AE\uFE0F")

  public val wavyDash: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u3030\uFE0F")

  public val curlyLoop: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u27B0")

  public val loop: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u27BF")

  public val end: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD1A")

  public val back: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD19")

  public val on: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD1B")

  public val top: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD1D")

  public val soon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD1C")

  public val heavyCheckMark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2714\uFE0F")

  public val ballotBoxWithCheck: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2611\uFE0F")

  public val radioButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD18")

  public val whiteCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26AA")

  public val blackCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u26AB")

  public val redCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD34")

  public val blueCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD35")

  public val brownCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDFE4")

  public val purpleCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDFE3")

  public val greenCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDFE2")

  public val yellowCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDFE1")

  public val orangeCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDFE0")

  public val smallRedTriangle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD3A")

  public val smallRedTriangleDown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD3B")

  public val smallOrangeDiamond: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD38")

  public val smallBlueDiamond: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD39")

  public val largeOrangeDiamond: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD36")

  public val largeBlueDiamond: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD37")

  public val whiteSquareButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD33")

  public val blackSquareButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD32")

  public val blackSmallSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u25AA\uFE0F")

  public val whiteSmallSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u25AB\uFE0F")

  public val blackMediumSmallSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u25FE")

  public val whiteMediumSmallSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u25FD")

  public val blackMediumSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u25FC\uFE0F")

  public val whiteMediumSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u25FB\uFE0F")

  public val blackLargeSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2B1B")

  public val whiteLargeSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2B1C")

  public val orangeSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDFE7")

  public val blueSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDFE6")

  public val redSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDFE5")

  public val brownSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDFEB")

  public val purpleSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDFEA")

  public val greenSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDFE9")

  public val yellowSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDFE8")

  public val speaker: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD08")

  public val mute: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD07")

  public val sound: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD09")

  public val loudSound: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD0A")

  public val bell: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD14")

  public val noBell: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD15")

  public val mega: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCE3")

  public val loudspeaker: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCE2")

  public val speechLeft: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDE8\uFE0F")

  public val leftSpeechBubble: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDE8\uFE0F")

  public val eyeInSpeechBubble: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDC41\u200D\uD83D\uDDE8")

  public val speechBalloon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCAC")

  public val thoughtBalloon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDCAD")

  public val angerRight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDEF\uFE0F")

  public val rightAngerBubble: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDDEF\uFE0F")

  public val spades: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2660\uFE0F")

  public val clubs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2663\uFE0F")

  public val hearts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2665\uFE0F")

  public val diamonds: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2666\uFE0F")

  public val blackJoker: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDCCF")

  public val flowerPlayingCards: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFB4")

  public val mahjong: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDC04")

  public val clock1: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD50")

  public val clock2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD51")

  public val clock3: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD52")

  public val clock4: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD53")

  public val clock5: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD54")

  public val clock6: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD55")

  public val clock7: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD56")

  public val clock8: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD57")

  public val clock9: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD58")

  public val clock10: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD59")

  public val clock11: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD5A")

  public val clock12: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD5B")

  public val clock130: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD5C")

  public val clock230: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD5D")

  public val clock330: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD5E")

  public val clock430: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD5F")

  public val clock530: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD60")

  public val clock630: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD61")

  public val clock730: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD62")

  public val clock830: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD63")

  public val clock930: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD64")

  public val clock1030: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD65")

  public val clock1130: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD66")

  public val clock1230: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDD67")

  public val femaleSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2640\uFE0F")

  public val maleSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2642\uFE0F")

  public val medicalSymbol: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\u2695\uFE0F")

  public val regionalIndicatorZ: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFF")

  public val regionalIndicatorY: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFE")

  public val regionalIndicatorX: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFD")

  public val regionalIndicatorW: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFC")

  public val regionalIndicatorV: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFB")

  public val regionalIndicatorU: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFA")

  public val regionalIndicatorT: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9")

  public val regionalIndicatorS: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8")

  public val regionalIndicatorR: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF7")

  public val regionalIndicatorQ: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF6")

  public val regionalIndicatorP: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF5")

  public val regionalIndicatorO: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF4")

  public val regionalIndicatorN: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF3")

  public val regionalIndicatorM: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2")

  public val regionalIndicatorL: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF1")

  public val regionalIndicatorK: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF0")

  public val regionalIndicatorJ: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEF")

  public val regionalIndicatorI: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEE")

  public val regionalIndicatorH: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDED")

  public val regionalIndicatorG: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC")

  public val regionalIndicatorF: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEB")

  public val regionalIndicatorE: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEA")

  public val regionalIndicatorD: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE9")

  public val regionalIndicatorC: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8")

  public val regionalIndicatorB: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7")

  public val regionalIndicatorA: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6")

  public val flagWhite: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFF3\uFE0F")

  public val flagBlack: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFF4")

  public val checkeredFlag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFC1")

  public val triangularFlagOnPost: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83D\uDEA9")

  public val rainbowFlag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFF3\uFE0F\u200D\uD83C\uDF08")

  public val gayPrideFlag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFF3\uFE0F\u200D\uD83C\uDF08")

  public val pirateFlag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDFF4\u200D\u2620\uFE0F")

  public val flagAf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDEB")

  public val flagAx: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDFD")

  public val flagAl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDF1")

  public val flagDz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE9\uD83C\uDDFF")

  public val flagAs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDF8")

  public val flagAd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDE9")

  public val flagAo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDF4")

  public val flagAi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDEE")

  public val flagAq: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDF6")

  public val flagAg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDEC")

  public val flagAr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDF7")

  public val flagAm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDF2")

  public val flagAw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDFC")

  public val flagAu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDFA")

  public val flagAt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDF9")

  public val flagAz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDFF")

  public val flagBs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDF8")

  public val flagBh: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDED")

  public val flagBd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDE9")

  public val flagBb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDE7")

  public val flagBy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDFE")

  public val flagBe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDEA")

  public val flagBz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDFF")

  public val flagBj: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDEF")

  public val flagBm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDF2")

  public val flagBt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDF9")

  public val flagBo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDF4")

  public val flagBa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDE6")

  public val flagBw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDFC")

  public val flagBr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDF7")

  public val flagIo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEE\uD83C\uDDF4")

  public val flagVg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFB\uD83C\uDDEC")

  public val flagBn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDF3")

  public val flagBg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDEC")

  public val flagBf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDEB")

  public val flagBi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDEE")

  public val flagKh: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF0\uD83C\uDDED")

  public val flagCm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDF2")

  public val flagCa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDE6")

  public val flagIc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEE\uD83C\uDDE8")

  public val flagCv: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDFB")

  public val flagBq: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDF6")

  public val flagKy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF0\uD83C\uDDFE")

  public val flagCf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDEB")

  public val flagTd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDE9")

  public val flagCl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDF1")

  public val flagCn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDF3")

  public val flagCx: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDFD")

  public val flagCc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDE8")

  public val flagCo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDF4")

  public val flagKm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF0\uD83C\uDDF2")

  public val flagCg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDEC")

  public val flagCd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDE9")

  public val flagCk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDF0")

  public val flagCr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDF7")

  public val flagCi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDEE")

  public val flagHr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDED\uD83C\uDDF7")

  public val flagCu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDFA")

  public val flagCw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDFC")

  public val flagCy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDFE")

  public val flagCz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDFF")

  public val flagDk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE9\uD83C\uDDF0")

  public val flagDj: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE9\uD83C\uDDEF")

  public val flagDm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE9\uD83C\uDDF2")

  public val flagDo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE9\uD83C\uDDF4")

  public val flagEc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEA\uD83C\uDDE8")

  public val flagEg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEA\uD83C\uDDEC")

  public val flagSv: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDFB")

  public val flagGq: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDF6")

  public val flagEr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEA\uD83C\uDDF7")

  public val flagEe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEA\uD83C\uDDEA")

  public val flagEt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEA\uD83C\uDDF9")

  public val flagEu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEA\uD83C\uDDFA")

  public val flagFk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEB\uD83C\uDDF0")

  public val flagFo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEB\uD83C\uDDF4")

  public val flagFj: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEB\uD83C\uDDEF")

  public val flagFi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEB\uD83C\uDDEE")

  public val flagFr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEB\uD83C\uDDF7")

  public val flagGf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDEB")

  public val flagPf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF5\uD83C\uDDEB")

  public val flagTf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDEB")

  public val flagGa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDE6")

  public val flagGm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDF2")

  public val flagGe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDEA")

  public val flagDe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE9\uD83C\uDDEA")

  public val flagGh: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDED")

  public val flagGi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDEE")

  public val flagGr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDF7")

  public val flagGl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDF1")

  public val flagGd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDE9")

  public val flagGp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDF5")

  public val flagGu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDFA")

  public val flagGt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDF9")

  public val flagGg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDEC")

  public val flagGn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDF3")

  public val flagGw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDFC")

  public val flagGy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDFE")

  public val flagHt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDED\uD83C\uDDF9")

  public val flagHn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDED\uD83C\uDDF3")

  public val flagHk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDED\uD83C\uDDF0")

  public val flagHu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDED\uD83C\uDDFA")

  public val flagIs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEE\uD83C\uDDF8")

  public val flagIn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEE\uD83C\uDDF3")

  public val flagId: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEE\uD83C\uDDE9")

  public val flagIr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEE\uD83C\uDDF7")

  public val flagIq: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEE\uD83C\uDDF6")

  public val flagIe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEE\uD83C\uDDEA")

  public val flagIm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEE\uD83C\uDDF2")

  public val flagIl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEE\uD83C\uDDF1")

  public val flagIt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEE\uD83C\uDDF9")

  public val flagJm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEF\uD83C\uDDF2")

  public val flagJp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEF\uD83C\uDDF5")

  public val crossedFlags: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDF8C")

  public val flagJe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEF\uD83C\uDDEA")

  public val flagJo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEF\uD83C\uDDF4")

  public val flagKz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF0\uD83C\uDDFF")

  public val flagKe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF0\uD83C\uDDEA")

  public val flagKi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF0\uD83C\uDDEE")

  public val flagXk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFD\uD83C\uDDF0")

  public val flagKw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF0\uD83C\uDDFC")

  public val flagKg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF0\uD83C\uDDEC")

  public val flagLa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF1\uD83C\uDDE6")

  public val flagLv: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF1\uD83C\uDDFB")

  public val flagLb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF1\uD83C\uDDE7")

  public val flagLs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF1\uD83C\uDDF8")

  public val flagLr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF1\uD83C\uDDF7")

  public val flagLy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF1\uD83C\uDDFE")

  public val flagLi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF1\uD83C\uDDEE")

  public val flagLt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF1\uD83C\uDDF9")

  public val flagLu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF1\uD83C\uDDFA")

  public val flagMo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDF4")

  public val flagMk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDF0")

  public val flagMg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDEC")

  public val flagMw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDFC")

  public val flagMy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDFE")

  public val flagMv: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDFB")

  public val flagMl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDF1")

  public val flagMt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDF9")

  public val flagMh: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDED")

  public val flagMq: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDF6")

  public val flagMr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDF7")

  public val flagMu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDFA")

  public val flagYt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFE\uD83C\uDDF9")

  public val flagMx: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDFD")

  public val flagFm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEB\uD83C\uDDF2")

  public val flagMd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDE9")

  public val flagMc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDE8")

  public val flagMn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDF3")

  public val flagMe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDEA")

  public val flagMs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDF8")

  public val flagMa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDE6")

  public val flagMz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDFF")

  public val flagMm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDF2")

  public val flagNa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF3\uD83C\uDDE6")

  public val flagNr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF3\uD83C\uDDF7")

  public val flagNp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF3\uD83C\uDDF5")

  public val flagNl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF3\uD83C\uDDF1")

  public val flagNc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF3\uD83C\uDDE8")

  public val flagNz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF3\uD83C\uDDFF")

  public val flagNi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF3\uD83C\uDDEE")

  public val flagNe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF3\uD83C\uDDEA")

  public val flagNg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF3\uD83C\uDDEC")

  public val flagNu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF3\uD83C\uDDFA")

  public val flagNf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF3\uD83C\uDDEB")

  public val flagKp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF0\uD83C\uDDF5")

  public val flagMp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDF5")

  public val flagNo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF3\uD83C\uDDF4")

  public val flagOm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF4\uD83C\uDDF2")

  public val flagPk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF5\uD83C\uDDF0")

  public val flagPw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF5\uD83C\uDDFC")

  public val flagPs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF5\uD83C\uDDF8")

  public val flagPa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF5\uD83C\uDDE6")

  public val flagPg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF5\uD83C\uDDEC")

  public val flagPy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF5\uD83C\uDDFE")

  public val flagPe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF5\uD83C\uDDEA")

  public val flagPh: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF5\uD83C\uDDED")

  public val flagPn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF5\uD83C\uDDF3")

  public val flagPl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF5\uD83C\uDDF1")

  public val flagPt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF5\uD83C\uDDF9")

  public val flagPr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF5\uD83C\uDDF7")

  public val flagQa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF6\uD83C\uDDE6")

  public val flagRe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF7\uD83C\uDDEA")

  public val flagRo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF7\uD83C\uDDF4")

  public val flagRu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF7\uD83C\uDDFA")

  public val flagRw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF7\uD83C\uDDFC")

  public val flagWs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFC\uD83C\uDDF8")

  public val flagSm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDF2")

  public val flagSt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDF9")

  public val flagSa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDE6")

  public val flagSn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDF3")

  public val flagRs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF7\uD83C\uDDF8")

  public val flagSc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDE8")

  public val flagSl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDF1")

  public val flagSg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDEC")

  public val flagSx: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDFD")

  public val flagSk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDF0")

  public val flagSi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDEE")

  public val flagGs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDF8")

  public val flagSb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDE7")

  public val flagSo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDF4")

  public val flagZa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFF\uD83C\uDDE6")

  public val flagKr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF0\uD83C\uDDF7")

  public val flagSs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDF8")

  public val flagEs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEA\uD83C\uDDF8")

  public val flagLk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF1\uD83C\uDDF0")

  public val flagBl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDF1")

  public val flagSh: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDED")

  public val flagKn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF0\uD83C\uDDF3")

  public val flagLc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF1\uD83C\uDDE8")

  public val flagPm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF5\uD83C\uDDF2")

  public val flagVc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFB\uD83C\uDDE8")

  public val flagSd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDE9")

  public val flagSr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDF7")

  public val flagSz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDFF")

  public val flagSe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDEA")

  public val flagCh: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDED")

  public val flagSy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDFE")

  public val flagTw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDFC")

  public val flagTj: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDEF")

  public val flagTz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDFF")

  public val flagTh: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDED")

  public val flagTl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDF1")

  public val flagTg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDEC")

  public val flagTk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDF0")

  public val flagTo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDF4")

  public val flagTt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDF9")

  public val flagTn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDF3")

  public val flagTr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDF7")

  public val flagTm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDF2")

  public val flagTc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDE8")

  public val flagVi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFB\uD83C\uDDEE")

  public val flagTv: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDFB")

  public val flagUg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFA\uD83C\uDDEC")

  public val flagUa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFA\uD83C\uDDE6")

  public val flagAe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDEA")

  public val flagGb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEC\uD83C\uDDE7")

  public val england: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83C\uDFF4\uDB40\uDC67\uDB40\uDC62\uDB40\uDC65\uDB40\uDC6E\uDB40\uDC67\uDB40\uDC7F")

  public val scotland: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83C\uDFF4\uDB40\uDC67\uDB40\uDC62\uDB40\uDC73\uDB40\uDC63\uDB40\uDC74\uDB40\uDC7F")

  public val wales: DiscordEmoji.Generic
    get() =
        DiscordEmoji.Generic("\uD83C\uDFF4\uDB40\uDC67\uDB40\uDC62\uDB40\uDC77\uDB40\uDC6C\uDB40\uDC73\uDB40\uDC7F")

  public val flagUs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFA\uD83C\uDDF8")

  public val flagUy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFA\uD83C\uDDFE")

  public val flagUz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFA\uD83C\uDDFF")

  public val flagVu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFB\uD83C\uDDFA")

  public val flagVa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFB\uD83C\uDDE6")

  public val flagVe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFB\uD83C\uDDEA")

  public val flagVn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFB\uD83C\uDDF3")

  public val flagWf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFC\uD83C\uDDEB")

  public val flagEh: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEA\uD83C\uDDED")

  public val flagYe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFE\uD83C\uDDEA")

  public val flagZm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFF\uD83C\uDDF2")

  public val flagZw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFF\uD83C\uDDFC")

  public val flagAc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE6\uD83C\uDDE8")

  public val flagBv: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE7\uD83C\uDDFB")

  public val flagCp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE8\uD83C\uDDF5")

  public val flagEa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDEA\uD83C\uDDE6")

  public val flagDg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDE9\uD83C\uDDEC")

  public val flagHm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDED\uD83C\uDDF2")

  public val flagMf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF2\uD83C\uDDEB")

  public val flagSj: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF8\uD83C\uDDEF")

  public val flagTa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDF9\uD83C\uDDE6")

  public val flagUm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFA\uD83C\uDDF2")

  public val unitedNations: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("\uD83C\uDDFA\uD83C\uDDF3")

  /**
   * Gets a discord emoji with the given [unicode].
   */
  public operator fun `get`(unicode: String): DiscordEmoji? {
    val tone = unicode.toSkinTone()
    val withoutTone = unicode.removeTone()
    val emoji = Emojis.all[withoutTone]

    return if (emoji is DiscordEmoji.Diverse) emoji.copy(tone = tone!!) else emoji
  }
}

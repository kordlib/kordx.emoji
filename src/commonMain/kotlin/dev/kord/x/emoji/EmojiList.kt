package dev.kord.x.emoji

import kotlin.js.JsName

/**
 * List of all supported discord emojis.
 */
@Suppress(names = arrayOf("ObjectPropertyName", "MemberVisibilityCanBePrivate",
        "SpellCheckingInspection", "unused"))
public object Emojis {
  public val all: Map<String, DiscordEmoji> = mapOf(
      "😀" to grinning,
      "😃" to smiley,
      "😄" to smile,
      "😁" to grin,
      "😆" to laughing,
      "😅" to sweatSmile,
      "🤣" to rofl,
      "😂" to joy,
      "🙂" to slightlySmilingFace,
      "🙃" to upsideDownFace,
      "🫠" to meltingFace,
      "😉" to wink,
      "😊" to blush,
      "😇" to innocent,
      "🥰" to smilingFaceWithThreeHearts,
      "😍" to heartEyes,
      "🤩" to starStruck,
      "😘" to kissingHeart,
      "😗" to kissing,
      "☺️" to relaxed,
      "😚" to kissingClosedEyes,
      "😙" to kissingSmilingEyes,
      "🥲" to smilingFaceWithTear,
      "😋" to yum,
      "😛" to stuckOutTongue,
      "😜" to stuckOutTongueWinkingEye,
      "🤪" to zanyFace,
      "😝" to stuckOutTongueClosedEyes,
      "🤑" to moneyMouthFace,
      "🤗" to hugs,
      "🤭" to handOverMouth,
      "🫢" to faceWithOpenEyesAndHandOverMouth,
      "🫣" to faceWithPeekingEye,
      "🤫" to shushingFace,
      "🤔" to thinking,
      "🫡" to salutingFace,
      "🤐" to zipperMouthFace,
      "🤨" to raisedEyebrow,
      "😐" to neutralFace,
      "😑" to expressionless,
      "😶" to noMouth,
      "🫥" to dottedLineFace,
      "😶‍🌫️" to faceInClouds,
      "😏" to smirk,
      "😒" to unamused,
      "🙄" to rollEyes,
      "😬" to grimacing,
      "😮‍💨" to faceExhaling,
      "🤥" to lyingFace,
      "🫨" to shakingFace,
      "😌" to relieved,
      "😔" to pensive,
      "😪" to sleepy,
      "🤤" to droolingFace,
      "😴" to sleeping,
      "😷" to mask,
      "🤒" to faceWithThermometer,
      "🤕" to faceWithHeadBandage,
      "🤢" to nauseatedFace,
      "🤮" to vomitingFace,
      "🤧" to sneezingFace,
      "🥵" to hotFace,
      "🥶" to coldFace,
      "🥴" to woozyFace,
      "😵" to dizzyFace,
      "😵‍💫" to faceWithSpiralEyes,
      "🤯" to explodingHead,
      "🤠" to cowboyHatFace,
      "🥳" to partyingFace,
      "🥸" to disguisedFace,
      "😎" to sunglasses,
      "🤓" to nerdFace,
      "🧐" to monocleFace,
      "😕" to confused,
      "🫤" to faceWithDiagonalMouth,
      "😟" to worried,
      "🙁" to slightlyFrowningFace,
      "☹️" to frowningFace,
      "😮" to openMouth,
      "😯" to hushed,
      "😲" to astonished,
      "😳" to flushed,
      "🥺" to pleadingFace,
      "🥹" to faceHoldingBackTears,
      "😦" to frowning,
      "😧" to anguished,
      "😨" to fearful,
      "😰" to coldSweat,
      "😥" to disappointedRelieved,
      "😢" to cry,
      "😭" to sob,
      "😱" to scream,
      "😖" to confounded,
      "😣" to persevere,
      "😞" to disappointed,
      "😓" to sweat,
      "😩" to weary,
      "😫" to tiredFace,
      "🥱" to yawningFace,
      "😤" to triumph,
      "😡" to rage,
      "😠" to angry,
      "🤬" to cursingFace,
      "😈" to smilingImp,
      "👿" to imp,
      "💀" to skull,
      "☠️" to skullAndCrossbones,
      "💩" to hankey,
      "🤡" to clownFace,
      "👹" to japaneseOgre,
      "👺" to japaneseGoblin,
      "👻" to ghost,
      "👽" to alien,
      "👾" to spaceInvader,
      "🤖" to robot,
      "😺" to smileyCat,
      "😸" to smileCat,
      "😹" to joyCat,
      "😻" to heartEyesCat,
      "😼" to smirkCat,
      "😽" to kissingCat,
      "🙀" to screamCat,
      "😿" to cryingCatFace,
      "😾" to poutingCat,
      "🙈" to seeNoEvil,
      "🙉" to hearNoEvil,
      "🙊" to speakNoEvil,
      "💌" to loveLetter,
      "💘" to cupid,
      "💝" to giftHeart,
      "💖" to sparklingHeart,
      "💗" to heartpulse,
      "💓" to heartbeat,
      "💞" to revolvingHearts,
      "💕" to twoHearts,
      "💟" to heartDecoration,
      "❣️" to heavyHeartExclamation,
      "💔" to brokenHeart,
      "❤️‍🔥" to heartOnFire,
      "❤️‍🩹" to mendingHeart,
      "❤️" to heart,
      "🩷" to pinkHeart,
      "🧡" to orangeHeart,
      "💛" to yellowHeart,
      "💚" to greenHeart,
      "💙" to blueHeart,
      "🩵" to lightBlueHeart,
      "💜" to purpleHeart,
      "🤎" to brownHeart,
      "🖤" to blackHeart,
      "🩶" to greyHeart,
      "🤍" to whiteHeart,
      "💋" to kiss,
      "💯" to `100`,
      "💢" to anger,
      "💥" to boom,
      "💫" to dizzy,
      "💦" to sweatDrops,
      "💨" to dash,
      "🕳️" to hole,
      "💬" to speechBalloon,
      "👁️‍🗨️" to eyeSpeechBubble,
      "🗨️" to leftSpeechBubble,
      "🗯️" to rightAngerBubble,
      "💭" to thoughtBalloon,
      "💤" to zzz,
      "👋" to wave,
      "🤚" to raisedBackOfHand,
      "🖐️" to raisedHandWithFingersSplayed,
      "✋" to hand,
      "🖖" to vulcanSalute,
      "🫱" to rightwardsHand,
      "🫲" to leftwardsHand,
      "🫳" to palmDownHand,
      "🫴" to palmUpHand,
      "🫷" to leftwardsPushingHand,
      "🫸" to rightwardsPushingHand,
      "👌" to okHand,
      "🤌" to pinchedFingers,
      "🤏" to pinchingHand,
      "✌️" to v,
      "🤞" to crossedFingers,
      "🫰" to handWithIndexFingerAndThumbCrossed,
      "🤟" to loveYouGesture,
      "🤘" to metal,
      "🤙" to callMeHand,
      "👈" to pointLeft,
      "👉" to pointRight,
      "👆" to pointUp2,
      "🖕" to middleFinger,
      "👇" to pointDown,
      "☝️" to pointUp,
      "🫵" to indexPointingAtTheViewer,
      "👍" to `+1`,
      "👎" to `-1`,
      "✊" to fistRaised,
      "👊" to fistOncoming,
      "🤛" to fistLeft,
      "🤜" to fistRight,
      "👏" to clap,
      "🙌" to raisedHands,
      "🫶" to heartHands,
      "👐" to openHands,
      "🤲" to palmsUpTogether,
      "🤝" to handshake,
      "🙏" to pray,
      "✍️" to writingHand,
      "💅" to nailCare,
      "🤳" to selfie,
      "💪" to muscle,
      "🦾" to mechanicalArm,
      "🦿" to mechanicalLeg,
      "🦵" to leg,
      "🦶" to foot,
      "👂" to ear,
      "🦻" to earWithHearingAid,
      "👃" to nose,
      "🧠" to brain,
      "🫀" to anatomicalHeart,
      "🫁" to lungs,
      "🦷" to tooth,
      "🦴" to bone,
      "👀" to eyes,
      "👁️" to eye,
      "👅" to tongue,
      "👄" to lips,
      "🫦" to bitingLip,
      "👶" to baby,
      "🧒" to child,
      "👦" to boy,
      "👧" to girl,
      "🧑" to adult,
      "👱" to blondHairedPerson,
      "👨" to man,
      "🧔" to beardedPerson,
      "🧔‍♂️" to manBeard,
      "🧔‍♀️" to womanBeard,
      "👨‍🦰" to redHairedMan,
      "👨‍🦱" to curlyHairedMan,
      "👨‍🦳" to whiteHairedMan,
      "👨‍🦲" to baldMan,
      "👩" to woman,
      "👩‍🦰" to redHairedWoman,
      "🧑‍🦰" to personRedHair,
      "👩‍🦱" to curlyHairedWoman,
      "🧑‍🦱" to personCurlyHair,
      "👩‍🦳" to whiteHairedWoman,
      "🧑‍🦳" to personWhiteHair,
      "👩‍🦲" to baldWoman,
      "🧑‍🦲" to personBald,
      "👱‍♀️" to blondHairedWoman,
      "👱‍♂️" to blondHairedMan,
      "🧓" to olderAdult,
      "👴" to olderMan,
      "👵" to olderWoman,
      "🙍" to frowningPerson,
      "🙍‍♂️" to frowningMan,
      "🙍‍♀️" to frowningWoman,
      "🙎" to poutingFace,
      "🙎‍♂️" to poutingMan,
      "🙎‍♀️" to poutingWoman,
      "🙅" to noGood,
      "🙅‍♂️" to noGoodMan,
      "🙅‍♀️" to noGoodWoman,
      "🙆" to okPerson,
      "🙆‍♂️" to okMan,
      "🙆‍♀️" to okWoman,
      "💁" to tippingHandPerson,
      "💁‍♂️" to tippingHandMan,
      "💁‍♀️" to tippingHandWoman,
      "🙋" to raisingHand,
      "🙋‍♂️" to raisingHandMan,
      "🙋‍♀️" to raisingHandWoman,
      "🧏" to deafPerson,
      "🧏‍♂️" to deafMan,
      "🧏‍♀️" to deafWoman,
      "🙇" to bow,
      "🙇‍♂️" to bowingMan,
      "🙇‍♀️" to bowingWoman,
      "🤦" to facepalm,
      "🤦‍♂️" to manFacepalming,
      "🤦‍♀️" to womanFacepalming,
      "🤷" to shrug,
      "🤷‍♂️" to manShrugging,
      "🤷‍♀️" to womanShrugging,
      "🧑‍⚕️" to healthWorker,
      "👨‍⚕️" to manHealthWorker,
      "👩‍⚕️" to womanHealthWorker,
      "🧑‍🎓" to student,
      "👨‍🎓" to manStudent,
      "👩‍🎓" to womanStudent,
      "🧑‍🏫" to teacher,
      "👨‍🏫" to manTeacher,
      "👩‍🏫" to womanTeacher,
      "🧑‍⚖️" to judge,
      "👨‍⚖️" to manJudge,
      "👩‍⚖️" to womanJudge,
      "🧑‍🌾" to farmer,
      "👨‍🌾" to manFarmer,
      "👩‍🌾" to womanFarmer,
      "🧑‍🍳" to cook,
      "👨‍🍳" to manCook,
      "👩‍🍳" to womanCook,
      "🧑‍🔧" to mechanic,
      "👨‍🔧" to manMechanic,
      "👩‍🔧" to womanMechanic,
      "🧑‍🏭" to factoryWorker,
      "👨‍🏭" to manFactoryWorker,
      "👩‍🏭" to womanFactoryWorker,
      "🧑‍💼" to officeWorker,
      "👨‍💼" to manOfficeWorker,
      "👩‍💼" to womanOfficeWorker,
      "🧑‍🔬" to scientist,
      "👨‍🔬" to manScientist,
      "👩‍🔬" to womanScientist,
      "🧑‍💻" to technologist,
      "👨‍💻" to manTechnologist,
      "👩‍💻" to womanTechnologist,
      "🧑‍🎤" to singer,
      "👨‍🎤" to manSinger,
      "👩‍🎤" to womanSinger,
      "🧑‍🎨" to artist,
      "👨‍🎨" to manArtist,
      "👩‍🎨" to womanArtist,
      "🧑‍✈️" to pilot,
      "👨‍✈️" to manPilot,
      "👩‍✈️" to womanPilot,
      "🧑‍🚀" to astronaut,
      "👨‍🚀" to manAstronaut,
      "👩‍🚀" to womanAstronaut,
      "🧑‍🚒" to firefighter,
      "👨‍🚒" to manFirefighter,
      "👩‍🚒" to womanFirefighter,
      "👮" to policeOfficer,
      "👮‍♂️" to policeman,
      "👮‍♀️" to policewoman,
      "🕵️" to detective,
      "🕵️‍♂️" to maleDetective,
      "🕵️‍♀️" to femaleDetective,
      "💂" to guard,
      "💂‍♂️" to guardsman,
      "💂‍♀️" to guardswoman,
      "🥷" to ninja,
      "👷" to constructionWorker,
      "👷‍♂️" to constructionWorkerMan,
      "👷‍♀️" to constructionWorkerWoman,
      "🫅" to personWithCrown,
      "🤴" to prince,
      "👸" to princess,
      "👳" to personWithTurban,
      "👳‍♂️" to manWithTurban,
      "👳‍♀️" to womanWithTurban,
      "👲" to manWithGuaPiMao,
      "🧕" to womanWithHeadscarf,
      "🤵" to personInTuxedo,
      "🤵‍♂️" to manInTuxedo,
      "🤵‍♀️" to womanInTuxedo,
      "👰" to personWithVeil,
      "👰‍♂️" to manWithVeil,
      "👰‍♀️" to womanWithVeil,
      "🤰" to pregnantWoman,
      "🫃" to pregnantMan,
      "🫄" to pregnantPerson,
      "🤱" to breastFeeding,
      "👩‍🍼" to womanFeedingBaby,
      "👨‍🍼" to manFeedingBaby,
      "🧑‍🍼" to personFeedingBaby,
      "👼" to angel,
      "🎅" to santa,
      "🤶" to mrsClaus,
      "🧑‍🎄" to mxClaus,
      "🦸" to superhero,
      "🦸‍♂️" to superheroMan,
      "🦸‍♀️" to superheroWoman,
      "🦹" to supervillain,
      "🦹‍♂️" to supervillainMan,
      "🦹‍♀️" to supervillainWoman,
      "🧙" to mage,
      "🧙‍♂️" to mageMan,
      "🧙‍♀️" to mageWoman,
      "🧚" to fairy,
      "🧚‍♂️" to fairyMan,
      "🧚‍♀️" to fairyWoman,
      "🧛" to vampire,
      "🧛‍♂️" to vampireMan,
      "🧛‍♀️" to vampireWoman,
      "🧜" to merperson,
      "🧜‍♂️" to merman,
      "🧜‍♀️" to mermaid,
      "🧝" to elf,
      "🧝‍♂️" to elfMan,
      "🧝‍♀️" to elfWoman,
      "🧞" to genie,
      "🧞‍♂️" to genieMan,
      "🧞‍♀️" to genieWoman,
      "🧟" to zombie,
      "🧟‍♂️" to zombieMan,
      "🧟‍♀️" to zombieWoman,
      "🧌" to troll,
      "💆" to massage,
      "💆‍♂️" to massageMan,
      "💆‍♀️" to massageWoman,
      "💇" to haircut,
      "💇‍♂️" to haircutMan,
      "💇‍♀️" to haircutWoman,
      "🚶" to walking,
      "🚶‍♂️" to walkingMan,
      "🚶‍♀️" to walkingWoman,
      "🧍" to standingPerson,
      "🧍‍♂️" to standingMan,
      "🧍‍♀️" to standingWoman,
      "🧎" to kneelingPerson,
      "🧎‍♂️" to kneelingMan,
      "🧎‍♀️" to kneelingWoman,
      "🧑‍🦯" to personWithProbingCane,
      "👨‍🦯" to manWithProbingCane,
      "👩‍🦯" to womanWithProbingCane,
      "🧑‍🦼" to personInMotorizedWheelchair,
      "👨‍🦼" to manInMotorizedWheelchair,
      "👩‍🦼" to womanInMotorizedWheelchair,
      "🧑‍🦽" to personInManualWheelchair,
      "👨‍🦽" to manInManualWheelchair,
      "👩‍🦽" to womanInManualWheelchair,
      "🏃" to runner,
      "🏃‍♂️" to runningMan,
      "🏃‍♀️" to runningWoman,
      "💃" to womanDancing,
      "🕺" to manDancing,
      "🕴️" to businessSuitLevitating,
      "👯" to dancers,
      "👯‍♂️" to dancingMen,
      "👯‍♀️" to dancingWomen,
      "🧖" to saunaPerson,
      "🧖‍♂️" to saunaMan,
      "🧖‍♀️" to saunaWoman,
      "🧗" to climbing,
      "🧗‍♂️" to climbingMan,
      "🧗‍♀️" to climbingWoman,
      "🤺" to personFencing,
      "🏇" to horseRacing,
      "⛷️" to skier,
      "🏂" to snowboarder,
      "🏌️" to golfing,
      "🏌️‍♂️" to golfingMan,
      "🏌️‍♀️" to golfingWoman,
      "🏄" to surfer,
      "🏄‍♂️" to surfingMan,
      "🏄‍♀️" to surfingWoman,
      "🚣" to rowboat,
      "🚣‍♂️" to rowingMan,
      "🚣‍♀️" to rowingWoman,
      "🏊" to swimmer,
      "🏊‍♂️" to swimmingMan,
      "🏊‍♀️" to swimmingWoman,
      "⛹️" to bouncingBallPerson,
      "⛹️‍♂️" to bouncingBallMan,
      "⛹️‍♀️" to bouncingBallWoman,
      "🏋️" to weightLifting,
      "🏋️‍♂️" to weightLiftingMan,
      "🏋️‍♀️" to weightLiftingWoman,
      "🚴" to bicyclist,
      "🚴‍♂️" to bikingMan,
      "🚴‍♀️" to bikingWoman,
      "🚵" to mountainBicyclist,
      "🚵‍♂️" to mountainBikingMan,
      "🚵‍♀️" to mountainBikingWoman,
      "🤸" to cartwheeling,
      "🤸‍♂️" to manCartwheeling,
      "🤸‍♀️" to womanCartwheeling,
      "🤼" to wrestling,
      "🤼‍♂️" to menWrestling,
      "🤼‍♀️" to womenWrestling,
      "🤽" to waterPolo,
      "🤽‍♂️" to manPlayingWaterPolo,
      "🤽‍♀️" to womanPlayingWaterPolo,
      "🤾" to handballPerson,
      "🤾‍♂️" to manPlayingHandball,
      "🤾‍♀️" to womanPlayingHandball,
      "🤹" to jugglingPerson,
      "🤹‍♂️" to manJuggling,
      "🤹‍♀️" to womanJuggling,
      "🧘" to lotusPosition,
      "🧘‍♂️" to lotusPositionMan,
      "🧘‍♀️" to lotusPositionWoman,
      "🛀" to bath,
      "🛌" to sleepingBed,
      "🧑‍🤝‍🧑" to peopleHoldingHands,
      "👭" to twoWomenHoldingHands,
      "👫" to couple,
      "👬" to twoMenHoldingHands,
      "💏" to couplekiss,
      "👩‍❤️‍💋‍👨" to couplekissManWoman,
      "👨‍❤️‍💋‍👨" to couplekissManMan,
      "👩‍❤️‍💋‍👩" to couplekissWomanWoman,
      "💑" to coupleWithHeart,
      "👩‍❤️‍👨" to coupleWithHeartWomanMan,
      "👨‍❤️‍👨" to coupleWithHeartManMan,
      "👩‍❤️‍👩" to coupleWithHeartWomanWoman,
      "👪" to family,
      "👨‍👩‍👦" to familyManWomanBoy,
      "👨‍👩‍👧" to familyManWomanGirl,
      "👨‍👩‍👧‍👦" to familyManWomanGirlBoy,
      "👨‍👩‍👦‍👦" to familyManWomanBoyBoy,
      "👨‍👩‍👧‍👧" to familyManWomanGirlGirl,
      "👨‍👨‍👦" to familyManManBoy,
      "👨‍👨‍👧" to familyManManGirl,
      "👨‍👨‍👧‍👦" to familyManManGirlBoy,
      "👨‍👨‍👦‍👦" to familyManManBoyBoy,
      "👨‍👨‍👧‍👧" to familyManManGirlGirl,
      "👩‍👩‍👦" to familyWomanWomanBoy,
      "👩‍👩‍👧" to familyWomanWomanGirl,
      "👩‍👩‍👧‍👦" to familyWomanWomanGirlBoy,
      "👩‍👩‍👦‍👦" to familyWomanWomanBoyBoy,
      "👩‍👩‍👧‍👧" to familyWomanWomanGirlGirl,
      "👨‍👦" to familyManBoy,
      "👨‍👦‍👦" to familyManBoyBoy,
      "👨‍👧" to familyManGirl,
      "👨‍👧‍👦" to familyManGirlBoy,
      "👨‍👧‍👧" to familyManGirlGirl,
      "👩‍👦" to familyWomanBoy,
      "👩‍👦‍👦" to familyWomanBoyBoy,
      "👩‍👧" to familyWomanGirl,
      "👩‍👧‍👦" to familyWomanGirlBoy,
      "👩‍👧‍👧" to familyWomanGirlGirl,
      "🗣️" to speakingHead,
      "👤" to bustInSilhouette,
      "👥" to bustsInSilhouette,
      "🫂" to peopleHugging,
      "👣" to footprints,
      "🐵" to monkeyFace,
      "🐒" to monkey,
      "🦍" to gorilla,
      "🦧" to orangutan,
      "🐶" to dog,
      "🐕" to dog2,
      "🦮" to guideDog,
      "🐕‍🦺" to serviceDog,
      "🐩" to poodle,
      "🐺" to wolf,
      "🦊" to foxFace,
      "🦝" to raccoon,
      "🐱" to cat,
      "🐈" to cat2,
      "🐈‍⬛" to blackCat,
      "🦁" to lion,
      "🐯" to tiger,
      "🐅" to tiger2,
      "🐆" to leopard,
      "🐴" to horse,
      "🫎" to moose,
      "🫏" to donkey,
      "🐎" to racehorse,
      "🦄" to unicorn,
      "🦓" to zebra,
      "🦌" to deer,
      "🦬" to bison,
      "🐮" to cow,
      "🐂" to ox,
      "🐃" to waterBuffalo,
      "🐄" to cow2,
      "🐷" to pig,
      "🐖" to pig2,
      "🐗" to boar,
      "🐽" to pigNose,
      "🐏" to ram,
      "🐑" to sheep,
      "🐐" to goat,
      "🐪" to dromedaryCamel,
      "🐫" to camel,
      "🦙" to llama,
      "🦒" to giraffe,
      "🐘" to elephant,
      "🦣" to mammoth,
      "🦏" to rhinoceros,
      "🦛" to hippopotamus,
      "🐭" to mouse,
      "🐁" to mouse2,
      "🐀" to rat,
      "🐹" to hamster,
      "🐰" to rabbit,
      "🐇" to rabbit2,
      "🐿️" to chipmunk,
      "🦫" to beaver,
      "🦔" to hedgehog,
      "🦇" to bat,
      "🐻" to bear,
      "🐻‍❄️" to polarBear,
      "🐨" to koala,
      "🐼" to pandaFace,
      "🦥" to sloth,
      "🦦" to otter,
      "🦨" to skunk,
      "🦘" to kangaroo,
      "🦡" to badger,
      "🐾" to feet,
      "🦃" to turkey,
      "🐔" to chicken,
      "🐓" to rooster,
      "🐣" to hatchingChick,
      "🐤" to babyChick,
      "🐥" to hatchedChick,
      "🐦" to bird,
      "🐧" to penguin,
      "🕊️" to dove,
      "🦅" to eagle,
      "🦆" to duck,
      "🦢" to swan,
      "🦉" to owl,
      "🦤" to dodo,
      "🪶" to feather,
      "🦩" to flamingo,
      "🦚" to peacock,
      "🦜" to parrot,
      "🪽" to wing,
      "🐦‍⬛" to blackBird,
      "🪿" to goose,
      "🐸" to frog,
      "🐊" to crocodile,
      "🐢" to turtle,
      "🦎" to lizard,
      "🐍" to snake,
      "🐲" to dragonFace,
      "🐉" to dragon,
      "🦕" to sauropod,
      "🦖" to `t-rex`,
      "🐳" to whale,
      "🐋" to whale2,
      "🐬" to dolphin,
      "🦭" to seal,
      "🐟" to fish,
      "🐠" to tropicalFish,
      "🐡" to blowfish,
      "🦈" to shark,
      "🐙" to octopus,
      "🐚" to shell,
      "🪸" to coral,
      "🪼" to jellyfish,
      "🐌" to snail,
      "🦋" to butterfly,
      "🐛" to bug,
      "🐜" to ant,
      "🐝" to bee,
      "🪲" to beetle,
      "🐞" to ladyBeetle,
      "🦗" to cricket,
      "🪳" to cockroach,
      "🕷️" to spider,
      "🕸️" to spiderWeb,
      "🦂" to scorpion,
      "🦟" to mosquito,
      "🪰" to fly,
      "🪱" to worm,
      "🦠" to microbe,
      "💐" to bouquet,
      "🌸" to cherryBlossom,
      "💮" to whiteFlower,
      "🪷" to lotus,
      "🏵️" to rosette,
      "🌹" to rose,
      "🥀" to wiltedFlower,
      "🌺" to hibiscus,
      "🌻" to sunflower,
      "🌼" to blossom,
      "🌷" to tulip,
      "🪻" to hyacinth,
      "🌱" to seedling,
      "🪴" to pottedPlant,
      "🌲" to evergreenTree,
      "🌳" to deciduousTree,
      "🌴" to palmTree,
      "🌵" to cactus,
      "🌾" to earOfRice,
      "🌿" to herb,
      "☘️" to shamrock,
      "🍀" to fourLeafClover,
      "🍁" to mapleLeaf,
      "🍂" to fallenLeaf,
      "🍃" to leaves,
      "🪹" to emptyNest,
      "🪺" to nestWithEggs,
      "🍄" to mushroom,
      "🍇" to grapes,
      "🍈" to melon,
      "🍉" to watermelon,
      "🍊" to tangerine,
      "🍋" to lemon,
      "🍌" to banana,
      "🍍" to pineapple,
      "🥭" to mango,
      "🍎" to apple,
      "🍏" to greenApple,
      "🍐" to pear,
      "🍑" to peach,
      "🍒" to cherries,
      "🍓" to strawberry,
      "🫐" to blueberries,
      "🥝" to kiwiFruit,
      "🍅" to tomato,
      "🫒" to olive,
      "🥥" to coconut,
      "🥑" to avocado,
      "🍆" to eggplant,
      "🥔" to potato,
      "🥕" to carrot,
      "🌽" to corn,
      "🌶️" to hotPepper,
      "🫑" to bellPepper,
      "🥒" to cucumber,
      "🥬" to leafyGreen,
      "🥦" to broccoli,
      "🧄" to garlic,
      "🧅" to onion,
      "🥜" to peanuts,
      "🫘" to beans,
      "🌰" to chestnut,
      "🫚" to gingerRoot,
      "🫛" to peaPod,
      "🍞" to bread,
      "🥐" to croissant,
      "🥖" to baguetteBread,
      "🫓" to flatbread,
      "🥨" to pretzel,
      "🥯" to bagel,
      "🥞" to pancakes,
      "🧇" to waffle,
      "🧀" to cheese,
      "🍖" to meatOnBone,
      "🍗" to poultryLeg,
      "🥩" to cutOfMeat,
      "🥓" to bacon,
      "🍔" to hamburger,
      "🍟" to fries,
      "🍕" to pizza,
      "🌭" to hotdog,
      "🥪" to sandwich,
      "🌮" to taco,
      "🌯" to burrito,
      "🫔" to tamale,
      "🥙" to stuffedFlatbread,
      "🧆" to falafel,
      "🥚" to egg,
      "🍳" to friedEgg,
      "🥘" to shallowPanOfFood,
      "🍲" to stew,
      "🫕" to fondue,
      "🥣" to bowlWithSpoon,
      "🥗" to greenSalad,
      "🍿" to popcorn,
      "🧈" to butter,
      "🧂" to salt,
      "🥫" to cannedFood,
      "🍱" to bento,
      "🍘" to riceCracker,
      "🍙" to riceBall,
      "🍚" to rice,
      "🍛" to curry,
      "🍜" to ramen,
      "🍝" to spaghetti,
      "🍠" to sweetPotato,
      "🍢" to oden,
      "🍣" to sushi,
      "🍤" to friedShrimp,
      "🍥" to fishCake,
      "🥮" to moonCake,
      "🍡" to dango,
      "🥟" to dumpling,
      "🥠" to fortuneCookie,
      "🥡" to takeoutBox,
      "🦀" to crab,
      "🦞" to lobster,
      "🦐" to shrimp,
      "🦑" to squid,
      "🦪" to oyster,
      "🍦" to icecream,
      "🍧" to shavedIce,
      "🍨" to iceCream,
      "🍩" to doughnut,
      "🍪" to cookie,
      "🎂" to birthday,
      "🍰" to cake,
      "🧁" to cupcake,
      "🥧" to pie,
      "🍫" to chocolateBar,
      "🍬" to candy,
      "🍭" to lollipop,
      "🍮" to custard,
      "🍯" to honeyPot,
      "🍼" to babyBottle,
      "🥛" to milkGlass,
      "☕" to coffee,
      "🫖" to teapot,
      "🍵" to tea,
      "🍶" to sake,
      "🍾" to champagne,
      "🍷" to wineGlass,
      "🍸" to cocktail,
      "🍹" to tropicalDrink,
      "🍺" to beer,
      "🍻" to beers,
      "🥂" to clinkingGlasses,
      "🥃" to tumblerGlass,
      "🫗" to pouringLiquid,
      "🥤" to cupWithStraw,
      "🧋" to bubbleTea,
      "🧃" to beverageBox,
      "🧉" to mate,
      "🧊" to iceCube,
      "🥢" to chopsticks,
      "🍽️" to plateWithCutlery,
      "🍴" to forkAndKnife,
      "🥄" to spoon,
      "🔪" to hocho,
      "🫙" to jar,
      "🏺" to amphora,
      "🌍" to earthAfrica,
      "🌎" to earthAmericas,
      "🌏" to earthAsia,
      "🌐" to globeWithMeridians,
      "🗺️" to worldMap,
      "🗾" to japan,
      "🧭" to compass,
      "🏔️" to mountainSnow,
      "⛰️" to mountain,
      "🌋" to volcano,
      "🗻" to mountFuji,
      "🏕️" to camping,
      "🏖️" to beachUmbrella,
      "🏜️" to desert,
      "🏝️" to desertIsland,
      "🏞️" to nationalPark,
      "🏟️" to stadium,
      "🏛️" to classicalBuilding,
      "🏗️" to buildingConstruction,
      "🧱" to bricks,
      "🪨" to rock,
      "🪵" to wood,
      "🛖" to hut,
      "🏘️" to houses,
      "🏚️" to derelictHouse,
      "🏠" to house,
      "🏡" to houseWithGarden,
      "🏢" to office,
      "🏣" to postOffice,
      "🏤" to europeanPostOffice,
      "🏥" to hospital,
      "🏦" to bank,
      "🏨" to hotel,
      "🏩" to loveHotel,
      "🏪" to convenienceStore,
      "🏫" to school,
      "🏬" to departmentStore,
      "🏭" to factory,
      "🏯" to japaneseCastle,
      "🏰" to europeanCastle,
      "💒" to wedding,
      "🗼" to tokyoTower,
      "🗽" to statueOfLiberty,
      "⛪" to church,
      "🕌" to mosque,
      "🛕" to hinduTemple,
      "🕍" to synagogue,
      "⛩️" to shintoShrine,
      "🕋" to kaaba,
      "⛲" to fountain,
      "⛺" to tent,
      "🌁" to foggy,
      "🌃" to nightWithStars,
      "🏙️" to cityscape,
      "🌄" to sunriseOverMountains,
      "🌅" to sunrise,
      "🌆" to citySunset,
      "🌇" to citySunrise,
      "🌉" to bridgeAtNight,
      "♨️" to hotsprings,
      "🎠" to carouselHorse,
      "🛝" to playgroundSlide,
      "🎡" to ferrisWheel,
      "🎢" to rollerCoaster,
      "💈" to barber,
      "🎪" to circusTent,
      "🚂" to steamLocomotive,
      "🚃" to railwayCar,
      "🚄" to bullettrainSide,
      "🚅" to bullettrainFront,
      "🚆" to train2,
      "🚇" to metro,
      "🚈" to lightRail,
      "🚉" to station,
      "🚊" to tram,
      "🚝" to monorail,
      "🚞" to mountainRailway,
      "🚋" to train,
      "🚌" to bus,
      "🚍" to oncomingBus,
      "🚎" to trolleybus,
      "🚐" to minibus,
      "🚑" to ambulance,
      "🚒" to fireEngine,
      "🚓" to policeCar,
      "🚔" to oncomingPoliceCar,
      "🚕" to taxi,
      "🚖" to oncomingTaxi,
      "🚗" to car,
      "🚘" to oncomingAutomobile,
      "🚙" to blueCar,
      "🛻" to pickupTruck,
      "🚚" to truck,
      "🚛" to articulatedLorry,
      "🚜" to tractor,
      "🏎️" to racingCar,
      "🏍️" to motorcycle,
      "🛵" to motorScooter,
      "🦽" to manualWheelchair,
      "🦼" to motorizedWheelchair,
      "🛺" to autoRickshaw,
      "🚲" to bike,
      "🛴" to kickScooter,
      "🛹" to skateboard,
      "🛼" to rollerSkate,
      "🚏" to busstop,
      "🛣️" to motorway,
      "🛤️" to railwayTrack,
      "🛢️" to oilDrum,
      "⛽" to fuelpump,
      "🛞" to wheel,
      "🚨" to rotatingLight,
      "🚥" to trafficLight,
      "🚦" to verticalTrafficLight,
      "🛑" to stopSign,
      "🚧" to construction,
      "⚓" to anchor,
      "🛟" to ringBuoy,
      "⛵" to boat,
      "🛶" to canoe,
      "🚤" to speedboat,
      "🛳️" to passengerShip,
      "⛴️" to ferry,
      "🛥️" to motorBoat,
      "🚢" to ship,
      "✈️" to airplane,
      "🛩️" to smallAirplane,
      "🛫" to flightDeparture,
      "🛬" to flightArrival,
      "🪂" to parachute,
      "💺" to seat,
      "🚁" to helicopter,
      "🚟" to suspensionRailway,
      "🚠" to mountainCableway,
      "🚡" to aerialTramway,
      "🛰️" to artificialSatellite,
      "🚀" to rocket,
      "🛸" to flyingSaucer,
      "🛎️" to bellhopBell,
      "🧳" to luggage,
      "⌛" to hourglass,
      "⏳" to hourglassFlowingSand,
      "⌚" to watch,
      "⏰" to alarmClock,
      "⏱️" to stopwatch,
      "⏲️" to timerClock,
      "🕰️" to mantelpieceClock,
      "🕛" to clock12,
      "🕧" to clock1230,
      "🕐" to clock1,
      "🕜" to clock130,
      "🕑" to clock2,
      "🕝" to clock230,
      "🕒" to clock3,
      "🕞" to clock330,
      "🕓" to clock4,
      "🕟" to clock430,
      "🕔" to clock5,
      "🕠" to clock530,
      "🕕" to clock6,
      "🕡" to clock630,
      "🕖" to clock7,
      "🕢" to clock730,
      "🕗" to clock8,
      "🕣" to clock830,
      "🕘" to clock9,
      "🕤" to clock930,
      "🕙" to clock10,
      "🕥" to clock1030,
      "🕚" to clock11,
      "🕦" to clock1130,
      "🌑" to newMoon,
      "🌒" to waxingCrescentMoon,
      "🌓" to firstQuarterMoon,
      "🌔" to moon,
      "🌕" to fullMoon,
      "🌖" to waningGibbousMoon,
      "🌗" to lastQuarterMoon,
      "🌘" to waningCrescentMoon,
      "🌙" to crescentMoon,
      "🌚" to newMoonWithFace,
      "🌛" to firstQuarterMoonWithFace,
      "🌜" to lastQuarterMoonWithFace,
      "🌡️" to thermometer,
      "☀️" to sunny,
      "🌝" to fullMoonWithFace,
      "🌞" to sunWithFace,
      "🪐" to ringedPlanet,
      "⭐" to star,
      "🌟" to star2,
      "🌠" to stars,
      "🌌" to milkyWay,
      "☁️" to cloud,
      "⛅" to partlySunny,
      "⛈️" to cloudWithLightningAndRain,
      "🌤️" to sunBehindSmallCloud,
      "🌥️" to sunBehindLargeCloud,
      "🌦️" to sunBehindRainCloud,
      "🌧️" to cloudWithRain,
      "🌨️" to cloudWithSnow,
      "🌩️" to cloudWithLightning,
      "🌪️" to tornado,
      "🌫️" to fog,
      "🌬️" to windFace,
      "🌀" to cyclone,
      "🌈" to rainbow,
      "🌂" to closedUmbrella,
      "☂️" to openUmbrella,
      "☔" to umbrella,
      "⛱️" to parasolOnGround,
      "⚡" to zap,
      "❄️" to snowflake,
      "☃️" to snowmanWithSnow,
      "⛄" to snowman,
      "☄️" to comet,
      "🔥" to fire,
      "💧" to droplet,
      "🌊" to ocean,
      "🎃" to jackOLantern,
      "🎄" to christmasTree,
      "🎆" to fireworks,
      "🎇" to sparkler,
      "🧨" to firecracker,
      "✨" to sparkles,
      "🎈" to balloon,
      "🎉" to tada,
      "🎊" to confettiBall,
      "🎋" to tanabataTree,
      "🎍" to bamboo,
      "🎎" to dolls,
      "🎏" to flags,
      "🎐" to windChime,
      "🎑" to riceScene,
      "🧧" to redEnvelope,
      "🎀" to ribbon,
      "🎁" to gift,
      "🎗️" to reminderRibbon,
      "🎟️" to tickets,
      "🎫" to ticket,
      "🎖️" to medalMilitary,
      "🏆" to trophy,
      "🏅" to medalSports,
      "🥇" to `1stPlaceMedal`,
      "🥈" to `2ndPlaceMedal`,
      "🥉" to `3rdPlaceMedal`,
      "⚽" to soccer,
      "⚾" to baseball,
      "🥎" to softball,
      "🏀" to basketball,
      "🏐" to volleyball,
      "🏈" to football,
      "🏉" to rugbyFootball,
      "🎾" to tennis,
      "🥏" to flyingDisc,
      "🎳" to bowling,
      "🏏" to cricketGame,
      "🏑" to fieldHockey,
      "🏒" to iceHockey,
      "🥍" to lacrosse,
      "🏓" to pingPong,
      "🏸" to badminton,
      "🥊" to boxingGlove,
      "🥋" to martialArtsUniform,
      "🥅" to goalNet,
      "⛳" to golf,
      "⛸️" to iceSkate,
      "🎣" to fishingPoleAndFish,
      "🤿" to divingMask,
      "🎽" to runningShirtWithSash,
      "🎿" to ski,
      "🛷" to sled,
      "🥌" to curlingStone,
      "🎯" to dart,
      "🪀" to yoYo,
      "🪁" to kite,
      "🔫" to gun,
      "🎱" to `8ball`,
      "🔮" to crystalBall,
      "🪄" to magicWand,
      "🎮" to videoGame,
      "🕹️" to joystick,
      "🎰" to slotMachine,
      "🎲" to gameDie,
      "🧩" to jigsaw,
      "🧸" to teddyBear,
      "🪅" to pinata,
      "🪩" to mirrorBall,
      "🪆" to nestingDolls,
      "♠️" to spades,
      "♥️" to hearts,
      "♦️" to diamonds,
      "♣️" to clubs,
      "♟️" to chessPawn,
      "🃏" to blackJoker,
      "🀄" to mahjong,
      "🎴" to flowerPlayingCards,
      "🎭" to performingArts,
      "🖼️" to framedPicture,
      "🎨" to art,
      "🧵" to thread,
      "🪡" to sewingNeedle,
      "🧶" to yarn,
      "🪢" to knot,
      "👓" to eyeglasses,
      "🕶️" to darkSunglasses,
      "🥽" to goggles,
      "🥼" to labCoat,
      "🦺" to safetyVest,
      "👔" to necktie,
      "👕" to shirt,
      "👖" to jeans,
      "🧣" to scarf,
      "🧤" to gloves,
      "🧥" to coat,
      "🧦" to socks,
      "👗" to dress,
      "👘" to kimono,
      "🥻" to sari,
      "🩱" to onePieceSwimsuit,
      "🩲" to swimBrief,
      "🩳" to shorts,
      "👙" to bikini,
      "👚" to womansClothes,
      "🪭" to foldingHandFan,
      "👛" to purse,
      "👜" to handbag,
      "👝" to pouch,
      "🛍️" to shopping,
      "🎒" to schoolSatchel,
      "🩴" to thongSandal,
      "👞" to mansShoe,
      "👟" to athleticShoe,
      "🥾" to hikingBoot,
      "🥿" to flatShoe,
      "👠" to highHeel,
      "👡" to sandal,
      "🩰" to balletShoes,
      "👢" to boot,
      "🪮" to hairPick,
      "👑" to crown,
      "👒" to womansHat,
      "🎩" to tophat,
      "🎓" to mortarBoard,
      "🧢" to billedCap,
      "🪖" to militaryHelmet,
      "⛑️" to rescueWorkerHelmet,
      "📿" to prayerBeads,
      "💄" to lipstick,
      "💍" to ring,
      "💎" to gem,
      "🔇" to mute,
      "🔈" to speaker,
      "🔉" to sound,
      "🔊" to loudSound,
      "📢" to loudspeaker,
      "📣" to mega,
      "📯" to postalHorn,
      "🔔" to bell,
      "🔕" to noBell,
      "🎼" to musicalScore,
      "🎵" to musicalNote,
      "🎶" to notes,
      "🎙️" to studioMicrophone,
      "🎚️" to levelSlider,
      "🎛️" to controlKnobs,
      "🎤" to microphone,
      "🎧" to headphones,
      "📻" to radio,
      "🎷" to saxophone,
      "🪗" to accordion,
      "🎸" to guitar,
      "🎹" to musicalKeyboard,
      "🎺" to trumpet,
      "🎻" to violin,
      "🪕" to banjo,
      "🥁" to drum,
      "🪘" to longDrum,
      "🪇" to maracas,
      "🪈" to flute,
      "📱" to iphone,
      "📲" to calling,
      "☎️" to phone,
      "📞" to telephoneReceiver,
      "📟" to pager,
      "📠" to fax,
      "🔋" to battery,
      "🪫" to lowBattery,
      "🔌" to electricPlug,
      "💻" to computer,
      "🖥️" to desktopComputer,
      "🖨️" to printer,
      "⌨️" to keyboard,
      "🖱️" to computerMouse,
      "🖲️" to trackball,
      "💽" to minidisc,
      "💾" to floppyDisk,
      "💿" to cd,
      "📀" to dvd,
      "🧮" to abacus,
      "🎥" to movieCamera,
      "🎞️" to filmStrip,
      "📽️" to filmProjector,
      "🎬" to clapper,
      "📺" to tv,
      "📷" to camera,
      "📸" to cameraFlash,
      "📹" to videoCamera,
      "📼" to vhs,
      "🔍" to mag,
      "🔎" to magRight,
      "🕯️" to candle,
      "💡" to bulb,
      "🔦" to flashlight,
      "🏮" to izakayaLantern,
      "🪔" to diyaLamp,
      "📔" to notebookWithDecorativeCover,
      "📕" to closedBook,
      "📖" to book,
      "📗" to greenBook,
      "📘" to blueBook,
      "📙" to orangeBook,
      "📚" to books,
      "📓" to notebook,
      "📒" to ledger,
      "📃" to pageWithCurl,
      "📜" to scroll,
      "📄" to pageFacingUp,
      "📰" to newspaper,
      "🗞️" to newspaperRoll,
      "📑" to bookmarkTabs,
      "🔖" to bookmark,
      "🏷️" to label,
      "💰" to moneybag,
      "🪙" to coin,
      "💴" to yen,
      "💵" to dollar,
      "💶" to euro,
      "💷" to pound,
      "💸" to moneyWithWings,
      "💳" to creditCard,
      "🧾" to receipt,
      "💹" to chart,
      "✉️" to envelope,
      "📧" to email,
      "📨" to incomingEnvelope,
      "📩" to envelopeWithArrow,
      "📤" to outboxTray,
      "📥" to inboxTray,
      "📦" to `package`,
      "📫" to mailbox,
      "📪" to mailboxClosed,
      "📬" to mailboxWithMail,
      "📭" to mailboxWithNoMail,
      "📮" to postbox,
      "🗳️" to ballotBox,
      "✏️" to pencil2,
      "✒️" to blackNib,
      "🖋️" to fountainPen,
      "🖊️" to pen,
      "🖌️" to paintbrush,
      "🖍️" to crayon,
      "📝" to memo,
      "💼" to briefcase,
      "📁" to fileFolder,
      "📂" to openFileFolder,
      "🗂️" to cardIndexDividers,
      "📅" to date,
      "📆" to calendar,
      "🗒️" to spiralNotepad,
      "🗓️" to spiralCalendar,
      "📇" to cardIndex,
      "📈" to chartWithUpwardsTrend,
      "📉" to chartWithDownwardsTrend,
      "📊" to barChart,
      "📋" to clipboard,
      "📌" to pushpin,
      "📍" to roundPushpin,
      "📎" to paperclip,
      "🖇️" to paperclips,
      "📏" to straightRuler,
      "📐" to triangularRuler,
      "✂️" to scissors,
      "🗃️" to cardFileBox,
      "🗄️" to fileCabinet,
      "🗑️" to wastebasket,
      "🔒" to lock,
      "🔓" to unlock,
      "🔏" to lockWithInkPen,
      "🔐" to closedLockWithKey,
      "🔑" to key,
      "🗝️" to oldKey,
      "🔨" to hammer,
      "🪓" to axe,
      "⛏️" to pick,
      "⚒️" to hammerAndPick,
      "🛠️" to hammerAndWrench,
      "🗡️" to dagger,
      "⚔️" to crossedSwords,
      "💣" to bomb,
      "🪃" to boomerang,
      "🏹" to bowAndArrow,
      "🛡️" to shield,
      "🪚" to carpentrySaw,
      "🔧" to wrench,
      "🪛" to screwdriver,
      "🔩" to nutAndBolt,
      "⚙️" to gear,
      "🗜️" to clamp,
      "⚖️" to balanceScale,
      "🦯" to probingCane,
      "🔗" to link,
      "⛓️" to chains,
      "🪝" to hook,
      "🧰" to toolbox,
      "🧲" to magnet,
      "🪜" to ladder,
      "⚗️" to alembic,
      "🧪" to testTube,
      "🧫" to petriDish,
      "🧬" to dna,
      "🔬" to microscope,
      "🔭" to telescope,
      "📡" to satellite,
      "💉" to syringe,
      "🩸" to dropOfBlood,
      "💊" to pill,
      "🩹" to adhesiveBandage,
      "🩼" to crutch,
      "🩺" to stethoscope,
      "🩻" to xRay,
      "🚪" to door,
      "🛗" to elevator,
      "🪞" to mirror,
      "🪟" to window,
      "🛏️" to bed,
      "🛋️" to couchAndLamp,
      "🪑" to chair,
      "🚽" to toilet,
      "🪠" to plunger,
      "🚿" to shower,
      "🛁" to bathtub,
      "🪤" to mouseTrap,
      "🪒" to razor,
      "🧴" to lotionBottle,
      "🧷" to safetyPin,
      "🧹" to broom,
      "🧺" to basket,
      "🧻" to rollOfPaper,
      "🪣" to bucket,
      "🧼" to soap,
      "🫧" to bubbles,
      "🪥" to toothbrush,
      "🧽" to sponge,
      "🧯" to fireExtinguisher,
      "🛒" to shoppingCart,
      "🚬" to smoking,
      "⚰️" to coffin,
      "🪦" to headstone,
      "⚱️" to funeralUrn,
      "🧿" to nazarAmulet,
      "🪬" to hamsa,
      "🗿" to moyai,
      "🪧" to placard,
      "🪪" to identificationCard,
      "🏧" to atm,
      "🚮" to putLitterInItsPlace,
      "🚰" to potableWater,
      "♿" to wheelchair,
      "🚹" to mens,
      "🚺" to womens,
      "🚻" to restroom,
      "🚼" to babySymbol,
      "🚾" to wc,
      "🛂" to passportControl,
      "🛃" to customs,
      "🛄" to baggageClaim,
      "🛅" to leftLuggage,
      "⚠️" to warning,
      "🚸" to childrenCrossing,
      "⛔" to noEntry,
      "🚫" to noEntrySign,
      "🚳" to noBicycles,
      "🚭" to noSmoking,
      "🚯" to doNotLitter,
      "🚱" to `non-potableWater`,
      "🚷" to noPedestrians,
      "📵" to noMobilePhones,
      "🔞" to underage,
      "☢️" to radioactive,
      "☣️" to biohazard,
      "⬆️" to arrowUp,
      "↗️" to arrowUpperRight,
      "➡️" to arrowRight,
      "↘️" to arrowLowerRight,
      "⬇️" to arrowDown,
      "↙️" to arrowLowerLeft,
      "⬅️" to arrowLeft,
      "↖️" to arrowUpperLeft,
      "↕️" to arrowUpDown,
      "↔️" to leftRightArrow,
      "↩️" to leftwardsArrowWithHook,
      "↪️" to arrowRightHook,
      "⤴️" to arrowHeadingUp,
      "⤵️" to arrowHeadingDown,
      "🔃" to arrowsClockwise,
      "🔄" to arrowsCounterclockwise,
      "🔙" to back,
      "🔚" to end,
      "🔛" to on,
      "🔜" to soon,
      "🔝" to top,
      "🛐" to placeOfWorship,
      "⚛️" to atomSymbol,
      "🕉️" to om,
      "✡️" to starOfDavid,
      "☸️" to wheelOfDharma,
      "☯️" to yinYang,
      "✝️" to latinCross,
      "☦️" to orthodoxCross,
      "☪️" to starAndCrescent,
      "☮️" to peaceSymbol,
      "🕎" to menorah,
      "🔯" to sixPointedStar,
      "🪯" to khanda,
      "♈" to aries,
      "♉" to taurus,
      "♊" to gemini,
      "♋" to cancer,
      "♌" to leo,
      "♍" to virgo,
      "♎" to libra,
      "♏" to scorpius,
      "♐" to sagittarius,
      "♑" to capricorn,
      "♒" to aquarius,
      "♓" to pisces,
      "⛎" to ophiuchus,
      "🔀" to twistedRightwardsArrows,
      "🔁" to repeat,
      "🔂" to repeatOne,
      "▶️" to arrowForward,
      "⏩" to fastForward,
      "⏭️" to nextTrackButton,
      "⏯️" to playOrPauseButton,
      "◀️" to arrowBackward,
      "⏪" to rewind,
      "⏮️" to previousTrackButton,
      "🔼" to arrowUpSmall,
      "⏫" to arrowDoubleUp,
      "🔽" to arrowDownSmall,
      "⏬" to arrowDoubleDown,
      "⏸️" to pauseButton,
      "⏹️" to stopButton,
      "⏺️" to recordButton,
      "⏏️" to ejectButton,
      "🎦" to cinema,
      "🔅" to lowBrightness,
      "🔆" to highBrightness,
      "📶" to signalStrength,
      "🛜" to wireless,
      "📳" to vibrationMode,
      "📴" to mobilePhoneOff,
      "♀️" to femaleSign,
      "♂️" to maleSign,
      "⚧️" to transgenderSymbol,
      "✖️" to heavyMultiplicationX,
      "➕" to heavyPlusSign,
      "➖" to heavyMinusSign,
      "➗" to heavyDivisionSign,
      "🟰" to heavyEqualsSign,
      "♾️" to infinity,
      "‼️" to bangbang,
      "⁉️" to interrobang,
      "❓" to question,
      "❔" to greyQuestion,
      "❕" to greyExclamation,
      "❗" to exclamation,
      "〰️" to wavyDash,
      "💱" to currencyExchange,
      "💲" to heavyDollarSign,
      "⚕️" to medicalSymbol,
      "♻️" to recycle,
      "⚜️" to fleurDeLis,
      "🔱" to trident,
      "📛" to nameBadge,
      "🔰" to beginner,
      "⭕" to o,
      "✅" to whiteCheckMark,
      "☑️" to ballotBoxWithCheck,
      "✔️" to heavyCheckMark,
      "❌" to x,
      "❎" to negativeSquaredCrossMark,
      "➰" to curlyLoop,
      "➿" to loop,
      "〽️" to partAlternationMark,
      "✳️" to eightSpokedAsterisk,
      "✴️" to eightPointedBlackStar,
      "❇️" to sparkle,
      "©️" to copyright,
      "®️" to registered,
      "™️" to tm,
      "#️⃣" to hash,
      "*️⃣" to asterisk,
      "0️⃣" to zero,
      "1️⃣" to one,
      "2️⃣" to two,
      "3️⃣" to three,
      "4️⃣" to four,
      "5️⃣" to five,
      "6️⃣" to six,
      "7️⃣" to seven,
      "8️⃣" to eight,
      "9️⃣" to nine,
      "🔟" to keycapTen,
      "🔠" to capitalAbcd,
      "🔡" to abcd,
      "🔢" to `1234`,
      "🔣" to symbols,
      "🔤" to abc,
      "🅰️" to a,
      "🆎" to ab,
      "🅱️" to b,
      "🆑" to cl,
      "🆒" to cool,
      "🆓" to free,
      "ℹ️" to informationSource,
      "🆔" to id,
      "Ⓜ️" to m,
      "🆕" to new,
      "🆖" to ng,
      "🅾️" to o2,
      "🆗" to ok,
      "🅿️" to parking,
      "🆘" to sos,
      "🆙" to up,
      "🆚" to vs,
      "🈁" to koko,
      "🈂️" to sa,
      "🈷️" to u6708,
      "🈶" to u6709,
      "🈯" to u6307,
      "🉐" to ideographAdvantage,
      "🈹" to u5272,
      "🈚" to u7121,
      "🈲" to u7981,
      "🉑" to accept,
      "🈸" to u7533,
      "🈴" to u5408,
      "🈳" to u7a7a,
      "㊗️" to congratulations,
      "㊙️" to secret,
      "🈺" to u55b6,
      "🈵" to u6e80,
      "🔴" to redCircle,
      "🟠" to orangeCircle,
      "🟡" to yellowCircle,
      "🟢" to greenCircle,
      "🔵" to largeBlueCircle,
      "🟣" to purpleCircle,
      "🟤" to brownCircle,
      "⚫" to blackCircle,
      "⚪" to whiteCircle,
      "🟥" to redSquare,
      "🟧" to orangeSquare,
      "🟨" to yellowSquare,
      "🟩" to greenSquare,
      "🟦" to blueSquare,
      "🟪" to purpleSquare,
      "🟫" to brownSquare,
      "⬛" to blackLargeSquare,
      "⬜" to whiteLargeSquare,
      "◼️" to blackMediumSquare,
      "◻️" to whiteMediumSquare,
      "◾" to blackMediumSmallSquare,
      "◽" to whiteMediumSmallSquare,
      "▪️" to blackSmallSquare,
      "▫️" to whiteSmallSquare,
      "🔶" to largeOrangeDiamond,
      "🔷" to largeBlueDiamond,
      "🔸" to smallOrangeDiamond,
      "🔹" to smallBlueDiamond,
      "🔺" to smallRedTriangle,
      "🔻" to smallRedTriangleDown,
      "💠" to diamondShapeWithADotInside,
      "🔘" to radioButton,
      "🔳" to whiteSquareButton,
      "🔲" to blackSquareButton,
      "🏁" to checkeredFlag,
      "🚩" to triangularFlagOnPost,
      "🎌" to crossedFlags,
      "🏴" to blackFlag,
      "🏳️" to whiteFlag,
      "🏳️‍🌈" to rainbowFlag,
      "🏳️‍⚧️" to transgenderFlag,
      "🏴‍☠️" to pirateFlag,
      "🇦🇨" to ascensionIsland,
      "🇦🇩" to andorra,
      "🇦🇪" to unitedArabEmirates,
      "🇦🇫" to afghanistan,
      "🇦🇬" to antiguaBarbuda,
      "🇦🇮" to anguilla,
      "🇦🇱" to albania,
      "🇦🇲" to armenia,
      "🇦🇴" to angola,
      "🇦🇶" to antarctica,
      "🇦🇷" to argentina,
      "🇦🇸" to americanSamoa,
      "🇦🇹" to austria,
      "🇦🇺" to australia,
      "🇦🇼" to aruba,
      "🇦🇽" to alandIslands,
      "🇦🇿" to azerbaijan,
      "🇧🇦" to bosniaHerzegovina,
      "🇧🇧" to barbados,
      "🇧🇩" to bangladesh,
      "🇧🇪" to belgium,
      "🇧🇫" to burkinaFaso,
      "🇧🇬" to bulgaria,
      "🇧🇭" to bahrain,
      "🇧🇮" to burundi,
      "🇧🇯" to benin,
      "🇧🇱" to stBarthelemy,
      "🇧🇲" to bermuda,
      "🇧🇳" to brunei,
      "🇧🇴" to bolivia,
      "🇧🇶" to caribbeanNetherlands,
      "🇧🇷" to brazil,
      "🇧🇸" to bahamas,
      "🇧🇹" to bhutan,
      "🇧🇻" to bouvetIsland,
      "🇧🇼" to botswana,
      "🇧🇾" to belarus,
      "🇧🇿" to belize,
      "🇨🇦" to canada,
      "🇨🇨" to cocosIslands,
      "🇨🇩" to congoKinshasa,
      "🇨🇫" to centralAfricanRepublic,
      "🇨🇬" to congoBrazzaville,
      "🇨🇭" to switzerland,
      "🇨🇮" to coteDivoire,
      "🇨🇰" to cookIslands,
      "🇨🇱" to chile,
      "🇨🇲" to cameroon,
      "🇨🇳" to cn,
      "🇨🇴" to colombia,
      "🇨🇵" to clippertonIsland,
      "🇨🇷" to costaRica,
      "🇨🇺" to cuba,
      "🇨🇻" to capeVerde,
      "🇨🇼" to curacao,
      "🇨🇽" to christmasIsland,
      "🇨🇾" to cyprus,
      "🇨🇿" to czechRepublic,
      "🇩🇪" to de,
      "🇩🇬" to diegoGarcia,
      "🇩🇯" to djibouti,
      "🇩🇰" to denmark,
      "🇩🇲" to dominica,
      "🇩🇴" to dominicanRepublic,
      "🇩🇿" to algeria,
      "🇪🇦" to ceutaMelilla,
      "🇪🇨" to ecuador,
      "🇪🇪" to estonia,
      "🇪🇬" to egypt,
      "🇪🇭" to westernSahara,
      "🇪🇷" to eritrea,
      "🇪🇸" to es,
      "🇪🇹" to ethiopia,
      "🇪🇺" to eu,
      "🇫🇮" to finland,
      "🇫🇯" to fiji,
      "🇫🇰" to falklandIslands,
      "🇫🇲" to micronesia,
      "🇫🇴" to faroeIslands,
      "🇫🇷" to fr,
      "🇬🇦" to gabon,
      "🇬🇧" to gb,
      "🇬🇩" to grenada,
      "🇬🇪" to georgia,
      "🇬🇫" to frenchGuiana,
      "🇬🇬" to guernsey,
      "🇬🇭" to ghana,
      "🇬🇮" to gibraltar,
      "🇬🇱" to greenland,
      "🇬🇲" to gambia,
      "🇬🇳" to guinea,
      "🇬🇵" to guadeloupe,
      "🇬🇶" to equatorialGuinea,
      "🇬🇷" to greece,
      "🇬🇸" to southGeorgiaSouthSandwichIslands,
      "🇬🇹" to guatemala,
      "🇬🇺" to guam,
      "🇬🇼" to guineaBissau,
      "🇬🇾" to guyana,
      "🇭🇰" to hongKong,
      "🇭🇲" to heardMcdonaldIslands,
      "🇭🇳" to honduras,
      "🇭🇷" to croatia,
      "🇭🇹" to haiti,
      "🇭🇺" to hungary,
      "🇮🇨" to canaryIslands,
      "🇮🇩" to indonesia,
      "🇮🇪" to ireland,
      "🇮🇱" to israel,
      "🇮🇲" to isleOfMan,
      "🇮🇳" to india,
      "🇮🇴" to britishIndianOceanTerritory,
      "🇮🇶" to iraq,
      "🇮🇷" to iran,
      "🇮🇸" to iceland,
      "🇮🇹" to it,
      "🇯🇪" to jersey,
      "🇯🇲" to jamaica,
      "🇯🇴" to jordan,
      "🇯🇵" to jp,
      "🇰🇪" to kenya,
      "🇰🇬" to kyrgyzstan,
      "🇰🇭" to cambodia,
      "🇰🇮" to kiribati,
      "🇰🇲" to comoros,
      "🇰🇳" to stKittsNevis,
      "🇰🇵" to northKorea,
      "🇰🇷" to kr,
      "🇰🇼" to kuwait,
      "🇰🇾" to caymanIslands,
      "🇰🇿" to kazakhstan,
      "🇱🇦" to laos,
      "🇱🇧" to lebanon,
      "🇱🇨" to stLucia,
      "🇱🇮" to liechtenstein,
      "🇱🇰" to sriLanka,
      "🇱🇷" to liberia,
      "🇱🇸" to lesotho,
      "🇱🇹" to lithuania,
      "🇱🇺" to luxembourg,
      "🇱🇻" to latvia,
      "🇱🇾" to libya,
      "🇲🇦" to morocco,
      "🇲🇨" to monaco,
      "🇲🇩" to moldova,
      "🇲🇪" to montenegro,
      "🇲🇫" to stMartin,
      "🇲🇬" to madagascar,
      "🇲🇭" to marshallIslands,
      "🇲🇰" to macedonia,
      "🇲🇱" to mali,
      "🇲🇲" to myanmar,
      "🇲🇳" to mongolia,
      "🇲🇴" to macau,
      "🇲🇵" to northernMarianaIslands,
      "🇲🇶" to martinique,
      "🇲🇷" to mauritania,
      "🇲🇸" to montserrat,
      "🇲🇹" to malta,
      "🇲🇺" to mauritius,
      "🇲🇻" to maldives,
      "🇲🇼" to malawi,
      "🇲🇽" to mexico,
      "🇲🇾" to malaysia,
      "🇲🇿" to mozambique,
      "🇳🇦" to namibia,
      "🇳🇨" to newCaledonia,
      "🇳🇪" to niger,
      "🇳🇫" to norfolkIsland,
      "🇳🇬" to nigeria,
      "🇳🇮" to nicaragua,
      "🇳🇱" to netherlands,
      "🇳🇴" to norway,
      "🇳🇵" to nepal,
      "🇳🇷" to nauru,
      "🇳🇺" to niue,
      "🇳🇿" to newZealand,
      "🇴🇲" to oman,
      "🇵🇦" to panama,
      "🇵🇪" to peru,
      "🇵🇫" to frenchPolynesia,
      "🇵🇬" to papuaNewGuinea,
      "🇵🇭" to philippines,
      "🇵🇰" to pakistan,
      "🇵🇱" to poland,
      "🇵🇲" to stPierreMiquelon,
      "🇵🇳" to pitcairnIslands,
      "🇵🇷" to puertoRico,
      "🇵🇸" to palestinianTerritories,
      "🇵🇹" to portugal,
      "🇵🇼" to palau,
      "🇵🇾" to paraguay,
      "🇶🇦" to qatar,
      "🇷🇪" to reunion,
      "🇷🇴" to romania,
      "🇷🇸" to serbia,
      "🇷🇺" to ru,
      "🇷🇼" to rwanda,
      "🇸🇦" to saudiArabia,
      "🇸🇧" to solomonIslands,
      "🇸🇨" to seychelles,
      "🇸🇩" to sudan,
      "🇸🇪" to sweden,
      "🇸🇬" to singapore,
      "🇸🇭" to stHelena,
      "🇸🇮" to slovenia,
      "🇸🇯" to svalbardJanMayen,
      "🇸🇰" to slovakia,
      "🇸🇱" to sierraLeone,
      "🇸🇲" to sanMarino,
      "🇸🇳" to senegal,
      "🇸🇴" to somalia,
      "🇸🇷" to suriname,
      "🇸🇸" to southSudan,
      "🇸🇹" to saoTomePrincipe,
      "🇸🇻" to elSalvador,
      "🇸🇽" to sintMaarten,
      "🇸🇾" to syria,
      "🇸🇿" to swaziland,
      "🇹🇦" to tristanDaCunha,
      "🇹🇨" to turksCaicosIslands,
      "🇹🇩" to chad,
      "🇹🇫" to frenchSouthernTerritories,
      "🇹🇬" to togo,
      "🇹🇭" to thailand,
      "🇹🇯" to tajikistan,
      "🇹🇰" to tokelau,
      "🇹🇱" to timorLeste,
      "🇹🇲" to turkmenistan,
      "🇹🇳" to tunisia,
      "🇹🇴" to tonga,
      "🇹🇷" to tr,
      "🇹🇹" to trinidadTobago,
      "🇹🇻" to tuvalu,
      "🇹🇼" to taiwan,
      "🇹🇿" to tanzania,
      "🇺🇦" to ukraine,
      "🇺🇬" to uganda,
      "🇺🇲" to usOutlyingIslands,
      "🇺🇳" to unitedNations,
      "🇺🇸" to us,
      "🇺🇾" to uruguay,
      "🇺🇿" to uzbekistan,
      "🇻🇦" to vaticanCity,
      "🇻🇨" to stVincentGrenadines,
      "🇻🇪" to venezuela,
      "🇻🇬" to britishVirginIslands,
      "🇻🇮" to usVirginIslands,
      "🇻🇳" to vietnam,
      "🇻🇺" to vanuatu,
      "🇼🇫" to wallisFutuna,
      "🇼🇸" to samoa,
      "🇽🇰" to kosovo,
      "🇾🇪" to yemen,
      "🇾🇹" to mayotte,
      "🇿🇦" to southAfrica,
      "🇿🇲" to zambia,
      "🇿🇼" to zimbabwe,
      "🏴󠁧󠁢󠁥󠁮󠁧󠁿" to england,
      "🏴󠁧󠁢󠁳󠁣󠁴󠁿" to scotland,
      "🏴󠁧󠁢󠁷󠁬󠁳󠁿" to wales)

  public val grinning: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😀")

  public val smiley: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😃")

  public val smile: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😄")

  public val grin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😁")

  public val laughing: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😆")

  public val satisfied: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😆")

  public val sweatSmile: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😅")

  public val rofl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤣")

  public val joy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😂")

  public val slightlySmilingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🙂")

  public val upsideDownFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🙃")

  public val meltingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫠")

  public val wink: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😉")

  public val blush: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😊")

  public val innocent: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😇")

  public val smilingFaceWithThreeHearts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥰")

  public val heartEyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😍")

  public val starStruck: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤩")

  public val kissingHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😘")

  public val kissing: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😗")

  public val relaxed: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☺️")

  public val kissingClosedEyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😚")

  public val kissingSmilingEyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😙")

  public val smilingFaceWithTear: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥲")

  public val yum: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😋")

  public val stuckOutTongue: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😛")

  public val stuckOutTongueWinkingEye: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😜")

  public val zanyFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤪")

  public val stuckOutTongueClosedEyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😝")

  public val moneyMouthFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤑")

  public val hugs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤗")

  public val handOverMouth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤭")

  public val faceWithOpenEyesAndHandOverMouth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫢")

  public val faceWithPeekingEye: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫣")

  public val shushingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤫")

  public val thinking: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤔")

  public val salutingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫡")

  public val zipperMouthFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤐")

  public val raisedEyebrow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤨")

  public val neutralFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😐")

  public val expressionless: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😑")

  public val noMouth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😶")

  public val dottedLineFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫥")

  public val faceInClouds: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😶‍🌫️")

  public val smirk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😏")

  public val unamused: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😒")

  public val rollEyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🙄")

  public val grimacing: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😬")

  public val faceExhaling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😮‍💨")

  public val lyingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤥")

  public val shakingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫨")

  public val relieved: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😌")

  public val pensive: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😔")

  public val sleepy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😪")

  public val droolingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤤")

  public val sleeping: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😴")

  public val mask: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😷")

  public val faceWithThermometer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤒")

  public val faceWithHeadBandage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤕")

  public val nauseatedFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤢")

  public val vomitingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤮")

  public val sneezingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤧")

  public val hotFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥵")

  public val coldFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥶")

  public val woozyFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥴")

  public val dizzyFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😵")

  public val faceWithSpiralEyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😵‍💫")

  public val explodingHead: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤯")

  public val cowboyHatFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤠")

  public val partyingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥳")

  public val disguisedFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥸")

  public val sunglasses: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😎")

  public val nerdFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤓")

  public val monocleFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧐")

  public val confused: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😕")

  public val faceWithDiagonalMouth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫤")

  public val worried: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😟")

  public val slightlyFrowningFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🙁")

  public val frowningFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☹️")

  public val openMouth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😮")

  public val hushed: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😯")

  public val astonished: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😲")

  public val flushed: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😳")

  public val pleadingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥺")

  public val faceHoldingBackTears: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥹")

  public val frowning: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😦")

  public val anguished: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😧")

  public val fearful: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😨")

  public val coldSweat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😰")

  public val disappointedRelieved: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😥")

  public val cry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😢")

  public val sob: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😭")

  public val scream: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😱")

  public val confounded: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😖")

  public val persevere: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😣")

  public val disappointed: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😞")

  public val sweat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😓")

  public val weary: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😩")

  public val tiredFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😫")

  public val yawningFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥱")

  public val triumph: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😤")

  public val rage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😡")

  public val pout: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😡")

  public val angry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😠")

  public val cursingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤬")

  public val smilingImp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😈")

  public val imp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👿")

  public val skull: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💀")

  public val skullAndCrossbones: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☠️")

  public val hankey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💩")

  public val poop: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💩")

  public val shit: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💩")

  public val clownFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤡")

  public val japaneseOgre: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👹")

  public val japaneseGoblin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👺")

  public val ghost: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👻")

  public val alien: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👽")

  public val spaceInvader: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👾")

  public val robot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤖")

  public val smileyCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😺")

  public val smileCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😸")

  public val joyCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😹")

  public val heartEyesCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😻")

  public val smirkCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😼")

  public val kissingCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😽")

  public val screamCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🙀")

  public val cryingCatFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😿")

  public val poutingCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😾")

  public val seeNoEvil: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🙈")

  public val hearNoEvil: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🙉")

  public val speakNoEvil: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🙊")

  public val loveLetter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💌")

  public val cupid: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💘")

  public val giftHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💝")

  public val sparklingHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💖")

  public val heartpulse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💗")

  public val heartbeat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💓")

  public val revolvingHearts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💞")

  public val twoHearts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💕")

  public val heartDecoration: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💟")

  public val heavyHeartExclamation: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❣️")

  public val brokenHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💔")

  public val heartOnFire: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❤️‍🔥")

  public val mendingHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❤️‍🩹")

  public val heart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❤️")

  public val pinkHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩷")

  public val orangeHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧡")

  public val yellowHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💛")

  public val greenHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💚")

  public val blueHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💙")

  public val lightBlueHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩵")

  public val purpleHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💜")

  public val brownHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤎")

  public val blackHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖤")

  public val greyHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩶")

  public val whiteHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤍")

  public val kiss: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💋")

  @JsName("_100")
  public val `100`: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💯")

  public val anger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💢")

  public val boom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💥")

  public val collision: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💥")

  public val dizzy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💫")

  public val sweatDrops: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💦")

  public val dash: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💨")

  public val hole: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕳️")

  public val speechBalloon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💬")

  public val eyeSpeechBubble: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👁️‍🗨️")

  public val leftSpeechBubble: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗨️")

  public val rightAngerBubble: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗯️")

  public val thoughtBalloon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💭")

  public val zzz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💤")

  public val wave: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👋")

  public val raisedBackOfHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤚")

  public val raisedHandWithFingersSplayed: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🖐️")

  public val hand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("✋")

  public val raisedHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("✋")

  public val vulcanSalute: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🖖")

  public val rightwardsHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🫱")

  public val leftwardsHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🫲")

  public val palmDownHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🫳")

  public val palmUpHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🫴")

  public val leftwardsPushingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🫷")

  public val rightwardsPushingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🫸")

  public val okHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👌")

  public val pinchedFingers: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤌")

  public val pinchingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤏")

  public val v: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("✌️")

  public val crossedFingers: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤞")

  public val handWithIndexFingerAndThumbCrossed: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🫰")

  public val loveYouGesture: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤟")

  public val metal: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤘")

  public val callMeHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤙")

  public val pointLeft: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👈")

  public val pointRight: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👉")

  public val pointUp2: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👆")

  public val middleFinger: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🖕")

  public val fu: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🖕")

  public val pointDown: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👇")

  public val pointUp: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("☝️")

  public val indexPointingAtTheViewer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🫵")

  @JsName("BHBd")
  public val `+1`: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👍")

  public val thumbsup: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👍")

  @JsName("BJBd")
  public val `-1`: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👎")

  public val thumbsdown: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👎")

  public val fistRaised: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("✊")

  public val fist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("✊")

  public val fistOncoming: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👊")

  public val facepunch: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👊")

  public val punch: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👊")

  public val fistLeft: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤛")

  public val fistRight: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤜")

  public val clap: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👏")

  public val raisedHands: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙌")

  public val heartHands: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🫶")

  public val openHands: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👐")

  public val palmsUpTogether: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤲")

  public val handshake: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤝")

  public val pray: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙏")

  public val writingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("✍️")

  public val nailCare: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💅")

  public val selfie: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤳")

  public val muscle: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💪")

  public val mechanicalArm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦾")

  public val mechanicalLeg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦿")

  public val leg: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🦵")

  public val foot: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🦶")

  public val ear: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👂")

  public val earWithHearingAid: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🦻")

  public val nose: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👃")

  public val brain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧠")

  public val anatomicalHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫀")

  public val lungs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫁")

  public val tooth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦷")

  public val bone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦴")

  public val eyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👀")

  public val eye: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👁️")

  public val tongue: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👅")

  public val lips: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👄")

  public val bitingLip: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫦")

  public val baby: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👶")

  public val child: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧒")

  public val boy: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👦")

  public val girl: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👧")

  public val adult: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑")

  public val blondHairedPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👱")

  public val man: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨")

  public val beardedPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧔")

  public val manBeard: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧔‍♂️")

  public val womanBeard: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧔‍♀️")

  public val redHairedMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🦰")

  public val curlyHairedMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🦱")

  public val whiteHairedMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🦳")

  public val baldMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🦲")

  public val woman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩")

  public val redHairedWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🦰")

  public val personRedHair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🦰")

  public val curlyHairedWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🦱")

  public val personCurlyHair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🦱")

  public val whiteHairedWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🦳")

  public val personWhiteHair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🦳")

  public val baldWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🦲")

  public val personBald: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🦲")

  public val blondHairedWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👱‍♀️")

  public val blondeWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👱‍♀️")

  public val blondHairedMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👱‍♂️")

  public val olderAdult: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧓")

  public val olderMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👴")

  public val olderWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👵")

  public val frowningPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙍")

  public val frowningMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙍‍♂️")

  public val frowningWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙍‍♀️")

  public val poutingFace: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙎")

  public val poutingMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙎‍♂️")

  public val poutingWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙎‍♀️")

  public val noGood: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙅")

  public val noGoodMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙅‍♂️")

  public val ngMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙅‍♂️")

  public val noGoodWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙅‍♀️")

  public val ngWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙅‍♀️")

  public val okPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙆")

  public val okMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙆‍♂️")

  public val okWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙆‍♀️")

  public val tippingHandPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💁")

  public val informationDeskPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💁")

  public val tippingHandMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💁‍♂️")

  public val sassyMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💁‍♂️")

  public val tippingHandWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💁‍♀️")

  public val sassyWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💁‍♀️")

  public val raisingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙋")

  public val raisingHandMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙋‍♂️")

  public val raisingHandWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙋‍♀️")

  public val deafPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧏")

  public val deafMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧏‍♂️")

  public val deafWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧏‍♀️")

  public val bow: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙇")

  public val bowingMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙇‍♂️")

  public val bowingWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙇‍♀️")

  public val facepalm: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤦")

  public val manFacepalming: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤦‍♂️")

  public val womanFacepalming: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤦‍♀️")

  public val shrug: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤷")

  public val manShrugging: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤷‍♂️")

  public val womanShrugging: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤷‍♀️")

  public val healthWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍⚕️")

  public val manHealthWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍⚕️")

  public val womanHealthWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍⚕️")

  public val student: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🎓")

  public val manStudent: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🎓")

  public val womanStudent: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🎓")

  public val teacher: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🏫")

  public val manTeacher: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🏫")

  public val womanTeacher: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🏫")

  public val judge: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍⚖️")

  public val manJudge: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍⚖️")

  public val womanJudge: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍⚖️")

  public val farmer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🌾")

  public val manFarmer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🌾")

  public val womanFarmer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🌾")

  public val cook: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🍳")

  public val manCook: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🍳")

  public val womanCook: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🍳")

  public val mechanic: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🔧")

  public val manMechanic: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🔧")

  public val womanMechanic: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🔧")

  public val factoryWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🏭")

  public val manFactoryWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🏭")

  public val womanFactoryWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🏭")

  public val officeWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍💼")

  public val manOfficeWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍💼")

  public val womanOfficeWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍💼")

  public val scientist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🔬")

  public val manScientist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🔬")

  public val womanScientist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🔬")

  public val technologist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍💻")

  public val manTechnologist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍💻")

  public val womanTechnologist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍💻")

  public val singer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🎤")

  public val manSinger: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🎤")

  public val womanSinger: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🎤")

  public val artist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🎨")

  public val manArtist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🎨")

  public val womanArtist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🎨")

  public val pilot: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍✈️")

  public val manPilot: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍✈️")

  public val womanPilot: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍✈️")

  public val astronaut: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🚀")

  public val manAstronaut: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🚀")

  public val womanAstronaut: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🚀")

  public val firefighter: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🚒")

  public val manFirefighter: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🚒")

  public val womanFirefighter: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🚒")

  public val policeOfficer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👮")

  public val cop: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👮")

  public val policeman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👮‍♂️")

  public val policewoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👮‍♀️")

  public val detective: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🕵️")

  public val maleDetective: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🕵️‍♂️")

  public val femaleDetective: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🕵️‍♀️")

  public val guard: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💂")

  public val guardsman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💂‍♂️")

  public val guardswoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💂‍♀️")

  public val ninja: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🥷")

  public val constructionWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👷")

  public val constructionWorkerMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👷‍♂️")

  public val constructionWorkerWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👷‍♀️")

  public val personWithCrown: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🫅")

  public val prince: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤴")

  public val princess: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👸")

  public val personWithTurban: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👳")

  public val manWithTurban: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👳‍♂️")

  public val womanWithTurban: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👳‍♀️")

  public val manWithGuaPiMao: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👲")

  public val womanWithHeadscarf: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧕")

  public val personInTuxedo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤵")

  public val manInTuxedo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤵‍♂️")

  public val womanInTuxedo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤵‍♀️")

  public val personWithVeil: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👰")

  public val manWithVeil: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👰‍♂️")

  public val womanWithVeil: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👰‍♀️")

  public val brideWithVeil: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👰‍♀️")

  public val pregnantWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤰")

  public val pregnantMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🫃")

  public val pregnantPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🫄")

  public val breastFeeding: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤱")

  public val womanFeedingBaby: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🍼")

  public val manFeedingBaby: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🍼")

  public val personFeedingBaby: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🍼")

  public val angel: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👼")

  public val santa: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🎅")

  public val mrsClaus: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤶")

  public val mxClaus: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🎄")

  public val superhero: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🦸")

  public val superheroMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🦸‍♂️")

  public val superheroWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🦸‍♀️")

  public val supervillain: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🦹")

  public val supervillainMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🦹‍♂️")

  public val supervillainWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🦹‍♀️")

  public val mage: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧙")

  public val mageMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧙‍♂️")

  public val mageWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧙‍♀️")

  public val fairy: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧚")

  public val fairyMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧚‍♂️")

  public val fairyWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧚‍♀️")

  public val vampire: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧛")

  public val vampireMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧛‍♂️")

  public val vampireWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧛‍♀️")

  public val merperson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧜")

  public val merman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧜‍♂️")

  public val mermaid: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧜‍♀️")

  public val elf: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧝")

  public val elfMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧝‍♂️")

  public val elfWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧝‍♀️")

  public val genie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧞")

  public val genieMan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧞‍♂️")

  public val genieWoman: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧞‍♀️")

  public val zombie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧟")

  public val zombieMan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧟‍♂️")

  public val zombieWoman: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧟‍♀️")

  public val troll: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧌")

  public val massage: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💆")

  public val massageMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💆‍♂️")

  public val massageWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💆‍♀️")

  public val haircut: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💇")

  public val haircutMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💇‍♂️")

  public val haircutWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💇‍♀️")

  public val walking: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚶")

  public val walkingMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚶‍♂️")

  public val walkingWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚶‍♀️")

  public val standingPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧍")

  public val standingMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧍‍♂️")

  public val standingWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧍‍♀️")

  public val kneelingPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧎")

  public val kneelingMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧎‍♂️")

  public val kneelingWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧎‍♀️")

  public val personWithProbingCane: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🦯")

  public val manWithProbingCane: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🦯")

  public val womanWithProbingCane: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🦯")

  public val personInMotorizedWheelchair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🦼")

  public val manInMotorizedWheelchair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🦼")

  public val womanInMotorizedWheelchair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🦼")

  public val personInManualWheelchair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🦽")

  public val manInManualWheelchair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🦽")

  public val womanInManualWheelchair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🦽")

  public val runner: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏃")

  public val running: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏃")

  public val runningMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏃‍♂️")

  public val runningWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏃‍♀️")

  public val womanDancing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💃")

  public val dancer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💃")

  public val manDancing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🕺")

  public val businessSuitLevitating: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🕴️")

  public val dancers: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👯")

  public val dancingMen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👯‍♂️")

  public val dancingWomen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👯‍♀️")

  public val saunaPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧖")

  public val saunaMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧖‍♂️")

  public val saunaWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧖‍♀️")

  public val climbing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧗")

  public val climbingMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧗‍♂️")

  public val climbingWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧗‍♀️")

  public val personFencing: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤺")

  public val horseRacing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏇")

  public val skier: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛷️")

  public val snowboarder: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏂")

  public val golfing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏌️")

  public val golfingMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏌️‍♂️")

  public val golfingWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏌️‍♀️")

  public val surfer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏄")

  public val surfingMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏄‍♂️")

  public val surfingWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏄‍♀️")

  public val rowboat: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚣")

  public val rowingMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚣‍♂️")

  public val rowingWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚣‍♀️")

  public val swimmer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏊")

  public val swimmingMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏊‍♂️")

  public val swimmingWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏊‍♀️")

  public val bouncingBallPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("⛹️")

  public val bouncingBallMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("⛹️‍♂️")

  public val basketballMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("⛹️‍♂️")

  public val bouncingBallWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("⛹️‍♀️")

  public val basketballWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("⛹️‍♀️")

  public val weightLifting: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏋️")

  public val weightLiftingMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏋️‍♂️")

  public val weightLiftingWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏋️‍♀️")

  public val bicyclist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚴")

  public val bikingMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚴‍♂️")

  public val bikingWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚴‍♀️")

  public val mountainBicyclist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚵")

  public val mountainBikingMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚵‍♂️")

  public val mountainBikingWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚵‍♀️")

  public val cartwheeling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤸")

  public val manCartwheeling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤸‍♂️")

  public val womanCartwheeling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤸‍♀️")

  public val wrestling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤼")

  public val menWrestling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤼‍♂️")

  public val womenWrestling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤼‍♀️")

  public val waterPolo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤽")

  public val manPlayingWaterPolo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤽‍♂️")

  public val womanPlayingWaterPolo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤽‍♀️")

  public val handballPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤾")

  public val manPlayingHandball: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤾‍♂️")

  public val womanPlayingHandball: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤾‍♀️")

  public val jugglingPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤹")

  public val manJuggling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤹‍♂️")

  public val womanJuggling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤹‍♀️")

  public val lotusPosition: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧘")

  public val lotusPositionMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧘‍♂️")

  public val lotusPositionWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧘‍♀️")

  public val bath: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🛀")

  public val sleepingBed: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🛌")

  public val peopleHoldingHands: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🤝‍🧑")

  public val twoWomenHoldingHands: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👭")

  public val couple: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👫")

  public val twoMenHoldingHands: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👬")

  public val couplekiss: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💏")

  public val couplekissManWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍❤️‍💋‍👨")

  public val couplekissManMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍❤️‍💋‍👨")

  public val couplekissWomanWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍❤️‍💋‍👩")

  public val coupleWithHeart: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💑")

  public val coupleWithHeartWomanMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍❤️‍👨")

  public val coupleWithHeartManMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍❤️‍👨")

  public val coupleWithHeartWomanWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍❤️‍👩")

  public val family: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👪")

  public val familyManWomanBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👩‍👦")

  public val familyManWomanGirl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👩‍👧")

  public val familyManWomanGirlBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👩‍👧‍👦")

  public val familyManWomanBoyBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👩‍👦‍👦")

  public val familyManWomanGirlGirl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👩‍👧‍👧")

  public val familyManManBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👨‍👦")

  public val familyManManGirl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👨‍👧")

  public val familyManManGirlBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👨‍👧‍👦")

  public val familyManManBoyBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👨‍👦‍👦")

  public val familyManManGirlGirl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👨‍👧‍👧")

  public val familyWomanWomanBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍👩‍👦")

  public val familyWomanWomanGirl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍👩‍👧")

  public val familyWomanWomanGirlBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍👩‍👧‍👦")

  public val familyWomanWomanBoyBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍👩‍👦‍👦")

  public val familyWomanWomanGirlGirl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍👩‍👧‍👧")

  public val familyManBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👦")

  public val familyManBoyBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👦‍👦")

  public val familyManGirl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👧")

  public val familyManGirlBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👧‍👦")

  public val familyManGirlGirl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👧‍👧")

  public val familyWomanBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍👦")

  public val familyWomanBoyBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍👦‍👦")

  public val familyWomanGirl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍👧")

  public val familyWomanGirlBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍👧‍👦")

  public val familyWomanGirlGirl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍👧‍👧")

  public val speakingHead: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗣️")

  public val bustInSilhouette: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👤")

  public val bustsInSilhouette: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👥")

  public val peopleHugging: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫂")

  public val footprints: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👣")

  public val monkeyFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐵")

  public val monkey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐒")

  public val gorilla: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦍")

  public val orangutan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦧")

  public val dog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐶")

  public val dog2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐕")

  public val guideDog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦮")

  public val serviceDog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐕‍🦺")

  public val poodle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐩")

  public val wolf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐺")

  public val foxFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦊")

  public val raccoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦝")

  public val cat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐱")

  public val cat2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐈")

  public val blackCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐈‍⬛")

  public val lion: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦁")

  public val tiger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐯")

  public val tiger2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐅")

  public val leopard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐆")

  public val horse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐴")

  public val moose: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫎")

  public val donkey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫏")

  public val racehorse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐎")

  public val unicorn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦄")

  public val zebra: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦓")

  public val deer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦌")

  public val bison: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦬")

  public val cow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐮")

  public val ox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐂")

  public val waterBuffalo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐃")

  public val cow2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐄")

  public val pig: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐷")

  public val pig2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐖")

  public val boar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐗")

  public val pigNose: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐽")

  public val ram: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐏")

  public val sheep: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐑")

  public val goat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐐")

  public val dromedaryCamel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐪")

  public val camel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐫")

  public val llama: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦙")

  public val giraffe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦒")

  public val elephant: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐘")

  public val mammoth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦣")

  public val rhinoceros: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦏")

  public val hippopotamus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦛")

  public val mouse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐭")

  public val mouse2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐁")

  public val rat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐀")

  public val hamster: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐹")

  public val rabbit: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐰")

  public val rabbit2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐇")

  public val chipmunk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐿️")

  public val beaver: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦫")

  public val hedgehog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦔")

  public val bat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦇")

  public val bear: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐻")

  public val polarBear: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐻‍❄️")

  public val koala: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐨")

  public val pandaFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐼")

  public val sloth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦥")

  public val otter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦦")

  public val skunk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦨")

  public val kangaroo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦘")

  public val badger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦡")

  public val feet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐾")

  public val pawPrints: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐾")

  public val turkey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦃")

  public val chicken: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐔")

  public val rooster: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐓")

  public val hatchingChick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐣")

  public val babyChick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐤")

  public val hatchedChick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐥")

  public val bird: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐦")

  public val penguin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐧")

  public val dove: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕊️")

  public val eagle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦅")

  public val duck: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦆")

  public val swan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦢")

  public val owl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦉")

  public val dodo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦤")

  public val feather: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪶")

  public val flamingo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦩")

  public val peacock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦚")

  public val parrot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦜")

  public val wing: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪽")

  public val blackBird: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐦‍⬛")

  public val goose: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪿")

  public val frog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐸")

  public val crocodile: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐊")

  public val turtle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐢")

  public val lizard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦎")

  public val snake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐍")

  public val dragonFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐲")

  public val dragon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐉")

  public val sauropod: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦕")

  @JsName("DIBJDGCtDc")
  public val `t-rex`: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦖")

  public val whale: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐳")

  public val whale2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐋")

  public val dolphin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐬")

  public val flipper: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐬")

  public val seal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦭")

  public val fish: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐟")

  public val tropicalFish: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐠")

  public val blowfish: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐡")

  public val shark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦈")

  public val octopus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐙")

  public val shell: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐚")

  public val coral: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪸")

  public val jellyfish: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪼")

  public val snail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐌")

  public val butterfly: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦋")

  public val bug: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐛")

  public val ant: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐜")

  public val bee: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐝")

  public val honeybee: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐝")

  public val beetle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪲")

  public val ladyBeetle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐞")

  public val cricket: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦗")

  public val cockroach: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪳")

  public val spider: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕷️")

  public val spiderWeb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕸️")

  public val scorpion: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦂")

  public val mosquito: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦟")

  public val fly: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪰")

  public val worm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪱")

  public val microbe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦠")

  public val bouquet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💐")

  public val cherryBlossom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌸")

  public val whiteFlower: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💮")

  public val lotus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪷")

  public val rosette: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏵️")

  public val rose: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌹")

  public val wiltedFlower: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥀")

  public val hibiscus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌺")

  public val sunflower: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌻")

  public val blossom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌼")

  public val tulip: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌷")

  public val hyacinth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪻")

  public val seedling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌱")

  public val pottedPlant: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪴")

  public val evergreenTree: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌲")

  public val deciduousTree: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌳")

  public val palmTree: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌴")

  public val cactus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌵")

  public val earOfRice: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌾")

  public val herb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌿")

  public val shamrock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☘️")

  public val fourLeafClover: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍀")

  public val mapleLeaf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍁")

  public val fallenLeaf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍂")

  public val leaves: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍃")

  public val emptyNest: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪹")

  public val nestWithEggs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪺")

  public val mushroom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍄")

  public val grapes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍇")

  public val melon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍈")

  public val watermelon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍉")

  public val tangerine: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍊")

  public val orange: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍊")

  public val mandarin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍊")

  public val lemon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍋")

  public val banana: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍌")

  public val pineapple: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍍")

  public val mango: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥭")

  public val apple: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍎")

  public val greenApple: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍏")

  public val pear: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍐")

  public val peach: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍑")

  public val cherries: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍒")

  public val strawberry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍓")

  public val blueberries: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫐")

  public val kiwiFruit: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥝")

  public val tomato: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍅")

  public val olive: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫒")

  public val coconut: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥥")

  public val avocado: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥑")

  public val eggplant: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍆")

  public val potato: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥔")

  public val carrot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥕")

  public val corn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌽")

  public val hotPepper: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌶️")

  public val bellPepper: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫑")

  public val cucumber: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥒")

  public val leafyGreen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥬")

  public val broccoli: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥦")

  public val garlic: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧄")

  public val onion: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧅")

  public val peanuts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥜")

  public val beans: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫘")

  public val chestnut: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌰")

  public val gingerRoot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫚")

  public val peaPod: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫛")

  public val bread: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍞")

  public val croissant: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥐")

  public val baguetteBread: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥖")

  public val flatbread: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫓")

  public val pretzel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥨")

  public val bagel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥯")

  public val pancakes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥞")

  public val waffle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧇")

  public val cheese: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧀")

  public val meatOnBone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍖")

  public val poultryLeg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍗")

  public val cutOfMeat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥩")

  public val bacon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥓")

  public val hamburger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍔")

  public val fries: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍟")

  public val pizza: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍕")

  public val hotdog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌭")

  public val sandwich: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥪")

  public val taco: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌮")

  public val burrito: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌯")

  public val tamale: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫔")

  public val stuffedFlatbread: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥙")

  public val falafel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧆")

  public val egg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥚")

  public val friedEgg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍳")

  public val shallowPanOfFood: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥘")

  public val stew: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍲")

  public val fondue: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫕")

  public val bowlWithSpoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥣")

  public val greenSalad: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥗")

  public val popcorn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍿")

  public val butter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧈")

  public val salt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧂")

  public val cannedFood: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥫")

  public val bento: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍱")

  public val riceCracker: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍘")

  public val riceBall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍙")

  public val rice: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍚")

  public val curry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍛")

  public val ramen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍜")

  public val spaghetti: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍝")

  public val sweetPotato: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍠")

  public val oden: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍢")

  public val sushi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍣")

  public val friedShrimp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍤")

  public val fishCake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍥")

  public val moonCake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥮")

  public val dango: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍡")

  public val dumpling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥟")

  public val fortuneCookie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥠")

  public val takeoutBox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥡")

  public val crab: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦀")

  public val lobster: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦞")

  public val shrimp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦐")

  public val squid: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦑")

  public val oyster: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦪")

  public val icecream: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍦")

  public val shavedIce: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍧")

  public val iceCream: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍨")

  public val doughnut: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍩")

  public val cookie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍪")

  public val birthday: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎂")

  public val cake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍰")

  public val cupcake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧁")

  public val pie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥧")

  public val chocolateBar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍫")

  public val candy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍬")

  public val lollipop: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍭")

  public val custard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍮")

  public val honeyPot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍯")

  public val babyBottle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍼")

  public val milkGlass: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥛")

  public val coffee: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☕")

  public val teapot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫖")

  public val tea: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍵")

  public val sake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍶")

  public val champagne: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍾")

  public val wineGlass: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍷")

  public val cocktail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍸")

  public val tropicalDrink: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍹")

  public val beer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍺")

  public val beers: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍻")

  public val clinkingGlasses: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥂")

  public val tumblerGlass: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥃")

  public val pouringLiquid: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫗")

  public val cupWithStraw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥤")

  public val bubbleTea: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧋")

  public val beverageBox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧃")

  public val mate: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧉")

  public val iceCube: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧊")

  public val chopsticks: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥢")

  public val plateWithCutlery: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍽️")

  public val forkAndKnife: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍴")

  public val spoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥄")

  public val hocho: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔪")

  public val knife: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔪")

  public val jar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫙")

  public val amphora: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏺")

  public val earthAfrica: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌍")

  public val earthAmericas: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌎")

  public val earthAsia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌏")

  public val globeWithMeridians: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌐")

  public val worldMap: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗺️")

  public val japan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗾")

  public val compass: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧭")

  public val mountainSnow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏔️")

  public val mountain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛰️")

  public val volcano: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌋")

  public val mountFuji: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗻")

  public val camping: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏕️")

  public val beachUmbrella: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏖️")

  public val desert: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏜️")

  public val desertIsland: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏝️")

  public val nationalPark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏞️")

  public val stadium: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏟️")

  public val classicalBuilding: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏛️")

  public val buildingConstruction: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏗️")

  public val bricks: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧱")

  public val rock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪨")

  public val wood: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪵")

  public val hut: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛖")

  public val houses: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏘️")

  public val derelictHouse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏚️")

  public val house: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏠")

  public val houseWithGarden: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏡")

  public val office: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏢")

  public val postOffice: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏣")

  public val europeanPostOffice: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏤")

  public val hospital: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏥")

  public val bank: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏦")

  public val hotel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏨")

  public val loveHotel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏩")

  public val convenienceStore: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏪")

  public val school: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏫")

  public val departmentStore: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏬")

  public val factory: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏭")

  public val japaneseCastle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏯")

  public val europeanCastle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏰")

  public val wedding: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💒")

  public val tokyoTower: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗼")

  public val statueOfLiberty: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗽")

  public val church: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛪")

  public val mosque: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕌")

  public val hinduTemple: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛕")

  public val synagogue: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕍")

  public val shintoShrine: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛩️")

  public val kaaba: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕋")

  public val fountain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛲")

  public val tent: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛺")

  public val foggy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌁")

  public val nightWithStars: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌃")

  public val cityscape: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏙️")

  public val sunriseOverMountains: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌄")

  public val sunrise: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌅")

  public val citySunset: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌆")

  public val citySunrise: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌇")

  public val bridgeAtNight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌉")

  public val hotsprings: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♨️")

  public val carouselHorse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎠")

  public val playgroundSlide: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛝")

  public val ferrisWheel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎡")

  public val rollerCoaster: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎢")

  public val barber: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💈")

  public val circusTent: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎪")

  public val steamLocomotive: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚂")

  public val railwayCar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚃")

  public val bullettrainSide: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚄")

  public val bullettrainFront: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚅")

  public val train2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚆")

  public val metro: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚇")

  public val lightRail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚈")

  public val station: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚉")

  public val tram: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚊")

  public val monorail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚝")

  public val mountainRailway: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚞")

  public val train: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚋")

  public val bus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚌")

  public val oncomingBus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚍")

  public val trolleybus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚎")

  public val minibus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚐")

  public val ambulance: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚑")

  public val fireEngine: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚒")

  public val policeCar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚓")

  public val oncomingPoliceCar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚔")

  public val taxi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚕")

  public val oncomingTaxi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚖")

  public val car: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚗")

  public val redCar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚗")

  public val oncomingAutomobile: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚘")

  public val blueCar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚙")

  public val pickupTruck: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛻")

  public val truck: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚚")

  public val articulatedLorry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚛")

  public val tractor: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚜")

  public val racingCar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏎️")

  public val motorcycle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏍️")

  public val motorScooter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛵")

  public val manualWheelchair: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦽")

  public val motorizedWheelchair: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦼")

  public val autoRickshaw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛺")

  public val bike: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚲")

  public val kickScooter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛴")

  public val skateboard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛹")

  public val rollerSkate: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛼")

  public val busstop: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚏")

  public val motorway: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛣️")

  public val railwayTrack: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛤️")

  public val oilDrum: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛢️")

  public val fuelpump: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛽")

  public val wheel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛞")

  public val rotatingLight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚨")

  public val trafficLight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚥")

  public val verticalTrafficLight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚦")

  public val stopSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛑")

  public val construction: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚧")

  public val anchor: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚓")

  public val ringBuoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛟")

  public val boat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛵")

  public val sailboat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛵")

  public val canoe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛶")

  public val speedboat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚤")

  public val passengerShip: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛳️")

  public val ferry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛴️")

  public val motorBoat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛥️")

  public val ship: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚢")

  public val airplane: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✈️")

  public val smallAirplane: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛩️")

  public val flightDeparture: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛫")

  public val flightArrival: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛬")

  public val parachute: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪂")

  public val seat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💺")

  public val helicopter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚁")

  public val suspensionRailway: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚟")

  public val mountainCableway: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚠")

  public val aerialTramway: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚡")

  public val artificialSatellite: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛰️")

  public val rocket: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚀")

  public val flyingSaucer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛸")

  public val bellhopBell: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛎️")

  public val luggage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧳")

  public val hourglass: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⌛")

  public val hourglassFlowingSand: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏳")

  public val watch: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⌚")

  public val alarmClock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏰")

  public val stopwatch: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏱️")

  public val timerClock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏲️")

  public val mantelpieceClock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕰️")

  public val clock12: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕛")

  public val clock1230: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕧")

  public val clock1: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕐")

  public val clock130: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕜")

  public val clock2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕑")

  public val clock230: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕝")

  public val clock3: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕒")

  public val clock330: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕞")

  public val clock4: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕓")

  public val clock430: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕟")

  public val clock5: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕔")

  public val clock530: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕠")

  public val clock6: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕕")

  public val clock630: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕡")

  public val clock7: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕖")

  public val clock730: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕢")

  public val clock8: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕗")

  public val clock830: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕣")

  public val clock9: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕘")

  public val clock930: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕤")

  public val clock10: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕙")

  public val clock1030: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕥")

  public val clock11: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕚")

  public val clock1130: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕦")

  public val newMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌑")

  public val waxingCrescentMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌒")

  public val firstQuarterMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌓")

  public val moon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌔")

  public val waxingGibbousMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌔")

  public val fullMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌕")

  public val waningGibbousMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌖")

  public val lastQuarterMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌗")

  public val waningCrescentMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌘")

  public val crescentMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌙")

  public val newMoonWithFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌚")

  public val firstQuarterMoonWithFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌛")

  public val lastQuarterMoonWithFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌜")

  public val thermometer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌡️")

  public val sunny: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☀️")

  public val fullMoonWithFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌝")

  public val sunWithFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌞")

  public val ringedPlanet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪐")

  public val star: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⭐")

  public val star2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌟")

  public val stars: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌠")

  public val milkyWay: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌌")

  public val cloud: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☁️")

  public val partlySunny: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛅")

  public val cloudWithLightningAndRain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛈️")

  public val sunBehindSmallCloud: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌤️")

  public val sunBehindLargeCloud: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌥️")

  public val sunBehindRainCloud: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌦️")

  public val cloudWithRain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌧️")

  public val cloudWithSnow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌨️")

  public val cloudWithLightning: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌩️")

  public val tornado: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌪️")

  public val fog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌫️")

  public val windFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌬️")

  public val cyclone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌀")

  public val rainbow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌈")

  public val closedUmbrella: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌂")

  public val openUmbrella: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☂️")

  public val umbrella: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☔")

  public val parasolOnGround: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛱️")

  public val zap: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚡")

  public val snowflake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❄️")

  public val snowmanWithSnow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☃️")

  public val snowman: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛄")

  public val comet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☄️")

  public val fire: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔥")

  public val droplet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💧")

  public val ocean: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌊")

  public val jackOLantern: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎃")

  public val christmasTree: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎄")

  public val fireworks: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎆")

  public val sparkler: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎇")

  public val firecracker: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧨")

  public val sparkles: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✨")

  public val balloon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎈")

  public val tada: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎉")

  public val confettiBall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎊")

  public val tanabataTree: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎋")

  public val bamboo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎍")

  public val dolls: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎎")

  public val flags: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎏")

  public val windChime: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎐")

  public val riceScene: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎑")

  public val redEnvelope: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧧")

  public val ribbon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎀")

  public val gift: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎁")

  public val reminderRibbon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎗️")

  public val tickets: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎟️")

  public val ticket: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎫")

  public val medalMilitary: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎖️")

  public val trophy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏆")

  public val medalSports: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏅")

  @JsName("_1stPlaceMedal")
  public val `1stPlaceMedal`: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥇")

  @JsName("_2ndPlaceMedal")
  public val `2ndPlaceMedal`: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥈")

  @JsName("_3rdPlaceMedal")
  public val `3rdPlaceMedal`: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥉")

  public val soccer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚽")

  public val baseball: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚾")

  public val softball: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥎")

  public val basketball: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏀")

  public val volleyball: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏐")

  public val football: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏈")

  public val rugbyFootball: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏉")

  public val tennis: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎾")

  public val flyingDisc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥏")

  public val bowling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎳")

  public val cricketGame: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏏")

  public val fieldHockey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏑")

  public val iceHockey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏒")

  public val lacrosse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥍")

  public val pingPong: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏓")

  public val badminton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏸")

  public val boxingGlove: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥊")

  public val martialArtsUniform: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥋")

  public val goalNet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥅")

  public val golf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛳")

  public val iceSkate: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛸️")

  public val fishingPoleAndFish: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎣")

  public val divingMask: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤿")

  public val runningShirtWithSash: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎽")

  public val ski: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎿")

  public val sled: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛷")

  public val curlingStone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥌")

  public val dart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎯")

  public val yoYo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪀")

  public val kite: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪁")

  public val gun: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔫")

  @JsName("_8ball")
  public val `8ball`: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎱")

  public val crystalBall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔮")

  public val magicWand: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪄")

  public val videoGame: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎮")

  public val joystick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕹️")

  public val slotMachine: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎰")

  public val gameDie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎲")

  public val jigsaw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧩")

  public val teddyBear: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧸")

  public val pinata: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪅")

  public val mirrorBall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪩")

  public val nestingDolls: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪆")

  public val spades: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♠️")

  public val hearts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♥️")

  public val diamonds: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♦️")

  public val clubs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♣️")

  public val chessPawn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♟️")

  public val blackJoker: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🃏")

  public val mahjong: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🀄")

  public val flowerPlayingCards: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎴")

  public val performingArts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎭")

  public val framedPicture: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖼️")

  public val art: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎨")

  public val thread: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧵")

  public val sewingNeedle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪡")

  public val yarn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧶")

  public val knot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪢")

  public val eyeglasses: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👓")

  public val darkSunglasses: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕶️")

  public val goggles: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥽")

  public val labCoat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥼")

  public val safetyVest: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦺")

  public val necktie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👔")

  public val shirt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👕")

  public val tshirt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👕")

  public val jeans: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👖")

  public val scarf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧣")

  public val gloves: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧤")

  public val coat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧥")

  public val socks: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧦")

  public val dress: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👗")

  public val kimono: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👘")

  public val sari: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥻")

  public val onePieceSwimsuit: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩱")

  public val swimBrief: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩲")

  public val shorts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩳")

  public val bikini: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👙")

  public val womansClothes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👚")

  public val foldingHandFan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪭")

  public val purse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👛")

  public val handbag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👜")

  public val pouch: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👝")

  public val shopping: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛍️")

  public val schoolSatchel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎒")

  public val thongSandal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩴")

  public val mansShoe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👞")

  public val shoe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👞")

  public val athleticShoe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👟")

  public val hikingBoot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥾")

  public val flatShoe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥿")

  public val highHeel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👠")

  public val sandal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👡")

  public val balletShoes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩰")

  public val boot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👢")

  public val hairPick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪮")

  public val crown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👑")

  public val womansHat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👒")

  public val tophat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎩")

  public val mortarBoard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎓")

  public val billedCap: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧢")

  public val militaryHelmet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪖")

  public val rescueWorkerHelmet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛑️")

  public val prayerBeads: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📿")

  public val lipstick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💄")

  public val ring: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💍")

  public val gem: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💎")

  public val mute: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔇")

  public val speaker: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔈")

  public val sound: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔉")

  public val loudSound: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔊")

  public val loudspeaker: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📢")

  public val mega: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📣")

  public val postalHorn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📯")

  public val bell: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔔")

  public val noBell: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔕")

  public val musicalScore: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎼")

  public val musicalNote: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎵")

  public val notes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎶")

  public val studioMicrophone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎙️")

  public val levelSlider: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎚️")

  public val controlKnobs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎛️")

  public val microphone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎤")

  public val headphones: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎧")

  public val radio: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📻")

  public val saxophone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎷")

  public val accordion: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪗")

  public val guitar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎸")

  public val musicalKeyboard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎹")

  public val trumpet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎺")

  public val violin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎻")

  public val banjo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪕")

  public val drum: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥁")

  public val longDrum: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪘")

  public val maracas: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪇")

  public val flute: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪈")

  public val iphone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📱")

  public val calling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📲")

  public val phone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☎️")

  public val telephone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☎️")

  public val telephoneReceiver: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📞")

  public val pager: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📟")

  public val fax: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📠")

  public val battery: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔋")

  public val lowBattery: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪫")

  public val electricPlug: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔌")

  public val computer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💻")

  public val desktopComputer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖥️")

  public val printer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖨️")

  public val keyboard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⌨️")

  public val computerMouse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖱️")

  public val trackball: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖲️")

  public val minidisc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💽")

  public val floppyDisk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💾")

  public val cd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💿")

  public val dvd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📀")

  public val abacus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧮")

  public val movieCamera: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎥")

  public val filmStrip: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎞️")

  public val filmProjector: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📽️")

  public val clapper: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎬")

  public val tv: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📺")

  public val camera: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📷")

  public val cameraFlash: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📸")

  public val videoCamera: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📹")

  public val vhs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📼")

  public val mag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔍")

  public val magRight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔎")

  public val candle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕯️")

  public val bulb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💡")

  public val flashlight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔦")

  public val izakayaLantern: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏮")

  public val lantern: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏮")

  public val diyaLamp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪔")

  public val notebookWithDecorativeCover: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📔")

  public val closedBook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📕")

  public val book: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📖")

  public val openBook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📖")

  public val greenBook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📗")

  public val blueBook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📘")

  public val orangeBook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📙")

  public val books: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📚")

  public val notebook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📓")

  public val ledger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📒")

  public val pageWithCurl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📃")

  public val scroll: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📜")

  public val pageFacingUp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📄")

  public val newspaper: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📰")

  public val newspaperRoll: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗞️")

  public val bookmarkTabs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📑")

  public val bookmark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔖")

  public val label: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏷️")

  public val moneybag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💰")

  public val coin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪙")

  public val yen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💴")

  public val dollar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💵")

  public val euro: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💶")

  public val pound: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💷")

  public val moneyWithWings: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💸")

  public val creditCard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💳")

  public val receipt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧾")

  public val chart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💹")

  public val envelope: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✉️")

  public val email: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📧")

  @JsName("CtBJDBCpCxDA")
  public val `e-mail`: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📧")

  public val incomingEnvelope: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📨")

  public val envelopeWithArrow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📩")

  public val outboxTray: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📤")

  public val inboxTray: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📥")

  public val `package`: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📦")

  public val mailbox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📫")

  public val mailboxClosed: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📪")

  public val mailboxWithMail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📬")

  public val mailboxWithNoMail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📭")

  public val postbox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📮")

  public val ballotBox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗳️")

  public val pencil2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✏️")

  public val blackNib: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✒️")

  public val fountainPen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖋️")

  public val pen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖊️")

  public val paintbrush: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖌️")

  public val crayon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖍️")

  public val memo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📝")

  public val pencil: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📝")

  public val briefcase: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💼")

  public val fileFolder: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📁")

  public val openFileFolder: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📂")

  public val cardIndexDividers: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗂️")

  public val date: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📅")

  public val calendar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📆")

  public val spiralNotepad: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗒️")

  public val spiralCalendar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗓️")

  public val cardIndex: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📇")

  public val chartWithUpwardsTrend: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📈")

  public val chartWithDownwardsTrend: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📉")

  public val barChart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📊")

  public val clipboard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📋")

  public val pushpin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📌")

  public val roundPushpin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📍")

  public val paperclip: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📎")

  public val paperclips: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖇️")

  public val straightRuler: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📏")

  public val triangularRuler: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📐")

  public val scissors: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✂️")

  public val cardFileBox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗃️")

  public val fileCabinet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗄️")

  public val wastebasket: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗑️")

  public val lock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔒")

  public val unlock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔓")

  public val lockWithInkPen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔏")

  public val closedLockWithKey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔐")

  public val key: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔑")

  public val oldKey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗝️")

  public val hammer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔨")

  public val axe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪓")

  public val pick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛏️")

  public val hammerAndPick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚒️")

  public val hammerAndWrench: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛠️")

  public val dagger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗡️")

  public val crossedSwords: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚔️")

  public val bomb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💣")

  public val boomerang: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪃")

  public val bowAndArrow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏹")

  public val shield: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛡️")

  public val carpentrySaw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪚")

  public val wrench: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔧")

  public val screwdriver: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪛")

  public val nutAndBolt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔩")

  public val gear: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚙️")

  public val clamp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗜️")

  public val balanceScale: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚖️")

  public val probingCane: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦯")

  public val link: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔗")

  public val chains: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛓️")

  public val hook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪝")

  public val toolbox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧰")

  public val magnet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧲")

  public val ladder: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪜")

  public val alembic: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚗️")

  public val testTube: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧪")

  public val petriDish: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧫")

  public val dna: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧬")

  public val microscope: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔬")

  public val telescope: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔭")

  public val satellite: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📡")

  public val syringe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💉")

  public val dropOfBlood: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩸")

  public val pill: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💊")

  public val adhesiveBandage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩹")

  public val crutch: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩼")

  public val stethoscope: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩺")

  public val xRay: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩻")

  public val door: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚪")

  public val elevator: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛗")

  public val mirror: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪞")

  public val window: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪟")

  public val bed: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛏️")

  public val couchAndLamp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛋️")

  public val chair: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪑")

  public val toilet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚽")

  public val plunger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪠")

  public val shower: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚿")

  public val bathtub: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛁")

  public val mouseTrap: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪤")

  public val razor: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪒")

  public val lotionBottle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧴")

  public val safetyPin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧷")

  public val broom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧹")

  public val basket: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧺")

  public val rollOfPaper: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧻")

  public val bucket: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪣")

  public val soap: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧼")

  public val bubbles: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫧")

  public val toothbrush: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪥")

  public val sponge: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧽")

  public val fireExtinguisher: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧯")

  public val shoppingCart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛒")

  public val smoking: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚬")

  public val coffin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚰️")

  public val headstone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪦")

  public val funeralUrn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚱️")

  public val nazarAmulet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧿")

  public val hamsa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪬")

  public val moyai: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗿")

  public val placard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪧")

  public val identificationCard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪪")

  public val atm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏧")

  public val putLitterInItsPlace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚮")

  public val potableWater: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚰")

  public val wheelchair: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♿")

  public val mens: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚹")

  public val womens: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚺")

  public val restroom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚻")

  public val babySymbol: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚼")

  public val wc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚾")

  public val passportControl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛂")

  public val customs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛃")

  public val baggageClaim: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛄")

  public val leftLuggage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛅")

  public val warning: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚠️")

  public val childrenCrossing: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚸")

  public val noEntry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛔")

  public val noEntrySign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚫")

  public val noBicycles: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚳")

  public val noSmoking: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚭")

  public val doNotLitter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚯")

  @JsName("DCDDDCBJDEDDDICpCqDACtCfCpDICtDG")
  public val `non-potableWater`: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚱")

  public val noPedestrians: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚷")

  public val noMobilePhones: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📵")

  public val underage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔞")

  public val radioactive: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☢️")

  public val biohazard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☣️")

  public val arrowUp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⬆️")

  public val arrowUpperRight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("↗️")

  public val arrowRight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("➡️")

  public val arrowLowerRight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("↘️")

  public val arrowDown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⬇️")

  public val arrowLowerLeft: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("↙️")

  public val arrowLeft: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⬅️")

  public val arrowUpperLeft: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("↖️")

  public val arrowUpDown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("↕️")

  public val leftRightArrow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("↔️")

  public val leftwardsArrowWithHook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("↩️")

  public val arrowRightHook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("↪️")

  public val arrowHeadingUp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⤴️")

  public val arrowHeadingDown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⤵️")

  public val arrowsClockwise: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔃")

  public val arrowsCounterclockwise: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔄")

  public val back: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔙")

  public val end: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔚")

  public val on: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔛")

  public val soon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔜")

  public val top: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔝")

  public val placeOfWorship: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛐")

  public val atomSymbol: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚛️")

  public val om: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕉️")

  public val starOfDavid: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✡️")

  public val wheelOfDharma: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☸️")

  public val yinYang: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☯️")

  public val latinCross: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✝️")

  public val orthodoxCross: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☦️")

  public val starAndCrescent: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☪️")

  public val peaceSymbol: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☮️")

  public val menorah: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕎")

  public val sixPointedStar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔯")

  public val khanda: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪯")

  public val aries: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♈")

  public val taurus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♉")

  public val gemini: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♊")

  public val cancer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♋")

  public val leo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♌")

  public val virgo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♍")

  public val libra: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♎")

  public val scorpius: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♏")

  public val sagittarius: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♐")

  public val capricorn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♑")

  public val aquarius: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♒")

  public val pisces: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♓")

  public val ophiuchus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛎")

  public val twistedRightwardsArrows: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔀")

  public val repeat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔁")

  public val repeatOne: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔂")

  public val arrowForward: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("▶️")

  public val fastForward: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏩")

  public val nextTrackButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏭️")

  public val playOrPauseButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏯️")

  public val arrowBackward: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("◀️")

  public val rewind: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏪")

  public val previousTrackButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏮️")

  public val arrowUpSmall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔼")

  public val arrowDoubleUp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏫")

  public val arrowDownSmall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔽")

  public val arrowDoubleDown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏬")

  public val pauseButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏸️")

  public val stopButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏹️")

  public val recordButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏺️")

  public val ejectButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏏️")

  public val cinema: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎦")

  public val lowBrightness: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔅")

  public val highBrightness: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔆")

  public val signalStrength: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📶")

  public val wireless: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛜")

  public val vibrationMode: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📳")

  public val mobilePhoneOff: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📴")

  public val femaleSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♀️")

  public val maleSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♂️")

  public val transgenderSymbol: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚧️")

  public val heavyMultiplicationX: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✖️")

  public val heavyPlusSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("➕")

  public val heavyMinusSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("➖")

  public val heavyDivisionSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("➗")

  public val heavyEqualsSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟰")

  public val infinity: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♾️")

  public val bangbang: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("‼️")

  public val interrobang: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⁉️")

  public val question: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❓")

  public val greyQuestion: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❔")

  public val greyExclamation: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❕")

  public val exclamation: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❗")

  public val heavyExclamationMark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❗")

  public val wavyDash: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("〰️")

  public val currencyExchange: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💱")

  public val heavyDollarSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💲")

  public val medicalSymbol: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚕️")

  public val recycle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♻️")

  public val fleurDeLis: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚜️")

  public val trident: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔱")

  public val nameBadge: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📛")

  public val beginner: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔰")

  public val o: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⭕")

  public val whiteCheckMark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✅")

  public val ballotBoxWithCheck: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☑️")

  public val heavyCheckMark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✔️")

  public val x: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❌")

  public val negativeSquaredCrossMark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❎")

  public val curlyLoop: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("➰")

  public val loop: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("➿")

  public val partAlternationMark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("〽️")

  public val eightSpokedAsterisk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✳️")

  public val eightPointedBlackStar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✴️")

  public val sparkle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❇️")

  public val copyright: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("©️")

  public val registered: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("®️")

  public val tm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("™️")

  public val hash: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("#️⃣")

  public val asterisk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("*️⃣")

  public val zero: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("0️⃣")

  public val one: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("1️⃣")

  public val two: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("2️⃣")

  public val three: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("3️⃣")

  public val four: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("4️⃣")

  public val five: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("5️⃣")

  public val six: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("6️⃣")

  public val seven: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("7️⃣")

  public val eight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("8️⃣")

  public val nine: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("9️⃣")

  public val keycapTen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔟")

  public val capitalAbcd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔠")

  public val abcd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔡")

  @JsName("_1234")
  public val `1234`: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔢")

  public val symbols: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔣")

  public val abc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔤")

  public val a: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🅰️")

  public val ab: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆎")

  public val b: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🅱️")

  public val cl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆑")

  public val cool: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆒")

  public val free: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆓")

  public val informationSource: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("ℹ️")

  public val id: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆔")

  public val m: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("Ⓜ️")

  public val new: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆕")

  public val ng: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆖")

  public val o2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🅾️")

  public val ok: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆗")

  public val parking: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🅿️")

  public val sos: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆘")

  public val up: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆙")

  public val vs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆚")

  public val koko: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈁")

  public val sa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈂️")

  public val u6708: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈷️")

  public val u6709: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈶")

  public val u6307: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈯")

  public val ideographAdvantage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🉐")

  public val u5272: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈹")

  public val u7121: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈚")

  public val u7981: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈲")

  public val accept: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🉑")

  public val u7533: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈸")

  public val u5408: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈴")

  public val u7a7a: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈳")

  public val congratulations: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("㊗️")

  public val secret: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("㊙️")

  public val u55b6: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈺")

  public val u6e80: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈵")

  public val redCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔴")

  public val orangeCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟠")

  public val yellowCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟡")

  public val greenCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟢")

  public val largeBlueCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔵")

  public val purpleCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟣")

  public val brownCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟤")

  public val blackCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚫")

  public val whiteCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚪")

  public val redSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟥")

  public val orangeSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟧")

  public val yellowSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟨")

  public val greenSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟩")

  public val blueSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟦")

  public val purpleSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟪")

  public val brownSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟫")

  public val blackLargeSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⬛")

  public val whiteLargeSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⬜")

  public val blackMediumSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("◼️")

  public val whiteMediumSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("◻️")

  public val blackMediumSmallSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("◾")

  public val whiteMediumSmallSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("◽")

  public val blackSmallSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("▪️")

  public val whiteSmallSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("▫️")

  public val largeOrangeDiamond: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔶")

  public val largeBlueDiamond: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔷")

  public val smallOrangeDiamond: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔸")

  public val smallBlueDiamond: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔹")

  public val smallRedTriangle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔺")

  public val smallRedTriangleDown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔻")

  public val diamondShapeWithADotInside: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💠")

  public val radioButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔘")

  public val whiteSquareButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔳")

  public val blackSquareButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔲")

  public val checkeredFlag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏁")

  public val triangularFlagOnPost: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚩")

  public val crossedFlags: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎌")

  public val blackFlag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏴")

  public val whiteFlag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏳️")

  public val rainbowFlag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏳️‍🌈")

  public val transgenderFlag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏳️‍⚧️")

  public val pirateFlag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏴‍☠️")

  public val ascensionIsland: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇨")

  public val andorra: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇩")

  public val unitedArabEmirates: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇪")

  public val afghanistan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇫")

  public val antiguaBarbuda: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇬")

  public val anguilla: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇮")

  public val albania: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇱")

  public val armenia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇲")

  public val angola: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇴")

  public val antarctica: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇶")

  public val argentina: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇷")

  public val americanSamoa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇸")

  public val austria: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇹")

  public val australia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇺")

  public val aruba: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇼")

  public val alandIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇽")

  public val azerbaijan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇿")

  public val bosniaHerzegovina: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇦")

  public val barbados: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇧")

  public val bangladesh: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇩")

  public val belgium: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇪")

  public val burkinaFaso: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇫")

  public val bulgaria: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇬")

  public val bahrain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇭")

  public val burundi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇮")

  public val benin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇯")

  public val stBarthelemy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇱")

  public val bermuda: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇲")

  public val brunei: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇳")

  public val bolivia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇴")

  public val caribbeanNetherlands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇶")

  public val brazil: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇷")

  public val bahamas: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇸")

  public val bhutan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇹")

  public val bouvetIsland: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇻")

  public val botswana: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇼")

  public val belarus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇾")

  public val belize: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇿")

  public val canada: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇦")

  public val cocosIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇨")

  public val congoKinshasa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇩")

  public val centralAfricanRepublic: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇫")

  public val congoBrazzaville: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇬")

  public val switzerland: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇭")

  public val coteDivoire: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇮")

  public val cookIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇰")

  public val chile: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇱")

  public val cameroon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇲")

  public val cn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇳")

  public val colombia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇴")

  public val clippertonIsland: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇵")

  public val costaRica: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇷")

  public val cuba: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇺")

  public val capeVerde: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇻")

  public val curacao: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇼")

  public val christmasIsland: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇽")

  public val cyprus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇾")

  public val czechRepublic: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇿")

  public val de: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇩🇪")

  public val diegoGarcia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇩🇬")

  public val djibouti: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇩🇯")

  public val denmark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇩🇰")

  public val dominica: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇩🇲")

  public val dominicanRepublic: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇩🇴")

  public val algeria: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇩🇿")

  public val ceutaMelilla: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇪🇦")

  public val ecuador: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇪🇨")

  public val estonia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇪🇪")

  public val egypt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇪🇬")

  public val westernSahara: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇪🇭")

  public val eritrea: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇪🇷")

  public val es: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇪🇸")

  public val ethiopia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇪🇹")

  public val eu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇪🇺")

  public val europeanUnion: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇪🇺")

  public val finland: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇫🇮")

  public val fiji: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇫🇯")

  public val falklandIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇫🇰")

  public val micronesia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇫🇲")

  public val faroeIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇫🇴")

  public val fr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇫🇷")

  public val gabon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇦")

  public val gb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇧")

  public val uk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇧")

  public val grenada: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇩")

  public val georgia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇪")

  public val frenchGuiana: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇫")

  public val guernsey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇬")

  public val ghana: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇭")

  public val gibraltar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇮")

  public val greenland: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇱")

  public val gambia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇲")

  public val guinea: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇳")

  public val guadeloupe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇵")

  public val equatorialGuinea: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇶")

  public val greece: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇷")

  public val southGeorgiaSouthSandwichIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇸")

  public val guatemala: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇹")

  public val guam: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇺")

  public val guineaBissau: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇼")

  public val guyana: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇾")

  public val hongKong: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇭🇰")

  public val heardMcdonaldIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇭🇲")

  public val honduras: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇭🇳")

  public val croatia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇭🇷")

  public val haiti: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇭🇹")

  public val hungary: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇭🇺")

  public val canaryIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇨")

  public val indonesia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇩")

  public val ireland: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇪")

  public val israel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇱")

  public val isleOfMan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇲")

  public val india: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇳")

  public val britishIndianOceanTerritory: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇴")

  public val iraq: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇶")

  public val iran: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇷")

  public val iceland: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇸")

  public val it: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇹")

  public val jersey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇯🇪")

  public val jamaica: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇯🇲")

  public val jordan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇯🇴")

  public val jp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇯🇵")

  public val kenya: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇪")

  public val kyrgyzstan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇬")

  public val cambodia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇭")

  public val kiribati: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇮")

  public val comoros: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇲")

  public val stKittsNevis: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇳")

  public val northKorea: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇵")

  public val kr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇷")

  public val kuwait: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇼")

  public val caymanIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇾")

  public val kazakhstan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇿")

  public val laos: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇦")

  public val lebanon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇧")

  public val stLucia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇨")

  public val liechtenstein: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇮")

  public val sriLanka: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇰")

  public val liberia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇷")

  public val lesotho: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇸")

  public val lithuania: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇹")

  public val luxembourg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇺")

  public val latvia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇻")

  public val libya: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇾")

  public val morocco: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇦")

  public val monaco: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇨")

  public val moldova: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇩")

  public val montenegro: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇪")

  public val stMartin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇫")

  public val madagascar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇬")

  public val marshallIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇭")

  public val macedonia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇰")

  public val mali: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇱")

  public val myanmar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇲")

  public val mongolia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇳")

  public val macau: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇴")

  public val northernMarianaIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇵")

  public val martinique: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇶")

  public val mauritania: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇷")

  public val montserrat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇸")

  public val malta: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇹")

  public val mauritius: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇺")

  public val maldives: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇻")

  public val malawi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇼")

  public val mexico: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇽")

  public val malaysia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇾")

  public val mozambique: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇿")

  public val namibia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇦")

  public val newCaledonia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇨")

  public val niger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇪")

  public val norfolkIsland: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇫")

  public val nigeria: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇬")

  public val nicaragua: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇮")

  public val netherlands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇱")

  public val norway: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇴")

  public val nepal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇵")

  public val nauru: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇷")

  public val niue: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇺")

  public val newZealand: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇿")

  public val oman: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇴🇲")

  public val panama: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇦")

  public val peru: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇪")

  public val frenchPolynesia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇫")

  public val papuaNewGuinea: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇬")

  public val philippines: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇭")

  public val pakistan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇰")

  public val poland: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇱")

  public val stPierreMiquelon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇲")

  public val pitcairnIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇳")

  public val puertoRico: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇷")

  public val palestinianTerritories: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇸")

  public val portugal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇹")

  public val palau: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇼")

  public val paraguay: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇾")

  public val qatar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇶🇦")

  public val reunion: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇷🇪")

  public val romania: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇷🇴")

  public val serbia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇷🇸")

  public val ru: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇷🇺")

  public val rwanda: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇷🇼")

  public val saudiArabia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇦")

  public val solomonIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇧")

  public val seychelles: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇨")

  public val sudan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇩")

  public val sweden: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇪")

  public val singapore: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇬")

  public val stHelena: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇭")

  public val slovenia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇮")

  public val svalbardJanMayen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇯")

  public val slovakia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇰")

  public val sierraLeone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇱")

  public val sanMarino: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇲")

  public val senegal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇳")

  public val somalia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇴")

  public val suriname: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇷")

  public val southSudan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇸")

  public val saoTomePrincipe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇹")

  public val elSalvador: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇻")

  public val sintMaarten: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇽")

  public val syria: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇾")

  public val swaziland: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇿")

  public val tristanDaCunha: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇦")

  public val turksCaicosIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇨")

  public val chad: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇩")

  public val frenchSouthernTerritories: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇫")

  public val togo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇬")

  public val thailand: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇭")

  public val tajikistan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇯")

  public val tokelau: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇰")

  public val timorLeste: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇱")

  public val turkmenistan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇲")

  public val tunisia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇳")

  public val tonga: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇴")

  public val tr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇷")

  public val trinidadTobago: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇹")

  public val tuvalu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇻")

  public val taiwan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇼")

  public val tanzania: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇿")

  public val ukraine: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇺🇦")

  public val uganda: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇺🇬")

  public val usOutlyingIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇺🇲")

  public val unitedNations: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇺🇳")

  public val us: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇺🇸")

  public val uruguay: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇺🇾")

  public val uzbekistan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇺🇿")

  public val vaticanCity: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇻🇦")

  public val stVincentGrenadines: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇻🇨")

  public val venezuela: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇻🇪")

  public val britishVirginIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇻🇬")

  public val usVirginIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇻🇮")

  public val vietnam: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇻🇳")

  public val vanuatu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇻🇺")

  public val wallisFutuna: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇼🇫")

  public val samoa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇼🇸")

  public val kosovo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇽🇰")

  public val yemen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇾🇪")

  public val mayotte: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇾🇹")

  public val southAfrica: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇿🇦")

  public val zambia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇿🇲")

  public val zimbabwe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇿🇼")

  public val england: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏴󠁧󠁢󠁥󠁮󠁧󠁿")

  public val scotland: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏴󠁧󠁢󠁳󠁣󠁴󠁿")

  public val wales: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏴󠁧󠁢󠁷󠁬󠁳󠁿")

  /**
   * Gets a discord emoji with the given [unicode].
   */
  public operator fun `get`(unicode: String): DiscordEmoji? {
    val tone = unicode.toSkinTone()
    val withoutTone = unicode.removeTone()
    val emoji = all[withoutTone]

    return if (emoji is DiscordEmoji.Diverse) emoji.copy(tone = tone!!) else emoji
  }
}

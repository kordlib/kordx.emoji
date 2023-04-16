package dev.kord.x.emoji

import kotlin.js.JsName

/**
 * List of all supported discord emojis.
 */
@Suppress(names = arrayOf("ObjectPropertyName", "MemberVisibilityCanBePrivate", "unused"))
public object Emojis {
  public val all: Map<String, DiscordEmoji> = mapOf("😀" to grinning,
      "😃" to smiley,
      "😄" to smile,
      "😁" to grin,
      "😆" to laughing,
      "😅" to sweatSmile,
      "😂" to joy,
      "🤣" to rofl,
      "☺️" to relaxed,
      "😊" to blush,
      "😇" to innocent,
      "🙂" to slightSmile,
      "🙃" to upsideDown,
      "😉" to wink,
      "😌" to relieved,
      "😍" to heartEyes,
      "🥰" to smilingFaceWith3Hearts,
      "😘" to kissingHeart,
      "😗" to kissing,
      "😙" to kissingSmilingEyes,
      "😚" to kissingClosedEyes,
      "😋" to yum,
      "😛" to stuckOutTongue,
      "😝" to stuckOutTongueClosedEyes,
      "😜" to stuckOutTongueWinkingEye,
      "🤪" to zanyFace,
      "🤨" to faceWithRaisedEyebrow,
      "🧐" to faceWithMonocle,
      "🤓" to nerd,
      "😎" to sunglasses,
      "🤩" to starStruck,
      "🥳" to partyingFace,
      "😏" to smirk,
      "😒" to unamused,
      "😞" to disappointed,
      "😔" to pensive,
      "😟" to worried,
      "😕" to confused,
      "🙁" to slightFrown,
      "☹️" to frowning2,
      "😣" to persevere,
      "😖" to confounded,
      "😫" to tiredFace,
      "😩" to weary,
      "🥺" to pleadingFace,
      "😢" to cry,
      "😭" to sob,
      "😤" to triumph,
      "😠" to angry,
      "😡" to rage,
      "🤬" to faceWithSymbolsOverMouth,
      "🤯" to explodingHead,
      "😳" to flushed,
      "🥵" to hotFace,
      "🥶" to coldFace,
      "😱" to scream,
      "😨" to fearful,
      "😰" to coldSweat,
      "😥" to disappointedRelieved,
      "😓" to sweat,
      "🤗" to hugging,
      "🤔" to thinking,
      "🤭" to faceWithHandOverMouth,
      "🥱" to yawningFace,
      "🤫" to shushingFace,
      "🤥" to lyingFace,
      "😶" to noMouth,
      "😐" to neutralFace,
      "😑" to expressionless,
      "😬" to grimacing,
      "🙄" to rollingEyes,
      "😯" to hushed,
      "😦" to frowning,
      "😧" to anguished,
      "😮" to openMouth,
      "😲" to astonished,
      "😴" to sleeping,
      "🤤" to droolingFace,
      "😪" to sleepy,
      "😵" to dizzyFace,
      "🤐" to zipperMouth,
      "🥴" to woozyFace,
      "🤢" to nauseatedFace,
      "🤮" to faceVomiting,
      "🤧" to sneezingFace,
      "😷" to mask,
      "🤒" to thermometerFace,
      "🤕" to headBandage,
      "🤑" to moneyMouth,
      "🤠" to cowboy,
      "😈" to smilingImp,
      "👿" to imp,
      "👹" to japaneseOgre,
      "👺" to japaneseGoblin,
      "🤡" to clown,
      "💩" to poop,
      "👻" to ghost,
      "💀" to skull,
      "☠️" to skullCrossbones,
      "👽" to alien,
      "👾" to spaceInvader,
      "🤖" to robot,
      "🎃" to jackOLantern,
      "😺" to smileyCat,
      "😸" to smileCat,
      "😹" to joyCat,
      "😻" to heartEyesCat,
      "😼" to smirkCat,
      "😽" to kissingCat,
      "🙀" to screamCat,
      "😿" to cryingCatFace,
      "😾" to poutingCat,
      "🤲" to palmsUpTogether,
      "👐" to openHands,
      "🙌" to raisedHands,
      "👏" to clap,
      "🤝" to handshake,
      "👍" to thumbsup,
      "👎" to thumbsdown,
      "👊" to punch,
      "✊" to fist,
      "🤛" to leftFacingFist,
      "🤜" to rightFacingFist,
      "🤞" to fingersCrossed,
      "✌️" to v,
      "🤟" to loveYouGesture,
      "🤘" to metal,
      "👌" to okHand,
      "🤏" to pinchingHand,
      "👈" to pointLeft,
      "👉" to pointRight,
      "👆" to pointUp2,
      "👇" to pointDown,
      "☝️" to pointUp,
      "✋" to raisedHand,
      "🤚" to raisedBackOfHand,
      "🖐️" to handSplayed,
      "🖖" to vulcan,
      "👋" to wave,
      "🤙" to callMe,
      "💪" to muscle,
      "🦾" to mechanicalArm,
      "🖕" to middleFinger,
      "✍️" to writingHand,
      "🙏" to pray,
      "🦶" to foot,
      "🦵" to leg,
      "🦿" to mechanicalLeg,
      "💄" to lipstick,
      "💋" to kiss,
      "👄" to lips,
      "🦷" to tooth,
      "🦴" to bone,
      "👅" to tongue,
      "👂" to ear,
      "🦻" to earWithHearingAid,
      "👃" to nose,
      "👣" to footprints,
      "👁️" to eye,
      "👀" to eyes,
      "🧠" to brain,
      "🗣️" to speakingHead,
      "👤" to bustInSilhouette,
      "👥" to bustsInSilhouette,
      "👶" to baby,
      "👧" to girl,
      "🧒" to child,
      "👦" to boy,
      "👩" to woman,
      "🧑" to adult,
      "👨" to man,
      "👩‍🦱" to womanCurlyHaired,
      "👨‍🦱" to manCurlyHaired,
      "👩‍🦰" to womanRedHaired,
      "👨‍🦰" to manRedHaired,
      "👱‍♀️" to blondHairedWoman,
      "👱" to blondHairedPerson,
      "👱‍♂️" to blondHairedMan,
      "👩‍🦳" to womanWhiteHaired,
      "👨‍🦳" to manWhiteHaired,
      "👩‍🦲" to womanBald,
      "👨‍🦲" to manBald,
      "🧔" to beardedPerson,
      "👵" to olderWoman,
      "🧓" to olderAdult,
      "👴" to olderMan,
      "👲" to manWithChineseCap,
      "👳" to personWearingTurban,
      "👳‍♀️" to womanWearingTurban,
      "👳‍♂️" to manWearingTurban,
      "🧕" to womanWithHeadscarf,
      "👮" to policeOfficer,
      "👮‍♀️" to womanPoliceOfficer,
      "👮‍♂️" to manPoliceOfficer,
      "👷" to constructionWorker,
      "👷‍♀️" to womanConstructionWorker,
      "👷‍♂️" to manConstructionWorker,
      "💂" to guard,
      "💂‍♀️" to womanGuard,
      "💂‍♂️" to manGuard,
      "🕵️" to detective,
      "🕵️‍♀️" to womanDetective,
      "🕵️‍♂️" to manDetective,
      "👩‍⚕️" to womanHealthWorker,
      "👨‍⚕️" to manHealthWorker,
      "👩‍🌾" to womanFarmer,
      "👨‍🌾" to manFarmer,
      "👩‍🍳" to womanCook,
      "👨‍🍳" to manCook,
      "👩‍🎓" to womanStudent,
      "👨‍🎓" to manStudent,
      "👩‍🎤" to womanSinger,
      "👨‍🎤" to manSinger,
      "👩‍🏫" to womanTeacher,
      "👨‍🏫" to manTeacher,
      "👩‍🏭" to womanFactoryWorker,
      "👨‍🏭" to manFactoryWorker,
      "👩‍💻" to womanTechnologist,
      "👨‍💻" to manTechnologist,
      "👩‍💼" to womanOfficeWorker,
      "👨‍💼" to manOfficeWorker,
      "👩‍🔧" to womanMechanic,
      "👨‍🔧" to manMechanic,
      "👩‍🔬" to womanScientist,
      "👨‍🔬" to manScientist,
      "👩‍🎨" to womanArtist,
      "👨‍🎨" to manArtist,
      "👩‍🚒" to womanFirefighter,
      "👨‍🚒" to manFirefighter,
      "👩‍✈️" to womanPilot,
      "👨‍✈️" to manPilot,
      "👩‍🚀" to womanAstronaut,
      "👨‍🚀" to manAstronaut,
      "👩‍⚖️" to womanJudge,
      "👨‍⚖️" to manJudge,
      "👰" to brideWithVeil,
      "🤵" to manInTuxedo,
      "👸" to princess,
      "🤴" to prince,
      "🦸" to superhero,
      "🦸‍♀️" to womanSuperhero,
      "🦸‍♂️" to manSuperhero,
      "🦹" to supervillain,
      "🦹‍♀️" to womanSupervillain,
      "🦹‍♂️" to manSupervillain,
      "🤶" to mrsClaus,
      "🎅" to santa,
      "🧙" to mage,
      "🧙‍♀️" to womanMage,
      "🧙‍♂️" to manMage,
      "🧝" to elf,
      "🧝‍♀️" to womanElf,
      "🧝‍♂️" to manElf,
      "🧛" to vampire,
      "🧛‍♀️" to womanVampire,
      "🧛‍♂️" to manVampire,
      "🧟" to zombie,
      "🧟‍♀️" to womanZombie,
      "🧟‍♂️" to manZombie,
      "🧞" to genie,
      "🧞‍♀️" to womanGenie,
      "🧞‍♂️" to manGenie,
      "🧜" to merperson,
      "🧜‍♀️" to mermaid,
      "🧜‍♂️" to merman,
      "🧚" to fairy,
      "🧚‍♀️" to womanFairy,
      "🧚‍♂️" to manFairy,
      "👼" to angel,
      "🤰" to pregnantWoman,
      "🤱" to breastFeeding,
      "🙇" to personBowing,
      "🙇‍♀️" to womanBowing,
      "🙇‍♂️" to manBowing,
      "💁" to personTippingHand,
      "💁‍♀️" to womanTippingHand,
      "💁‍♂️" to manTippingHand,
      "🙅" to personGesturingNo,
      "🙅‍♀️" to womanGesturingNo,
      "🙅‍♂️" to manGesturingNo,
      "🙆" to personGesturingOk,
      "🙆‍♀️" to womanGesturingOk,
      "🙆‍♂️" to manGesturingOk,
      "🙋" to personRaisingHand,
      "🙋‍♀️" to womanRaisingHand,
      "🙋‍♂️" to manRaisingHand,
      "🧏" to deafPerson,
      "🧏‍♀️" to deafWoman,
      "🧏‍♂️" to deafMan,
      "🤦" to personFacepalming,
      "🤦‍♀️" to womanFacepalming,
      "🤦‍♂️" to manFacepalming,
      "🤷" to personShrugging,
      "🤷‍♀️" to womanShrugging,
      "🤷‍♂️" to manShrugging,
      "🙎" to personPouting,
      "🙎‍♀️" to womanPouting,
      "🙎‍♂️" to manPouting,
      "🙍" to personFrowning,
      "🙍‍♀️" to womanFrowning,
      "🙍‍♂️" to manFrowning,
      "💇" to personGettingHaircut,
      "💇‍♀️" to womanGettingHaircut,
      "💇‍♂️" to manGettingHaircut,
      "💆" to personGettingMassage,
      "💆‍♀️" to womanGettingFaceMassage,
      "💆‍♂️" to manGettingFaceMassage,
      "🧖" to personInSteamyRoom,
      "🧖‍♀️" to womanInSteamyRoom,
      "🧖‍♂️" to manInSteamyRoom,
      "💅" to nailCare,
      "🤳" to selfie,
      "💃" to dancer,
      "🕺" to manDancing,
      "👯" to peopleWithBunnyEarsPartying,
      "👯‍♀️" to womenWithBunnyEarsPartying,
      "👯‍♂️" to menWithBunnyEarsPartying,
      "🕴️" to levitate,
      "🚶" to personWalking,
      "🚶‍♀️" to womanWalking,
      "🚶‍♂️" to manWalking,
      "🏃" to personRunning,
      "🏃‍♀️" to womanRunning,
      "🏃‍♂️" to manRunning,
      "🧍" to personStanding,
      "🧍‍♀️" to womanStanding,
      "🧍‍♂️" to manStanding,
      "🧎" to personKneeling,
      "🧎‍♀️" to womanKneeling,
      "🧎‍♂️" to manKneeling,
      "👩‍🦯" to womanWithProbingCane,
      "👨‍🦯" to manWithProbingCane,
      "👩‍🦼" to womanInMotorizedWheelchair,
      "👨‍🦼" to manInMotorizedWheelchair,
      "👩‍🦽" to womanInManualWheelchair,
      "👨‍🦽" to manInManualWheelchair,
      "🧑‍🤝‍🧑" to peopleHoldingHands,
      "👫" to couple,
      "👭" to twoWomenHoldingHands,
      "👬" to twoMenHoldingHands,
      "💑" to coupleWithHeart,
      "👩‍❤️‍👨" to coupleWithHeartWomanMan,
      "👩‍❤️‍👩" to coupleWw,
      "👨‍❤️‍👨" to coupleMm,
      "💏" to couplekiss,
      "👩‍❤️‍💋‍👨" to kissWomanMan,
      "👩‍❤️‍💋‍👩" to kissWw,
      "👨‍❤️‍💋‍👨" to kissMm,
      "👪" to family,
      "👨‍👩‍👦" to familyManWomanBoy,
      "👨‍👩‍👧" to familyMwg,
      "👨‍👩‍👧‍👦" to familyMwgb,
      "👨‍👩‍👦‍👦" to familyMwbb,
      "👨‍👩‍👧‍👧" to familyMwgg,
      "👩‍👩‍👦" to familyWwb,
      "👩‍👩‍👧" to familyWwg,
      "👩‍👩‍👧‍👦" to familyWwgb,
      "👩‍👩‍👦‍👦" to familyWwbb,
      "👩‍👩‍👧‍👧" to familyWwgg,
      "👨‍👨‍👦" to familyMmb,
      "👨‍👨‍👧" to familyMmg,
      "👨‍👨‍👧‍👦" to familyMmgb,
      "👨‍👨‍👦‍👦" to familyMmbb,
      "👨‍👨‍👧‍👧" to familyMmgg,
      "👩‍👦" to familyWomanBoy,
      "👩‍👧" to familyWomanGirl,
      "👩‍👧‍👦" to familyWomanGirlBoy,
      "👩‍👦‍👦" to familyWomanBoyBoy,
      "👩‍👧‍👧" to familyWomanGirlGirl,
      "👨‍👦" to familyManBoy,
      "👨‍👧" to familyManGirl,
      "👨‍👧‍👦" to familyManGirlBoy,
      "👨‍👦‍👦" to familyManBoyBoy,
      "👨‍👧‍👧" to familyManGirlGirl,
      "🧶" to yarn,
      "🧵" to thread,
      "🧥" to coat,
      "🥼" to labCoat,
      "🦺" to safetyVest,
      "👚" to womansClothes,
      "👕" to shirt,
      "👖" to jeans,
      "🩳" to shorts,
      "👔" to necktie,
      "👗" to dress,
      "👙" to bikini,
      "🩱" to onePieceSwimsuit,
      "👘" to kimono,
      "🥻" to sari,
      "🥿" to womansFlatShoe,
      "👠" to highHeel,
      "👡" to sandal,
      "👢" to boot,
      "🩰" to balletShoes,
      "👞" to mansShoe,
      "👟" to athleticShoe,
      "🥾" to hikingBoot,
      "🩲" to briefs,
      "🧦" to socks,
      "🧤" to gloves,
      "🧣" to scarf,
      "🎩" to tophat,
      "🧢" to billedCap,
      "👒" to womansHat,
      "🎓" to mortarBoard,
      "⛑️" to helmetWithCross,
      "👑" to crown,
      "💍" to ring,
      "👝" to pouch,
      "👛" to purse,
      "👜" to handbag,
      "💼" to briefcase,
      "🎒" to schoolSatchel,
      "🧳" to luggage,
      "👓" to eyeglasses,
      "🕶️" to darkSunglasses,
      "🥽" to goggles,
      "🤿" to divingMask,
      "🌂" to closedUmbrella,
      "🐶" to dog,
      "🐱" to cat,
      "🐭" to mouse,
      "🐹" to hamster,
      "🐰" to rabbit,
      "🦊" to fox,
      "🐻" to bear,
      "🐼" to pandaFace,
      "🐨" to koala,
      "🐯" to tiger,
      "🦁" to lionFace,
      "🐮" to cow,
      "🐷" to pig,
      "🐽" to pigNose,
      "🐸" to frog,
      "🐵" to monkeyFace,
      "🙈" to seeNoEvil,
      "🙉" to hearNoEvil,
      "🙊" to speakNoEvil,
      "🐒" to monkey,
      "🐔" to chicken,
      "🐧" to penguin,
      "🐦" to bird,
      "🐤" to babyChick,
      "🐣" to hatchingChick,
      "🐥" to hatchedChick,
      "🦆" to duck,
      "🦅" to eagle,
      "🦉" to owl,
      "🦇" to bat,
      "🐺" to wolf,
      "🐗" to boar,
      "🐴" to horse,
      "🦄" to unicorn,
      "🐝" to bee,
      "🐛" to bug,
      "🦋" to butterfly,
      "🐌" to snail,
      "🐚" to shell,
      "🐞" to beetle,
      "🐜" to ant,
      "🦟" to mosquito,
      "🦗" to cricket,
      "🕷️" to spider,
      "🕸️" to spiderWeb,
      "🦂" to scorpion,
      "🐢" to turtle,
      "🐍" to snake,
      "🦎" to lizard,
      "🦖" to tRex,
      "🦕" to sauropod,
      "🐙" to octopus,
      "🦑" to squid,
      "🦐" to shrimp,
      "🦞" to lobster,
      "🦪" to oyster,
      "🦀" to crab,
      "🐡" to blowfish,
      "🐠" to tropicalFish,
      "🐟" to fish,
      "🐬" to dolphin,
      "🐳" to whale,
      "🐋" to whale2,
      "🦈" to shark,
      "🐊" to crocodile,
      "🐅" to tiger2,
      "🐆" to leopard,
      "🦓" to zebra,
      "🦍" to gorilla,
      "🦧" to orangutan,
      "🐘" to elephant,
      "🦛" to hippopotamus,
      "🦏" to rhino,
      "🐪" to dromedaryCamel,
      "🐫" to camel,
      "🦒" to giraffe,
      "🦘" to kangaroo,
      "🐃" to waterBuffalo,
      "🐂" to ox,
      "🐄" to cow2,
      "🐎" to racehorse,
      "🐖" to pig2,
      "🐏" to ram,
      "🦙" to llama,
      "🐑" to sheep,
      "🐐" to goat,
      "🦌" to deer,
      "🐕" to dog2,
      "🦮" to guideDog,
      "🐕‍🦺" to serviceDog,
      "🐩" to poodle,
      "🐈" to cat2,
      "🐓" to rooster,
      "🦃" to turkey,
      "🦚" to peacock,
      "🦜" to parrot,
      "🦢" to swan,
      "🦩" to flamingo,
      "🕊️" to dove,
      "🐇" to rabbit2,
      "🦥" to sloth,
      "🦦" to otter,
      "🦨" to skunk,
      "🦝" to raccoon,
      "🦡" to badger,
      "🐁" to mouse2,
      "🐀" to rat,
      "🐿️" to chipmunk,
      "🦔" to hedgehog,
      "🐾" to feet,
      "🐉" to dragon,
      "🐲" to dragonFace,
      "🌵" to cactus,
      "🎄" to christmasTree,
      "🌲" to evergreenTree,
      "🌳" to deciduousTree,
      "🌴" to palmTree,
      "🌱" to seedling,
      "🌿" to herb,
      "☘️" to shamrock,
      "🍀" to fourLeafClover,
      "🎍" to bamboo,
      "🎋" to tanabataTree,
      "🍃" to leaves,
      "🍂" to fallenLeaf,
      "🍁" to mapleLeaf,
      "🍄" to mushroom,
      "🌾" to earOfRice,
      "💐" to bouquet,
      "🌷" to tulip,
      "🌹" to rose,
      "🥀" to wiltedRose,
      "🌺" to hibiscus,
      "🌸" to cherryBlossom,
      "🌼" to blossom,
      "🌻" to sunflower,
      "🌞" to sunWithFace,
      "🌝" to fullMoonWithFace,
      "🌛" to firstQuarterMoonWithFace,
      "🌜" to lastQuarterMoonWithFace,
      "🌚" to newMoonWithFace,
      "🌕" to fullMoon,
      "🌖" to waningGibbousMoon,
      "🌗" to lastQuarterMoon,
      "🌘" to waningCrescentMoon,
      "🌑" to newMoon,
      "🌒" to waxingCrescentMoon,
      "🌓" to firstQuarterMoon,
      "🌔" to waxingGibbousMoon,
      "🌙" to crescentMoon,
      "🌎" to earthAmericas,
      "🌍" to earthAfrica,
      "🌏" to earthAsia,
      "🪐" to ringedPlanet,
      "💫" to dizzy,
      "⭐" to star,
      "🌟" to star2,
      "✨" to sparkles,
      "⚡" to zap,
      "☄️" to comet,
      "💥" to boom,
      "🔥" to fire,
      "🌪️" to cloudTornado,
      "🌈" to rainbow,
      "☀️" to sunny,
      "🌤️" to whiteSunSmallCloud,
      "⛅" to partlySunny,
      "🌥️" to whiteSunCloud,
      "☁️" to cloud,
      "🌦️" to whiteSunRainCloud,
      "🌧️" to cloudRain,
      "⛈️" to thunderCloudRain,
      "🌩️" to cloudLightning,
      "🌨️" to cloudSnow,
      "❄️" to snowflake,
      "☃️" to snowman2,
      "⛄" to snowman,
      "🌬️" to windBlowingFace,
      "💨" to dash,
      "💧" to droplet,
      "💦" to sweatDrops,
      "☔" to umbrella,
      "☂️" to umbrella2,
      "🌊" to ocean,
      "🌫️" to fog,
      "🍏" to greenApple,
      "🍎" to apple,
      "🍐" to pear,
      "🍊" to tangerine,
      "🍋" to lemon,
      "🍌" to banana,
      "🍉" to watermelon,
      "🍇" to grapes,
      "🍓" to strawberry,
      "🍈" to melon,
      "🍒" to cherries,
      "🍑" to peach,
      "🥭" to mango,
      "🍍" to pineapple,
      "🥥" to coconut,
      "🥝" to kiwi,
      "🍅" to tomato,
      "🍆" to eggplant,
      "🥑" to avocado,
      "🥦" to broccoli,
      "🥬" to leafyGreen,
      "🥒" to cucumber,
      "🌶️" to hotPepper,
      "🌽" to corn,
      "🥕" to carrot,
      "🧅" to onion,
      "🧄" to garlic,
      "🥔" to potato,
      "🍠" to sweetPotato,
      "🥐" to croissant,
      "🥯" to bagel,
      "🍞" to bread,
      "🥖" to frenchBread,
      "🥨" to pretzel,
      "🧀" to cheese,
      "🥚" to egg,
      "🍳" to cooking,
      "🥞" to pancakes,
      "🧇" to waffle,
      "🥓" to bacon,
      "🥩" to cutOfMeat,
      "🍗" to poultryLeg,
      "🍖" to meatOnBone,
      "🌭" to hotdog,
      "🍔" to hamburger,
      "🍟" to fries,
      "🍕" to pizza,
      "🥪" to sandwich,
      "🧆" to falafel,
      "🥙" to stuffedFlatbread,
      "🌮" to taco,
      "🌯" to burrito,
      "🥗" to salad,
      "🥘" to shallowPanOfFood,
      "🥫" to cannedFood,
      "🍝" to spaghetti,
      "🍜" to ramen,
      "🍲" to stew,
      "🍛" to curry,
      "🍣" to sushi,
      "🍱" to bento,
      "🥟" to dumpling,
      "🍤" to friedShrimp,
      "🍙" to riceBall,
      "🍚" to rice,
      "🍘" to riceCracker,
      "🍥" to fishCake,
      "🥠" to fortuneCookie,
      "🥮" to moonCake,
      "🍢" to oden,
      "🍡" to dango,
      "🍧" to shavedIce,
      "🍨" to iceCream,
      "🍦" to icecream,
      "🥧" to pie,
      "🧁" to cupcake,
      "🍰" to cake,
      "🎂" to birthday,
      "🍮" to custard,
      "🍭" to lollipop,
      "🍬" to candy,
      "🍫" to chocolateBar,
      "🍿" to popcorn,
      "🍩" to doughnut,
      "🍪" to cookie,
      "🌰" to chestnut,
      "🥜" to peanuts,
      "🍯" to honeyPot,
      "🧈" to butter,
      "🥛" to milk,
      "🍼" to babyBottle,
      "☕" to coffee,
      "🍵" to tea,
      "🧉" to mate,
      "🥤" to cupWithStraw,
      "🧃" to beverageBox,
      "🧊" to iceCube,
      "🍶" to sake,
      "🍺" to beer,
      "🍻" to beers,
      "🥂" to champagneGlass,
      "🍷" to wineGlass,
      "🥃" to tumblerGlass,
      "🍸" to cocktail,
      "🍹" to tropicalDrink,
      "🍾" to champagne,
      "🥄" to spoon,
      "🍴" to forkAndKnife,
      "🍽️" to forkKnifePlate,
      "🥣" to bowlWithSpoon,
      "🥡" to takeoutBox,
      "🥢" to chopsticks,
      "🧂" to salt,
      "⚽" to soccer,
      "🏀" to basketball,
      "🏈" to football,
      "⚾" to baseball,
      "🥎" to softball,
      "🎾" to tennis,
      "🏐" to volleyball,
      "🏉" to rugbyFootball,
      "🥏" to flyingDisc,
      "🎱" to `8ball`,
      "🏓" to pingPong,
      "🏸" to badminton,
      "🏒" to hockey,
      "🏑" to fieldHockey,
      "🥍" to lacrosse,
      "🏏" to cricketGame,
      "🥅" to goal,
      "⛳" to golf,
      "🏹" to bowAndArrow,
      "🎣" to fishingPoleAndFish,
      "🥊" to boxingGlove,
      "🥋" to martialArtsUniform,
      "🎽" to runningShirtWithSash,
      "🛹" to skateboard,
      "🛷" to sled,
      "🪂" to parachute,
      "⛸️" to iceSkate,
      "🥌" to curlingStone,
      "🎿" to ski,
      "⛷️" to skier,
      "🏂" to snowboarder,
      "🏋️" to personLiftingWeights,
      "🏋️‍♀️" to womanLiftingWeights,
      "🏋️‍♂️" to manLiftingWeights,
      "🤼" to peopleWrestling,
      "🤼‍♀️" to womenWrestling,
      "🤼‍♂️" to menWrestling,
      "🤸" to personDoingCartwheel,
      "🤸‍♀️" to womanCartwheeling,
      "🤸‍♂️" to manCartwheeling,
      "⛹️" to personBouncingBall,
      "⛹️‍♀️" to womanBouncingBall,
      "⛹️‍♂️" to manBouncingBall,
      "🤺" to personFencing,
      "🤾" to personPlayingHandball,
      "🤾‍♀️" to womanPlayingHandball,
      "🤾‍♂️" to manPlayingHandball,
      "🏌️" to personGolfing,
      "🏌️‍♀️" to womanGolfing,
      "🏌️‍♂️" to manGolfing,
      "🏇" to horseRacing,
      "🧘" to personInLotusPosition,
      "🧘‍♀️" to womanInLotusPosition,
      "🧘‍♂️" to manInLotusPosition,
      "🏄" to personSurfing,
      "🏄‍♀️" to womanSurfing,
      "🏄‍♂️" to manSurfing,
      "🏊" to personSwimming,
      "🏊‍♀️" to womanSwimming,
      "🏊‍♂️" to manSwimming,
      "🤽" to personPlayingWaterPolo,
      "🤽‍♀️" to womanPlayingWaterPolo,
      "🤽‍♂️" to manPlayingWaterPolo,
      "🚣" to personRowingBoat,
      "🚣‍♀️" to womanRowingBoat,
      "🚣‍♂️" to manRowingBoat,
      "🧗" to personClimbing,
      "🧗‍♀️" to womanClimbing,
      "🧗‍♂️" to manClimbing,
      "🚵" to personMountainBiking,
      "🚵‍♀️" to womanMountainBiking,
      "🚵‍♂️" to manMountainBiking,
      "🚴" to personBiking,
      "🚴‍♀️" to womanBiking,
      "🚴‍♂️" to manBiking,
      "🏆" to trophy,
      "🥇" to firstPlace,
      "🥈" to secondPlace,
      "🥉" to thirdPlace,
      "🏅" to medal,
      "🎖️" to militaryMedal,
      "🏵️" to rosette,
      "🎗️" to reminderRibbon,
      "🎫" to ticket,
      "🎟️" to tickets,
      "🎪" to circusTent,
      "🤹" to personJuggling,
      "🤹‍♀️" to womanJuggling,
      "🤹‍♂️" to manJuggling,
      "🎭" to performingArts,
      "🎨" to art,
      "🎬" to clapper,
      "🎤" to microphone,
      "🎧" to headphones,
      "🎼" to musicalScore,
      "🎹" to musicalKeyboard,
      "🥁" to drum,
      "🎷" to saxophone,
      "🎺" to trumpet,
      "🪕" to banjo,
      "🎸" to guitar,
      "🎻" to violin,
      "🎲" to gameDie,
      "♟️" to chessPawn,
      "🎯" to dart,
      "🪁" to kite,
      "🪀" to yoYo,
      "🎳" to bowling,
      "🎮" to videoGame,
      "🎰" to slotMachine,
      "🧩" to jigsaw,
      "🚗" to redCar,
      "🚕" to taxi,
      "🚙" to blueCar,
      "🚌" to bus,
      "🚎" to trolleybus,
      "🏎️" to raceCar,
      "🚓" to policeCar,
      "🚑" to ambulance,
      "🚒" to fireEngine,
      "🚐" to minibus,
      "🚚" to truck,
      "🚛" to articulatedLorry,
      "🚜" to tractor,
      "🛺" to autoRickshaw,
      "🛵" to motorScooter,
      "🏍️" to motorcycle,
      "🛴" to scooter,
      "🚲" to bike,
      "🦼" to motorizedWheelchair,
      "🦽" to manualWheelchair,
      "🚨" to rotatingLight,
      "🚔" to oncomingPoliceCar,
      "🚍" to oncomingBus,
      "🚘" to oncomingAutomobile,
      "🚖" to oncomingTaxi,
      "🚡" to aerialTramway,
      "🚠" to mountainCableway,
      "🚟" to suspensionRailway,
      "🚃" to railwayCar,
      "🚋" to train,
      "🚞" to mountainRailway,
      "🚝" to monorail,
      "🚄" to bullettrainSide,
      "🚅" to bullettrainFront,
      "🚈" to lightRail,
      "🚂" to steamLocomotive,
      "🚆" to train2,
      "🚇" to metro,
      "🚊" to tram,
      "🚉" to station,
      "✈️" to airplane,
      "🛫" to airplaneDeparture,
      "🛬" to airplaneArriving,
      "🛩️" to airplaneSmall,
      "💺" to seat,
      "🛰️" to satelliteOrbital,
      "🚀" to rocket,
      "🛸" to flyingSaucer,
      "🚁" to helicopter,
      "🛶" to canoe,
      "⛵" to sailboat,
      "🚤" to speedboat,
      "🛥️" to motorboat,
      "🛳️" to cruiseShip,
      "⛴️" to ferry,
      "🚢" to ship,
      "⚓" to anchor,
      "⛽" to fuelpump,
      "🚧" to construction,
      "🚦" to verticalTrafficLight,
      "🚥" to trafficLight,
      "🚏" to busstop,
      "🗺️" to map,
      "🗿" to moyai,
      "🗽" to statueOfLiberty,
      "🗼" to tokyoTower,
      "🏰" to europeanCastle,
      "🏯" to japaneseCastle,
      "🏟️" to stadium,
      "🎡" to ferrisWheel,
      "🎢" to rollerCoaster,
      "🎠" to carouselHorse,
      "⛲" to fountain,
      "⛱️" to beachUmbrella,
      "🏖️" to beach,
      "🏝️" to island,
      "🏜️" to desert,
      "🌋" to volcano,
      "⛰️" to mountain,
      "🏔️" to mountainSnow,
      "🗻" to mountFuji,
      "🏕️" to camping,
      "⛺" to tent,
      "🏠" to house,
      "🏡" to houseWithGarden,
      "🏘️" to homes,
      "🏚️" to houseAbandoned,
      "🏗️" to constructionSite,
      "🏭" to factory,
      "🏢" to office,
      "🏬" to departmentStore,
      "🏣" to postOffice,
      "🏤" to europeanPostOffice,
      "🏥" to hospital,
      "🏦" to bank,
      "🏨" to hotel,
      "🏪" to convenienceStore,
      "🏫" to school,
      "🏩" to loveHotel,
      "💒" to wedding,
      "🏛️" to classicalBuilding,
      "⛪" to church,
      "🕌" to mosque,
      "🛕" to hinduTemple,
      "🕍" to synagogue,
      "🕋" to kaaba,
      "⛩️" to shintoShrine,
      "🛤️" to railwayTrack,
      "🛣️" to motorway,
      "🗾" to japan,
      "🎑" to riceScene,
      "🏞️" to park,
      "🌅" to sunrise,
      "🌄" to sunriseOverMountains,
      "🌠" to stars,
      "🎇" to sparkler,
      "🎆" to fireworks,
      "🌇" to citySunset,
      "🌆" to cityDusk,
      "🏙️" to cityscape,
      "🌃" to nightWithStars,
      "🌌" to milkyWay,
      "🌉" to bridgeAtNight,
      "🌁" to foggy,
      "⌚" to watch,
      "📱" to iphone,
      "📲" to calling,
      "💻" to computer,
      "⌨️" to keyboard,
      "🖥️" to desktop,
      "🖨️" to printer,
      "🖱️" to mouseThreeButton,
      "🖲️" to trackball,
      "🕹️" to joystick,
      "🗜️" to compression,
      "💽" to minidisc,
      "💾" to floppyDisk,
      "💿" to cd,
      "📀" to dvd,
      "📼" to vhs,
      "📷" to camera,
      "📸" to cameraWithFlash,
      "📹" to videoCamera,
      "🎥" to movieCamera,
      "📽️" to projector,
      "🎞️" to filmFrames,
      "📞" to telephoneReceiver,
      "☎️" to telephone,
      "📟" to pager,
      "📠" to fax,
      "📺" to tv,
      "📻" to radio,
      "🎙️" to microphone2,
      "🎚️" to levelSlider,
      "🎛️" to controlKnobs,
      "🧭" to compass,
      "⏱️" to stopwatch,
      "⏲️" to timer,
      "⏰" to alarmClock,
      "🕰️" to clock,
      "⌛" to hourglass,
      "⏳" to hourglassFlowingSand,
      "📡" to satellite,
      "🔋" to battery,
      "🔌" to electricPlug,
      "💡" to bulb,
      "🔦" to flashlight,
      "🕯️" to candle,
      "🧯" to fireExtinguisher,
      "🛢️" to oil,
      "💸" to moneyWithWings,
      "💵" to dollar,
      "💴" to yen,
      "💶" to euro,
      "💷" to pound,
      "💰" to moneybag,
      "💳" to creditCard,
      "💎" to gem,
      "⚖️" to scales,
      "🧰" to toolbox,
      "🔧" to wrench,
      "🔨" to hammer,
      "⚒️" to hammerPick,
      "🛠️" to tools,
      "⛏️" to pick,
      "🔩" to nutAndBolt,
      "⚙️" to gear,
      "🧱" to bricks,
      "⛓️" to chains,
      "🧲" to magnet,
      "🔫" to gun,
      "💣" to bomb,
      "🧨" to firecracker,
      "🪓" to axe,
      "🪒" to razor,
      "🔪" to knife,
      "🗡️" to dagger,
      "⚔️" to crossedSwords,
      "🛡️" to shield,
      "🚬" to smoking,
      "⚰️" to coffin,
      "⚱️" to urn,
      "🏺" to amphora,
      "🪔" to diyaLamp,
      "🔮" to crystalBall,
      "📿" to prayerBeads,
      "🧿" to nazarAmulet,
      "💈" to barber,
      "⚗️" to alembic,
      "🔭" to telescope,
      "🔬" to microscope,
      "🕳️" to hole,
      "🦯" to probingCane,
      "🩺" to stethoscope,
      "🩹" to adhesiveBandage,
      "💊" to pill,
      "💉" to syringe,
      "🩸" to dropOfBlood,
      "🧬" to dna,
      "🦠" to microbe,
      "🧫" to petriDish,
      "🧪" to testTube,
      "🌡️" to thermometer,
      "🪑" to chair,
      "🧹" to broom,
      "🧺" to basket,
      "🧻" to rollOfPaper,
      "🚽" to toilet,
      "🚰" to potableWater,
      "🚿" to shower,
      "🛁" to bathtub,
      "🛀" to bath,
      "🧼" to soap,
      "🧽" to sponge,
      "🧴" to squeezeBottle,
      "🛎️" to bellhop,
      "🔑" to key,
      "🗝️" to key2,
      "🚪" to door,
      "🛋️" to couch,
      "🛏️" to bed,
      "🛌" to sleepingAccommodation,
      "🧸" to teddyBear,
      "🖼️" to framePhoto,
      "🛍️" to shoppingBags,
      "🛒" to shoppingCart,
      "🎁" to gift,
      "🎈" to balloon,
      "🎏" to flags,
      "🎀" to ribbon,
      "🎊" to confettiBall,
      "🎉" to tada,
      "🎎" to dolls,
      "🏮" to izakayaLantern,
      "🎐" to windChime,
      "🧧" to redEnvelope,
      "✉️" to envelope,
      "📩" to envelopeWithArrow,
      "📨" to incomingEnvelope,
      "📧" to eMail,
      "💌" to loveLetter,
      "📥" to inboxTray,
      "📤" to outboxTray,
      "📦" to `package`,
      "🏷️" to label,
      "📪" to mailboxClosed,
      "📫" to mailbox,
      "📬" to mailboxWithMail,
      "📭" to mailboxWithNoMail,
      "📮" to postbox,
      "📯" to postalHorn,
      "📜" to scroll,
      "📃" to pageWithCurl,
      "📄" to pageFacingUp,
      "📑" to bookmarkTabs,
      "🧾" to receipt,
      "📊" to barChart,
      "📈" to chartWithUpwardsTrend,
      "📉" to chartWithDownwardsTrend,
      "🗒️" to notepadSpiral,
      "🗓️" to calendarSpiral,
      "📆" to calendar,
      "📅" to date,
      "🗑️" to wastebasket,
      "📇" to cardIndex,
      "🗃️" to cardBox,
      "🗳️" to ballotBox,
      "🗄️" to fileCabinet,
      "📋" to clipboard,
      "📁" to fileFolder,
      "📂" to openFileFolder,
      "🗂️" to dividers,
      "🗞️" to newspaper2,
      "📰" to newspaper,
      "📓" to notebook,
      "📔" to notebookWithDecorativeCover,
      "📒" to ledger,
      "📕" to closedBook,
      "📗" to greenBook,
      "📘" to blueBook,
      "📙" to orangeBook,
      "📚" to books,
      "📖" to book,
      "🔖" to bookmark,
      "🧷" to safetyPin,
      "🔗" to link,
      "📎" to paperclip,
      "🖇️" to paperclips,
      "📐" to triangularRuler,
      "📏" to straightRuler,
      "🧮" to abacus,
      "📌" to pushpin,
      "📍" to roundPushpin,
      "✂️" to scissors,
      "🖊️" to penBallpoint,
      "🖋️" to penFountain,
      "✒️" to blackNib,
      "🖌️" to paintbrush,
      "🖍️" to crayon,
      "📝" to pencil,
      "✏️" to pencil2,
      "🔍" to mag,
      "🔎" to magRight,
      "🔏" to lockWithInkPen,
      "🔐" to closedLockWithKey,
      "🔒" to lock,
      "🔓" to unlock,
      "❤️" to heart,
      "🧡" to orangeHeart,
      "💛" to yellowHeart,
      "💚" to greenHeart,
      "💙" to blueHeart,
      "💜" to purpleHeart,
      "🖤" to blackHeart,
      "🤎" to brownHeart,
      "🤍" to whiteHeart,
      "💔" to brokenHeart,
      "❣️" to heartExclamation,
      "💕" to twoHearts,
      "💞" to revolvingHearts,
      "💓" to heartbeat,
      "💗" to heartpulse,
      "💖" to sparklingHeart,
      "💘" to cupid,
      "💝" to giftHeart,
      "💟" to heartDecoration,
      "☮️" to peace,
      "✝️" to cross,
      "☪️" to starAndCrescent,
      "🕉️" to omSymbol,
      "☸️" to wheelOfDharma,
      "✡️" to starOfDavid,
      "🔯" to sixPointedStar,
      "🕎" to menorah,
      "☯️" to yinYang,
      "☦️" to orthodoxCross,
      "🛐" to placeOfWorship,
      "⛎" to ophiuchus,
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
      "🆔" to id,
      "⚛️" to atom,
      "🉑" to accept,
      "☢️" to radioactive,
      "☣️" to biohazard,
      "📴" to mobilePhoneOff,
      "📳" to vibrationMode,
      "🈶" to u6709,
      "🈚" to u7121,
      "🈸" to u7533,
      "🈺" to u55b6,
      "🈷️" to u6708,
      "✴️" to eightPointedBlackStar,
      "🆚" to vs,
      "💮" to whiteFlower,
      "🉐" to ideographAdvantage,
      "㊙️" to secret,
      "㊗️" to congratulations,
      "🈴" to u5408,
      "🈵" to u6e80,
      "🈹" to u5272,
      "🈲" to u7981,
      "🅰️" to a,
      "🅱️" to b,
      "🆎" to ab,
      "🆑" to cl,
      "🅾️" to o2,
      "🆘" to sos,
      "❌" to x,
      "⭕" to o,
      "🛑" to octagonalSign,
      "⛔" to noEntry,
      "📛" to nameBadge,
      "🚫" to noEntrySign,
      "💯" to `100`,
      "💢" to anger,
      "♨️" to hotsprings,
      "🚷" to noPedestrians,
      "🚯" to doNotLitter,
      "🚳" to noBicycles,
      "🚱" to nonPotableWater,
      "🔞" to underage,
      "📵" to noMobilePhones,
      "🚭" to noSmoking,
      "❗" to exclamation,
      "❕" to greyExclamation,
      "❓" to question,
      "❔" to greyQuestion,
      "‼️" to bangbang,
      "⁉️" to interrobang,
      "🔅" to lowBrightness,
      "🔆" to highBrightness,
      "〽️" to partAlternationMark,
      "⚠️" to warning,
      "🚸" to childrenCrossing,
      "🔱" to trident,
      "⚜️" to fleurDeLis,
      "🔰" to beginner,
      "♻️" to recycle,
      "✅" to whiteCheckMark,
      "🈯" to u6307,
      "💹" to chart,
      "❇️" to sparkle,
      "✳️" to eightSpokedAsterisk,
      "❎" to negativeSquaredCrossMark,
      "🌐" to globeWithMeridians,
      "💠" to diamondShapeWithADotInside,
      "Ⓜ️" to m,
      "🌀" to cyclone,
      "💤" to zzz,
      "🏧" to atm,
      "🚾" to wc,
      "♿" to wheelchair,
      "🅿️" to parking,
      "🈳" to u7a7a,
      "🈂️" to sa,
      "🛂" to passportControl,
      "🛃" to customs,
      "🛄" to baggageClaim,
      "🛅" to leftLuggage,
      "🚹" to mens,
      "🚺" to womens,
      "🚼" to babySymbol,
      "🚻" to restroom,
      "🚮" to putLitterInItsPlace,
      "🎦" to cinema,
      "📶" to signalStrength,
      "🈁" to koko,
      "🔣" to symbols,
      "ℹ️" to informationSource,
      "🔤" to abc,
      "🔡" to abcd,
      "🔠" to capitalAbcd,
      "🆖" to ng,
      "🆗" to ok,
      "🆙" to up,
      "🆒" to cool,
      "🆕" to new,
      "🆓" to free,
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
      "🔢" to `1234`,
      "#️⃣" to hash,
      "*️⃣" to asterisk,
      "⏏️" to eject,
      "▶️" to arrowForward,
      "⏸️" to pauseButton,
      "⏯️" to playPause,
      "⏹️" to stopButton,
      "⏺️" to recordButton,
      "⏭️" to trackNext,
      "⏮️" to trackPrevious,
      "⏩" to fastForward,
      "⏪" to rewind,
      "⏫" to arrowDoubleUp,
      "⏬" to arrowDoubleDown,
      "◀️" to arrowBackward,
      "🔼" to arrowUpSmall,
      "🔽" to arrowDownSmall,
      "➡️" to arrowRight,
      "⬅️" to arrowLeft,
      "⬆️" to arrowUp,
      "⬇️" to arrowDown,
      "↗️" to arrowUpperRight,
      "↘️" to arrowLowerRight,
      "↙️" to arrowLowerLeft,
      "↖️" to arrowUpperLeft,
      "↕️" to arrowUpDown,
      "↔️" to leftRightArrow,
      "↪️" to arrowRightHook,
      "↩️" to leftwardsArrowWithHook,
      "⤴️" to arrowHeadingUp,
      "⤵️" to arrowHeadingDown,
      "🔀" to twistedRightwardsArrows,
      "🔁" to repeat,
      "🔂" to repeatOne,
      "🔄" to arrowsCounterclockwise,
      "🔃" to arrowsClockwise,
      "🎵" to musicalNote,
      "🎶" to notes,
      "➕" to heavyPlusSign,
      "➖" to heavyMinusSign,
      "➗" to heavyDivisionSign,
      "✖️" to heavyMultiplicationX,
      "♾️" to infinity,
      "💲" to heavyDollarSign,
      "💱" to currencyExchange,
      "™️" to tm,
      "©️" to copyright,
      "®️" to registered,
      "〰️" to wavyDash,
      "➰" to curlyLoop,
      "➿" to loop,
      "🔚" to end,
      "🔙" to back,
      "🔛" to on,
      "🔝" to top,
      "🔜" to soon,
      "✔️" to heavyCheckMark,
      "☑️" to ballotBoxWithCheck,
      "🔘" to radioButton,
      "⚪" to whiteCircle,
      "⚫" to blackCircle,
      "🔴" to redCircle,
      "🔵" to blueCircle,
      "🟤" to brownCircle,
      "🟣" to purpleCircle,
      "🟢" to greenCircle,
      "🟡" to yellowCircle,
      "🟠" to orangeCircle,
      "🔺" to smallRedTriangle,
      "🔻" to smallRedTriangleDown,
      "🔸" to smallOrangeDiamond,
      "🔹" to smallBlueDiamond,
      "🔶" to largeOrangeDiamond,
      "🔷" to largeBlueDiamond,
      "🔳" to whiteSquareButton,
      "🔲" to blackSquareButton,
      "▪️" to blackSmallSquare,
      "▫️" to whiteSmallSquare,
      "◾" to blackMediumSmallSquare,
      "◽" to whiteMediumSmallSquare,
      "◼️" to blackMediumSquare,
      "◻️" to whiteMediumSquare,
      "⬛" to blackLargeSquare,
      "⬜" to whiteLargeSquare,
      "🟧" to orangeSquare,
      "🟦" to blueSquare,
      "🟥" to redSquare,
      "🟫" to brownSquare,
      "🟪" to purpleSquare,
      "🟩" to greenSquare,
      "🟨" to yellowSquare,
      "🔈" to speaker,
      "🔇" to mute,
      "🔉" to sound,
      "🔊" to loudSound,
      "🔔" to bell,
      "🔕" to noBell,
      "📣" to mega,
      "📢" to loudspeaker,
      "🗨️" to speechLeft,
      "👁‍🗨" to eyeInSpeechBubble,
      "💬" to speechBalloon,
      "💭" to thoughtBalloon,
      "🗯️" to angerRight,
      "♠️" to spades,
      "♣️" to clubs,
      "♥️" to hearts,
      "♦️" to diamonds,
      "🃏" to blackJoker,
      "🎴" to flowerPlayingCards,
      "🀄" to mahjong,
      "🕐" to clock1,
      "🕑" to clock2,
      "🕒" to clock3,
      "🕓" to clock4,
      "🕔" to clock5,
      "🕕" to clock6,
      "🕖" to clock7,
      "🕗" to clock8,
      "🕘" to clock9,
      "🕙" to clock10,
      "🕚" to clock11,
      "🕛" to clock12,
      "🕜" to clock130,
      "🕝" to clock230,
      "🕞" to clock330,
      "🕟" to clock430,
      "🕠" to clock530,
      "🕡" to clock630,
      "🕢" to clock730,
      "🕣" to clock830,
      "🕤" to clock930,
      "🕥" to clock1030,
      "🕦" to clock1130,
      "🕧" to clock1230,
      "♀️" to femaleSign,
      "♂️" to maleSign,
      "⚕️" to medicalSymbol,
      "🇿" to regionalIndicatorZ,
      "🇾" to regionalIndicatorY,
      "🇽" to regionalIndicatorX,
      "🇼" to regionalIndicatorW,
      "🇻" to regionalIndicatorV,
      "🇺" to regionalIndicatorU,
      "🇹" to regionalIndicatorT,
      "🇸" to regionalIndicatorS,
      "🇷" to regionalIndicatorR,
      "🇶" to regionalIndicatorQ,
      "🇵" to regionalIndicatorP,
      "🇴" to regionalIndicatorO,
      "🇳" to regionalIndicatorN,
      "🇲" to regionalIndicatorM,
      "🇱" to regionalIndicatorL,
      "🇰" to regionalIndicatorK,
      "🇯" to regionalIndicatorJ,
      "🇮" to regionalIndicatorI,
      "🇭" to regionalIndicatorH,
      "🇬" to regionalIndicatorG,
      "🇫" to regionalIndicatorF,
      "🇪" to regionalIndicatorE,
      "🇩" to regionalIndicatorD,
      "🇨" to regionalIndicatorC,
      "🇧" to regionalIndicatorB,
      "🇦" to regionalIndicatorA,
      "🏳️" to flagWhite,
      "🏴" to flagBlack,
      "🏁" to checkeredFlag,
      "🚩" to triangularFlagOnPost,
      "🏳️‍🌈" to rainbowFlag,
      "🏴‍☠️" to pirateFlag,
      "🇦🇫" to flagAf,
      "🇦🇽" to flagAx,
      "🇦🇱" to flagAl,
      "🇩🇿" to flagDz,
      "🇦🇸" to flagAs,
      "🇦🇩" to flagAd,
      "🇦🇴" to flagAo,
      "🇦🇮" to flagAi,
      "🇦🇶" to flagAq,
      "🇦🇬" to flagAg,
      "🇦🇷" to flagAr,
      "🇦🇲" to flagAm,
      "🇦🇼" to flagAw,
      "🇦🇺" to flagAu,
      "🇦🇹" to flagAt,
      "🇦🇿" to flagAz,
      "🇧🇸" to flagBs,
      "🇧🇭" to flagBh,
      "🇧🇩" to flagBd,
      "🇧🇧" to flagBb,
      "🇧🇾" to flagBy,
      "🇧🇪" to flagBe,
      "🇧🇿" to flagBz,
      "🇧🇯" to flagBj,
      "🇧🇲" to flagBm,
      "🇧🇹" to flagBt,
      "🇧🇴" to flagBo,
      "🇧🇦" to flagBa,
      "🇧🇼" to flagBw,
      "🇧🇷" to flagBr,
      "🇮🇴" to flagIo,
      "🇻🇬" to flagVg,
      "🇧🇳" to flagBn,
      "🇧🇬" to flagBg,
      "🇧🇫" to flagBf,
      "🇧🇮" to flagBi,
      "🇰🇭" to flagKh,
      "🇨🇲" to flagCm,
      "🇨🇦" to flagCa,
      "🇮🇨" to flagIc,
      "🇨🇻" to flagCv,
      "🇧🇶" to flagBq,
      "🇰🇾" to flagKy,
      "🇨🇫" to flagCf,
      "🇹🇩" to flagTd,
      "🇨🇱" to flagCl,
      "🇨🇳" to flagCn,
      "🇨🇽" to flagCx,
      "🇨🇨" to flagCc,
      "🇨🇴" to flagCo,
      "🇰🇲" to flagKm,
      "🇨🇬" to flagCg,
      "🇨🇩" to flagCd,
      "🇨🇰" to flagCk,
      "🇨🇷" to flagCr,
      "🇨🇮" to flagCi,
      "🇭🇷" to flagHr,
      "🇨🇺" to flagCu,
      "🇨🇼" to flagCw,
      "🇨🇾" to flagCy,
      "🇨🇿" to flagCz,
      "🇩🇰" to flagDk,
      "🇩🇯" to flagDj,
      "🇩🇲" to flagDm,
      "🇩🇴" to flagDo,
      "🇪🇨" to flagEc,
      "🇪🇬" to flagEg,
      "🇸🇻" to flagSv,
      "🇬🇶" to flagGq,
      "🇪🇷" to flagEr,
      "🇪🇪" to flagEe,
      "🇪🇹" to flagEt,
      "🇪🇺" to flagEu,
      "🇫🇰" to flagFk,
      "🇫🇴" to flagFo,
      "🇫🇯" to flagFj,
      "🇫🇮" to flagFi,
      "🇫🇷" to flagFr,
      "🇬🇫" to flagGf,
      "🇵🇫" to flagPf,
      "🇹🇫" to flagTf,
      "🇬🇦" to flagGa,
      "🇬🇲" to flagGm,
      "🇬🇪" to flagGe,
      "🇩🇪" to flagDe,
      "🇬🇭" to flagGh,
      "🇬🇮" to flagGi,
      "🇬🇷" to flagGr,
      "🇬🇱" to flagGl,
      "🇬🇩" to flagGd,
      "🇬🇵" to flagGp,
      "🇬🇺" to flagGu,
      "🇬🇹" to flagGt,
      "🇬🇬" to flagGg,
      "🇬🇳" to flagGn,
      "🇬🇼" to flagGw,
      "🇬🇾" to flagGy,
      "🇭🇹" to flagHt,
      "🇭🇳" to flagHn,
      "🇭🇰" to flagHk,
      "🇭🇺" to flagHu,
      "🇮🇸" to flagIs,
      "🇮🇳" to flagIn,
      "🇮🇩" to flagId,
      "🇮🇷" to flagIr,
      "🇮🇶" to flagIq,
      "🇮🇪" to flagIe,
      "🇮🇲" to flagIm,
      "🇮🇱" to flagIl,
      "🇮🇹" to flagIt,
      "🇯🇲" to flagJm,
      "🇯🇵" to flagJp,
      "🎌" to crossedFlags,
      "🇯🇪" to flagJe,
      "🇯🇴" to flagJo,
      "🇰🇿" to flagKz,
      "🇰🇪" to flagKe,
      "🇰🇮" to flagKi,
      "🇽🇰" to flagXk,
      "🇰🇼" to flagKw,
      "🇰🇬" to flagKg,
      "🇱🇦" to flagLa,
      "🇱🇻" to flagLv,
      "🇱🇧" to flagLb,
      "🇱🇸" to flagLs,
      "🇱🇷" to flagLr,
      "🇱🇾" to flagLy,
      "🇱🇮" to flagLi,
      "🇱🇹" to flagLt,
      "🇱🇺" to flagLu,
      "🇲🇴" to flagMo,
      "🇲🇰" to flagMk,
      "🇲🇬" to flagMg,
      "🇲🇼" to flagMw,
      "🇲🇾" to flagMy,
      "🇲🇻" to flagMv,
      "🇲🇱" to flagMl,
      "🇲🇹" to flagMt,
      "🇲🇭" to flagMh,
      "🇲🇶" to flagMq,
      "🇲🇷" to flagMr,
      "🇲🇺" to flagMu,
      "🇾🇹" to flagYt,
      "🇲🇽" to flagMx,
      "🇫🇲" to flagFm,
      "🇲🇩" to flagMd,
      "🇲🇨" to flagMc,
      "🇲🇳" to flagMn,
      "🇲🇪" to flagMe,
      "🇲🇸" to flagMs,
      "🇲🇦" to flagMa,
      "🇲🇿" to flagMz,
      "🇲🇲" to flagMm,
      "🇳🇦" to flagNa,
      "🇳🇷" to flagNr,
      "🇳🇵" to flagNp,
      "🇳🇱" to flagNl,
      "🇳🇨" to flagNc,
      "🇳🇿" to flagNz,
      "🇳🇮" to flagNi,
      "🇳🇪" to flagNe,
      "🇳🇬" to flagNg,
      "🇳🇺" to flagNu,
      "🇳🇫" to flagNf,
      "🇰🇵" to flagKp,
      "🇲🇵" to flagMp,
      "🇳🇴" to flagNo,
      "🇴🇲" to flagOm,
      "🇵🇰" to flagPk,
      "🇵🇼" to flagPw,
      "🇵🇸" to flagPs,
      "🇵🇦" to flagPa,
      "🇵🇬" to flagPg,
      "🇵🇾" to flagPy,
      "🇵🇪" to flagPe,
      "🇵🇭" to flagPh,
      "🇵🇳" to flagPn,
      "🇵🇱" to flagPl,
      "🇵🇹" to flagPt,
      "🇵🇷" to flagPr,
      "🇶🇦" to flagQa,
      "🇷🇪" to flagRe,
      "🇷🇴" to flagRo,
      "🇷🇺" to flagRu,
      "🇷🇼" to flagRw,
      "🇼🇸" to flagWs,
      "🇸🇲" to flagSm,
      "🇸🇹" to flagSt,
      "🇸🇦" to flagSa,
      "🇸🇳" to flagSn,
      "🇷🇸" to flagRs,
      "🇸🇨" to flagSc,
      "🇸🇱" to flagSl,
      "🇸🇬" to flagSg,
      "🇸🇽" to flagSx,
      "🇸🇰" to flagSk,
      "🇸🇮" to flagSi,
      "🇬🇸" to flagGs,
      "🇸🇧" to flagSb,
      "🇸🇴" to flagSo,
      "🇿🇦" to flagZa,
      "🇰🇷" to flagKr,
      "🇸🇸" to flagSs,
      "🇪🇸" to flagEs,
      "🇱🇰" to flagLk,
      "🇧🇱" to flagBl,
      "🇸🇭" to flagSh,
      "🇰🇳" to flagKn,
      "🇱🇨" to flagLc,
      "🇵🇲" to flagPm,
      "🇻🇨" to flagVc,
      "🇸🇩" to flagSd,
      "🇸🇷" to flagSr,
      "🇸🇿" to flagSz,
      "🇸🇪" to flagSe,
      "🇨🇭" to flagCh,
      "🇸🇾" to flagSy,
      "🇹🇼" to flagTw,
      "🇹🇯" to flagTj,
      "🇹🇿" to flagTz,
      "🇹🇭" to flagTh,
      "🇹🇱" to flagTl,
      "🇹🇬" to flagTg,
      "🇹🇰" to flagTk,
      "🇹🇴" to flagTo,
      "🇹🇹" to flagTt,
      "🇹🇳" to flagTn,
      "🇹🇷" to flagTr,
      "🇹🇲" to flagTm,
      "🇹🇨" to flagTc,
      "🇻🇮" to flagVi,
      "🇹🇻" to flagTv,
      "🇺🇬" to flagUg,
      "🇺🇦" to flagUa,
      "🇦🇪" to flagAe,
      "🇬🇧" to flagGb,
      "🏴󠁧󠁢󠁥󠁮󠁧󠁿" to england,
      "🏴󠁧󠁢󠁳󠁣󠁴󠁿" to scotland,
      "🏴󠁧󠁢󠁷󠁬󠁳󠁿" to wales,
      "🇺🇸" to flagUs,
      "🇺🇾" to flagUy,
      "🇺🇿" to flagUz,
      "🇻🇺" to flagVu,
      "🇻🇦" to flagVa,
      "🇻🇪" to flagVe,
      "🇻🇳" to flagVn,
      "🇼🇫" to flagWf,
      "🇪🇭" to flagEh,
      "🇾🇪" to flagYe,
      "🇿🇲" to flagZm,
      "🇿🇼" to flagZw,
      "🇦🇨" to flagAc,
      "🇧🇻" to flagBv,
      "🇨🇵" to flagCp,
      "🇪🇦" to flagEa,
      "🇩🇬" to flagDg,
      "🇭🇲" to flagHm,
      "🇲🇫" to flagMf,
      "🇸🇯" to flagSj,
      "🇹🇦" to flagTa,
      "🇺🇲" to flagUm,
      "🇺🇳" to unitedNations)

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

  public val joy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😂")

  public val rofl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤣")

  public val rollingOnTheFloorLaughing: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤣")

  public val relaxed: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☺️")

  public val blush: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😊")

  public val innocent: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😇")

  public val slightSmile: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🙂")

  public val slightlySmilingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🙂")

  public val upsideDown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🙃")

  public val upsideDownFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🙃")

  public val wink: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😉")

  public val relieved: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😌")

  public val heartEyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😍")

  @JsName("DHDBCxDACxDCCvByCpCrCtCfCxDICwBfCACtCpDGDIDH")
  public val smilingFaceWith3Hearts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥰")

  public val kissingHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😘")

  public val kissing: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😗")

  public val kissingSmilingEyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😙")

  public val kissingClosedEyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😚")

  public val yum: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😋")

  public val stuckOutTongue: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😛")

  public val stuckOutTongueClosedEyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😝")

  public val stuckOutTongueWinkingEye: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😜")

  public val zanyFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤪")

  public val faceWithRaisedEyebrow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤨")

  public val faceWithMonocle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧐")

  public val nerd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤓")

  public val nerdFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤓")

  public val sunglasses: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😎")

  public val starStruck: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤩")

  public val partyingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥳")

  public val smirk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😏")

  public val unamused: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😒")

  public val disappointed: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😞")

  public val pensive: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😔")

  public val worried: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😟")

  public val confused: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😕")

  public val slightFrown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🙁")

  public val slightlyFrowningFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🙁")

  @JsName("CuDGDDDbDCCxDCCvBe")
  public val frowning2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☹️")

  public val whiteFrowningFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☹️")

  public val persevere: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😣")

  public val confounded: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😖")

  public val tiredFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😫")

  public val weary: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😩")

  public val pleadingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥺")

  public val cry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😢")

  public val sob: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😭")

  public val triumph: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😤")

  public val angry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😠")

  public val rage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😡")

  public val faceWithSymbolsOverMouth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤬")

  public val explodingHead: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤯")

  public val flushed: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😳")

  public val hotFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥵")

  public val coldFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥶")

  public val scream: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😱")

  public val fearful: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😨")

  public val coldSweat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😰")

  public val disappointedRelieved: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😥")

  public val sweat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😓")

  public val hugging: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤗")

  public val huggingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤗")

  public val thinking: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤔")

  public val thinkingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤔")

  public val faceWithHandOverMouth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤭")

  public val yawningFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥱")

  public val shushingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤫")

  public val lyingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤥")

  public val liar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤥")

  public val noMouth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😶")

  public val neutralFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😐")

  public val expressionless: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😑")

  public val grimacing: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😬")

  public val rollingEyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🙄")

  public val faceWithRollingEyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🙄")

  public val hushed: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😯")

  public val frowning: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😦")

  public val anguished: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😧")

  public val openMouth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😮")

  public val astonished: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😲")

  public val sleeping: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😴")

  public val droolingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤤")

  public val drool: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤤")

  public val sleepy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😪")

  public val dizzyFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😵")

  public val zipperMouth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤐")

  public val zipperMouthFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤐")

  public val woozyFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥴")

  public val nauseatedFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤢")

  public val sick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤢")

  public val faceVomiting: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤮")

  public val sneezingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤧")

  public val sneeze: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤧")

  public val mask: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😷")

  public val thermometerFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤒")

  public val faceWithThermometer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤒")

  public val headBandage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤕")

  public val faceWithHeadBandage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤕")

  public val moneyMouth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤑")

  public val moneyMouthFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤑")

  public val cowboy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤠")

  public val faceWithCowboyHat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤠")

  public val smilingImp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😈")

  public val imp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👿")

  public val japaneseOgre: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👹")

  public val japaneseGoblin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👺")

  public val clown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤡")

  public val clownFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤡")

  public val poop: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💩")

  public val shit: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💩")

  public val hankey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💩")

  public val poo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💩")

  public val ghost: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👻")

  public val skull: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💀")

  public val skeleton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💀")

  public val skullCrossbones: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☠️")

  public val skullAndCrossbones: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☠️")

  public val alien: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👽")

  public val spaceInvader: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👾")

  public val robot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤖")

  public val robotFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤖")

  public val jackOLantern: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎃")

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

  public val palmsUpTogether: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤲")

  public val openHands: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👐")

  public val raisedHands: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙌")

  public val clap: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👏")

  public val handshake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤝")

  public val shakingHands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤝")

  public val thumbsup: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👍")

  @JsName("BHBd")
  public val `+1`: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👍")

  public val thumbup: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👍")

  public val thumbsdown: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👎")

  @JsName("BJBd")
  public val `-1`: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👎")

  public val thumbdown: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👎")

  public val punch: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👊")

  public val fist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("✊")

  public val leftFacingFist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤛")

  public val leftFist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤛")

  public val rightFacingFist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤜")

  public val rightFist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤜")

  public val fingersCrossed: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤞")

  public val handWithIndexAndMiddleFingerCrossed: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤞")

  public val v: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("✌️")

  public val loveYouGesture: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤟")

  public val metal: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤘")

  public val signOfTheHorns: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤘")

  public val okHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👌")

  public val pinchingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤏")

  public val pointLeft: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👈")

  public val pointRight: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👉")

  @JsName("DEDDCxDCDICdDEBe")
  public val pointUp2: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👆")

  public val pointDown: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👇")

  public val pointUp: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("☝️")

  public val raisedHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("✋")

  public val raisedBackOfHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤚")

  public val backOfHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤚")

  public val handSplayed: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🖐️")

  public val raisedHandWithFingersSplayed: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🖐️")

  public val vulcan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🖖")

  public val raisedHandWithPartBetweenMiddleAndRingFingers: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🖖")

  public val wave: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👋")

  public val callMe: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤙")

  public val callMeHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤙")

  public val muscle: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💪")

  public val mechanicalArm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦾")

  public val middleFinger: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🖕")

  public val reversedHandWithMiddleFingerExtended: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🖕")

  public val writingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("✍️")

  public val pray: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙏")

  public val foot: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🦶")

  public val leg: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🦵")

  public val mechanicalLeg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦿")

  public val lipstick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💄")

  public val kiss: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💋")

  public val lips: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👄")

  public val tooth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦷")

  public val bone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦴")

  public val tongue: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👅")

  public val ear: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👂")

  public val earWithHearingAid: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🦻")

  public val nose: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👃")

  public val footprints: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👣")

  public val eye: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👁️")

  public val eyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👀")

  public val brain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧠")

  public val speakingHead: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗣️")

  public val speakingHeadInSilhouette: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗣️")

  public val bustInSilhouette: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👤")

  public val bustsInSilhouette: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👥")

  public val baby: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👶")

  public val girl: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👧")

  public val child: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧒")

  public val boy: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👦")

  public val woman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩")

  public val adult: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑")

  public val man: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨")

  public val womanCurlyHaired: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🦱")

  public val manCurlyHaired: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🦱")

  public val womanRedHaired: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🦰")

  public val manRedHaired: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🦰")

  public val blondHairedWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👱‍♀️")

  public val blondHairedPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👱")

  public val personWithBlondHair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👱")

  public val blondHairedMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👱‍♂️")

  public val womanWhiteHaired: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🦳")

  public val manWhiteHaired: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🦳")

  public val womanBald: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🦲")

  public val manBald: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🦲")

  public val beardedPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧔")

  public val olderWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👵")

  public val grandma: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👵")

  public val olderAdult: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧓")

  public val olderMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👴")

  public val manWithChineseCap: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👲")

  public val manWithGuaPiMao: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👲")

  public val personWearingTurban: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👳")

  public val manWithTurban: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👳")

  public val womanWearingTurban: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👳‍♀️")

  public val manWearingTurban: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👳‍♂️")

  public val womanWithHeadscarf: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧕")

  public val policeOfficer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👮")

  public val cop: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👮")

  public val womanPoliceOfficer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👮‍♀️")

  public val manPoliceOfficer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👮‍♂️")

  public val constructionWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👷")

  public val womanConstructionWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👷‍♀️")

  public val manConstructionWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👷‍♂️")

  public val guard: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💂")

  public val guardsman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💂")

  public val womanGuard: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💂‍♀️")

  public val manGuard: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💂‍♂️")

  public val detective: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🕵️")

  public val spy: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🕵️")

  public val sleuthOrSpy: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🕵️")

  public val womanDetective: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🕵️‍♀️")

  public val manDetective: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🕵️‍♂️")

  public val womanHealthWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍⚕️")

  public val manHealthWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍⚕️")

  public val womanFarmer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🌾")

  public val manFarmer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🌾")

  public val womanCook: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🍳")

  public val manCook: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🍳")

  public val womanStudent: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🎓")

  public val manStudent: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🎓")

  public val womanSinger: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🎤")

  public val manSinger: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🎤")

  public val womanTeacher: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🏫")

  public val manTeacher: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🏫")

  public val womanFactoryWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🏭")

  public val manFactoryWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🏭")

  public val womanTechnologist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍💻")

  public val manTechnologist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍💻")

  public val womanOfficeWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍💼")

  public val manOfficeWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍💼")

  public val womanMechanic: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🔧")

  public val manMechanic: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🔧")

  public val womanScientist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🔬")

  public val manScientist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🔬")

  public val womanArtist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🎨")

  public val manArtist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🎨")

  public val womanFirefighter: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🚒")

  public val manFirefighter: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🚒")

  public val womanPilot: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍✈️")

  public val manPilot: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍✈️")

  public val womanAstronaut: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🚀")

  public val manAstronaut: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🚀")

  public val womanJudge: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍⚖️")

  public val manJudge: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍⚖️")

  public val brideWithVeil: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👰")

  public val manInTuxedo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤵")

  public val princess: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👸")

  public val prince: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤴")

  public val superhero: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🦸")

  public val womanSuperhero: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🦸‍♀️")

  public val manSuperhero: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🦸‍♂️")

  public val supervillain: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🦹")

  public val womanSupervillain: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🦹‍♀️")

  public val manSupervillain: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🦹‍♂️")

  public val mrsClaus: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤶")

  public val motherChristmas: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤶")

  public val santa: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🎅")

  public val mage: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧙")

  public val womanMage: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧙‍♀️")

  public val manMage: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧙‍♂️")

  public val elf: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧝")

  public val womanElf: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧝‍♀️")

  public val manElf: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧝‍♂️")

  public val vampire: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧛")

  public val womanVampire: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧛‍♀️")

  public val manVampire: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧛‍♂️")

  public val zombie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧟")

  public val womanZombie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧟‍♀️")

  public val manZombie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧟‍♂️")

  public val genie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧞")

  public val womanGenie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧞‍♀️")

  public val manGenie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧞‍♂️")

  public val merperson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧜")

  public val mermaid: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧜‍♀️")

  public val merman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧜‍♂️")

  public val fairy: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧚")

  public val womanFairy: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧚‍♀️")

  public val manFairy: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧚‍♂️")

  public val angel: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👼")

  public val pregnantWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤰")

  public val expectingWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤰")

  public val breastFeeding: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤱")

  public val personBowing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙇")

  public val bow: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙇")

  public val womanBowing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙇‍♀️")

  public val manBowing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙇‍♂️")

  public val personTippingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💁")

  public val informationDeskPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💁")

  public val womanTippingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💁‍♀️")

  public val manTippingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💁‍♂️")

  public val personGesturingNo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙅")

  public val noGood: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙅")

  public val womanGesturingNo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙅‍♀️")

  public val manGesturingNo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙅‍♂️")

  public val personGesturingOk: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙆")

  public val okWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙆")

  public val womanGesturingOk: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙆‍♀️")

  public val manGesturingOk: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙆‍♂️")

  public val personRaisingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙋")

  public val raisingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙋")

  public val womanRaisingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙋‍♀️")

  public val manRaisingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙋‍♂️")

  public val deafPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧏")

  public val deafWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧏‍♀️")

  public val deafMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧏‍♂️")

  public val personFacepalming: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤦")

  public val facePalm: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤦")

  public val facepalm: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤦")

  public val womanFacepalming: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤦‍♀️")

  public val manFacepalming: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤦‍♂️")

  public val personShrugging: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤷")

  public val shrug: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤷")

  public val womanShrugging: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤷‍♀️")

  public val manShrugging: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤷‍♂️")

  public val personPouting: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙎")

  public val personWithPoutingFace: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙎")

  public val womanPouting: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙎‍♀️")

  public val manPouting: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙎‍♂️")

  public val personFrowning: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙍")

  public val womanFrowning: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙍‍♀️")

  public val manFrowning: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙍‍♂️")

  public val personGettingHaircut: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💇")

  public val haircut: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💇")

  public val womanGettingHaircut: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💇‍♀️")

  public val manGettingHaircut: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💇‍♂️")

  public val personGettingMassage: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💆")

  public val massage: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💆")

  public val womanGettingFaceMassage: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💆‍♀️")

  public val manGettingFaceMassage: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💆‍♂️")

  public val personInSteamyRoom: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧖")

  public val womanInSteamyRoom: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧖‍♀️")

  public val manInSteamyRoom: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧖‍♂️")

  public val nailCare: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💅")

  public val selfie: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤳")

  public val dancer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💃")

  public val manDancing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🕺")

  public val maleDancer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🕺")

  public val peopleWithBunnyEarsPartying: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👯")

  public val dancers: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👯")

  public val womenWithBunnyEarsPartying: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👯‍♀️")

  public val menWithBunnyEarsPartying: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👯‍♂️")

  public val levitate: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🕴️")

  public val manInBusinessSuitLevitating: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🕴️")

  public val personWalking: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚶")

  public val walking: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚶")

  public val womanWalking: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚶‍♀️")

  public val manWalking: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚶‍♂️")

  public val personRunning: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏃")

  public val runner: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏃")

  public val womanRunning: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏃‍♀️")

  public val manRunning: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏃‍♂️")

  public val personStanding: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧍")

  public val womanStanding: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧍‍♀️")

  public val manStanding: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧍‍♂️")

  public val personKneeling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧎")

  public val womanKneeling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧎‍♀️")

  public val manKneeling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧎‍♂️")

  public val womanWithProbingCane: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🦯")

  public val manWithProbingCane: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🦯")

  public val womanInMotorizedWheelchair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🦼")

  public val manInMotorizedWheelchair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🦼")

  public val womanInManualWheelchair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🦽")

  public val manInManualWheelchair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🦽")

  public val peopleHoldingHands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧑‍🤝‍🧑")

  public val couple: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👫")

  public val twoWomenHoldingHands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👭")

  public val twoMenHoldingHands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👬")

  public val coupleWithHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💑")

  public val coupleWithHeartWomanMan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍❤️‍👨")

  public val coupleWw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍❤️‍👩")

  public val coupleWithHeartWw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍❤️‍👩")

  public val coupleMm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍❤️‍👨")

  public val coupleWithHeartMm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍❤️‍👨")

  public val couplekiss: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💏")

  public val kissWomanMan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍❤️‍💋‍👨")

  public val kissWw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍❤️‍💋‍👩")

  public val couplekissWw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍❤️‍💋‍👩")

  public val kissMm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍❤️‍💋‍👨")

  public val couplekissMm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍❤️‍💋‍👨")

  public val family: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👪")

  public val familyManWomanBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👩‍👦")

  public val familyMwg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👩‍👧")

  public val familyMwgb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👩‍👧‍👦")

  public val familyMwbb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👩‍👦‍👦")

  public val familyMwgg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👩‍👧‍👧")

  public val familyWwb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍👩‍👦")

  public val familyWwg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍👩‍👧")

  public val familyWwgb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍👩‍👧‍👦")

  public val familyWwbb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍👩‍👦‍👦")

  public val familyWwgg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍👩‍👧‍👧")

  public val familyMmb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👨‍👦")

  public val familyMmg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👨‍👧")

  public val familyMmgb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👨‍👧‍👦")

  public val familyMmbb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👨‍👦‍👦")

  public val familyMmgg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👨‍👧‍👧")

  public val familyWomanBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍👦")

  public val familyWomanGirl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍👧")

  public val familyWomanGirlBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍👧‍👦")

  public val familyWomanBoyBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍👦‍👦")

  public val familyWomanGirlGirl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍👧‍👧")

  public val familyManBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👦")

  public val familyManGirl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👧")

  public val familyManGirlBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👧‍👦")

  public val familyManBoyBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👦‍👦")

  public val familyManGirlGirl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👧‍👧")

  public val yarn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧶")

  public val thread: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧵")

  public val coat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧥")

  public val labCoat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥼")

  public val safetyVest: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦺")

  public val womansClothes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👚")

  public val shirt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👕")

  public val jeans: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👖")

  public val shorts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩳")

  public val necktie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👔")

  public val dress: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👗")

  public val bikini: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👙")

  public val onePieceSwimsuit: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩱")

  public val kimono: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👘")

  public val sari: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥻")

  public val womansFlatShoe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥿")

  public val highHeel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👠")

  public val sandal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👡")

  public val boot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👢")

  public val balletShoes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩰")

  public val mansShoe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👞")

  public val athleticShoe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👟")

  public val hikingBoot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥾")

  public val briefs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩲")

  public val socks: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧦")

  public val gloves: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧤")

  public val scarf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧣")

  public val tophat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎩")

  public val billedCap: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧢")

  public val womansHat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👒")

  public val mortarBoard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎓")

  public val helmetWithCross: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛑️")

  public val helmetWithWhiteCross: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛑️")

  public val crown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👑")

  public val ring: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💍")

  public val pouch: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👝")

  public val purse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👛")

  public val handbag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👜")

  public val briefcase: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💼")

  public val schoolSatchel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎒")

  public val luggage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧳")

  public val eyeglasses: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👓")

  public val darkSunglasses: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕶️")

  public val goggles: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥽")

  public val divingMask: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤿")

  public val closedUmbrella: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌂")

  public val dog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐶")

  public val cat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐱")

  public val mouse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐭")

  public val hamster: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐹")

  public val rabbit: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐰")

  public val fox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦊")

  public val foxFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦊")

  public val bear: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐻")

  public val pandaFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐼")

  public val koala: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐨")

  public val tiger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐯")

  public val lionFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦁")

  public val lion: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦁")

  public val cow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐮")

  public val pig: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐷")

  public val pigNose: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐽")

  public val frog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐸")

  public val monkeyFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐵")

  public val seeNoEvil: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🙈")

  public val hearNoEvil: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🙉")

  public val speakNoEvil: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🙊")

  public val monkey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐒")

  public val chicken: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐔")

  public val penguin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐧")

  public val bird: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐦")

  public val babyChick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐤")

  public val hatchingChick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐣")

  public val hatchedChick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐥")

  public val duck: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦆")

  public val eagle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦅")

  public val owl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦉")

  public val bat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦇")

  public val wolf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐺")

  public val boar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐗")

  public val horse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐴")

  public val unicorn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦄")

  public val unicornFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦄")

  public val bee: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐝")

  public val bug: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐛")

  public val butterfly: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦋")

  public val snail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐌")

  public val shell: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐚")

  public val beetle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐞")

  public val ant: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐜")

  public val mosquito: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦟")

  public val cricket: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦗")

  public val spider: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕷️")

  public val spiderWeb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕸️")

  public val scorpion: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦂")

  public val turtle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐢")

  public val snake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐍")

  public val lizard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦎")

  public val tRex: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦖")

  public val sauropod: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦕")

  public val octopus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐙")

  public val squid: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦑")

  public val shrimp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦐")

  public val lobster: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦞")

  public val oyster: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦪")

  public val crab: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦀")

  public val blowfish: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐡")

  public val tropicalFish: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐠")

  public val fish: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐟")

  public val dolphin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐬")

  public val whale: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐳")

  @JsName("DbCwCpDACtBe")
  public val whale2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐋")

  public val shark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦈")

  public val crocodile: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐊")

  @JsName("DICxCvCtDGBe")
  public val tiger2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐅")

  public val leopard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐆")

  public val zebra: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦓")

  public val gorilla: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦍")

  public val orangutan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦧")

  public val elephant: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐘")

  public val hippopotamus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦛")

  public val rhino: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦏")

  public val rhinoceros: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦏")

  public val dromedaryCamel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐪")

  public val camel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐫")

  public val giraffe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦒")

  public val kangaroo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦘")

  public val waterBuffalo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐃")

  public val ox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐂")

  @JsName("CrDDDbBe")
  public val cow2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐄")

  public val racehorse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐎")

  @JsName("DECxCvBe")
  public val pig2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐖")

  public val ram: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐏")

  public val llama: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦙")

  public val sheep: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐑")

  public val goat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐐")

  public val deer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦌")

  @JsName("CsDDCvBe")
  public val dog2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐕")

  public val guideDog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦮")

  public val serviceDog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐕‍🦺")

  public val poodle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐩")

  @JsName("CrCpDIBe")
  public val cat2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐈")

  public val rooster: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐓")

  public val turkey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦃")

  public val peacock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦚")

  public val parrot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦜")

  public val swan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦢")

  public val flamingo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦩")

  public val dove: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕊️")

  public val doveOfPeace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕊️")

  @JsName("DGCpCqCqCxDIBe")
  public val rabbit2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐇")

  public val sloth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦥")

  public val otter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦦")

  public val skunk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦨")

  public val raccoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦝")

  public val badger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦡")

  @JsName("DBDDDJDHCtBe")
  public val mouse2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐁")

  public val rat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐀")

  public val chipmunk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐿️")

  public val hedgehog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦔")

  public val feet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐾")

  public val pawPrints: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐾")

  public val dragon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐉")

  public val dragonFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐲")

  public val cactus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌵")

  public val christmasTree: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎄")

  public val evergreenTree: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌲")

  public val deciduousTree: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌳")

  public val palmTree: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌴")

  public val seedling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌱")

  public val herb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌿")

  public val shamrock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☘️")

  public val fourLeafClover: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍀")

  public val bamboo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎍")

  public val tanabataTree: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎋")

  public val leaves: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍃")

  public val fallenLeaf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍂")

  public val mapleLeaf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍁")

  public val mushroom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍄")

  public val earOfRice: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌾")

  public val bouquet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💐")

  public val tulip: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌷")

  public val rose: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌹")

  public val wiltedRose: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥀")

  public val wiltedFlower: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥀")

  public val hibiscus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌺")

  public val cherryBlossom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌸")

  public val blossom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌼")

  public val sunflower: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌻")

  public val sunWithFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌞")

  public val fullMoonWithFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌝")

  public val firstQuarterMoonWithFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌛")

  public val lastQuarterMoonWithFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌜")

  public val newMoonWithFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌚")

  public val fullMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌕")

  public val waningGibbousMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌖")

  public val lastQuarterMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌗")

  public val waningCrescentMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌘")

  public val newMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌑")

  public val waxingCrescentMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌒")

  public val firstQuarterMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌓")

  public val waxingGibbousMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌔")

  public val crescentMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌙")

  public val earthAmericas: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌎")

  public val earthAfrica: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌍")

  public val earthAsia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌏")

  public val ringedPlanet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪐")

  public val dizzy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💫")

  public val star: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⭐")

  @JsName("DHDICpDGBe")
  public val star2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌟")

  public val sparkles: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✨")

  public val zap: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚡")

  public val comet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☄️")

  public val boom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💥")

  public val fire: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔥")

  public val flame: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔥")

  public val cloudTornado: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌪️")

  public val cloudWithTornado: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌪️")

  public val rainbow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌈")

  public val sunny: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☀️")

  public val whiteSunSmallCloud: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌤️")

  public val whiteSunWithSmallCloud: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌤️")

  public val partlySunny: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛅")

  public val whiteSunCloud: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌥️")

  public val whiteSunBehindCloud: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌥️")

  public val cloud: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☁️")

  public val whiteSunRainCloud: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌦️")

  public val whiteSunBehindCloudWithRain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌦️")

  public val cloudRain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌧️")

  public val cloudWithRain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌧️")

  public val thunderCloudRain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛈️")

  public val thunderCloudAndRain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛈️")

  public val cloudLightning: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌩️")

  public val cloudWithLightning: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌩️")

  public val cloudSnow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌨️")

  public val cloudWithSnow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌨️")

  public val snowflake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❄️")

  @JsName("DHDCDDDbDBCpDCBe")
  public val snowman2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☃️")

  public val snowman: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛄")

  public val windBlowingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌬️")

  public val dash: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💨")

  public val droplet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💧")

  public val sweatDrops: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💦")

  public val umbrella: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☔")

  @JsName("DJDBCqDGCtDADACpBe")
  public val umbrella2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☂️")

  public val ocean: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌊")

  public val fog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌫️")

  public val greenApple: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍏")

  public val apple: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍎")

  public val pear: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍐")

  public val tangerine: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍊")

  public val lemon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍋")

  public val banana: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍌")

  public val watermelon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍉")

  public val grapes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍇")

  public val strawberry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍓")

  public val melon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍈")

  public val cherries: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍒")

  public val peach: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍑")

  public val mango: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥭")

  public val pineapple: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍍")

  public val coconut: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥥")

  public val kiwi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥝")

  public val kiwifruit: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥝")

  public val tomato: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍅")

  public val eggplant: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍆")

  public val avocado: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥑")

  public val broccoli: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥦")

  public val leafyGreen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥬")

  public val cucumber: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥒")

  public val hotPepper: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌶️")

  public val corn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌽")

  public val carrot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥕")

  public val onion: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧅")

  public val garlic: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧄")

  public val potato: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥔")

  public val sweetPotato: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍠")

  public val croissant: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥐")

  public val bagel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥯")

  public val bread: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍞")

  public val frenchBread: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥖")

  public val baguetteBread: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥖")

  public val pretzel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥨")

  public val cheese: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧀")

  public val cheeseWedge: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧀")

  public val egg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥚")

  public val cooking: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍳")

  public val pancakes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥞")

  public val waffle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧇")

  public val bacon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥓")

  public val cutOfMeat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥩")

  public val poultryLeg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍗")

  public val meatOnBone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍖")

  public val hotdog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌭")

  public val hotDog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌭")

  public val hamburger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍔")

  public val fries: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍟")

  public val pizza: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍕")

  public val sandwich: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥪")

  public val falafel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧆")

  public val stuffedFlatbread: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥙")

  public val stuffedPita: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥙")

  public val taco: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌮")

  public val burrito: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌯")

  public val salad: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥗")

  public val greenSalad: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥗")

  public val shallowPanOfFood: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥘")

  public val paella: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥘")

  public val cannedFood: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥫")

  public val spaghetti: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍝")

  public val ramen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍜")

  public val stew: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍲")

  public val curry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍛")

  public val sushi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍣")

  public val bento: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍱")

  public val dumpling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥟")

  public val friedShrimp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍤")

  public val riceBall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍙")

  public val rice: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍚")

  public val riceCracker: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍘")

  public val fishCake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍥")

  public val fortuneCookie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥠")

  public val moonCake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥮")

  public val oden: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍢")

  public val dango: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍡")

  public val shavedIce: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍧")

  public val iceCream: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍨")

  public val icecream: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍦")

  public val pie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥧")

  public val cupcake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧁")

  public val cake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍰")

  public val birthday: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎂")

  public val custard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍮")

  public val pudding: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍮")

  public val flan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍮")

  public val lollipop: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍭")

  public val candy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍬")

  public val chocolateBar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍫")

  public val popcorn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍿")

  public val doughnut: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍩")

  public val cookie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍪")

  public val chestnut: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌰")

  public val peanuts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥜")

  public val shelledPeanut: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥜")

  public val honeyPot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍯")

  public val butter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧈")

  public val milk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥛")

  public val glassOfMilk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥛")

  public val babyBottle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍼")

  public val coffee: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☕")

  public val tea: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍵")

  public val mate: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧉")

  public val cupWithStraw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥤")

  public val beverageBox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧃")

  public val iceCube: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧊")

  public val sake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍶")

  public val beer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍺")

  public val beers: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍻")

  public val champagneGlass: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥂")

  public val clinkingGlass: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥂")

  public val wineGlass: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍷")

  public val tumblerGlass: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥃")

  public val whisky: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥃")

  public val cocktail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍸")

  public val tropicalDrink: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍹")

  public val champagne: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍾")

  public val bottleWithPoppingCork: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍾")

  public val spoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥄")

  public val forkAndKnife: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍴")

  public val forkKnifePlate: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍽️")

  public val forkAndKnifeWithPlate: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍽️")

  public val bowlWithSpoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥣")

  public val takeoutBox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥡")

  public val chopsticks: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥢")

  public val salt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧂")

  public val soccer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚽")

  public val basketball: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏀")

  public val football: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏈")

  public val baseball: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚾")

  public val softball: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥎")

  public val tennis: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎾")

  public val volleyball: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏐")

  public val rugbyFootball: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏉")

  public val flyingDisc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥏")

  @JsName("BkCqCpDADA")
  public val `8ball`: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎱")

  public val pingPong: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏓")

  public val tableTennis: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏓")

  public val badminton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏸")

  public val hockey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏒")

  public val fieldHockey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏑")

  public val lacrosse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥍")

  public val cricketGame: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏏")

  public val cricketBatBall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏏")

  public val goal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥅")

  public val goalNet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥅")

  public val golf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛳")

  public val bowAndArrow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏹")

  public val archery: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏹")

  public val fishingPoleAndFish: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎣")

  public val boxingGlove: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥊")

  public val boxingGloves: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥊")

  public val martialArtsUniform: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥋")

  public val karateUniform: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥋")

  public val runningShirtWithSash: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎽")

  public val skateboard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛹")

  public val sled: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛷")

  public val parachute: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪂")

  public val iceSkate: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛸️")

  public val curlingStone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥌")

  public val ski: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎿")

  public val skier: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛷️")

  public val snowboarder: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏂")

  public val personLiftingWeights: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏋️")

  public val lifter: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏋️")

  public val weightLifter: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏋️")

  public val womanLiftingWeights: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏋️‍♀️")

  public val manLiftingWeights: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏋️‍♂️")

  public val peopleWrestling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤼")

  public val wrestlers: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤼")

  public val wrestling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤼")

  public val womenWrestling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤼‍♀️")

  public val menWrestling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤼‍♂️")

  public val personDoingCartwheel: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤸")

  public val cartwheel: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤸")

  public val womanCartwheeling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤸‍♀️")

  public val manCartwheeling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤸‍♂️")

  public val personBouncingBall: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("⛹️")

  public val basketballPlayer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("⛹️")

  public val personWithBall: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("⛹️")

  public val womanBouncingBall: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("⛹️‍♀️")

  public val manBouncingBall: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("⛹️‍♂️")

  public val personFencing: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤺")

  public val fencer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤺")

  public val fencing: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤺")

  public val personPlayingHandball: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤾")

  public val handball: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤾")

  public val womanPlayingHandball: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤾‍♀️")

  public val manPlayingHandball: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤾‍♂️")

  public val personGolfing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏌️")

  public val golfer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏌️")

  public val womanGolfing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏌️‍♀️")

  public val manGolfing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏌️‍♂️")

  public val horseRacing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏇")

  public val personInLotusPosition: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧘")

  public val womanInLotusPosition: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧘‍♀️")

  public val manInLotusPosition: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧘‍♂️")

  public val personSurfing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏄")

  public val surfer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏄")

  public val womanSurfing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏄‍♀️")

  public val manSurfing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏄‍♂️")

  public val personSwimming: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏊")

  public val swimmer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏊")

  public val womanSwimming: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏊‍♀️")

  public val manSwimming: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏊‍♂️")

  public val personPlayingWaterPolo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤽")

  public val waterPolo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤽")

  public val womanPlayingWaterPolo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤽‍♀️")

  public val manPlayingWaterPolo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤽‍♂️")

  public val personRowingBoat: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚣")

  public val rowboat: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚣")

  public val womanRowingBoat: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚣‍♀️")

  public val manRowingBoat: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚣‍♂️")

  public val personClimbing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧗")

  public val womanClimbing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧗‍♀️")

  public val manClimbing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧗‍♂️")

  public val personMountainBiking: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚵")

  public val mountainBicyclist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚵")

  public val womanMountainBiking: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚵‍♀️")

  public val manMountainBiking: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚵‍♂️")

  public val personBiking: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚴")

  public val bicyclist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚴")

  public val womanBiking: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚴‍♀️")

  public val manBiking: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚴‍♂️")

  public val trophy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏆")

  public val firstPlace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥇")

  public val firstPlaceMedal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥇")

  public val secondPlace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥈")

  public val secondPlaceMedal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥈")

  public val thirdPlace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥉")

  public val thirdPlaceMedal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥉")

  public val medal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏅")

  public val sportsMedal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏅")

  public val militaryMedal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎖️")

  public val rosette: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏵️")

  public val reminderRibbon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎗️")

  public val ticket: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎫")

  public val tickets: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎟️")

  public val admissionTickets: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎟️")

  public val circusTent: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎪")

  public val personJuggling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤹")

  public val juggling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤹")

  public val juggler: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤹")

  public val womanJuggling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤹‍♀️")

  public val manJuggling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤹‍♂️")

  public val performingArts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎭")

  public val art: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎨")

  public val clapper: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎬")

  public val microphone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎤")

  public val headphones: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎧")

  public val musicalScore: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎼")

  public val musicalKeyboard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎹")

  public val drum: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥁")

  public val drumWithDrumsticks: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥁")

  public val saxophone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎷")

  public val trumpet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎺")

  public val banjo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪕")

  public val guitar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎸")

  public val violin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎻")

  public val gameDie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎲")

  public val chessPawn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♟️")

  public val dart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎯")

  public val kite: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪁")

  public val yoYo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪀")

  public val bowling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎳")

  public val videoGame: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎮")

  public val slotMachine: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎰")

  public val jigsaw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧩")

  public val redCar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚗")

  public val taxi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚕")

  public val blueCar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚙")

  public val bus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚌")

  public val trolleybus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚎")

  public val raceCar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏎️")

  public val racingCar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏎️")

  public val policeCar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚓")

  public val ambulance: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚑")

  public val fireEngine: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚒")

  public val minibus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚐")

  public val truck: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚚")

  public val articulatedLorry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚛")

  public val tractor: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚜")

  public val autoRickshaw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛺")

  public val motorScooter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛵")

  public val motorbike: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛵")

  public val motorcycle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏍️")

  public val racingMotorcycle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏍️")

  public val scooter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛴")

  public val bike: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚲")

  public val motorizedWheelchair: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦼")

  public val manualWheelchair: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦽")

  public val rotatingLight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚨")

  public val oncomingPoliceCar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚔")

  public val oncomingBus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚍")

  public val oncomingAutomobile: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚘")

  public val oncomingTaxi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚖")

  public val aerialTramway: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚡")

  public val mountainCableway: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚠")

  public val suspensionRailway: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚟")

  public val railwayCar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚃")

  public val train: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚋")

  public val mountainRailway: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚞")

  public val monorail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚝")

  public val bullettrainSide: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚄")

  public val bullettrainFront: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚅")

  public val lightRail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚈")

  public val steamLocomotive: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚂")

  @JsName("DIDGCpCxDCBe")
  public val train2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚆")

  public val metro: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚇")

  public val tram: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚊")

  public val station: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚉")

  public val airplane: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✈️")

  public val airplaneDeparture: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛫")

  public val airplaneArriving: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛬")

  public val airplaneSmall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛩️")

  public val smallAirplane: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛩️")

  public val seat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💺")

  public val satelliteOrbital: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛰️")

  public val rocket: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚀")

  public val flyingSaucer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛸")

  public val helicopter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚁")

  public val canoe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛶")

  public val kayak: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛶")

  public val sailboat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛵")

  public val speedboat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚤")

  public val motorboat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛥️")

  public val cruiseShip: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛳️")

  public val passengerShip: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛳️")

  public val ferry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛴️")

  public val ship: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚢")

  public val anchor: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚓")

  public val fuelpump: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛽")

  public val construction: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚧")

  public val verticalTrafficLight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚦")

  public val trafficLight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚥")

  public val busstop: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚏")

  public val map: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗺️")

  public val worldMap: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗺️")

  public val moyai: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗿")

  public val statueOfLiberty: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗽")

  public val tokyoTower: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗼")

  public val europeanCastle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏰")

  public val japaneseCastle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏯")

  public val stadium: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏟️")

  public val ferrisWheel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎡")

  public val rollerCoaster: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎢")

  public val carouselHorse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎠")

  public val fountain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛲")

  public val beachUmbrella: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛱️")

  public val umbrellaOnGround: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛱️")

  public val beach: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏖️")

  public val beachWithUmbrella: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏖️")

  public val island: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏝️")

  public val desertIsland: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏝️")

  public val desert: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏜️")

  public val volcano: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌋")

  public val mountain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛰️")

  public val mountainSnow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏔️")

  public val snowCappedMountain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏔️")

  public val mountFuji: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗻")

  public val camping: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏕️")

  public val tent: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛺")

  public val house: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏠")

  public val houseWithGarden: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏡")

  public val homes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏘️")

  public val houseBuildings: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏘️")

  public val houseAbandoned: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏚️")

  public val derelictHouseBuilding: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏚️")

  public val constructionSite: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏗️")

  public val buildingConstruction: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏗️")

  public val factory: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏭")

  public val office: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏢")

  public val departmentStore: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏬")

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

  public val convenienceStore: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏪")

  public val school: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏫")

  public val loveHotel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏩")

  public val wedding: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💒")

  public val classicalBuilding: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏛️")

  public val church: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛪")

  public val mosque: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕌")

  public val hinduTemple: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛕")

  public val synagogue: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕍")

  public val kaaba: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕋")

  public val shintoShrine: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛩️")

  public val railwayTrack: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛤️")

  public val railroadTrack: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛤️")

  public val motorway: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛣️")

  public val japan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗾")

  public val riceScene: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎑")

  public val park: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏞️")

  public val nationalPark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏞️")

  public val sunrise: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌅")

  public val sunriseOverMountains: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌄")

  public val stars: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌠")

  public val sparkler: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎇")

  public val fireworks: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎆")

  public val citySunset: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌇")

  public val citySunrise: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌇")

  public val cityDusk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌆")

  public val cityscape: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏙️")

  public val nightWithStars: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌃")

  public val milkyWay: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌌")

  public val bridgeAtNight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌉")

  public val foggy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌁")

  public val watch: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⌚")

  public val iphone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📱")

  public val calling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📲")

  public val computer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💻")

  public val keyboard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⌨️")

  public val desktop: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖥️")

  public val desktopComputer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖥️")

  public val printer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖨️")

  public val mouseThreeButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖱️")

  public val threeButtonMouse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖱️")

  public val trackball: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖲️")

  public val joystick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕹️")

  public val compression: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗜️")

  public val minidisc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💽")

  public val floppyDisk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💾")

  public val cd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💿")

  public val dvd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📀")

  public val vhs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📼")

  public val camera: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📷")

  public val cameraWithFlash: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📸")

  public val videoCamera: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📹")

  public val movieCamera: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎥")

  public val projector: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📽️")

  public val filmProjector: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📽️")

  public val filmFrames: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎞️")

  public val telephoneReceiver: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📞")

  public val telephone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☎️")

  public val pager: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📟")

  public val fax: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📠")

  public val tv: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📺")

  public val radio: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📻")

  @JsName("DBCxCrDGDDDECwDDDCCtBe")
  public val microphone2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎙️")

  public val studioMicrophone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎙️")

  public val levelSlider: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎚️")

  public val controlKnobs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎛️")

  public val compass: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧭")

  public val stopwatch: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏱️")

  public val timer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏲️")

  public val timerClock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏲️")

  public val alarmClock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏰")

  public val clock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕰️")

  public val mantlepieceClock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕰️")

  public val hourglass: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⌛")

  public val hourglassFlowingSand: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏳")

  public val satellite: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📡")

  public val battery: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔋")

  public val electricPlug: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔌")

  public val bulb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💡")

  public val flashlight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔦")

  public val candle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕯️")

  public val fireExtinguisher: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧯")

  public val oil: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛢️")

  public val oilDrum: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛢️")

  public val moneyWithWings: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💸")

  public val dollar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💵")

  public val yen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💴")

  public val euro: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💶")

  public val pound: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💷")

  public val moneybag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💰")

  public val creditCard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💳")

  public val gem: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💎")

  public val scales: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚖️")

  public val toolbox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧰")

  public val wrench: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔧")

  public val hammer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔨")

  public val hammerPick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚒️")

  public val hammerAndPick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚒️")

  public val tools: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛠️")

  public val hammerAndWrench: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛠️")

  public val pick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛏️")

  public val nutAndBolt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔩")

  public val gear: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚙️")

  public val bricks: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧱")

  public val chains: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛓️")

  public val magnet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧲")

  public val gun: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔫")

  public val bomb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💣")

  public val firecracker: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧨")

  public val axe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪓")

  public val razor: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪒")

  public val knife: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔪")

  public val dagger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗡️")

  public val daggerKnife: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗡️")

  public val crossedSwords: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚔️")

  public val shield: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛡️")

  public val smoking: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚬")

  public val coffin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚰️")

  public val urn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚱️")

  public val funeralUrn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚱️")

  public val amphora: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏺")

  public val diyaLamp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪔")

  public val crystalBall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔮")

  public val prayerBeads: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📿")

  public val nazarAmulet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧿")

  public val barber: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💈")

  public val alembic: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚗️")

  public val telescope: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔭")

  public val microscope: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔬")

  public val hole: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕳️")

  public val probingCane: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦯")

  public val stethoscope: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩺")

  public val adhesiveBandage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩹")

  public val pill: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💊")

  public val syringe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💉")

  public val dropOfBlood: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩸")

  public val dna: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧬")

  public val microbe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦠")

  public val petriDish: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧫")

  public val testTube: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧪")

  public val thermometer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌡️")

  public val chair: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪑")

  public val broom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧹")

  public val basket: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧺")

  public val rollOfPaper: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧻")

  public val toilet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚽")

  public val potableWater: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚰")

  public val shower: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚿")

  public val bathtub: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛁")

  public val bath: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🛀")

  public val soap: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧼")

  public val sponge: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧽")

  public val squeezeBottle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧴")

  public val bellhop: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛎️")

  public val bellhopBell: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛎️")

  public val key: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔑")

  @JsName("CzCtDdBe")
  public val key2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗝️")

  public val oldKey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗝️")

  public val door: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚪")

  public val couch: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛋️")

  public val couchAndLamp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛋️")

  public val bed: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛏️")

  public val sleepingAccommodation: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🛌")

  public val teddyBear: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧸")

  public val framePhoto: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖼️")

  public val frameWithPicture: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖼️")

  public val shoppingBags: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛍️")

  public val shoppingCart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛒")

  public val shoppingTrolley: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛒")

  public val gift: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎁")

  public val balloon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎈")

  public val flags: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎏")

  public val ribbon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎀")

  public val confettiBall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎊")

  public val tada: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎉")

  public val dolls: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎎")

  public val izakayaLantern: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏮")

  public val windChime: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎐")

  public val redEnvelope: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧧")

  public val envelope: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✉️")

  public val envelopeWithArrow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📩")

  public val incomingEnvelope: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📨")

  public val eMail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📧")

  public val email: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📧")

  public val loveLetter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💌")

  public val inboxTray: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📥")

  public val outboxTray: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📤")

  public val `package`: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📦")

  public val label: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏷️")

  public val mailboxClosed: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📪")

  public val mailbox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📫")

  public val mailboxWithMail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📬")

  public val mailboxWithNoMail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📭")

  public val postbox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📮")

  public val postalHorn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📯")

  public val scroll: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📜")

  public val pageWithCurl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📃")

  public val pageFacingUp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📄")

  public val bookmarkTabs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📑")

  public val receipt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧾")

  public val barChart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📊")

  public val chartWithUpwardsTrend: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📈")

  public val chartWithDownwardsTrend: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📉")

  public val notepadSpiral: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗒️")

  public val spiralNotePad: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗒️")

  public val calendarSpiral: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗓️")

  public val spiralCalendarPad: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗓️")

  public val calendar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📆")

  public val date: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📅")

  public val wastebasket: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗑️")

  public val cardIndex: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📇")

  public val cardBox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗃️")

  public val cardFileBox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗃️")

  public val ballotBox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗳️")

  public val ballotBoxWithBallot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗳️")

  public val fileCabinet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗄️")

  public val clipboard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📋")

  public val fileFolder: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📁")

  public val openFileFolder: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📂")

  public val dividers: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗂️")

  public val cardIndexDividers: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗂️")

  @JsName("DCCtDbDHDECpDECtDGBe")
  public val newspaper2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗞️")

  public val rolledUpNewspaper: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗞️")

  public val newspaper: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📰")

  public val notebook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📓")

  public val notebookWithDecorativeCover: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📔")

  public val ledger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📒")

  public val closedBook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📕")

  public val greenBook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📗")

  public val blueBook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📘")

  public val orangeBook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📙")

  public val books: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📚")

  public val book: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📖")

  public val bookmark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔖")

  public val safetyPin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧷")

  public val link: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔗")

  public val paperclip: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📎")

  public val paperclips: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖇️")

  public val linkedPaperclips: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖇️")

  public val triangularRuler: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📐")

  public val straightRuler: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📏")

  public val abacus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧮")

  public val pushpin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📌")

  public val roundPushpin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📍")

  public val scissors: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✂️")

  public val penBallpoint: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖊️")

  public val lowerLeftBallpointPen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖊️")

  public val penFountain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖋️")

  public val lowerLeftFountainPen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖋️")

  public val blackNib: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✒️")

  public val paintbrush: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖌️")

  public val lowerLeftPaintbrush: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖌️")

  public val crayon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖍️")

  public val lowerLeftCrayon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖍️")

  public val pencil: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📝")

  public val memo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📝")

  @JsName("DECtDCCrCxDABe")
  public val pencil2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✏️")

  public val mag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔍")

  public val magRight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔎")

  public val lockWithInkPen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔏")

  public val closedLockWithKey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔐")

  public val lock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔒")

  public val unlock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔓")

  public val heart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❤️")

  public val orangeHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧡")

  public val yellowHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💛")

  public val greenHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💚")

  public val blueHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💙")

  public val purpleHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💜")

  public val blackHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖤")

  public val brownHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤎")

  public val whiteHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤍")

  public val brokenHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💔")

  public val heartExclamation: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❣️")

  public val heavyHeartExclamationMarkOrnament: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❣️")

  public val twoHearts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💕")

  public val revolvingHearts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💞")

  public val heartbeat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💓")

  public val heartpulse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💗")

  public val sparklingHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💖")

  public val cupid: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💘")

  public val giftHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💝")

  public val heartDecoration: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💟")

  public val peace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☮️")

  public val peaceSymbol: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☮️")

  public val cross: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✝️")

  public val latinCross: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✝️")

  public val starAndCrescent: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☪️")

  public val omSymbol: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕉️")

  public val wheelOfDharma: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☸️")

  public val starOfDavid: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✡️")

  public val sixPointedStar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔯")

  public val menorah: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕎")

  public val yinYang: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☯️")

  public val orthodoxCross: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☦️")

  public val placeOfWorship: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛐")

  public val worshipSymbol: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛐")

  public val ophiuchus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛎")

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

  public val id: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆔")

  public val atom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚛️")

  public val atomSymbol: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚛️")

  public val accept: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🉑")

  public val radioactive: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☢️")

  public val radioactiveSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☢️")

  public val biohazard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☣️")

  public val biohazardSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☣️")

  public val mobilePhoneOff: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📴")

  public val vibrationMode: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📳")

  @JsName("DJBiBjBcBl")
  public val u6709: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈶")

  @JsName("DJBjBdBeBd")
  public val u7121: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈚")

  @JsName("DJBjBhBfBf")
  public val u7533: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈸")

  @JsName("DJBhBhCqBi")
  public val u55b6: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈺")

  @JsName("DJBiBjBcBk")
  public val u6708: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈷️")

  public val eightPointedBlackStar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✴️")

  public val vs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆚")

  public val whiteFlower: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💮")

  public val ideographAdvantage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🉐")

  public val secret: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("㊙️")

  public val congratulations: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("㊗️")

  @JsName("DJBhBgBcBk")
  public val u5408: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈴")

  @JsName("DJBiCtBkBc")
  public val u6e80: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈵")

  @JsName("DJBhBeBjBe")
  public val u5272: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈹")

  @JsName("DJBjBlBkBd")
  public val u7981: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈲")

  public val a: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🅰️")

  public val b: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🅱️")

  public val ab: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆎")

  public val cl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆑")

  @JsName("DDBe")
  public val o2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🅾️")

  public val sos: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆘")

  public val x: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❌")

  public val o: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⭕")

  public val octagonalSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛑")

  public val stopSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛑")

  public val noEntry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛔")

  public val nameBadge: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📛")

  public val noEntrySign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚫")

  @JsName("BdBcBc")
  public val `100`: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💯")

  public val anger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💢")

  public val hotsprings: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♨️")

  public val noPedestrians: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚷")

  public val doNotLitter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚯")

  public val noBicycles: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚳")

  public val nonPotableWater: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚱")

  public val underage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔞")

  public val noMobilePhones: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📵")

  public val noSmoking: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚭")

  public val exclamation: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❗")

  public val greyExclamation: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❕")

  public val question: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❓")

  public val greyQuestion: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❔")

  public val bangbang: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("‼️")

  public val interrobang: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⁉️")

  public val lowBrightness: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔅")

  public val highBrightness: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔆")

  public val partAlternationMark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("〽️")

  public val warning: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚠️")

  public val childrenCrossing: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚸")

  public val trident: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔱")

  public val fleurDeLis: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚜️")

  public val beginner: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔰")

  public val recycle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♻️")

  public val whiteCheckMark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✅")

  @JsName("DJBiBfBcBj")
  public val u6307: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈯")

  public val chart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💹")

  public val sparkle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❇️")

  public val eightSpokedAsterisk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✳️")

  public val negativeSquaredCrossMark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❎")

  public val globeWithMeridians: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌐")

  public val diamondShapeWithADotInside: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💠")

  public val m: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("Ⓜ️")

  public val cyclone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌀")

  public val zzz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💤")

  public val atm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏧")

  public val wc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚾")

  public val wheelchair: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♿")

  public val parking: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🅿️")

  @JsName("DJBjCpBjCp")
  public val u7a7a: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈳")

  public val sa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈂️")

  public val passportControl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛂")

  public val customs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛃")

  public val baggageClaim: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛄")

  public val leftLuggage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛅")

  public val mens: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚹")

  public val womens: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚺")

  public val babySymbol: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚼")

  public val restroom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚻")

  public val putLitterInItsPlace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚮")

  public val cinema: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎦")

  public val signalStrength: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📶")

  public val koko: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈁")

  public val symbols: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔣")

  public val informationSource: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("ℹ️")

  public val abc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔤")

  public val abcd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔡")

  public val capitalAbcd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔠")

  public val ng: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆖")

  public val ok: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆗")

  public val up: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆙")

  public val cool: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆒")

  public val new: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆕")

  public val free: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆓")

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

  @JsName("BdBeBfBg")
  public val `1234`: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔢")

  public val hash: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("#️⃣")

  public val asterisk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("*️⃣")

  public val keycapAsterisk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("*️⃣")

  public val eject: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏏️")

  public val ejectSymbol: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏏️")

  public val arrowForward: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("▶️")

  public val pauseButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏸️")

  public val doubleVerticalBar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏸️")

  public val playPause: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏯️")

  public val stopButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏹️")

  public val recordButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏺️")

  public val trackNext: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏭️")

  public val nextTrack: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏭️")

  public val trackPrevious: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏮️")

  public val previousTrack: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏮️")

  public val fastForward: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏩")

  public val rewind: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏪")

  public val arrowDoubleUp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏫")

  public val arrowDoubleDown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏬")

  public val arrowBackward: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("◀️")

  public val arrowUpSmall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔼")

  public val arrowDownSmall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔽")

  public val arrowRight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("➡️")

  public val arrowLeft: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⬅️")

  public val arrowUp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⬆️")

  public val arrowDown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⬇️")

  public val arrowUpperRight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("↗️")

  public val arrowLowerRight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("↘️")

  public val arrowLowerLeft: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("↙️")

  public val arrowUpperLeft: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("↖️")

  public val arrowUpDown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("↕️")

  public val leftRightArrow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("↔️")

  public val arrowRightHook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("↪️")

  public val leftwardsArrowWithHook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("↩️")

  public val arrowHeadingUp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⤴️")

  public val arrowHeadingDown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⤵️")

  public val twistedRightwardsArrows: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔀")

  public val repeat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔁")

  public val repeatOne: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔂")

  public val arrowsCounterclockwise: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔄")

  public val arrowsClockwise: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔃")

  public val musicalNote: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎵")

  public val notes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎶")

  public val heavyPlusSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("➕")

  public val heavyMinusSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("➖")

  public val heavyDivisionSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("➗")

  public val heavyMultiplicationX: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✖️")

  public val infinity: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♾️")

  public val heavyDollarSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💲")

  public val currencyExchange: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💱")

  public val tm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("™️")

  public val copyright: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("©️")

  public val registered: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("®️")

  public val wavyDash: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("〰️")

  public val curlyLoop: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("➰")

  public val loop: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("➿")

  public val end: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔚")

  public val back: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔙")

  public val on: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔛")

  public val top: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔝")

  public val soon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔜")

  public val heavyCheckMark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✔️")

  public val ballotBoxWithCheck: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☑️")

  public val radioButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔘")

  public val whiteCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚪")

  public val blackCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚫")

  public val redCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔴")

  public val blueCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔵")

  public val brownCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟤")

  public val purpleCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟣")

  public val greenCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟢")

  public val yellowCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟡")

  public val orangeCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟠")

  public val smallRedTriangle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔺")

  public val smallRedTriangleDown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔻")

  public val smallOrangeDiamond: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔸")

  public val smallBlueDiamond: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔹")

  public val largeOrangeDiamond: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔶")

  public val largeBlueDiamond: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔷")

  public val whiteSquareButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔳")

  public val blackSquareButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔲")

  public val blackSmallSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("▪️")

  public val whiteSmallSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("▫️")

  public val blackMediumSmallSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("◾")

  public val whiteMediumSmallSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("◽")

  public val blackMediumSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("◼️")

  public val whiteMediumSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("◻️")

  public val blackLargeSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⬛")

  public val whiteLargeSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⬜")

  public val orangeSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟧")

  public val blueSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟦")

  public val redSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟥")

  public val brownSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟫")

  public val purpleSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟪")

  public val greenSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟩")

  public val yellowSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟨")

  public val speaker: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔈")

  public val mute: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔇")

  public val sound: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔉")

  public val loudSound: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔊")

  public val bell: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔔")

  public val noBell: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔕")

  public val mega: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📣")

  public val loudspeaker: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📢")

  public val speechLeft: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗨️")

  public val leftSpeechBubble: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗨️")

  public val eyeInSpeechBubble: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👁‍🗨")

  public val speechBalloon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💬")

  public val thoughtBalloon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💭")

  public val angerRight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗯️")

  public val rightAngerBubble: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗯️")

  public val spades: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♠️")

  public val clubs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♣️")

  public val hearts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♥️")

  public val diamonds: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♦️")

  public val blackJoker: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🃏")

  public val flowerPlayingCards: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎴")

  public val mahjong: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🀄")

  @JsName("CrDADDCrCzBd")
  public val clock1: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕐")

  @JsName("CrDADDCrCzBe")
  public val clock2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕑")

  @JsName("CrDADDCrCzBf")
  public val clock3: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕒")

  @JsName("CrDADDCrCzBg")
  public val clock4: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕓")

  @JsName("CrDADDCrCzBh")
  public val clock5: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕔")

  @JsName("CrDADDCrCzBi")
  public val clock6: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕕")

  @JsName("CrDADDCrCzBj")
  public val clock7: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕖")

  @JsName("CrDADDCrCzBk")
  public val clock8: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕗")

  @JsName("CrDADDCrCzBl")
  public val clock9: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕘")

  @JsName("CrDADDCrCzBdBc")
  public val clock10: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕙")

  @JsName("CrDADDCrCzBdBd")
  public val clock11: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕚")

  @JsName("CrDADDCrCzBdBe")
  public val clock12: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕛")

  @JsName("CrDADDCrCzBdBfBc")
  public val clock130: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕜")

  @JsName("CrDADDCrCzBeBfBc")
  public val clock230: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕝")

  @JsName("CrDADDCrCzBfBfBc")
  public val clock330: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕞")

  @JsName("CrDADDCrCzBgBfBc")
  public val clock430: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕟")

  @JsName("CrDADDCrCzBhBfBc")
  public val clock530: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕠")

  @JsName("CrDADDCrCzBiBfBc")
  public val clock630: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕡")

  @JsName("CrDADDCrCzBjBfBc")
  public val clock730: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕢")

  @JsName("CrDADDCrCzBkBfBc")
  public val clock830: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕣")

  @JsName("CrDADDCrCzBlBfBc")
  public val clock930: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕤")

  @JsName("CrDADDCrCzBdBcBfBc")
  public val clock1030: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕥")

  @JsName("CrDADDCrCzBdBdBfBc")
  public val clock1130: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕦")

  @JsName("CrDADDCrCzBdBeBfBc")
  public val clock1230: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕧")

  public val femaleSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♀️")

  public val maleSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♂️")

  public val medicalSymbol: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚕️")

  public val regionalIndicatorZ: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇿")

  public val regionalIndicatorY: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇾")

  public val regionalIndicatorX: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇽")

  public val regionalIndicatorW: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇼")

  public val regionalIndicatorV: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇻")

  public val regionalIndicatorU: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇺")

  public val regionalIndicatorT: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹")

  public val regionalIndicatorS: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸")

  public val regionalIndicatorR: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇷")

  public val regionalIndicatorQ: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇶")

  public val regionalIndicatorP: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵")

  public val regionalIndicatorO: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇴")

  public val regionalIndicatorN: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳")

  public val regionalIndicatorM: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲")

  public val regionalIndicatorL: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱")

  public val regionalIndicatorK: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰")

  public val regionalIndicatorJ: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇯")

  public val regionalIndicatorI: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮")

  public val regionalIndicatorH: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇭")

  public val regionalIndicatorG: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬")

  public val regionalIndicatorF: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇫")

  public val regionalIndicatorE: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇪")

  public val regionalIndicatorD: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇩")

  public val regionalIndicatorC: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨")

  public val regionalIndicatorB: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧")

  public val regionalIndicatorA: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦")

  public val flagWhite: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏳️")

  public val flagBlack: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏴")

  public val checkeredFlag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏁")

  public val triangularFlagOnPost: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚩")

  public val rainbowFlag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏳️‍🌈")

  public val gayPrideFlag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏳️‍🌈")

  public val pirateFlag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏴‍☠️")

  public val flagAf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇫")

  public val flagAx: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇽")

  public val flagAl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇱")

  public val flagDz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇩🇿")

  public val flagAs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇸")

  public val flagAd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇩")

  public val flagAo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇴")

  public val flagAi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇮")

  public val flagAq: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇶")

  public val flagAg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇬")

  public val flagAr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇷")

  public val flagAm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇲")

  public val flagAw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇼")

  public val flagAu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇺")

  public val flagAt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇹")

  public val flagAz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇿")

  public val flagBs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇸")

  public val flagBh: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇭")

  public val flagBd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇩")

  public val flagBb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇧")

  public val flagBy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇾")

  public val flagBe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇪")

  public val flagBz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇿")

  public val flagBj: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇯")

  public val flagBm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇲")

  public val flagBt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇹")

  public val flagBo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇴")

  public val flagBa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇦")

  public val flagBw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇼")

  public val flagBr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇷")

  public val flagIo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇴")

  public val flagVg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇻🇬")

  public val flagBn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇳")

  public val flagBg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇬")

  public val flagBf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇫")

  public val flagBi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇮")

  public val flagKh: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇭")

  public val flagCm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇲")

  public val flagCa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇦")

  public val flagIc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇨")

  public val flagCv: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇻")

  public val flagBq: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇶")

  public val flagKy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇾")

  public val flagCf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇫")

  public val flagTd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇩")

  public val flagCl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇱")

  public val flagCn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇳")

  public val flagCx: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇽")

  public val flagCc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇨")

  public val flagCo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇴")

  public val flagKm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇲")

  public val flagCg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇬")

  public val flagCd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇩")

  public val flagCk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇰")

  public val flagCr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇷")

  public val flagCi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇮")

  public val flagHr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇭🇷")

  public val flagCu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇺")

  public val flagCw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇼")

  public val flagCy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇾")

  public val flagCz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇿")

  public val flagDk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇩🇰")

  public val flagDj: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇩🇯")

  public val flagDm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇩🇲")

  public val flagDo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇩🇴")

  public val flagEc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇪🇨")

  public val flagEg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇪🇬")

  public val flagSv: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇻")

  public val flagGq: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇶")

  public val flagEr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇪🇷")

  public val flagEe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇪🇪")

  public val flagEt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇪🇹")

  public val flagEu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇪🇺")

  public val flagFk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇫🇰")

  public val flagFo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇫🇴")

  public val flagFj: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇫🇯")

  public val flagFi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇫🇮")

  public val flagFr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇫🇷")

  public val flagGf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇫")

  public val flagPf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇫")

  public val flagTf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇫")

  public val flagGa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇦")

  public val flagGm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇲")

  public val flagGe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇪")

  public val flagDe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇩🇪")

  public val flagGh: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇭")

  public val flagGi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇮")

  public val flagGr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇷")

  public val flagGl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇱")

  public val flagGd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇩")

  public val flagGp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇵")

  public val flagGu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇺")

  public val flagGt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇹")

  public val flagGg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇬")

  public val flagGn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇳")

  public val flagGw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇼")

  public val flagGy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇾")

  public val flagHt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇭🇹")

  public val flagHn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇭🇳")

  public val flagHk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇭🇰")

  public val flagHu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇭🇺")

  public val flagIs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇸")

  public val flagIn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇳")

  public val flagId: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇩")

  public val flagIr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇷")

  public val flagIq: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇶")

  public val flagIe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇪")

  public val flagIm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇲")

  public val flagIl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇱")

  public val flagIt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇹")

  public val flagJm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇯🇲")

  public val flagJp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇯🇵")

  public val crossedFlags: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎌")

  public val flagJe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇯🇪")

  public val flagJo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇯🇴")

  public val flagKz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇿")

  public val flagKe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇪")

  public val flagKi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇮")

  public val flagXk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇽🇰")

  public val flagKw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇼")

  public val flagKg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇬")

  public val flagLa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇦")

  public val flagLv: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇻")

  public val flagLb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇧")

  public val flagLs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇸")

  public val flagLr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇷")

  public val flagLy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇾")

  public val flagLi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇮")

  public val flagLt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇹")

  public val flagLu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇺")

  public val flagMo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇴")

  public val flagMk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇰")

  public val flagMg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇬")

  public val flagMw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇼")

  public val flagMy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇾")

  public val flagMv: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇻")

  public val flagMl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇱")

  public val flagMt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇹")

  public val flagMh: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇭")

  public val flagMq: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇶")

  public val flagMr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇷")

  public val flagMu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇺")

  public val flagYt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇾🇹")

  public val flagMx: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇽")

  public val flagFm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇫🇲")

  public val flagMd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇩")

  public val flagMc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇨")

  public val flagMn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇳")

  public val flagMe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇪")

  public val flagMs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇸")

  public val flagMa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇦")

  public val flagMz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇿")

  public val flagMm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇲")

  public val flagNa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇦")

  public val flagNr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇷")

  public val flagNp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇵")

  public val flagNl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇱")

  public val flagNc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇨")

  public val flagNz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇿")

  public val flagNi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇮")

  public val flagNe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇪")

  public val flagNg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇬")

  public val flagNu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇺")

  public val flagNf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇫")

  public val flagKp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇵")

  public val flagMp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇵")

  public val flagNo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇴")

  public val flagOm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇴🇲")

  public val flagPk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇰")

  public val flagPw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇼")

  public val flagPs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇸")

  public val flagPa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇦")

  public val flagPg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇬")

  public val flagPy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇾")

  public val flagPe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇪")

  public val flagPh: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇭")

  public val flagPn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇳")

  public val flagPl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇱")

  public val flagPt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇹")

  public val flagPr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇷")

  public val flagQa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇶🇦")

  public val flagRe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇷🇪")

  public val flagRo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇷🇴")

  public val flagRu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇷🇺")

  public val flagRw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇷🇼")

  public val flagWs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇼🇸")

  public val flagSm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇲")

  public val flagSt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇹")

  public val flagSa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇦")

  public val flagSn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇳")

  public val flagRs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇷🇸")

  public val flagSc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇨")

  public val flagSl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇱")

  public val flagSg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇬")

  public val flagSx: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇽")

  public val flagSk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇰")

  public val flagSi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇮")

  public val flagGs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇸")

  public val flagSb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇧")

  public val flagSo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇴")

  public val flagZa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇿🇦")

  public val flagKr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇷")

  public val flagSs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇸")

  public val flagEs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇪🇸")

  public val flagLk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇰")

  public val flagBl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇱")

  public val flagSh: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇭")

  public val flagKn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇳")

  public val flagLc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇨")

  public val flagPm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇲")

  public val flagVc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇻🇨")

  public val flagSd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇩")

  public val flagSr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇷")

  public val flagSz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇿")

  public val flagSe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇪")

  public val flagCh: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇭")

  public val flagSy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇾")

  public val flagTw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇼")

  public val flagTj: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇯")

  public val flagTz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇿")

  public val flagTh: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇭")

  public val flagTl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇱")

  public val flagTg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇬")

  public val flagTk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇰")

  public val flagTo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇴")

  public val flagTt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇹")

  public val flagTn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇳")

  public val flagTr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇷")

  public val flagTm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇲")

  public val flagTc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇨")

  public val flagVi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇻🇮")

  public val flagTv: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇻")

  public val flagUg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇺🇬")

  public val flagUa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇺🇦")

  public val flagAe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇪")

  public val flagGb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇧")

  public val england: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏴󠁧󠁢󠁥󠁮󠁧󠁿")

  public val scotland: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏴󠁧󠁢󠁳󠁣󠁴󠁿")

  public val wales: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏴󠁧󠁢󠁷󠁬󠁳󠁿")

  public val flagUs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇺🇸")

  public val flagUy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇺🇾")

  public val flagUz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇺🇿")

  public val flagVu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇻🇺")

  public val flagVa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇻🇦")

  public val flagVe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇻🇪")

  public val flagVn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇻🇳")

  public val flagWf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇼🇫")

  public val flagEh: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇪🇭")

  public val flagYe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇾🇪")

  public val flagZm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇿🇲")

  public val flagZw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇿🇼")

  public val flagAc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇨")

  public val flagBv: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇻")

  public val flagCp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇵")

  public val flagEa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇪🇦")

  public val flagDg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇩🇬")

  public val flagHm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇭🇲")

  public val flagMf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇫")

  public val flagSj: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇯")

  public val flagTa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇦")

  public val flagUm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇺🇲")

  public val unitedNations: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇺🇳")

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

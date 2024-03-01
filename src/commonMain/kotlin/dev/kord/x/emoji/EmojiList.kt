package dev.kord.x.emoji

import kotlin.js.JsName

/**
 * List of all supported discord emojis.
 */
@Suppress(names = arrayOf("ObjectPropertyName", "MemberVisibilityCanBePrivate",
        "SpellCheckingInspection", "unused"))
public object Emojis {
  public val all: List<DiscordEmoji> = listOf(
      grinning,
      smiley,
      smile,
      grin,
      laughing,
      sweatSmile,
      rofl,
      joy,
      slightlySmilingFace,
      upsideDownFace,
      meltingFace,
      wink,
      blush,
      innocent,
      smilingFaceWithThreeHearts,
      heartEyes,
      starStruck,
      kissingHeart,
      kissing,
      relaxed,
      kissingClosedEyes,
      kissingSmilingEyes,
      smilingFaceWithTear,
      yum,
      stuckOutTongue,
      stuckOutTongueWinkingEye,
      zanyFace,
      stuckOutTongueClosedEyes,
      moneyMouthFace,
      hugs,
      handOverMouth,
      faceWithOpenEyesAndHandOverMouth,
      faceWithPeekingEye,
      shushingFace,
      thinking,
      salutingFace,
      zipperMouthFace,
      raisedEyebrow,
      neutralFace,
      expressionless,
      noMouth,
      dottedLineFace,
      faceInClouds,
      smirk,
      unamused,
      rollEyes,
      grimacing,
      faceExhaling,
      lyingFace,
      shakingFace,
      relieved,
      pensive,
      sleepy,
      droolingFace,
      sleeping,
      mask,
      faceWithThermometer,
      faceWithHeadBandage,
      nauseatedFace,
      vomitingFace,
      sneezingFace,
      hotFace,
      coldFace,
      woozyFace,
      dizzyFace,
      faceWithSpiralEyes,
      explodingHead,
      cowboyHatFace,
      partyingFace,
      disguisedFace,
      sunglasses,
      nerdFace,
      monocleFace,
      confused,
      faceWithDiagonalMouth,
      worried,
      slightlyFrowningFace,
      frowningFace,
      openMouth,
      hushed,
      astonished,
      flushed,
      pleadingFace,
      faceHoldingBackTears,
      frowning,
      anguished,
      fearful,
      coldSweat,
      disappointedRelieved,
      cry,
      sob,
      scream,
      confounded,
      persevere,
      disappointed,
      sweat,
      weary,
      tiredFace,
      yawningFace,
      triumph,
      rage,
      angry,
      cursingFace,
      smilingImp,
      imp,
      skull,
      skullAndCrossbones,
      hankey,
      clownFace,
      japaneseOgre,
      japaneseGoblin,
      ghost,
      alien,
      spaceInvader,
      robot,
      smileyCat,
      smileCat,
      joyCat,
      heartEyesCat,
      smirkCat,
      kissingCat,
      screamCat,
      cryingCatFace,
      poutingCat,
      seeNoEvil,
      hearNoEvil,
      speakNoEvil,
      loveLetter,
      cupid,
      giftHeart,
      sparklingHeart,
      heartpulse,
      heartbeat,
      revolvingHearts,
      twoHearts,
      heartDecoration,
      heavyHeartExclamation,
      brokenHeart,
      heartOnFire,
      mendingHeart,
      heart,
      pinkHeart,
      orangeHeart,
      yellowHeart,
      greenHeart,
      blueHeart,
      lightBlueHeart,
      purpleHeart,
      brownHeart,
      blackHeart,
      greyHeart,
      whiteHeart,
      kiss,
      `100`,
      anger,
      boom,
      dizzy,
      sweatDrops,
      dash,
      hole,
      speechBalloon,
      eyeSpeechBubble,
      leftSpeechBubble,
      rightAngerBubble,
      thoughtBalloon,
      zzz,
      wave,
      raisedBackOfHand,
      raisedHandWithFingersSplayed,
      hand,
      vulcanSalute,
      rightwardsHand,
      leftwardsHand,
      palmDownHand,
      palmUpHand,
      leftwardsPushingHand,
      rightwardsPushingHand,
      okHand,
      pinchedFingers,
      pinchingHand,
      v,
      crossedFingers,
      handWithIndexFingerAndThumbCrossed,
      loveYouGesture,
      metal,
      callMeHand,
      pointLeft,
      pointRight,
      pointUp2,
      fu,
      pointDown,
      pointUp,
      indexPointingAtTheViewer,
      thumbsup,
      thumbsdown,
      fist,
      facepunch,
      fistLeft,
      fistRight,
      clap,
      raisedHands,
      heartHands,
      openHands,
      palmsUpTogether,
      handshake,
      pray,
      writingHand,
      nailCare,
      selfie,
      muscle,
      mechanicalArm,
      mechanicalLeg,
      leg,
      foot,
      ear,
      earWithHearingAid,
      nose,
      brain,
      anatomicalHeart,
      lungs,
      tooth,
      bone,
      eyes,
      eye,
      tongue,
      lips,
      bitingLip,
      baby,
      child,
      boy,
      girl,
      adult,
      blondHairedPerson,
      man,
      beardedPerson,
      manBeard,
      womanBeard,
      redHairedMan,
      curlyHairedMan,
      whiteHairedMan,
      baldMan,
      woman,
      redHairedWoman,
      personRedHair,
      curlyHairedWoman,
      personCurlyHair,
      whiteHairedWoman,
      personWhiteHair,
      baldWoman,
      personBald,
      blondHairedWoman,
      blondHairedMan,
      olderAdult,
      olderMan,
      olderWoman,
      frowningPerson,
      frowningMan,
      frowningWoman,
      poutingFace,
      poutingMan,
      poutingWoman,
      noGood,
      noGoodMan,
      noGoodWoman,
      okPerson,
      okMan,
      okWoman,
      tippingHandPerson,
      tippingHandMan,
      tippingHandWoman,
      raisingHand,
      raisingHandMan,
      raisingHandWoman,
      deafPerson,
      deafMan,
      deafWoman,
      bow,
      bowingMan,
      bowingWoman,
      facepalm,
      manFacepalming,
      womanFacepalming,
      shrug,
      manShrugging,
      womanShrugging,
      healthWorker,
      manHealthWorker,
      womanHealthWorker,
      student,
      manStudent,
      womanStudent,
      teacher,
      manTeacher,
      womanTeacher,
      judge,
      manJudge,
      womanJudge,
      farmer,
      manFarmer,
      womanFarmer,
      cook,
      manCook,
      womanCook,
      mechanic,
      manMechanic,
      womanMechanic,
      factoryWorker,
      manFactoryWorker,
      womanFactoryWorker,
      officeWorker,
      manOfficeWorker,
      womanOfficeWorker,
      scientist,
      manScientist,
      womanScientist,
      technologist,
      manTechnologist,
      womanTechnologist,
      singer,
      manSinger,
      womanSinger,
      artist,
      manArtist,
      womanArtist,
      pilot,
      manPilot,
      womanPilot,
      astronaut,
      manAstronaut,
      womanAstronaut,
      firefighter,
      manFirefighter,
      womanFirefighter,
      cop,
      policeman,
      policewoman,
      detective,
      maleDetective,
      femaleDetective,
      guard,
      guardsman,
      guardswoman,
      ninja,
      constructionWorker,
      constructionWorkerMan,
      constructionWorkerWoman,
      personWithCrown,
      prince,
      princess,
      personWithTurban,
      manWithTurban,
      womanWithTurban,
      manWithGuaPiMao,
      womanWithHeadscarf,
      personInTuxedo,
      manInTuxedo,
      womanInTuxedo,
      personWithVeil,
      manWithVeil,
      womanWithVeil,
      pregnantWoman,
      pregnantMan,
      pregnantPerson,
      breastFeeding,
      womanFeedingBaby,
      manFeedingBaby,
      personFeedingBaby,
      angel,
      santa,
      mrsClaus,
      mxClaus,
      superhero,
      superheroMan,
      superheroWoman,
      supervillain,
      supervillainMan,
      supervillainWoman,
      mage,
      mageMan,
      mageWoman,
      fairy,
      fairyMan,
      fairyWoman,
      vampire,
      vampireMan,
      vampireWoman,
      merperson,
      merman,
      mermaid,
      elf,
      elfMan,
      elfWoman,
      genie,
      genieMan,
      genieWoman,
      zombie,
      zombieMan,
      zombieWoman,
      troll,
      massage,
      massageMan,
      massageWoman,
      haircut,
      haircutMan,
      haircutWoman,
      walking,
      walkingMan,
      walkingWoman,
      standingPerson,
      standingMan,
      standingWoman,
      kneelingPerson,
      kneelingMan,
      kneelingWoman,
      personWithProbingCane,
      manWithProbingCane,
      womanWithProbingCane,
      personInMotorizedWheelchair,
      manInMotorizedWheelchair,
      womanInMotorizedWheelchair,
      personInManualWheelchair,
      manInManualWheelchair,
      womanInManualWheelchair,
      runner,
      runningMan,
      runningWoman,
      dancer,
      manDancing,
      businessSuitLevitating,
      dancers,
      dancingMen,
      dancingWomen,
      saunaPerson,
      saunaMan,
      saunaWoman,
      climbing,
      climbingMan,
      climbingWoman,
      personFencing,
      horseRacing,
      skier,
      snowboarder,
      golfing,
      golfingMan,
      golfingWoman,
      surfer,
      surfingMan,
      surfingWoman,
      rowboat,
      rowingMan,
      rowingWoman,
      swimmer,
      swimmingMan,
      swimmingWoman,
      bouncingBallPerson,
      bouncingBallMan,
      bouncingBallWoman,
      weightLifting,
      weightLiftingMan,
      weightLiftingWoman,
      bicyclist,
      bikingMan,
      bikingWoman,
      mountainBicyclist,
      mountainBikingMan,
      mountainBikingWoman,
      cartwheeling,
      manCartwheeling,
      womanCartwheeling,
      wrestling,
      menWrestling,
      womenWrestling,
      waterPolo,
      manPlayingWaterPolo,
      womanPlayingWaterPolo,
      handballPerson,
      manPlayingHandball,
      womanPlayingHandball,
      jugglingPerson,
      manJuggling,
      womanJuggling,
      lotusPosition,
      lotusPositionMan,
      lotusPositionWoman,
      bath,
      sleepingBed,
      peopleHoldingHands,
      twoWomenHoldingHands,
      couple,
      twoMenHoldingHands,
      couplekiss,
      couplekissManWoman,
      couplekissManMan,
      couplekissWomanWoman,
      coupleWithHeart,
      coupleWithHeartWomanMan,
      coupleWithHeartManMan,
      coupleWithHeartWomanWoman,
      family,
      familyManWomanBoy,
      familyManWomanGirl,
      familyManWomanGirlBoy,
      familyManWomanBoyBoy,
      familyManWomanGirlGirl,
      familyManManBoy,
      familyManManGirl,
      familyManManGirlBoy,
      familyManManBoyBoy,
      familyManManGirlGirl,
      familyWomanWomanBoy,
      familyWomanWomanGirl,
      familyWomanWomanGirlBoy,
      familyWomanWomanBoyBoy,
      familyWomanWomanGirlGirl,
      familyManBoy,
      familyManBoyBoy,
      familyManGirl,
      familyManGirlBoy,
      familyManGirlGirl,
      familyWomanBoy,
      familyWomanBoyBoy,
      familyWomanGirl,
      familyWomanGirlBoy,
      familyWomanGirlGirl,
      speakingHead,
      bustInSilhouette,
      bustsInSilhouette,
      peopleHugging,
      footprints,
      monkeyFace,
      monkey,
      gorilla,
      orangutan,
      dog,
      dog2,
      guideDog,
      serviceDog,
      poodle,
      wolf,
      foxFace,
      raccoon,
      cat,
      cat2,
      blackCat,
      lion,
      tiger,
      tiger2,
      leopard,
      horse,
      moose,
      donkey,
      racehorse,
      unicorn,
      zebra,
      deer,
      bison,
      cow,
      ox,
      waterBuffalo,
      cow2,
      pig,
      pig2,
      boar,
      pigNose,
      ram,
      sheep,
      goat,
      dromedaryCamel,
      camel,
      llama,
      giraffe,
      elephant,
      mammoth,
      rhinoceros,
      hippopotamus,
      mouse,
      mouse2,
      rat,
      hamster,
      rabbit,
      rabbit2,
      chipmunk,
      beaver,
      hedgehog,
      bat,
      bear,
      polarBear,
      koala,
      pandaFace,
      sloth,
      otter,
      skunk,
      kangaroo,
      badger,
      feet,
      turkey,
      chicken,
      rooster,
      hatchingChick,
      babyChick,
      hatchedChick,
      bird,
      penguin,
      dove,
      eagle,
      duck,
      swan,
      owl,
      dodo,
      feather,
      flamingo,
      peacock,
      parrot,
      wing,
      blackBird,
      goose,
      frog,
      crocodile,
      turtle,
      lizard,
      snake,
      dragonFace,
      dragon,
      sauropod,
      `t-rex`,
      whale,
      whale2,
      dolphin,
      seal,
      fish,
      tropicalFish,
      blowfish,
      shark,
      octopus,
      shell,
      coral,
      jellyfish,
      snail,
      butterfly,
      bug,
      ant,
      bee,
      beetle,
      ladyBeetle,
      cricket,
      cockroach,
      spider,
      spiderWeb,
      scorpion,
      mosquito,
      fly,
      worm,
      microbe,
      bouquet,
      cherryBlossom,
      whiteFlower,
      lotus,
      rosette,
      rose,
      wiltedFlower,
      hibiscus,
      sunflower,
      blossom,
      tulip,
      hyacinth,
      seedling,
      pottedPlant,
      evergreenTree,
      deciduousTree,
      palmTree,
      cactus,
      earOfRice,
      herb,
      shamrock,
      fourLeafClover,
      mapleLeaf,
      fallenLeaf,
      leaves,
      emptyNest,
      nestWithEggs,
      mushroom,
      grapes,
      melon,
      watermelon,
      tangerine,
      lemon,
      banana,
      pineapple,
      mango,
      apple,
      greenApple,
      pear,
      peach,
      cherries,
      strawberry,
      blueberries,
      kiwiFruit,
      tomato,
      olive,
      coconut,
      avocado,
      eggplant,
      potato,
      carrot,
      corn,
      hotPepper,
      bellPepper,
      cucumber,
      leafyGreen,
      broccoli,
      garlic,
      onion,
      peanuts,
      beans,
      chestnut,
      gingerRoot,
      peaPod,
      bread,
      croissant,
      baguetteBread,
      flatbread,
      pretzel,
      bagel,
      pancakes,
      waffle,
      cheese,
      meatOnBone,
      poultryLeg,
      cutOfMeat,
      bacon,
      hamburger,
      fries,
      pizza,
      hotdog,
      sandwich,
      taco,
      burrito,
      tamale,
      stuffedFlatbread,
      falafel,
      egg,
      friedEgg,
      shallowPanOfFood,
      stew,
      fondue,
      bowlWithSpoon,
      greenSalad,
      popcorn,
      butter,
      salt,
      cannedFood,
      bento,
      riceCracker,
      riceBall,
      rice,
      curry,
      ramen,
      spaghetti,
      sweetPotato,
      oden,
      sushi,
      friedShrimp,
      fishCake,
      moonCake,
      dango,
      dumpling,
      fortuneCookie,
      takeoutBox,
      crab,
      lobster,
      shrimp,
      squid,
      oyster,
      icecream,
      shavedIce,
      iceCream,
      doughnut,
      cookie,
      birthday,
      cake,
      cupcake,
      pie,
      chocolateBar,
      candy,
      lollipop,
      custard,
      honeyPot,
      babyBottle,
      milkGlass,
      coffee,
      teapot,
      tea,
      sake,
      champagne,
      wineGlass,
      cocktail,
      tropicalDrink,
      beer,
      beers,
      clinkingGlasses,
      tumblerGlass,
      pouringLiquid,
      cupWithStraw,
      bubbleTea,
      beverageBox,
      mate,
      iceCube,
      chopsticks,
      plateWithCutlery,
      forkAndKnife,
      spoon,
      hocho,
      jar,
      amphora,
      earthAfrica,
      earthAmericas,
      earthAsia,
      globeWithMeridians,
      worldMap,
      japan,
      compass,
      mountainSnow,
      mountain,
      volcano,
      mountFuji,
      camping,
      beachUmbrella,
      desert,
      desertIsland,
      nationalPark,
      stadium,
      classicalBuilding,
      buildingConstruction,
      bricks,
      rock,
      wood,
      hut,
      houses,
      derelictHouse,
      house,
      houseWithGarden,
      office,
      postOffice,
      europeanPostOffice,
      hospital,
      bank,
      hotel,
      loveHotel,
      convenienceStore,
      school,
      departmentStore,
      factory,
      japaneseCastle,
      europeanCastle,
      wedding,
      tokyoTower,
      statueOfLiberty,
      church,
      mosque,
      hinduTemple,
      synagogue,
      shintoShrine,
      kaaba,
      fountain,
      tent,
      foggy,
      nightWithStars,
      cityscape,
      sunriseOverMountains,
      sunrise,
      citySunset,
      citySunrise,
      bridgeAtNight,
      hotsprings,
      carouselHorse,
      playgroundSlide,
      ferrisWheel,
      rollerCoaster,
      barber,
      circusTent,
      steamLocomotive,
      railwayCar,
      bullettrainSide,
      bullettrainFront,
      train2,
      metro,
      lightRail,
      station,
      tram,
      monorail,
      mountainRailway,
      train,
      bus,
      oncomingBus,
      trolleybus,
      minibus,
      ambulance,
      fireEngine,
      policeCar,
      oncomingPoliceCar,
      taxi,
      oncomingTaxi,
      car,
      oncomingAutomobile,
      blueCar,
      pickupTruck,
      truck,
      articulatedLorry,
      tractor,
      racingCar,
      motorcycle,
      motorScooter,
      manualWheelchair,
      motorizedWheelchair,
      autoRickshaw,
      bike,
      kickScooter,
      skateboard,
      rollerSkate,
      busstop,
      motorway,
      railwayTrack,
      oilDrum,
      fuelpump,
      wheel,
      rotatingLight,
      trafficLight,
      verticalTrafficLight,
      stopSign,
      construction,
      anchor,
      ringBuoy,
      boat,
      canoe,
      speedboat,
      passengerShip,
      ferry,
      motorBoat,
      ship,
      airplane,
      smallAirplane,
      flightDeparture,
      flightArrival,
      parachute,
      seat,
      helicopter,
      suspensionRailway,
      mountainCableway,
      aerialTramway,
      artificialSatellite,
      rocket,
      flyingSaucer,
      bellhopBell,
      luggage,
      hourglass,
      hourglassFlowingSand,
      watch,
      alarmClock,
      stopwatch,
      timerClock,
      mantelpieceClock,
      clock12,
      clock1230,
      clock1,
      clock130,
      clock2,
      clock230,
      clock3,
      clock330,
      clock4,
      clock430,
      clock5,
      clock530,
      clock6,
      clock630,
      clock7,
      clock730,
      clock8,
      clock830,
      clock9,
      clock930,
      clock10,
      clock1030,
      clock11,
      clock1130,
      newMoon,
      waxingCrescentMoon,
      firstQuarterMoon,
      moon,
      fullMoon,
      waningGibbousMoon,
      lastQuarterMoon,
      waningCrescentMoon,
      crescentMoon,
      newMoonWithFace,
      firstQuarterMoonWithFace,
      lastQuarterMoonWithFace,
      thermometer,
      sunny,
      fullMoonWithFace,
      sunWithFace,
      ringedPlanet,
      star,
      star2,
      stars,
      milkyWay,
      cloud,
      partlySunny,
      cloudWithLightningAndRain,
      sunBehindSmallCloud,
      sunBehindLargeCloud,
      sunBehindRainCloud,
      cloudWithRain,
      cloudWithSnow,
      cloudWithLightning,
      tornado,
      fog,
      windFace,
      cyclone,
      rainbow,
      closedUmbrella,
      openUmbrella,
      umbrella,
      parasolOnGround,
      zap,
      snowflake,
      snowmanWithSnow,
      snowman,
      comet,
      fire,
      droplet,
      ocean,
      jackOLantern,
      christmasTree,
      fireworks,
      sparkler,
      firecracker,
      sparkles,
      balloon,
      tada,
      confettiBall,
      tanabataTree,
      bamboo,
      dolls,
      flags,
      windChime,
      riceScene,
      redEnvelope,
      ribbon,
      gift,
      reminderRibbon,
      tickets,
      ticket,
      medalMilitary,
      trophy,
      medalSports,
      `1stPlaceMedal`,
      `2ndPlaceMedal`,
      `3rdPlaceMedal`,
      soccer,
      baseball,
      softball,
      basketball,
      volleyball,
      football,
      rugbyFootball,
      tennis,
      flyingDisc,
      bowling,
      cricketGame,
      fieldHockey,
      iceHockey,
      lacrosse,
      pingPong,
      badminton,
      boxingGlove,
      martialArtsUniform,
      goalNet,
      golf,
      iceSkate,
      fishingPoleAndFish,
      divingMask,
      runningShirtWithSash,
      ski,
      sled,
      curlingStone,
      dart,
      yoYo,
      kite,
      gun,
      `8ball`,
      crystalBall,
      magicWand,
      videoGame,
      joystick,
      slotMachine,
      gameDie,
      jigsaw,
      teddyBear,
      pinata,
      mirrorBall,
      nestingDolls,
      spades,
      hearts,
      diamonds,
      clubs,
      chessPawn,
      blackJoker,
      mahjong,
      flowerPlayingCards,
      performingArts,
      framedPicture,
      art,
      thread,
      sewingNeedle,
      yarn,
      knot,
      eyeglasses,
      darkSunglasses,
      goggles,
      labCoat,
      safetyVest,
      necktie,
      shirt,
      jeans,
      scarf,
      gloves,
      coat,
      socks,
      dress,
      kimono,
      sari,
      onePieceSwimsuit,
      swimBrief,
      shorts,
      bikini,
      womansClothes,
      foldingHandFan,
      purse,
      handbag,
      pouch,
      shopping,
      schoolSatchel,
      thongSandal,
      shoe,
      athleticShoe,
      hikingBoot,
      flatShoe,
      highHeel,
      sandal,
      balletShoes,
      boot,
      hairPick,
      crown,
      womansHat,
      tophat,
      mortarBoard,
      billedCap,
      militaryHelmet,
      rescueWorkerHelmet,
      prayerBeads,
      lipstick,
      ring,
      gem,
      mute,
      speaker,
      sound,
      loudSound,
      loudspeaker,
      mega,
      postalHorn,
      bell,
      noBell,
      musicalScore,
      musicalNote,
      notes,
      studioMicrophone,
      levelSlider,
      controlKnobs,
      microphone,
      headphones,
      radio,
      saxophone,
      accordion,
      guitar,
      musicalKeyboard,
      trumpet,
      violin,
      banjo,
      drum,
      longDrum,
      maracas,
      flute,
      iphone,
      calling,
      phone,
      telephoneReceiver,
      pager,
      fax,
      battery,
      lowBattery,
      electricPlug,
      computer,
      desktopComputer,
      printer,
      keyboard,
      computerMouse,
      trackball,
      minidisc,
      floppyDisk,
      cd,
      dvd,
      abacus,
      movieCamera,
      filmStrip,
      filmProjector,
      clapper,
      tv,
      camera,
      cameraFlash,
      videoCamera,
      vhs,
      mag,
      magRight,
      candle,
      bulb,
      flashlight,
      lantern,
      diyaLamp,
      notebookWithDecorativeCover,
      closedBook,
      book,
      greenBook,
      blueBook,
      orangeBook,
      books,
      notebook,
      ledger,
      pageWithCurl,
      scroll,
      pageFacingUp,
      newspaper,
      newspaperRoll,
      bookmarkTabs,
      bookmark,
      label,
      moneybag,
      coin,
      yen,
      dollar,
      euro,
      pound,
      moneyWithWings,
      creditCard,
      receipt,
      chart,
      envelope,
      email,
      incomingEnvelope,
      envelopeWithArrow,
      outboxTray,
      inboxTray,
      `package`,
      mailbox,
      mailboxClosed,
      mailboxWithMail,
      mailboxWithNoMail,
      postbox,
      ballotBox,
      pencil2,
      blackNib,
      fountainPen,
      pen,
      paintbrush,
      crayon,
      memo,
      briefcase,
      fileFolder,
      openFileFolder,
      cardIndexDividers,
      date,
      calendar,
      spiralNotepad,
      spiralCalendar,
      cardIndex,
      chartWithUpwardsTrend,
      chartWithDownwardsTrend,
      barChart,
      clipboard,
      pushpin,
      roundPushpin,
      paperclip,
      paperclips,
      straightRuler,
      triangularRuler,
      scissors,
      cardFileBox,
      fileCabinet,
      wastebasket,
      lock,
      unlock,
      lockWithInkPen,
      closedLockWithKey,
      key,
      oldKey,
      hammer,
      axe,
      pick,
      hammerAndPick,
      hammerAndWrench,
      dagger,
      crossedSwords,
      bomb,
      boomerang,
      bowAndArrow,
      shield,
      carpentrySaw,
      wrench,
      screwdriver,
      nutAndBolt,
      gear,
      clamp,
      balanceScale,
      probingCane,
      link,
      chains,
      hook,
      toolbox,
      magnet,
      ladder,
      alembic,
      testTube,
      petriDish,
      dna,
      microscope,
      telescope,
      satellite,
      syringe,
      dropOfBlood,
      pill,
      adhesiveBandage,
      crutch,
      stethoscope,
      xRay,
      door,
      elevator,
      mirror,
      window,
      bed,
      couchAndLamp,
      chair,
      toilet,
      plunger,
      shower,
      bathtub,
      mouseTrap,
      razor,
      lotionBottle,
      safetyPin,
      broom,
      basket,
      rollOfPaper,
      bucket,
      soap,
      bubbles,
      toothbrush,
      sponge,
      fireExtinguisher,
      shoppingCart,
      smoking,
      coffin,
      headstone,
      funeralUrn,
      nazarAmulet,
      hamsa,
      moyai,
      placard,
      identificationCard,
      atm,
      putLitterInItsPlace,
      potableWater,
      wheelchair,
      mens,
      womens,
      restroom,
      babySymbol,
      wc,
      passportControl,
      customs,
      baggageClaim,
      leftLuggage,
      warning,
      childrenCrossing,
      noEntry,
      noEntrySign,
      noBicycles,
      noSmoking,
      doNotLitter,
      `non-potableWater`,
      noPedestrians,
      noMobilePhones,
      underage,
      radioactive,
      biohazard,
      arrowUp,
      arrowUpperRight,
      arrowRight,
      arrowLowerRight,
      arrowDown,
      arrowLowerLeft,
      arrowLeft,
      arrowUpperLeft,
      arrowUpDown,
      leftRightArrow,
      leftwardsArrowWithHook,
      arrowRightHook,
      arrowHeadingUp,
      arrowHeadingDown,
      arrowsClockwise,
      arrowsCounterclockwise,
      back,
      end,
      on,
      soon,
      top,
      placeOfWorship,
      atomSymbol,
      om,
      starOfDavid,
      wheelOfDharma,
      yinYang,
      latinCross,
      orthodoxCross,
      starAndCrescent,
      peaceSymbol,
      menorah,
      sixPointedStar,
      khanda,
      aries,
      taurus,
      gemini,
      cancer,
      leo,
      virgo,
      libra,
      scorpius,
      sagittarius,
      capricorn,
      aquarius,
      pisces,
      ophiuchus,
      twistedRightwardsArrows,
      repeat,
      repeatOne,
      arrowForward,
      fastForward,
      nextTrackButton,
      playOrPauseButton,
      arrowBackward,
      rewind,
      previousTrackButton,
      arrowUpSmall,
      arrowDoubleUp,
      arrowDownSmall,
      arrowDoubleDown,
      pauseButton,
      stopButton,
      recordButton,
      ejectButton,
      cinema,
      lowBrightness,
      highBrightness,
      signalStrength,
      wireless,
      vibrationMode,
      mobilePhoneOff,
      femaleSign,
      maleSign,
      transgenderSymbol,
      heavyMultiplicationX,
      heavyPlusSign,
      heavyMinusSign,
      heavyDivisionSign,
      heavyEqualsSign,
      infinity,
      bangbang,
      interrobang,
      question,
      greyQuestion,
      greyExclamation,
      exclamation,
      wavyDash,
      currencyExchange,
      heavyDollarSign,
      medicalSymbol,
      recycle,
      fleurDeLis,
      trident,
      nameBadge,
      beginner,
      o,
      whiteCheckMark,
      ballotBoxWithCheck,
      heavyCheckMark,
      x,
      negativeSquaredCrossMark,
      curlyLoop,
      loop,
      partAlternationMark,
      eightSpokedAsterisk,
      eightPointedBlackStar,
      sparkle,
      copyright,
      registered,
      tm,
      hash,
      asterisk,
      zero,
      one,
      two,
      three,
      four,
      five,
      six,
      seven,
      eight,
      nine,
      keycapTen,
      capitalAbcd,
      abcd,
      `1234`,
      symbols,
      abc,
      a,
      ab,
      b,
      cl,
      cool,
      free,
      informationSource,
      id,
      m,
      new,
      ng,
      o2,
      ok,
      parking,
      sos,
      up,
      vs,
      koko,
      sa,
      u6708,
      u6709,
      u6307,
      ideographAdvantage,
      u5272,
      u7121,
      u7981,
      accept,
      u7533,
      u5408,
      u7a7a,
      congratulations,
      secret,
      u55b6,
      u6e80,
      redCircle,
      orangeCircle,
      yellowCircle,
      greenCircle,
      largeBlueCircle,
      purpleCircle,
      brownCircle,
      blackCircle,
      whiteCircle,
      redSquare,
      orangeSquare,
      yellowSquare,
      greenSquare,
      blueSquare,
      purpleSquare,
      brownSquare,
      blackLargeSquare,
      whiteLargeSquare,
      blackMediumSquare,
      whiteMediumSquare,
      blackMediumSmallSquare,
      whiteMediumSmallSquare,
      blackSmallSquare,
      whiteSmallSquare,
      largeOrangeDiamond,
      largeBlueDiamond,
      smallOrangeDiamond,
      smallBlueDiamond,
      smallRedTriangle,
      smallRedTriangleDown,
      diamondShapeWithADotInside,
      radioButton,
      whiteSquareButton,
      blackSquareButton,
      checkeredFlag,
      triangularFlagOnPost,
      crossedFlags,
      blackFlag,
      whiteFlag,
      rainbowFlag,
      transgenderFlag,
      pirateFlag,
      ascensionIsland,
      andorra,
      unitedArabEmirates,
      afghanistan,
      antiguaBarbuda,
      anguilla,
      albania,
      armenia,
      angola,
      antarctica,
      argentina,
      americanSamoa,
      austria,
      australia,
      aruba,
      alandIslands,
      azerbaijan,
      bosniaHerzegovina,
      barbados,
      bangladesh,
      belgium,
      burkinaFaso,
      bulgaria,
      bahrain,
      burundi,
      benin,
      stBarthelemy,
      bermuda,
      brunei,
      bolivia,
      caribbeanNetherlands,
      brazil,
      bahamas,
      bhutan,
      bouvetIsland,
      botswana,
      belarus,
      belize,
      canada,
      cocosIslands,
      congoKinshasa,
      centralAfricanRepublic,
      congoBrazzaville,
      switzerland,
      coteDivoire,
      cookIslands,
      chile,
      cameroon,
      cn,
      colombia,
      clippertonIsland,
      costaRica,
      cuba,
      capeVerde,
      curacao,
      christmasIsland,
      cyprus,
      czechRepublic,
      de,
      diegoGarcia,
      djibouti,
      denmark,
      dominica,
      dominicanRepublic,
      algeria,
      ceutaMelilla,
      ecuador,
      estonia,
      egypt,
      westernSahara,
      eritrea,
      es,
      ethiopia,
      eu,
      finland,
      fiji,
      falklandIslands,
      micronesia,
      faroeIslands,
      fr,
      gabon,
      gb,
      grenada,
      georgia,
      frenchGuiana,
      guernsey,
      ghana,
      gibraltar,
      greenland,
      gambia,
      guinea,
      guadeloupe,
      equatorialGuinea,
      greece,
      southGeorgiaSouthSandwichIslands,
      guatemala,
      guam,
      guineaBissau,
      guyana,
      hongKong,
      heardMcdonaldIslands,
      honduras,
      croatia,
      haiti,
      hungary,
      canaryIslands,
      indonesia,
      ireland,
      israel,
      isleOfMan,
      india,
      britishIndianOceanTerritory,
      iraq,
      iran,
      iceland,
      it,
      jersey,
      jamaica,
      jordan,
      jp,
      kenya,
      kyrgyzstan,
      cambodia,
      kiribati,
      comoros,
      stKittsNevis,
      northKorea,
      kr,
      kuwait,
      caymanIslands,
      kazakhstan,
      laos,
      lebanon,
      stLucia,
      liechtenstein,
      sriLanka,
      liberia,
      lesotho,
      lithuania,
      luxembourg,
      latvia,
      libya,
      morocco,
      monaco,
      moldova,
      montenegro,
      stMartin,
      madagascar,
      marshallIslands,
      macedonia,
      mali,
      myanmar,
      mongolia,
      macau,
      northernMarianaIslands,
      martinique,
      mauritania,
      montserrat,
      malta,
      mauritius,
      maldives,
      malawi,
      mexico,
      malaysia,
      mozambique,
      namibia,
      newCaledonia,
      niger,
      norfolkIsland,
      nigeria,
      nicaragua,
      netherlands,
      norway,
      nepal,
      nauru,
      niue,
      newZealand,
      oman,
      panama,
      peru,
      frenchPolynesia,
      papuaNewGuinea,
      philippines,
      pakistan,
      poland,
      stPierreMiquelon,
      pitcairnIslands,
      puertoRico,
      palestinianTerritories,
      portugal,
      palau,
      paraguay,
      qatar,
      reunion,
      romania,
      serbia,
      ru,
      rwanda,
      saudiArabia,
      solomonIslands,
      seychelles,
      sudan,
      sweden,
      singapore,
      stHelena,
      slovenia,
      svalbardJanMayen,
      slovakia,
      sierraLeone,
      sanMarino,
      senegal,
      somalia,
      suriname,
      southSudan,
      saoTomePrincipe,
      elSalvador,
      sintMaarten,
      syria,
      swaziland,
      tristanDaCunha,
      turksCaicosIslands,
      chad,
      frenchSouthernTerritories,
      togo,
      thailand,
      tajikistan,
      tokelau,
      timorLeste,
      turkmenistan,
      tunisia,
      tonga,
      tr,
      trinidadTobago,
      tuvalu,
      taiwan,
      tanzania,
      ukraine,
      uganda,
      usOutlyingIslands,
      unitedNations,
      us,
      uruguay,
      uzbekistan,
      vaticanCity,
      stVincentGrenadines,
      venezuela,
      britishVirginIslands,
      usVirginIslands,
      vietnam,
      vanuatu,
      wallisFutuna,
      samoa,
      kosovo,
      yemen,
      mayotte,
      southAfrica,
      zambia,
      zimbabwe,
      england,
      scotland,
      wales)

  public val grinning: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😀", listOf("grinning"))

  public val smiley: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😃", listOf("smiley"))

  public val smile: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😄", listOf("smile"))

  public val grin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😁", listOf("grin"))

  public val laughing: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😆", listOf("laughing", "satisfied"))

  public val sweatSmile: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😅", listOf("sweat_smile"))

  public val rofl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤣", listOf("rofl"))

  public val joy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😂", listOf("joy"))

  public val slightlySmilingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🙂", listOf("slightly_smiling_face"))

  public val upsideDownFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🙃", listOf("upside_down_face"))

  public val meltingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫠", listOf("melting_face"))

  public val wink: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😉", listOf("wink"))

  public val blush: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😊", listOf("blush"))

  public val innocent: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😇", listOf("innocent"))

  public val smilingFaceWithThreeHearts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥰", listOf("smiling_face_with_three_hearts"))

  public val heartEyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😍", listOf("heart_eyes"))

  public val starStruck: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤩", listOf("star_struck"))

  public val kissingHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😘", listOf("kissing_heart"))

  public val kissing: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😗", listOf("kissing"))

  public val relaxed: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☺️", listOf("relaxed"))

  public val kissingClosedEyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😚", listOf("kissing_closed_eyes"))

  public val kissingSmilingEyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😙", listOf("kissing_smiling_eyes"))

  public val smilingFaceWithTear: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥲", listOf("smiling_face_with_tear"))

  public val yum: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😋", listOf("yum"))

  public val stuckOutTongue: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😛", listOf("stuck_out_tongue"))

  public val stuckOutTongueWinkingEye: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😜", listOf("stuck_out_tongue_winking_eye"))

  public val zanyFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤪", listOf("zany_face"))

  public val stuckOutTongueClosedEyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😝", listOf("stuck_out_tongue_closed_eyes"))

  public val moneyMouthFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤑", listOf("money_mouth_face"))

  public val hugs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤗", listOf("hugs"))

  public val handOverMouth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤭", listOf("hand_over_mouth"))

  public val faceWithOpenEyesAndHandOverMouth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫢", listOf("face_with_open_eyes_and_hand_over_mouth"))

  public val faceWithPeekingEye: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫣", listOf("face_with_peeking_eye"))

  public val shushingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤫", listOf("shushing_face"))

  public val thinking: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤔", listOf("thinking"))

  public val salutingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫡", listOf("saluting_face"))

  public val zipperMouthFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤐", listOf("zipper_mouth_face"))

  public val raisedEyebrow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤨", listOf("raised_eyebrow"))

  public val neutralFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😐", listOf("neutral_face"))

  public val expressionless: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😑", listOf("expressionless"))

  public val noMouth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😶", listOf("no_mouth"))

  public val dottedLineFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫥", listOf("dotted_line_face"))

  public val faceInClouds: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😶‍🌫️", listOf("face_in_clouds"))

  public val smirk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😏", listOf("smirk"))

  public val unamused: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😒", listOf("unamused"))

  public val rollEyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🙄", listOf("roll_eyes"))

  public val grimacing: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😬", listOf("grimacing"))

  public val faceExhaling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😮‍💨", listOf("face_exhaling"))

  public val lyingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤥", listOf("lying_face"))

  public val shakingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫨", listOf("shaking_face"))

  public val relieved: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😌", listOf("relieved"))

  public val pensive: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😔", listOf("pensive"))

  public val sleepy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😪", listOf("sleepy"))

  public val droolingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤤", listOf("drooling_face"))

  public val sleeping: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😴", listOf("sleeping"))

  public val mask: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😷", listOf("mask"))

  public val faceWithThermometer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤒", listOf("face_with_thermometer"))

  public val faceWithHeadBandage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤕", listOf("face_with_head_bandage"))

  public val nauseatedFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤢", listOf("nauseated_face"))

  public val vomitingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤮", listOf("vomiting_face"))

  public val sneezingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤧", listOf("sneezing_face"))

  public val hotFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥵", listOf("hot_face"))

  public val coldFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥶", listOf("cold_face"))

  public val woozyFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥴", listOf("woozy_face"))

  public val dizzyFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😵", listOf("dizzy_face"))

  public val faceWithSpiralEyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😵‍💫", listOf("face_with_spiral_eyes"))

  public val explodingHead: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤯", listOf("exploding_head"))

  public val cowboyHatFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤠", listOf("cowboy_hat_face"))

  public val partyingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥳", listOf("partying_face"))

  public val disguisedFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥸", listOf("disguised_face"))

  public val sunglasses: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😎", listOf("sunglasses"))

  public val nerdFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤓", listOf("nerd_face"))

  public val monocleFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧐", listOf("monocle_face"))

  public val confused: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😕", listOf("confused"))

  public val faceWithDiagonalMouth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫤", listOf("face_with_diagonal_mouth"))

  public val worried: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😟", listOf("worried"))

  public val slightlyFrowningFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🙁", listOf("slightly_frowning_face"))

  public val frowningFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☹️", listOf("frowning_face"))

  public val openMouth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😮", listOf("open_mouth"))

  public val hushed: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😯", listOf("hushed"))

  public val astonished: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😲", listOf("astonished"))

  public val flushed: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😳", listOf("flushed"))

  public val pleadingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥺", listOf("pleading_face"))

  public val faceHoldingBackTears: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥹", listOf("face_holding_back_tears"))

  public val frowning: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😦", listOf("frowning"))

  public val anguished: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😧", listOf("anguished"))

  public val fearful: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😨", listOf("fearful"))

  public val coldSweat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😰", listOf("cold_sweat"))

  public val disappointedRelieved: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😥", listOf("disappointed_relieved"))

  public val cry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😢", listOf("cry"))

  public val sob: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😭", listOf("sob"))

  public val scream: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😱", listOf("scream"))

  public val confounded: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😖", listOf("confounded"))

  public val persevere: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😣", listOf("persevere"))

  public val disappointed: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😞", listOf("disappointed"))

  public val sweat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😓", listOf("sweat"))

  public val weary: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😩", listOf("weary"))

  public val tiredFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😫", listOf("tired_face"))

  public val yawningFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥱", listOf("yawning_face"))

  public val triumph: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😤", listOf("triumph"))

  public val rage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😡", listOf("rage", "pout"))

  public val angry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😠", listOf("angry"))

  public val cursingFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤬", listOf("cursing_face"))

  public val smilingImp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😈", listOf("smiling_imp"))

  public val imp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👿", listOf("imp"))

  public val skull: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💀", listOf("skull"))

  public val skullAndCrossbones: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☠️", listOf("skull_and_crossbones"))

  public val hankey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💩", listOf("hankey", "poop", "shit"))

  public val clownFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤡", listOf("clown_face"))

  public val japaneseOgre: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👹", listOf("japanese_ogre"))

  public val japaneseGoblin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👺", listOf("japanese_goblin"))

  public val ghost: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👻", listOf("ghost"))

  public val alien: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👽", listOf("alien"))

  public val spaceInvader: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👾", listOf("space_invader"))

  public val robot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤖", listOf("robot"))

  public val smileyCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😺", listOf("smiley_cat"))

  public val smileCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😸", listOf("smile_cat"))

  public val joyCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😹", listOf("joy_cat"))

  public val heartEyesCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😻", listOf("heart_eyes_cat"))

  public val smirkCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😼", listOf("smirk_cat"))

  public val kissingCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😽", listOf("kissing_cat"))

  public val screamCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🙀", listOf("scream_cat"))

  public val cryingCatFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😿", listOf("crying_cat_face"))

  public val poutingCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("😾", listOf("pouting_cat"))

  public val seeNoEvil: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🙈", listOf("see_no_evil"))

  public val hearNoEvil: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🙉", listOf("hear_no_evil"))

  public val speakNoEvil: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🙊", listOf("speak_no_evil"))

  public val loveLetter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💌", listOf("love_letter"))

  public val cupid: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💘", listOf("cupid"))

  public val giftHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💝", listOf("gift_heart"))

  public val sparklingHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💖", listOf("sparkling_heart"))

  public val heartpulse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💗", listOf("heartpulse"))

  public val heartbeat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💓", listOf("heartbeat"))

  public val revolvingHearts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💞", listOf("revolving_hearts"))

  public val twoHearts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💕", listOf("two_hearts"))

  public val heartDecoration: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💟", listOf("heart_decoration"))

  public val heavyHeartExclamation: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❣️", listOf("heavy_heart_exclamation"))

  public val brokenHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💔", listOf("broken_heart"))

  public val heartOnFire: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❤️‍🔥", listOf("heart_on_fire"))

  public val mendingHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❤️‍🩹", listOf("mending_heart"))

  public val heart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❤️", listOf("heart"))

  public val pinkHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩷", listOf("pink_heart"))

  public val orangeHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧡", listOf("orange_heart"))

  public val yellowHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💛", listOf("yellow_heart"))

  public val greenHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💚", listOf("green_heart"))

  public val blueHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💙", listOf("blue_heart"))

  public val lightBlueHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩵", listOf("light_blue_heart"))

  public val purpleHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💜", listOf("purple_heart"))

  public val brownHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤎", listOf("brown_heart"))

  public val blackHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖤", listOf("black_heart"))

  public val greyHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩶", listOf("grey_heart"))

  public val whiteHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤍", listOf("white_heart"))

  public val kiss: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💋", listOf("kiss"))

  @JsName("_100")
  public val `100`: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💯", listOf("100"))

  public val anger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💢", listOf("anger"))

  public val boom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💥", listOf("boom", "collision"))

  public val dizzy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💫", listOf("dizzy"))

  public val sweatDrops: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💦", listOf("sweat_drops"))

  public val dash: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💨", listOf("dash"))

  public val hole: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕳️", listOf("hole"))

  public val speechBalloon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💬", listOf("speech_balloon"))

  public val eyeSpeechBubble: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👁️‍🗨️", listOf("eye_speech_bubble"))

  public val leftSpeechBubble: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗨️", listOf("left_speech_bubble"))

  public val rightAngerBubble: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗯️", listOf("right_anger_bubble"))

  public val thoughtBalloon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💭", listOf("thought_balloon"))

  public val zzz: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💤", listOf("zzz"))

  public val wave: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👋", listOf("wave"))

  public val raisedBackOfHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤚", listOf("raised_back_of_hand"))

  public val raisedHandWithFingersSplayed: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🖐️", listOf("raised_hand_with_fingers_splayed"))

  public val hand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("✋", listOf("hand", "raised_hand"))

  public val vulcanSalute: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🖖", listOf("vulcan_salute"))

  public val rightwardsHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🫱", listOf("rightwards_hand"))

  public val leftwardsHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🫲", listOf("leftwards_hand"))

  public val palmDownHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🫳", listOf("palm_down_hand"))

  public val palmUpHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🫴", listOf("palm_up_hand"))

  public val leftwardsPushingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🫷", listOf("leftwards_pushing_hand"))

  public val rightwardsPushingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🫸", listOf("rightwards_pushing_hand"))

  public val okHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👌", listOf("ok_hand"))

  public val pinchedFingers: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤌", listOf("pinched_fingers"))

  public val pinchingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤏", listOf("pinching_hand"))

  public val v: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("✌️", listOf("v"))

  public val crossedFingers: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤞", listOf("crossed_fingers"))

  public val handWithIndexFingerAndThumbCrossed: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🫰", listOf("hand_with_index_finger_and_thumb_crossed"))

  public val loveYouGesture: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤟", listOf("love_you_gesture"))

  public val metal: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤘", listOf("metal"))

  public val callMeHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤙", listOf("call_me_hand"))

  public val pointLeft: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👈", listOf("point_left"))

  public val pointRight: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👉", listOf("point_right"))

  public val pointUp2: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👆", listOf("point_up_2"))

  public val fu: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🖕", listOf("middle_finger", "fu"))

  public val pointDown: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👇", listOf("point_down"))

  public val pointUp: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("☝️", listOf("point_up"))

  public val indexPointingAtTheViewer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🫵", listOf("index_pointing_at_the_viewer"))

  public val thumbsup: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👍", listOf("+1", "thumbsup"))

  public val thumbsdown: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👎", listOf("-1", "thumbsdown"))

  public val fist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("✊", listOf("fist_raised", "fist"))

  public val facepunch: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👊", listOf("fist_oncoming", "facepunch", "punch"))

  public val fistLeft: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤛", listOf("fist_left"))

  public val fistRight: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤜", listOf("fist_right"))

  public val clap: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👏", listOf("clap"))

  public val raisedHands: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙌", listOf("raised_hands"))

  public val heartHands: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🫶", listOf("heart_hands"))

  public val openHands: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👐", listOf("open_hands"))

  public val palmsUpTogether: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤲", listOf("palms_up_together"))

  public val handshake: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤝", listOf("handshake"))

  public val pray: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙏", listOf("pray"))

  public val writingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("✍️", listOf("writing_hand"))

  public val nailCare: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💅", listOf("nail_care"))

  public val selfie: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤳", listOf("selfie"))

  public val muscle: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💪", listOf("muscle"))

  public val mechanicalArm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦾", listOf("mechanical_arm"))

  public val mechanicalLeg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦿", listOf("mechanical_leg"))

  public val leg: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🦵", listOf("leg"))

  public val foot: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🦶", listOf("foot"))

  public val ear: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👂", listOf("ear"))

  public val earWithHearingAid: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🦻", listOf("ear_with_hearing_aid"))

  public val nose: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👃", listOf("nose"))

  public val brain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧠", listOf("brain"))

  public val anatomicalHeart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫀", listOf("anatomical_heart"))

  public val lungs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫁", listOf("lungs"))

  public val tooth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦷", listOf("tooth"))

  public val bone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦴", listOf("bone"))

  public val eyes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👀", listOf("eyes"))

  public val eye: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👁️", listOf("eye"))

  public val tongue: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👅", listOf("tongue"))

  public val lips: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👄", listOf("lips"))

  public val bitingLip: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫦", listOf("biting_lip"))

  public val baby: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👶", listOf("baby"))

  public val child: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧒", listOf("child"))

  public val boy: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👦", listOf("boy"))

  public val girl: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👧", listOf("girl"))

  public val adult: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑", listOf("adult"))

  public val blondHairedPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👱", listOf("blond_haired_person"))

  public val man: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨", listOf("man"))

  public val beardedPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧔", listOf("bearded_person"))

  public val manBeard: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧔‍♂️", listOf("man_beard"))

  public val womanBeard: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧔‍♀️", listOf("woman_beard"))

  public val redHairedMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🦰", listOf("red_haired_man"))

  public val curlyHairedMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🦱", listOf("curly_haired_man"))

  public val whiteHairedMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🦳", listOf("white_haired_man"))

  public val baldMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🦲", listOf("bald_man"))

  public val woman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩", listOf("woman"))

  public val redHairedWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🦰", listOf("red_haired_woman"))

  public val personRedHair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🦰", listOf("person_red_hair"))

  public val curlyHairedWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🦱", listOf("curly_haired_woman"))

  public val personCurlyHair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🦱", listOf("person_curly_hair"))

  public val whiteHairedWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🦳", listOf("white_haired_woman"))

  public val personWhiteHair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🦳", listOf("person_white_hair"))

  public val baldWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🦲", listOf("bald_woman"))

  public val personBald: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🦲", listOf("person_bald"))

  public val blondHairedWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👱‍♀️", listOf("blond_haired_woman", "blonde_woman"))

  public val blondHairedMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👱‍♂️", listOf("blond_haired_man"))

  public val olderAdult: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧓", listOf("older_adult"))

  public val olderMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👴", listOf("older_man"))

  public val olderWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👵", listOf("older_woman"))

  public val frowningPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙍", listOf("frowning_person"))

  public val frowningMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙍‍♂️", listOf("frowning_man"))

  public val frowningWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙍‍♀️", listOf("frowning_woman"))

  public val poutingFace: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙎", listOf("pouting_face"))

  public val poutingMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙎‍♂️", listOf("pouting_man"))

  public val poutingWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙎‍♀️", listOf("pouting_woman"))

  public val noGood: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙅", listOf("no_good"))

  public val noGoodMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙅‍♂️", listOf("no_good_man", "ng_man"))

  public val noGoodWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙅‍♀️", listOf("no_good_woman", "ng_woman"))

  public val okPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙆", listOf("ok_person"))

  public val okMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙆‍♂️", listOf("ok_man"))

  public val okWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙆‍♀️", listOf("ok_woman"))

  public val tippingHandPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💁", listOf("tipping_hand_person", "information_desk_person"))

  public val tippingHandMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💁‍♂️", listOf("tipping_hand_man", "sassy_man"))

  public val tippingHandWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💁‍♀️", listOf("tipping_hand_woman", "sassy_woman"))

  public val raisingHand: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙋", listOf("raising_hand"))

  public val raisingHandMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙋‍♂️", listOf("raising_hand_man"))

  public val raisingHandWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙋‍♀️", listOf("raising_hand_woman"))

  public val deafPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧏", listOf("deaf_person"))

  public val deafMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧏‍♂️", listOf("deaf_man"))

  public val deafWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧏‍♀️", listOf("deaf_woman"))

  public val bow: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙇", listOf("bow"))

  public val bowingMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙇‍♂️", listOf("bowing_man"))

  public val bowingWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🙇‍♀️", listOf("bowing_woman"))

  public val facepalm: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤦", listOf("facepalm"))

  public val manFacepalming: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤦‍♂️", listOf("man_facepalming"))

  public val womanFacepalming: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤦‍♀️", listOf("woman_facepalming"))

  public val shrug: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤷", listOf("shrug"))

  public val manShrugging: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤷‍♂️", listOf("man_shrugging"))

  public val womanShrugging: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤷‍♀️", listOf("woman_shrugging"))

  public val healthWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍⚕️", listOf("health_worker"))

  public val manHealthWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍⚕️", listOf("man_health_worker"))

  public val womanHealthWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍⚕️", listOf("woman_health_worker"))

  public val student: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🎓", listOf("student"))

  public val manStudent: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🎓", listOf("man_student"))

  public val womanStudent: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🎓", listOf("woman_student"))

  public val teacher: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🏫", listOf("teacher"))

  public val manTeacher: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🏫", listOf("man_teacher"))

  public val womanTeacher: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🏫", listOf("woman_teacher"))

  public val judge: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍⚖️", listOf("judge"))

  public val manJudge: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍⚖️", listOf("man_judge"))

  public val womanJudge: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍⚖️", listOf("woman_judge"))

  public val farmer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🌾", listOf("farmer"))

  public val manFarmer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🌾", listOf("man_farmer"))

  public val womanFarmer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🌾", listOf("woman_farmer"))

  public val cook: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🍳", listOf("cook"))

  public val manCook: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🍳", listOf("man_cook"))

  public val womanCook: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🍳", listOf("woman_cook"))

  public val mechanic: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🔧", listOf("mechanic"))

  public val manMechanic: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🔧", listOf("man_mechanic"))

  public val womanMechanic: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🔧", listOf("woman_mechanic"))

  public val factoryWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🏭", listOf("factory_worker"))

  public val manFactoryWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🏭", listOf("man_factory_worker"))

  public val womanFactoryWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🏭", listOf("woman_factory_worker"))

  public val officeWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍💼", listOf("office_worker"))

  public val manOfficeWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍💼", listOf("man_office_worker"))

  public val womanOfficeWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍💼", listOf("woman_office_worker"))

  public val scientist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🔬", listOf("scientist"))

  public val manScientist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🔬", listOf("man_scientist"))

  public val womanScientist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🔬", listOf("woman_scientist"))

  public val technologist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍💻", listOf("technologist"))

  public val manTechnologist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍💻", listOf("man_technologist"))

  public val womanTechnologist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍💻", listOf("woman_technologist"))

  public val singer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🎤", listOf("singer"))

  public val manSinger: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🎤", listOf("man_singer"))

  public val womanSinger: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🎤", listOf("woman_singer"))

  public val artist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🎨", listOf("artist"))

  public val manArtist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🎨", listOf("man_artist"))

  public val womanArtist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🎨", listOf("woman_artist"))

  public val pilot: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍✈️", listOf("pilot"))

  public val manPilot: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍✈️", listOf("man_pilot"))

  public val womanPilot: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍✈️", listOf("woman_pilot"))

  public val astronaut: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🚀", listOf("astronaut"))

  public val manAstronaut: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🚀", listOf("man_astronaut"))

  public val womanAstronaut: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🚀", listOf("woman_astronaut"))

  public val firefighter: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🚒", listOf("firefighter"))

  public val manFirefighter: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🚒", listOf("man_firefighter"))

  public val womanFirefighter: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🚒", listOf("woman_firefighter"))

  public val cop: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👮", listOf("police_officer", "cop"))

  public val policeman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👮‍♂️", listOf("policeman"))

  public val policewoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👮‍♀️", listOf("policewoman"))

  public val detective: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🕵️", listOf("detective"))

  public val maleDetective: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🕵️‍♂️", listOf("male_detective"))

  public val femaleDetective: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🕵️‍♀️", listOf("female_detective"))

  public val guard: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💂", listOf("guard"))

  public val guardsman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💂‍♂️", listOf("guardsman"))

  public val guardswoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💂‍♀️", listOf("guardswoman"))

  public val ninja: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🥷", listOf("ninja"))

  public val constructionWorker: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👷", listOf("construction_worker"))

  public val constructionWorkerMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👷‍♂️", listOf("construction_worker_man"))

  public val constructionWorkerWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👷‍♀️", listOf("construction_worker_woman"))

  public val personWithCrown: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🫅", listOf("person_with_crown"))

  public val prince: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤴", listOf("prince"))

  public val princess: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👸", listOf("princess"))

  public val personWithTurban: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👳", listOf("person_with_turban"))

  public val manWithTurban: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👳‍♂️", listOf("man_with_turban"))

  public val womanWithTurban: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👳‍♀️", listOf("woman_with_turban"))

  public val manWithGuaPiMao: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👲", listOf("man_with_gua_pi_mao"))

  public val womanWithHeadscarf: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧕", listOf("woman_with_headscarf"))

  public val personInTuxedo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤵", listOf("person_in_tuxedo"))

  public val manInTuxedo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤵‍♂️", listOf("man_in_tuxedo"))

  public val womanInTuxedo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤵‍♀️", listOf("woman_in_tuxedo"))

  public val personWithVeil: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👰", listOf("person_with_veil"))

  public val manWithVeil: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👰‍♂️", listOf("man_with_veil"))

  public val womanWithVeil: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👰‍♀️", listOf("woman_with_veil", "bride_with_veil"))

  public val pregnantWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤰", listOf("pregnant_woman"))

  public val pregnantMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🫃", listOf("pregnant_man"))

  public val pregnantPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🫄", listOf("pregnant_person"))

  public val breastFeeding: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤱", listOf("breast_feeding"))

  public val womanFeedingBaby: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🍼", listOf("woman_feeding_baby"))

  public val manFeedingBaby: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🍼", listOf("man_feeding_baby"))

  public val personFeedingBaby: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🍼", listOf("person_feeding_baby"))

  public val angel: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👼", listOf("angel"))

  public val santa: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🎅", listOf("santa"))

  public val mrsClaus: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤶", listOf("mrs_claus"))

  public val mxClaus: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🎄", listOf("mx_claus"))

  public val superhero: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🦸", listOf("superhero"))

  public val superheroMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🦸‍♂️", listOf("superhero_man"))

  public val superheroWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🦸‍♀️", listOf("superhero_woman"))

  public val supervillain: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🦹", listOf("supervillain"))

  public val supervillainMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🦹‍♂️", listOf("supervillain_man"))

  public val supervillainWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🦹‍♀️", listOf("supervillain_woman"))

  public val mage: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧙", listOf("mage"))

  public val mageMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧙‍♂️", listOf("mage_man"))

  public val mageWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧙‍♀️", listOf("mage_woman"))

  public val fairy: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧚", listOf("fairy"))

  public val fairyMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧚‍♂️", listOf("fairy_man"))

  public val fairyWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧚‍♀️", listOf("fairy_woman"))

  public val vampire: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧛", listOf("vampire"))

  public val vampireMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧛‍♂️", listOf("vampire_man"))

  public val vampireWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧛‍♀️", listOf("vampire_woman"))

  public val merperson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧜", listOf("merperson"))

  public val merman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧜‍♂️", listOf("merman"))

  public val mermaid: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧜‍♀️", listOf("mermaid"))

  public val elf: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧝", listOf("elf"))

  public val elfMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧝‍♂️", listOf("elf_man"))

  public val elfWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧝‍♀️", listOf("elf_woman"))

  public val genie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧞", listOf("genie"))

  public val genieMan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧞‍♂️", listOf("genie_man"))

  public val genieWoman: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧞‍♀️", listOf("genie_woman"))

  public val zombie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧟", listOf("zombie"))

  public val zombieMan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧟‍♂️", listOf("zombie_man"))

  public val zombieWoman: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧟‍♀️", listOf("zombie_woman"))

  public val troll: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧌", listOf("troll"))

  public val massage: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💆", listOf("massage"))

  public val massageMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💆‍♂️", listOf("massage_man"))

  public val massageWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💆‍♀️", listOf("massage_woman"))

  public val haircut: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💇", listOf("haircut"))

  public val haircutMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💇‍♂️", listOf("haircut_man"))

  public val haircutWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💇‍♀️", listOf("haircut_woman"))

  public val walking: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚶", listOf("walking"))

  public val walkingMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚶‍♂️", listOf("walking_man"))

  public val walkingWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚶‍♀️", listOf("walking_woman"))

  public val standingPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧍", listOf("standing_person"))

  public val standingMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧍‍♂️", listOf("standing_man"))

  public val standingWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧍‍♀️", listOf("standing_woman"))

  public val kneelingPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧎", listOf("kneeling_person"))

  public val kneelingMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧎‍♂️", listOf("kneeling_man"))

  public val kneelingWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧎‍♀️", listOf("kneeling_woman"))

  public val personWithProbingCane: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🦯", listOf("person_with_probing_cane"))

  public val manWithProbingCane: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🦯", listOf("man_with_probing_cane"))

  public val womanWithProbingCane: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🦯", listOf("woman_with_probing_cane"))

  public val personInMotorizedWheelchair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🦼", listOf("person_in_motorized_wheelchair"))

  public val manInMotorizedWheelchair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🦼", listOf("man_in_motorized_wheelchair"))

  public val womanInMotorizedWheelchair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🦼", listOf("woman_in_motorized_wheelchair"))

  public val personInManualWheelchair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🦽", listOf("person_in_manual_wheelchair"))

  public val manInManualWheelchair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍🦽", listOf("man_in_manual_wheelchair"))

  public val womanInManualWheelchair: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍🦽", listOf("woman_in_manual_wheelchair"))

  public val runner: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏃", listOf("runner", "running"))

  public val runningMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏃‍♂️", listOf("running_man"))

  public val runningWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏃‍♀️", listOf("running_woman"))

  public val dancer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💃", listOf("woman_dancing", "dancer"))

  public val manDancing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🕺", listOf("man_dancing"))

  public val businessSuitLevitating: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🕴️", listOf("business_suit_levitating"))

  public val dancers: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👯", listOf("dancers"))

  public val dancingMen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👯‍♂️", listOf("dancing_men"))

  public val dancingWomen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👯‍♀️", listOf("dancing_women"))

  public val saunaPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧖", listOf("sauna_person"))

  public val saunaMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧖‍♂️", listOf("sauna_man"))

  public val saunaWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧖‍♀️", listOf("sauna_woman"))

  public val climbing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧗", listOf("climbing"))

  public val climbingMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧗‍♂️", listOf("climbing_man"))

  public val climbingWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧗‍♀️", listOf("climbing_woman"))

  public val personFencing: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤺", listOf("person_fencing"))

  public val horseRacing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏇", listOf("horse_racing"))

  public val skier: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛷️", listOf("skier"))

  public val snowboarder: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏂", listOf("snowboarder"))

  public val golfing: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏌️", listOf("golfing"))

  public val golfingMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏌️‍♂️", listOf("golfing_man"))

  public val golfingWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏌️‍♀️", listOf("golfing_woman"))

  public val surfer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏄", listOf("surfer"))

  public val surfingMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏄‍♂️", listOf("surfing_man"))

  public val surfingWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏄‍♀️", listOf("surfing_woman"))

  public val rowboat: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚣", listOf("rowboat"))

  public val rowingMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚣‍♂️", listOf("rowing_man"))

  public val rowingWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚣‍♀️", listOf("rowing_woman"))

  public val swimmer: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏊", listOf("swimmer"))

  public val swimmingMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏊‍♂️", listOf("swimming_man"))

  public val swimmingWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏊‍♀️", listOf("swimming_woman"))

  public val bouncingBallPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("⛹️", listOf("bouncing_ball_person"))

  public val bouncingBallMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("⛹️‍♂️", listOf("bouncing_ball_man", "basketball_man"))

  public val bouncingBallWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("⛹️‍♀️", listOf("bouncing_ball_woman", "basketball_woman"))

  public val weightLifting: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏋️", listOf("weight_lifting"))

  public val weightLiftingMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏋️‍♂️", listOf("weight_lifting_man"))

  public val weightLiftingWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🏋️‍♀️", listOf("weight_lifting_woman"))

  public val bicyclist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚴", listOf("bicyclist"))

  public val bikingMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚴‍♂️", listOf("biking_man"))

  public val bikingWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚴‍♀️", listOf("biking_woman"))

  public val mountainBicyclist: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚵", listOf("mountain_bicyclist"))

  public val mountainBikingMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚵‍♂️", listOf("mountain_biking_man"))

  public val mountainBikingWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🚵‍♀️", listOf("mountain_biking_woman"))

  public val cartwheeling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤸", listOf("cartwheeling"))

  public val manCartwheeling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤸‍♂️", listOf("man_cartwheeling"))

  public val womanCartwheeling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤸‍♀️", listOf("woman_cartwheeling"))

  public val wrestling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤼", listOf("wrestling"))

  public val menWrestling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤼‍♂️", listOf("men_wrestling"))

  public val womenWrestling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤼‍♀️", listOf("women_wrestling"))

  public val waterPolo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤽", listOf("water_polo"))

  public val manPlayingWaterPolo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤽‍♂️", listOf("man_playing_water_polo"))

  public val womanPlayingWaterPolo: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤽‍♀️", listOf("woman_playing_water_polo"))

  public val handballPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤾", listOf("handball_person"))

  public val manPlayingHandball: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤾‍♂️", listOf("man_playing_handball"))

  public val womanPlayingHandball: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤾‍♀️", listOf("woman_playing_handball"))

  public val jugglingPerson: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤹", listOf("juggling_person"))

  public val manJuggling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤹‍♂️", listOf("man_juggling"))

  public val womanJuggling: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🤹‍♀️", listOf("woman_juggling"))

  public val lotusPosition: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧘", listOf("lotus_position"))

  public val lotusPositionMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧘‍♂️", listOf("lotus_position_man"))

  public val lotusPositionWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧘‍♀️", listOf("lotus_position_woman"))

  public val bath: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🛀", listOf("bath"))

  public val sleepingBed: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🛌", listOf("sleeping_bed"))

  public val peopleHoldingHands: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("🧑‍🤝‍🧑", listOf("people_holding_hands"))

  public val twoWomenHoldingHands: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👭", listOf("two_women_holding_hands"))

  public val couple: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👫", listOf("couple"))

  public val twoMenHoldingHands: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👬", listOf("two_men_holding_hands"))

  public val couplekiss: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💏", listOf("couplekiss"))

  public val couplekissManWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍❤️‍💋‍👨", listOf("couplekiss_man_woman"))

  public val couplekissManMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍❤️‍💋‍👨", listOf("couplekiss_man_man"))

  public val couplekissWomanWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍❤️‍💋‍👩", listOf("couplekiss_woman_woman"))

  public val coupleWithHeart: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("💑", listOf("couple_with_heart"))

  public val coupleWithHeartWomanMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍❤️‍👨", listOf("couple_with_heart_woman_man"))

  public val coupleWithHeartManMan: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👨‍❤️‍👨", listOf("couple_with_heart_man_man"))

  public val coupleWithHeartWomanWoman: DiscordEmoji.Diverse
    get() = DiscordEmoji.Diverse("👩‍❤️‍👩", listOf("couple_with_heart_woman_woman"))

  public val family: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👪", listOf("family"))

  public val familyManWomanBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👩‍👦", listOf("family_man_woman_boy"))

  public val familyManWomanGirl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👩‍👧", listOf("family_man_woman_girl"))

  public val familyManWomanGirlBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👩‍👧‍👦", listOf("family_man_woman_girl_boy"))

  public val familyManWomanBoyBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👩‍👦‍👦", listOf("family_man_woman_boy_boy"))

  public val familyManWomanGirlGirl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👩‍👧‍👧", listOf("family_man_woman_girl_girl"))

  public val familyManManBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👨‍👦", listOf("family_man_man_boy"))

  public val familyManManGirl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👨‍👧", listOf("family_man_man_girl"))

  public val familyManManGirlBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👨‍👧‍👦", listOf("family_man_man_girl_boy"))

  public val familyManManBoyBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👨‍👦‍👦", listOf("family_man_man_boy_boy"))

  public val familyManManGirlGirl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👨‍👧‍👧", listOf("family_man_man_girl_girl"))

  public val familyWomanWomanBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍👩‍👦", listOf("family_woman_woman_boy"))

  public val familyWomanWomanGirl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍👩‍👧", listOf("family_woman_woman_girl"))

  public val familyWomanWomanGirlBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍👩‍👧‍👦", listOf("family_woman_woman_girl_boy"))

  public val familyWomanWomanBoyBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍👩‍👦‍👦", listOf("family_woman_woman_boy_boy"))

  public val familyWomanWomanGirlGirl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍👩‍👧‍👧", listOf("family_woman_woman_girl_girl"))

  public val familyManBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👦", listOf("family_man_boy"))

  public val familyManBoyBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👦‍👦", listOf("family_man_boy_boy"))

  public val familyManGirl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👧", listOf("family_man_girl"))

  public val familyManGirlBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👧‍👦", listOf("family_man_girl_boy"))

  public val familyManGirlGirl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👨‍👧‍👧", listOf("family_man_girl_girl"))

  public val familyWomanBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍👦", listOf("family_woman_boy"))

  public val familyWomanBoyBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍👦‍👦", listOf("family_woman_boy_boy"))

  public val familyWomanGirl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍👧", listOf("family_woman_girl"))

  public val familyWomanGirlBoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍👧‍👦", listOf("family_woman_girl_boy"))

  public val familyWomanGirlGirl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👩‍👧‍👧", listOf("family_woman_girl_girl"))

  public val speakingHead: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗣️", listOf("speaking_head"))

  public val bustInSilhouette: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👤", listOf("bust_in_silhouette"))

  public val bustsInSilhouette: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👥", listOf("busts_in_silhouette"))

  public val peopleHugging: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫂", listOf("people_hugging"))

  public val footprints: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👣", listOf("footprints"))

  public val monkeyFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐵", listOf("monkey_face"))

  public val monkey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐒", listOf("monkey"))

  public val gorilla: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦍", listOf("gorilla"))

  public val orangutan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦧", listOf("orangutan"))

  public val dog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐶", listOf("dog"))

  public val dog2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐕", listOf("dog2"))

  public val guideDog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦮", listOf("guide_dog"))

  public val serviceDog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐕‍🦺", listOf("service_dog"))

  public val poodle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐩", listOf("poodle"))

  public val wolf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐺", listOf("wolf"))

  public val foxFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦊", listOf("fox_face"))

  public val raccoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦝", listOf("raccoon"))

  public val cat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐱", listOf("cat"))

  public val cat2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐈", listOf("cat2"))

  public val blackCat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐈‍⬛", listOf("black_cat"))

  public val lion: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦁", listOf("lion"))

  public val tiger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐯", listOf("tiger"))

  public val tiger2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐅", listOf("tiger2"))

  public val leopard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐆", listOf("leopard"))

  public val horse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐴", listOf("horse"))

  public val moose: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫎", listOf("moose"))

  public val donkey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫏", listOf("donkey"))

  public val racehorse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐎", listOf("racehorse"))

  public val unicorn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦄", listOf("unicorn"))

  public val zebra: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦓", listOf("zebra"))

  public val deer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦌", listOf("deer"))

  public val bison: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦬", listOf("bison"))

  public val cow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐮", listOf("cow"))

  public val ox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐂", listOf("ox"))

  public val waterBuffalo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐃", listOf("water_buffalo"))

  public val cow2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐄", listOf("cow2"))

  public val pig: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐷", listOf("pig"))

  public val pig2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐖", listOf("pig2"))

  public val boar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐗", listOf("boar"))

  public val pigNose: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐽", listOf("pig_nose"))

  public val ram: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐏", listOf("ram"))

  public val sheep: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐑", listOf("sheep"))

  public val goat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐐", listOf("goat"))

  public val dromedaryCamel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐪", listOf("dromedary_camel"))

  public val camel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐫", listOf("camel"))

  public val llama: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦙", listOf("llama"))

  public val giraffe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦒", listOf("giraffe"))

  public val elephant: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐘", listOf("elephant"))

  public val mammoth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦣", listOf("mammoth"))

  public val rhinoceros: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦏", listOf("rhinoceros"))

  public val hippopotamus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦛", listOf("hippopotamus"))

  public val mouse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐭", listOf("mouse"))

  public val mouse2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐁", listOf("mouse2"))

  public val rat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐀", listOf("rat"))

  public val hamster: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐹", listOf("hamster"))

  public val rabbit: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐰", listOf("rabbit"))

  public val rabbit2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐇", listOf("rabbit2"))

  public val chipmunk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐿️", listOf("chipmunk"))

  public val beaver: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦫", listOf("beaver"))

  public val hedgehog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦔", listOf("hedgehog"))

  public val bat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦇", listOf("bat"))

  public val bear: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐻", listOf("bear"))

  public val polarBear: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐻‍❄️", listOf("polar_bear"))

  public val koala: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐨", listOf("koala"))

  public val pandaFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐼", listOf("panda_face"))

  public val sloth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦥", listOf("sloth"))

  public val otter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦦", listOf("otter"))

  public val skunk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦨", listOf("skunk"))

  public val kangaroo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦘", listOf("kangaroo"))

  public val badger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦡", listOf("badger"))

  public val feet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐾", listOf("feet", "paw_prints"))

  public val turkey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦃", listOf("turkey"))

  public val chicken: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐔", listOf("chicken"))

  public val rooster: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐓", listOf("rooster"))

  public val hatchingChick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐣", listOf("hatching_chick"))

  public val babyChick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐤", listOf("baby_chick"))

  public val hatchedChick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐥", listOf("hatched_chick"))

  public val bird: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐦", listOf("bird"))

  public val penguin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐧", listOf("penguin"))

  public val dove: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕊️", listOf("dove"))

  public val eagle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦅", listOf("eagle"))

  public val duck: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦆", listOf("duck"))

  public val swan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦢", listOf("swan"))

  public val owl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦉", listOf("owl"))

  public val dodo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦤", listOf("dodo"))

  public val feather: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪶", listOf("feather"))

  public val flamingo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦩", listOf("flamingo"))

  public val peacock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦚", listOf("peacock"))

  public val parrot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦜", listOf("parrot"))

  public val wing: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪽", listOf("wing"))

  public val blackBird: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐦‍⬛", listOf("black_bird"))

  public val goose: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪿", listOf("goose"))

  public val frog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐸", listOf("frog"))

  public val crocodile: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐊", listOf("crocodile"))

  public val turtle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐢", listOf("turtle"))

  public val lizard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦎", listOf("lizard"))

  public val snake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐍", listOf("snake"))

  public val dragonFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐲", listOf("dragon_face"))

  public val dragon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐉", listOf("dragon"))

  public val sauropod: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦕", listOf("sauropod"))

  @JsName("DIBJDGCtDc")
  public val `t-rex`: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦖", listOf("t-rex"))

  public val whale: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐳", listOf("whale"))

  public val whale2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐋", listOf("whale2"))

  public val dolphin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐬", listOf("dolphin", "flipper"))

  public val seal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦭", listOf("seal"))

  public val fish: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐟", listOf("fish"))

  public val tropicalFish: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐠", listOf("tropical_fish"))

  public val blowfish: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐡", listOf("blowfish"))

  public val shark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦈", listOf("shark"))

  public val octopus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐙", listOf("octopus"))

  public val shell: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐚", listOf("shell"))

  public val coral: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪸", listOf("coral"))

  public val jellyfish: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪼", listOf("jellyfish"))

  public val snail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐌", listOf("snail"))

  public val butterfly: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦋", listOf("butterfly"))

  public val bug: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐛", listOf("bug"))

  public val ant: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐜", listOf("ant"))

  public val bee: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐝", listOf("bee", "honeybee"))

  public val beetle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪲", listOf("beetle"))

  public val ladyBeetle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🐞", listOf("lady_beetle"))

  public val cricket: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦗", listOf("cricket"))

  public val cockroach: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪳", listOf("cockroach"))

  public val spider: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕷️", listOf("spider"))

  public val spiderWeb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕸️", listOf("spider_web"))

  public val scorpion: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦂", listOf("scorpion"))

  public val mosquito: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦟", listOf("mosquito"))

  public val fly: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪰", listOf("fly"))

  public val worm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪱", listOf("worm"))

  public val microbe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦠", listOf("microbe"))

  public val bouquet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💐", listOf("bouquet"))

  public val cherryBlossom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌸", listOf("cherry_blossom"))

  public val whiteFlower: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💮", listOf("white_flower"))

  public val lotus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪷", listOf("lotus"))

  public val rosette: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏵️", listOf("rosette"))

  public val rose: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌹", listOf("rose"))

  public val wiltedFlower: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥀", listOf("wilted_flower"))

  public val hibiscus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌺", listOf("hibiscus"))

  public val sunflower: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌻", listOf("sunflower"))

  public val blossom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌼", listOf("blossom"))

  public val tulip: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌷", listOf("tulip"))

  public val hyacinth: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪻", listOf("hyacinth"))

  public val seedling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌱", listOf("seedling"))

  public val pottedPlant: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪴", listOf("potted_plant"))

  public val evergreenTree: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌲", listOf("evergreen_tree"))

  public val deciduousTree: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌳", listOf("deciduous_tree"))

  public val palmTree: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌴", listOf("palm_tree"))

  public val cactus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌵", listOf("cactus"))

  public val earOfRice: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌾", listOf("ear_of_rice"))

  public val herb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌿", listOf("herb"))

  public val shamrock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☘️", listOf("shamrock"))

  public val fourLeafClover: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍀", listOf("four_leaf_clover"))

  public val mapleLeaf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍁", listOf("maple_leaf"))

  public val fallenLeaf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍂", listOf("fallen_leaf"))

  public val leaves: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍃", listOf("leaves"))

  public val emptyNest: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪹", listOf("empty_nest"))

  public val nestWithEggs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪺", listOf("nest_with_eggs"))

  public val mushroom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍄", listOf("mushroom"))

  public val grapes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍇", listOf("grapes"))

  public val melon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍈", listOf("melon"))

  public val watermelon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍉", listOf("watermelon"))

  public val tangerine: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍊", listOf("tangerine", "orange", "mandarin"))

  public val lemon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍋", listOf("lemon"))

  public val banana: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍌", listOf("banana"))

  public val pineapple: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍍", listOf("pineapple"))

  public val mango: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥭", listOf("mango"))

  public val apple: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍎", listOf("apple"))

  public val greenApple: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍏", listOf("green_apple"))

  public val pear: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍐", listOf("pear"))

  public val peach: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍑", listOf("peach"))

  public val cherries: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍒", listOf("cherries"))

  public val strawberry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍓", listOf("strawberry"))

  public val blueberries: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫐", listOf("blueberries"))

  public val kiwiFruit: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥝", listOf("kiwi_fruit"))

  public val tomato: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍅", listOf("tomato"))

  public val olive: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫒", listOf("olive"))

  public val coconut: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥥", listOf("coconut"))

  public val avocado: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥑", listOf("avocado"))

  public val eggplant: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍆", listOf("eggplant"))

  public val potato: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥔", listOf("potato"))

  public val carrot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥕", listOf("carrot"))

  public val corn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌽", listOf("corn"))

  public val hotPepper: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌶️", listOf("hot_pepper"))

  public val bellPepper: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫑", listOf("bell_pepper"))

  public val cucumber: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥒", listOf("cucumber"))

  public val leafyGreen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥬", listOf("leafy_green"))

  public val broccoli: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥦", listOf("broccoli"))

  public val garlic: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧄", listOf("garlic"))

  public val onion: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧅", listOf("onion"))

  public val peanuts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥜", listOf("peanuts"))

  public val beans: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫘", listOf("beans"))

  public val chestnut: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌰", listOf("chestnut"))

  public val gingerRoot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫚", listOf("ginger_root"))

  public val peaPod: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫛", listOf("pea_pod"))

  public val bread: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍞", listOf("bread"))

  public val croissant: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥐", listOf("croissant"))

  public val baguetteBread: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥖", listOf("baguette_bread"))

  public val flatbread: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫓", listOf("flatbread"))

  public val pretzel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥨", listOf("pretzel"))

  public val bagel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥯", listOf("bagel"))

  public val pancakes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥞", listOf("pancakes"))

  public val waffle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧇", listOf("waffle"))

  public val cheese: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧀", listOf("cheese"))

  public val meatOnBone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍖", listOf("meat_on_bone"))

  public val poultryLeg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍗", listOf("poultry_leg"))

  public val cutOfMeat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥩", listOf("cut_of_meat"))

  public val bacon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥓", listOf("bacon"))

  public val hamburger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍔", listOf("hamburger"))

  public val fries: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍟", listOf("fries"))

  public val pizza: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍕", listOf("pizza"))

  public val hotdog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌭", listOf("hotdog"))

  public val sandwich: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥪", listOf("sandwich"))

  public val taco: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌮", listOf("taco"))

  public val burrito: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌯", listOf("burrito"))

  public val tamale: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫔", listOf("tamale"))

  public val stuffedFlatbread: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥙", listOf("stuffed_flatbread"))

  public val falafel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧆", listOf("falafel"))

  public val egg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥚", listOf("egg"))

  public val friedEgg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍳", listOf("fried_egg"))

  public val shallowPanOfFood: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥘", listOf("shallow_pan_of_food"))

  public val stew: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍲", listOf("stew"))

  public val fondue: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫕", listOf("fondue"))

  public val bowlWithSpoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥣", listOf("bowl_with_spoon"))

  public val greenSalad: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥗", listOf("green_salad"))

  public val popcorn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍿", listOf("popcorn"))

  public val butter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧈", listOf("butter"))

  public val salt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧂", listOf("salt"))

  public val cannedFood: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥫", listOf("canned_food"))

  public val bento: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍱", listOf("bento"))

  public val riceCracker: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍘", listOf("rice_cracker"))

  public val riceBall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍙", listOf("rice_ball"))

  public val rice: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍚", listOf("rice"))

  public val curry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍛", listOf("curry"))

  public val ramen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍜", listOf("ramen"))

  public val spaghetti: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍝", listOf("spaghetti"))

  public val sweetPotato: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍠", listOf("sweet_potato"))

  public val oden: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍢", listOf("oden"))

  public val sushi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍣", listOf("sushi"))

  public val friedShrimp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍤", listOf("fried_shrimp"))

  public val fishCake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍥", listOf("fish_cake"))

  public val moonCake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥮", listOf("moon_cake"))

  public val dango: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍡", listOf("dango"))

  public val dumpling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥟", listOf("dumpling"))

  public val fortuneCookie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥠", listOf("fortune_cookie"))

  public val takeoutBox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥡", listOf("takeout_box"))

  public val crab: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦀", listOf("crab"))

  public val lobster: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦞", listOf("lobster"))

  public val shrimp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦐", listOf("shrimp"))

  public val squid: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦑", listOf("squid"))

  public val oyster: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦪", listOf("oyster"))

  public val icecream: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍦", listOf("icecream"))

  public val shavedIce: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍧", listOf("shaved_ice"))

  public val iceCream: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍨", listOf("ice_cream"))

  public val doughnut: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍩", listOf("doughnut"))

  public val cookie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍪", listOf("cookie"))

  public val birthday: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎂", listOf("birthday"))

  public val cake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍰", listOf("cake"))

  public val cupcake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧁", listOf("cupcake"))

  public val pie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥧", listOf("pie"))

  public val chocolateBar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍫", listOf("chocolate_bar"))

  public val candy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍬", listOf("candy"))

  public val lollipop: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍭", listOf("lollipop"))

  public val custard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍮", listOf("custard"))

  public val honeyPot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍯", listOf("honey_pot"))

  public val babyBottle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍼", listOf("baby_bottle"))

  public val milkGlass: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥛", listOf("milk_glass"))

  public val coffee: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☕", listOf("coffee"))

  public val teapot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫖", listOf("teapot"))

  public val tea: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍵", listOf("tea"))

  public val sake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍶", listOf("sake"))

  public val champagne: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍾", listOf("champagne"))

  public val wineGlass: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍷", listOf("wine_glass"))

  public val cocktail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍸", listOf("cocktail"))

  public val tropicalDrink: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍹", listOf("tropical_drink"))

  public val beer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍺", listOf("beer"))

  public val beers: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍻", listOf("beers"))

  public val clinkingGlasses: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥂", listOf("clinking_glasses"))

  public val tumblerGlass: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥃", listOf("tumbler_glass"))

  public val pouringLiquid: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫗", listOf("pouring_liquid"))

  public val cupWithStraw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥤", listOf("cup_with_straw"))

  public val bubbleTea: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧋", listOf("bubble_tea"))

  public val beverageBox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧃", listOf("beverage_box"))

  public val mate: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧉", listOf("mate"))

  public val iceCube: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧊", listOf("ice_cube"))

  public val chopsticks: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥢", listOf("chopsticks"))

  public val plateWithCutlery: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍽️", listOf("plate_with_cutlery"))

  public val forkAndKnife: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🍴", listOf("fork_and_knife"))

  public val spoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥄", listOf("spoon"))

  public val hocho: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔪", listOf("hocho", "knife"))

  public val jar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫙", listOf("jar"))

  public val amphora: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏺", listOf("amphora"))

  public val earthAfrica: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌍", listOf("earth_africa"))

  public val earthAmericas: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌎", listOf("earth_americas"))

  public val earthAsia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌏", listOf("earth_asia"))

  public val globeWithMeridians: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌐", listOf("globe_with_meridians"))

  public val worldMap: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗺️", listOf("world_map"))

  public val japan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗾", listOf("japan"))

  public val compass: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧭", listOf("compass"))

  public val mountainSnow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏔️", listOf("mountain_snow"))

  public val mountain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛰️", listOf("mountain"))

  public val volcano: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌋", listOf("volcano"))

  public val mountFuji: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗻", listOf("mount_fuji"))

  public val camping: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏕️", listOf("camping"))

  public val beachUmbrella: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏖️", listOf("beach_umbrella"))

  public val desert: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏜️", listOf("desert"))

  public val desertIsland: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏝️", listOf("desert_island"))

  public val nationalPark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏞️", listOf("national_park"))

  public val stadium: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏟️", listOf("stadium"))

  public val classicalBuilding: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏛️", listOf("classical_building"))

  public val buildingConstruction: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏗️", listOf("building_construction"))

  public val bricks: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧱", listOf("bricks"))

  public val rock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪨", listOf("rock"))

  public val wood: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪵", listOf("wood"))

  public val hut: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛖", listOf("hut"))

  public val houses: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏘️", listOf("houses"))

  public val derelictHouse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏚️", listOf("derelict_house"))

  public val house: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏠", listOf("house"))

  public val houseWithGarden: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏡", listOf("house_with_garden"))

  public val office: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏢", listOf("office"))

  public val postOffice: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏣", listOf("post_office"))

  public val europeanPostOffice: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏤", listOf("european_post_office"))

  public val hospital: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏥", listOf("hospital"))

  public val bank: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏦", listOf("bank"))

  public val hotel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏨", listOf("hotel"))

  public val loveHotel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏩", listOf("love_hotel"))

  public val convenienceStore: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏪", listOf("convenience_store"))

  public val school: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏫", listOf("school"))

  public val departmentStore: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏬", listOf("department_store"))

  public val factory: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏭", listOf("factory"))

  public val japaneseCastle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏯", listOf("japanese_castle"))

  public val europeanCastle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏰", listOf("european_castle"))

  public val wedding: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💒", listOf("wedding"))

  public val tokyoTower: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗼", listOf("tokyo_tower"))

  public val statueOfLiberty: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗽", listOf("statue_of_liberty"))

  public val church: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛪", listOf("church"))

  public val mosque: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕌", listOf("mosque"))

  public val hinduTemple: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛕", listOf("hindu_temple"))

  public val synagogue: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕍", listOf("synagogue"))

  public val shintoShrine: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛩️", listOf("shinto_shrine"))

  public val kaaba: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕋", listOf("kaaba"))

  public val fountain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛲", listOf("fountain"))

  public val tent: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛺", listOf("tent"))

  public val foggy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌁", listOf("foggy"))

  public val nightWithStars: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌃", listOf("night_with_stars"))

  public val cityscape: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏙️", listOf("cityscape"))

  public val sunriseOverMountains: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌄", listOf("sunrise_over_mountains"))

  public val sunrise: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌅", listOf("sunrise"))

  public val citySunset: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌆", listOf("city_sunset"))

  public val citySunrise: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌇", listOf("city_sunrise"))

  public val bridgeAtNight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌉", listOf("bridge_at_night"))

  public val hotsprings: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♨️", listOf("hotsprings"))

  public val carouselHorse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎠", listOf("carousel_horse"))

  public val playgroundSlide: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛝", listOf("playground_slide"))

  public val ferrisWheel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎡", listOf("ferris_wheel"))

  public val rollerCoaster: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎢", listOf("roller_coaster"))

  public val barber: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💈", listOf("barber"))

  public val circusTent: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎪", listOf("circus_tent"))

  public val steamLocomotive: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚂", listOf("steam_locomotive"))

  public val railwayCar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚃", listOf("railway_car"))

  public val bullettrainSide: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚄", listOf("bullettrain_side"))

  public val bullettrainFront: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚅", listOf("bullettrain_front"))

  public val train2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚆", listOf("train2"))

  public val metro: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚇", listOf("metro"))

  public val lightRail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚈", listOf("light_rail"))

  public val station: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚉", listOf("station"))

  public val tram: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚊", listOf("tram"))

  public val monorail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚝", listOf("monorail"))

  public val mountainRailway: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚞", listOf("mountain_railway"))

  public val train: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚋", listOf("train"))

  public val bus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚌", listOf("bus"))

  public val oncomingBus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚍", listOf("oncoming_bus"))

  public val trolleybus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚎", listOf("trolleybus"))

  public val minibus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚐", listOf("minibus"))

  public val ambulance: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚑", listOf("ambulance"))

  public val fireEngine: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚒", listOf("fire_engine"))

  public val policeCar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚓", listOf("police_car"))

  public val oncomingPoliceCar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚔", listOf("oncoming_police_car"))

  public val taxi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚕", listOf("taxi"))

  public val oncomingTaxi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚖", listOf("oncoming_taxi"))

  public val car: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚗", listOf("car", "red_car"))

  public val oncomingAutomobile: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚘", listOf("oncoming_automobile"))

  public val blueCar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚙", listOf("blue_car"))

  public val pickupTruck: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛻", listOf("pickup_truck"))

  public val truck: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚚", listOf("truck"))

  public val articulatedLorry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚛", listOf("articulated_lorry"))

  public val tractor: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚜", listOf("tractor"))

  public val racingCar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏎️", listOf("racing_car"))

  public val motorcycle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏍️", listOf("motorcycle"))

  public val motorScooter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛵", listOf("motor_scooter"))

  public val manualWheelchair: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦽", listOf("manual_wheelchair"))

  public val motorizedWheelchair: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦼", listOf("motorized_wheelchair"))

  public val autoRickshaw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛺", listOf("auto_rickshaw"))

  public val bike: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚲", listOf("bike"))

  public val kickScooter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛴", listOf("kick_scooter"))

  public val skateboard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛹", listOf("skateboard"))

  public val rollerSkate: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛼", listOf("roller_skate"))

  public val busstop: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚏", listOf("busstop"))

  public val motorway: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛣️", listOf("motorway"))

  public val railwayTrack: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛤️", listOf("railway_track"))

  public val oilDrum: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛢️", listOf("oil_drum"))

  public val fuelpump: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛽", listOf("fuelpump"))

  public val wheel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛞", listOf("wheel"))

  public val rotatingLight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚨", listOf("rotating_light"))

  public val trafficLight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚥", listOf("traffic_light"))

  public val verticalTrafficLight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚦", listOf("vertical_traffic_light"))

  public val stopSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛑", listOf("stop_sign"))

  public val construction: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚧", listOf("construction"))

  public val anchor: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚓", listOf("anchor"))

  public val ringBuoy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛟", listOf("ring_buoy"))

  public val boat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛵", listOf("boat", "sailboat"))

  public val canoe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛶", listOf("canoe"))

  public val speedboat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚤", listOf("speedboat"))

  public val passengerShip: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛳️", listOf("passenger_ship"))

  public val ferry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛴️", listOf("ferry"))

  public val motorBoat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛥️", listOf("motor_boat"))

  public val ship: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚢", listOf("ship"))

  public val airplane: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✈️", listOf("airplane"))

  public val smallAirplane: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛩️", listOf("small_airplane"))

  public val flightDeparture: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛫", listOf("flight_departure"))

  public val flightArrival: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛬", listOf("flight_arrival"))

  public val parachute: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪂", listOf("parachute"))

  public val seat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💺", listOf("seat"))

  public val helicopter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚁", listOf("helicopter"))

  public val suspensionRailway: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚟", listOf("suspension_railway"))

  public val mountainCableway: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚠", listOf("mountain_cableway"))

  public val aerialTramway: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚡", listOf("aerial_tramway"))

  public val artificialSatellite: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛰️", listOf("artificial_satellite"))

  public val rocket: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚀", listOf("rocket"))

  public val flyingSaucer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛸", listOf("flying_saucer"))

  public val bellhopBell: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛎️", listOf("bellhop_bell"))

  public val luggage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧳", listOf("luggage"))

  public val hourglass: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⌛", listOf("hourglass"))

  public val hourglassFlowingSand: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏳", listOf("hourglass_flowing_sand"))

  public val watch: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⌚", listOf("watch"))

  public val alarmClock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏰", listOf("alarm_clock"))

  public val stopwatch: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏱️", listOf("stopwatch"))

  public val timerClock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏲️", listOf("timer_clock"))

  public val mantelpieceClock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕰️", listOf("mantelpiece_clock"))

  public val clock12: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕛", listOf("clock12"))

  public val clock1230: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕧", listOf("clock1230"))

  public val clock1: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕐", listOf("clock1"))

  public val clock130: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕜", listOf("clock130"))

  public val clock2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕑", listOf("clock2"))

  public val clock230: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕝", listOf("clock230"))

  public val clock3: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕒", listOf("clock3"))

  public val clock330: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕞", listOf("clock330"))

  public val clock4: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕓", listOf("clock4"))

  public val clock430: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕟", listOf("clock430"))

  public val clock5: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕔", listOf("clock5"))

  public val clock530: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕠", listOf("clock530"))

  public val clock6: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕕", listOf("clock6"))

  public val clock630: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕡", listOf("clock630"))

  public val clock7: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕖", listOf("clock7"))

  public val clock730: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕢", listOf("clock730"))

  public val clock8: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕗", listOf("clock8"))

  public val clock830: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕣", listOf("clock830"))

  public val clock9: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕘", listOf("clock9"))

  public val clock930: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕤", listOf("clock930"))

  public val clock10: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕙", listOf("clock10"))

  public val clock1030: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕥", listOf("clock1030"))

  public val clock11: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕚", listOf("clock11"))

  public val clock1130: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕦", listOf("clock1130"))

  public val newMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌑", listOf("new_moon"))

  public val waxingCrescentMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌒", listOf("waxing_crescent_moon"))

  public val firstQuarterMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌓", listOf("first_quarter_moon"))

  public val moon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌔", listOf("moon", "waxing_gibbous_moon"))

  public val fullMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌕", listOf("full_moon"))

  public val waningGibbousMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌖", listOf("waning_gibbous_moon"))

  public val lastQuarterMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌗", listOf("last_quarter_moon"))

  public val waningCrescentMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌘", listOf("waning_crescent_moon"))

  public val crescentMoon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌙", listOf("crescent_moon"))

  public val newMoonWithFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌚", listOf("new_moon_with_face"))

  public val firstQuarterMoonWithFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌛", listOf("first_quarter_moon_with_face"))

  public val lastQuarterMoonWithFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌜", listOf("last_quarter_moon_with_face"))

  public val thermometer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌡️", listOf("thermometer"))

  public val sunny: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☀️", listOf("sunny"))

  public val fullMoonWithFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌝", listOf("full_moon_with_face"))

  public val sunWithFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌞", listOf("sun_with_face"))

  public val ringedPlanet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪐", listOf("ringed_planet"))

  public val star: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⭐", listOf("star"))

  public val star2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌟", listOf("star2"))

  public val stars: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌠", listOf("stars"))

  public val milkyWay: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌌", listOf("milky_way"))

  public val cloud: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☁️", listOf("cloud"))

  public val partlySunny: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛅", listOf("partly_sunny"))

  public val cloudWithLightningAndRain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛈️", listOf("cloud_with_lightning_and_rain"))

  public val sunBehindSmallCloud: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌤️", listOf("sun_behind_small_cloud"))

  public val sunBehindLargeCloud: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌥️", listOf("sun_behind_large_cloud"))

  public val sunBehindRainCloud: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌦️", listOf("sun_behind_rain_cloud"))

  public val cloudWithRain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌧️", listOf("cloud_with_rain"))

  public val cloudWithSnow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌨️", listOf("cloud_with_snow"))

  public val cloudWithLightning: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌩️", listOf("cloud_with_lightning"))

  public val tornado: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌪️", listOf("tornado"))

  public val fog: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌫️", listOf("fog"))

  public val windFace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌬️", listOf("wind_face"))

  public val cyclone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌀", listOf("cyclone"))

  public val rainbow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌈", listOf("rainbow"))

  public val closedUmbrella: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌂", listOf("closed_umbrella"))

  public val openUmbrella: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☂️", listOf("open_umbrella"))

  public val umbrella: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☔", listOf("umbrella"))

  public val parasolOnGround: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛱️", listOf("parasol_on_ground"))

  public val zap: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚡", listOf("zap"))

  public val snowflake: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❄️", listOf("snowflake"))

  public val snowmanWithSnow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☃️", listOf("snowman_with_snow"))

  public val snowman: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛄", listOf("snowman"))

  public val comet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☄️", listOf("comet"))

  public val fire: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔥", listOf("fire"))

  public val droplet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💧", listOf("droplet"))

  public val ocean: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🌊", listOf("ocean"))

  public val jackOLantern: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎃", listOf("jack_o_lantern"))

  public val christmasTree: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎄", listOf("christmas_tree"))

  public val fireworks: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎆", listOf("fireworks"))

  public val sparkler: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎇", listOf("sparkler"))

  public val firecracker: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧨", listOf("firecracker"))

  public val sparkles: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✨", listOf("sparkles"))

  public val balloon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎈", listOf("balloon"))

  public val tada: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎉", listOf("tada"))

  public val confettiBall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎊", listOf("confetti_ball"))

  public val tanabataTree: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎋", listOf("tanabata_tree"))

  public val bamboo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎍", listOf("bamboo"))

  public val dolls: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎎", listOf("dolls"))

  public val flags: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎏", listOf("flags"))

  public val windChime: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎐", listOf("wind_chime"))

  public val riceScene: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎑", listOf("rice_scene"))

  public val redEnvelope: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧧", listOf("red_envelope"))

  public val ribbon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎀", listOf("ribbon"))

  public val gift: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎁", listOf("gift"))

  public val reminderRibbon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎗️", listOf("reminder_ribbon"))

  public val tickets: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎟️", listOf("tickets"))

  public val ticket: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎫", listOf("ticket"))

  public val medalMilitary: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎖️", listOf("medal_military"))

  public val trophy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏆", listOf("trophy"))

  public val medalSports: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏅", listOf("medal_sports"))

  @JsName("_1stPlaceMedal")
  public val `1stPlaceMedal`: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥇", listOf("1st_place_medal"))

  @JsName("_2ndPlaceMedal")
  public val `2ndPlaceMedal`: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥈", listOf("2nd_place_medal"))

  @JsName("_3rdPlaceMedal")
  public val `3rdPlaceMedal`: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥉", listOf("3rd_place_medal"))

  public val soccer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚽", listOf("soccer"))

  public val baseball: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚾", listOf("baseball"))

  public val softball: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥎", listOf("softball"))

  public val basketball: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏀", listOf("basketball"))

  public val volleyball: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏐", listOf("volleyball"))

  public val football: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏈", listOf("football"))

  public val rugbyFootball: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏉", listOf("rugby_football"))

  public val tennis: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎾", listOf("tennis"))

  public val flyingDisc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥏", listOf("flying_disc"))

  public val bowling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎳", listOf("bowling"))

  public val cricketGame: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏏", listOf("cricket_game"))

  public val fieldHockey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏑", listOf("field_hockey"))

  public val iceHockey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏒", listOf("ice_hockey"))

  public val lacrosse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥍", listOf("lacrosse"))

  public val pingPong: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏓", listOf("ping_pong"))

  public val badminton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏸", listOf("badminton"))

  public val boxingGlove: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥊", listOf("boxing_glove"))

  public val martialArtsUniform: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥋", listOf("martial_arts_uniform"))

  public val goalNet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥅", listOf("goal_net"))

  public val golf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛳", listOf("golf"))

  public val iceSkate: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛸️", listOf("ice_skate"))

  public val fishingPoleAndFish: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎣", listOf("fishing_pole_and_fish"))

  public val divingMask: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🤿", listOf("diving_mask"))

  public val runningShirtWithSash: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎽", listOf("running_shirt_with_sash"))

  public val ski: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎿", listOf("ski"))

  public val sled: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛷", listOf("sled"))

  public val curlingStone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥌", listOf("curling_stone"))

  public val dart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎯", listOf("dart"))

  public val yoYo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪀", listOf("yo_yo"))

  public val kite: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪁", listOf("kite"))

  public val gun: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔫", listOf("gun"))

  @JsName("_8ball")
  public val `8ball`: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎱", listOf("8ball"))

  public val crystalBall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔮", listOf("crystal_ball"))

  public val magicWand: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪄", listOf("magic_wand"))

  public val videoGame: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎮", listOf("video_game"))

  public val joystick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕹️", listOf("joystick"))

  public val slotMachine: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎰", listOf("slot_machine"))

  public val gameDie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎲", listOf("game_die"))

  public val jigsaw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧩", listOf("jigsaw"))

  public val teddyBear: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧸", listOf("teddy_bear"))

  public val pinata: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪅", listOf("pinata"))

  public val mirrorBall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪩", listOf("mirror_ball"))

  public val nestingDolls: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪆", listOf("nesting_dolls"))

  public val spades: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♠️", listOf("spades"))

  public val hearts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♥️", listOf("hearts"))

  public val diamonds: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♦️", listOf("diamonds"))

  public val clubs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♣️", listOf("clubs"))

  public val chessPawn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♟️", listOf("chess_pawn"))

  public val blackJoker: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🃏", listOf("black_joker"))

  public val mahjong: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🀄", listOf("mahjong"))

  public val flowerPlayingCards: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎴", listOf("flower_playing_cards"))

  public val performingArts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎭", listOf("performing_arts"))

  public val framedPicture: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖼️", listOf("framed_picture"))

  public val art: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎨", listOf("art"))

  public val thread: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧵", listOf("thread"))

  public val sewingNeedle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪡", listOf("sewing_needle"))

  public val yarn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧶", listOf("yarn"))

  public val knot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪢", listOf("knot"))

  public val eyeglasses: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👓", listOf("eyeglasses"))

  public val darkSunglasses: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕶️", listOf("dark_sunglasses"))

  public val goggles: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥽", listOf("goggles"))

  public val labCoat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥼", listOf("lab_coat"))

  public val safetyVest: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦺", listOf("safety_vest"))

  public val necktie: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👔", listOf("necktie"))

  public val shirt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👕", listOf("shirt", "tshirt"))

  public val jeans: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👖", listOf("jeans"))

  public val scarf: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧣", listOf("scarf"))

  public val gloves: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧤", listOf("gloves"))

  public val coat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧥", listOf("coat"))

  public val socks: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧦", listOf("socks"))

  public val dress: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👗", listOf("dress"))

  public val kimono: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👘", listOf("kimono"))

  public val sari: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥻", listOf("sari"))

  public val onePieceSwimsuit: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩱", listOf("one_piece_swimsuit"))

  public val swimBrief: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩲", listOf("swim_brief"))

  public val shorts: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩳", listOf("shorts"))

  public val bikini: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👙", listOf("bikini"))

  public val womansClothes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👚", listOf("womans_clothes"))

  public val foldingHandFan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪭", listOf("folding_hand_fan"))

  public val purse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👛", listOf("purse"))

  public val handbag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👜", listOf("handbag"))

  public val pouch: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👝", listOf("pouch"))

  public val shopping: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛍️", listOf("shopping"))

  public val schoolSatchel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎒", listOf("school_satchel"))

  public val thongSandal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩴", listOf("thong_sandal"))

  public val shoe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👞", listOf("mans_shoe", "shoe"))

  public val athleticShoe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👟", listOf("athletic_shoe"))

  public val hikingBoot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥾", listOf("hiking_boot"))

  public val flatShoe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥿", listOf("flat_shoe"))

  public val highHeel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👠", listOf("high_heel"))

  public val sandal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👡", listOf("sandal"))

  public val balletShoes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩰", listOf("ballet_shoes"))

  public val boot: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👢", listOf("boot"))

  public val hairPick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪮", listOf("hair_pick"))

  public val crown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👑", listOf("crown"))

  public val womansHat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("👒", listOf("womans_hat"))

  public val tophat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎩", listOf("tophat"))

  public val mortarBoard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎓", listOf("mortar_board"))

  public val billedCap: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧢", listOf("billed_cap"))

  public val militaryHelmet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪖", listOf("military_helmet"))

  public val rescueWorkerHelmet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛑️", listOf("rescue_worker_helmet"))

  public val prayerBeads: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📿", listOf("prayer_beads"))

  public val lipstick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💄", listOf("lipstick"))

  public val ring: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💍", listOf("ring"))

  public val gem: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💎", listOf("gem"))

  public val mute: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔇", listOf("mute"))

  public val speaker: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔈", listOf("speaker"))

  public val sound: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔉", listOf("sound"))

  public val loudSound: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔊", listOf("loud_sound"))

  public val loudspeaker: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📢", listOf("loudspeaker"))

  public val mega: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📣", listOf("mega"))

  public val postalHorn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📯", listOf("postal_horn"))

  public val bell: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔔", listOf("bell"))

  public val noBell: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔕", listOf("no_bell"))

  public val musicalScore: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎼", listOf("musical_score"))

  public val musicalNote: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎵", listOf("musical_note"))

  public val notes: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎶", listOf("notes"))

  public val studioMicrophone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎙️", listOf("studio_microphone"))

  public val levelSlider: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎚️", listOf("level_slider"))

  public val controlKnobs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎛️", listOf("control_knobs"))

  public val microphone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎤", listOf("microphone"))

  public val headphones: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎧", listOf("headphones"))

  public val radio: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📻", listOf("radio"))

  public val saxophone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎷", listOf("saxophone"))

  public val accordion: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪗", listOf("accordion"))

  public val guitar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎸", listOf("guitar"))

  public val musicalKeyboard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎹", listOf("musical_keyboard"))

  public val trumpet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎺", listOf("trumpet"))

  public val violin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎻", listOf("violin"))

  public val banjo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪕", listOf("banjo"))

  public val drum: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🥁", listOf("drum"))

  public val longDrum: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪘", listOf("long_drum"))

  public val maracas: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪇", listOf("maracas"))

  public val flute: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪈", listOf("flute"))

  public val iphone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📱", listOf("iphone"))

  public val calling: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📲", listOf("calling"))

  public val phone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☎️", listOf("phone", "telephone"))

  public val telephoneReceiver: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📞", listOf("telephone_receiver"))

  public val pager: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📟", listOf("pager"))

  public val fax: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📠", listOf("fax"))

  public val battery: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔋", listOf("battery"))

  public val lowBattery: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪫", listOf("low_battery"))

  public val electricPlug: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔌", listOf("electric_plug"))

  public val computer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💻", listOf("computer"))

  public val desktopComputer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖥️", listOf("desktop_computer"))

  public val printer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖨️", listOf("printer"))

  public val keyboard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⌨️", listOf("keyboard"))

  public val computerMouse: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖱️", listOf("computer_mouse"))

  public val trackball: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖲️", listOf("trackball"))

  public val minidisc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💽", listOf("minidisc"))

  public val floppyDisk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💾", listOf("floppy_disk"))

  public val cd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💿", listOf("cd"))

  public val dvd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📀", listOf("dvd"))

  public val abacus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧮", listOf("abacus"))

  public val movieCamera: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎥", listOf("movie_camera"))

  public val filmStrip: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎞️", listOf("film_strip"))

  public val filmProjector: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📽️", listOf("film_projector"))

  public val clapper: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎬", listOf("clapper"))

  public val tv: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📺", listOf("tv"))

  public val camera: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📷", listOf("camera"))

  public val cameraFlash: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📸", listOf("camera_flash"))

  public val videoCamera: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📹", listOf("video_camera"))

  public val vhs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📼", listOf("vhs"))

  public val mag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔍", listOf("mag"))

  public val magRight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔎", listOf("mag_right"))

  public val candle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕯️", listOf("candle"))

  public val bulb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💡", listOf("bulb"))

  public val flashlight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔦", listOf("flashlight"))

  public val lantern: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏮", listOf("izakaya_lantern", "lantern"))

  public val diyaLamp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪔", listOf("diya_lamp"))

  public val notebookWithDecorativeCover: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📔", listOf("notebook_with_decorative_cover"))

  public val closedBook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📕", listOf("closed_book"))

  public val book: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📖", listOf("book", "open_book"))

  public val greenBook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📗", listOf("green_book"))

  public val blueBook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📘", listOf("blue_book"))

  public val orangeBook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📙", listOf("orange_book"))

  public val books: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📚", listOf("books"))

  public val notebook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📓", listOf("notebook"))

  public val ledger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📒", listOf("ledger"))

  public val pageWithCurl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📃", listOf("page_with_curl"))

  public val scroll: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📜", listOf("scroll"))

  public val pageFacingUp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📄", listOf("page_facing_up"))

  public val newspaper: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📰", listOf("newspaper"))

  public val newspaperRoll: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗞️", listOf("newspaper_roll"))

  public val bookmarkTabs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📑", listOf("bookmark_tabs"))

  public val bookmark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔖", listOf("bookmark"))

  public val label: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏷️", listOf("label"))

  public val moneybag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💰", listOf("moneybag"))

  public val coin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪙", listOf("coin"))

  public val yen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💴", listOf("yen"))

  public val dollar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💵", listOf("dollar"))

  public val euro: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💶", listOf("euro"))

  public val pound: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💷", listOf("pound"))

  public val moneyWithWings: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💸", listOf("money_with_wings"))

  public val creditCard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💳", listOf("credit_card"))

  public val receipt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧾", listOf("receipt"))

  public val chart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💹", listOf("chart"))

  public val envelope: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✉️", listOf("envelope"))

  public val email: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📧", listOf("email", "e-mail"))

  public val incomingEnvelope: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📨", listOf("incoming_envelope"))

  public val envelopeWithArrow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📩", listOf("envelope_with_arrow"))

  public val outboxTray: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📤", listOf("outbox_tray"))

  public val inboxTray: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📥", listOf("inbox_tray"))

  public val `package`: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📦", listOf("package"))

  public val mailbox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📫", listOf("mailbox"))

  public val mailboxClosed: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📪", listOf("mailbox_closed"))

  public val mailboxWithMail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📬", listOf("mailbox_with_mail"))

  public val mailboxWithNoMail: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📭", listOf("mailbox_with_no_mail"))

  public val postbox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📮", listOf("postbox"))

  public val ballotBox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗳️", listOf("ballot_box"))

  public val pencil2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✏️", listOf("pencil2"))

  public val blackNib: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✒️", listOf("black_nib"))

  public val fountainPen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖋️", listOf("fountain_pen"))

  public val pen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖊️", listOf("pen"))

  public val paintbrush: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖌️", listOf("paintbrush"))

  public val crayon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖍️", listOf("crayon"))

  public val memo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📝", listOf("memo", "pencil"))

  public val briefcase: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💼", listOf("briefcase"))

  public val fileFolder: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📁", listOf("file_folder"))

  public val openFileFolder: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📂", listOf("open_file_folder"))

  public val cardIndexDividers: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗂️", listOf("card_index_dividers"))

  public val date: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📅", listOf("date"))

  public val calendar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📆", listOf("calendar"))

  public val spiralNotepad: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗒️", listOf("spiral_notepad"))

  public val spiralCalendar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗓️", listOf("spiral_calendar"))

  public val cardIndex: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📇", listOf("card_index"))

  public val chartWithUpwardsTrend: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📈", listOf("chart_with_upwards_trend"))

  public val chartWithDownwardsTrend: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📉", listOf("chart_with_downwards_trend"))

  public val barChart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📊", listOf("bar_chart"))

  public val clipboard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📋", listOf("clipboard"))

  public val pushpin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📌", listOf("pushpin"))

  public val roundPushpin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📍", listOf("round_pushpin"))

  public val paperclip: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📎", listOf("paperclip"))

  public val paperclips: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🖇️", listOf("paperclips"))

  public val straightRuler: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📏", listOf("straight_ruler"))

  public val triangularRuler: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📐", listOf("triangular_ruler"))

  public val scissors: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✂️", listOf("scissors"))

  public val cardFileBox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗃️", listOf("card_file_box"))

  public val fileCabinet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗄️", listOf("file_cabinet"))

  public val wastebasket: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗑️", listOf("wastebasket"))

  public val lock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔒", listOf("lock"))

  public val unlock: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔓", listOf("unlock"))

  public val lockWithInkPen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔏", listOf("lock_with_ink_pen"))

  public val closedLockWithKey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔐", listOf("closed_lock_with_key"))

  public val key: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔑", listOf("key"))

  public val oldKey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗝️", listOf("old_key"))

  public val hammer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔨", listOf("hammer"))

  public val axe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪓", listOf("axe"))

  public val pick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛏️", listOf("pick"))

  public val hammerAndPick: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚒️", listOf("hammer_and_pick"))

  public val hammerAndWrench: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛠️", listOf("hammer_and_wrench"))

  public val dagger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗡️", listOf("dagger"))

  public val crossedSwords: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚔️", listOf("crossed_swords"))

  public val bomb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💣", listOf("bomb"))

  public val boomerang: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪃", listOf("boomerang"))

  public val bowAndArrow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏹", listOf("bow_and_arrow"))

  public val shield: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛡️", listOf("shield"))

  public val carpentrySaw: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪚", listOf("carpentry_saw"))

  public val wrench: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔧", listOf("wrench"))

  public val screwdriver: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪛", listOf("screwdriver"))

  public val nutAndBolt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔩", listOf("nut_and_bolt"))

  public val gear: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚙️", listOf("gear"))

  public val clamp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗜️", listOf("clamp"))

  public val balanceScale: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚖️", listOf("balance_scale"))

  public val probingCane: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🦯", listOf("probing_cane"))

  public val link: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔗", listOf("link"))

  public val chains: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛓️", listOf("chains"))

  public val hook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪝", listOf("hook"))

  public val toolbox: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧰", listOf("toolbox"))

  public val magnet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧲", listOf("magnet"))

  public val ladder: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪜", listOf("ladder"))

  public val alembic: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚗️", listOf("alembic"))

  public val testTube: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧪", listOf("test_tube"))

  public val petriDish: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧫", listOf("petri_dish"))

  public val dna: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧬", listOf("dna"))

  public val microscope: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔬", listOf("microscope"))

  public val telescope: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔭", listOf("telescope"))

  public val satellite: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📡", listOf("satellite"))

  public val syringe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💉", listOf("syringe"))

  public val dropOfBlood: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩸", listOf("drop_of_blood"))

  public val pill: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💊", listOf("pill"))

  public val adhesiveBandage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩹", listOf("adhesive_bandage"))

  public val crutch: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩼", listOf("crutch"))

  public val stethoscope: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩺", listOf("stethoscope"))

  public val xRay: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🩻", listOf("x_ray"))

  public val door: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚪", listOf("door"))

  public val elevator: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛗", listOf("elevator"))

  public val mirror: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪞", listOf("mirror"))

  public val window: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪟", listOf("window"))

  public val bed: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛏️", listOf("bed"))

  public val couchAndLamp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛋️", listOf("couch_and_lamp"))

  public val chair: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪑", listOf("chair"))

  public val toilet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚽", listOf("toilet"))

  public val plunger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪠", listOf("plunger"))

  public val shower: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚿", listOf("shower"))

  public val bathtub: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛁", listOf("bathtub"))

  public val mouseTrap: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪤", listOf("mouse_trap"))

  public val razor: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪒", listOf("razor"))

  public val lotionBottle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧴", listOf("lotion_bottle"))

  public val safetyPin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧷", listOf("safety_pin"))

  public val broom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧹", listOf("broom"))

  public val basket: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧺", listOf("basket"))

  public val rollOfPaper: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧻", listOf("roll_of_paper"))

  public val bucket: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪣", listOf("bucket"))

  public val soap: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧼", listOf("soap"))

  public val bubbles: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🫧", listOf("bubbles"))

  public val toothbrush: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪥", listOf("toothbrush"))

  public val sponge: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧽", listOf("sponge"))

  public val fireExtinguisher: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧯", listOf("fire_extinguisher"))

  public val shoppingCart: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛒", listOf("shopping_cart"))

  public val smoking: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚬", listOf("smoking"))

  public val coffin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚰️", listOf("coffin"))

  public val headstone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪦", listOf("headstone"))

  public val funeralUrn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚱️", listOf("funeral_urn"))

  public val nazarAmulet: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🧿", listOf("nazar_amulet"))

  public val hamsa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪬", listOf("hamsa"))

  public val moyai: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🗿", listOf("moyai"))

  public val placard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪧", listOf("placard"))

  public val identificationCard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪪", listOf("identification_card"))

  public val atm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏧", listOf("atm"))

  public val putLitterInItsPlace: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚮", listOf("put_litter_in_its_place"))

  public val potableWater: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚰", listOf("potable_water"))

  public val wheelchair: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♿", listOf("wheelchair"))

  public val mens: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚹", listOf("mens"))

  public val womens: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚺", listOf("womens"))

  public val restroom: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚻", listOf("restroom"))

  public val babySymbol: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚼", listOf("baby_symbol"))

  public val wc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚾", listOf("wc"))

  public val passportControl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛂", listOf("passport_control"))

  public val customs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛃", listOf("customs"))

  public val baggageClaim: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛄", listOf("baggage_claim"))

  public val leftLuggage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛅", listOf("left_luggage"))

  public val warning: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚠️", listOf("warning"))

  public val childrenCrossing: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚸", listOf("children_crossing"))

  public val noEntry: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛔", listOf("no_entry"))

  public val noEntrySign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚫", listOf("no_entry_sign"))

  public val noBicycles: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚳", listOf("no_bicycles"))

  public val noSmoking: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚭", listOf("no_smoking"))

  public val doNotLitter: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚯", listOf("do_not_litter"))

  @JsName("DCDDDCBJDEDDDICpCqDACtCfCpDICtDG")
  public val `non-potableWater`: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚱", listOf("non-potable_water"))

  public val noPedestrians: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚷", listOf("no_pedestrians"))

  public val noMobilePhones: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📵", listOf("no_mobile_phones"))

  public val underage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔞", listOf("underage"))

  public val radioactive: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☢️", listOf("radioactive"))

  public val biohazard: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☣️", listOf("biohazard"))

  public val arrowUp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⬆️", listOf("arrow_up"))

  public val arrowUpperRight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("↗️", listOf("arrow_upper_right"))

  public val arrowRight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("➡️", listOf("arrow_right"))

  public val arrowLowerRight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("↘️", listOf("arrow_lower_right"))

  public val arrowDown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⬇️", listOf("arrow_down"))

  public val arrowLowerLeft: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("↙️", listOf("arrow_lower_left"))

  public val arrowLeft: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⬅️", listOf("arrow_left"))

  public val arrowUpperLeft: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("↖️", listOf("arrow_upper_left"))

  public val arrowUpDown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("↕️", listOf("arrow_up_down"))

  public val leftRightArrow: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("↔️", listOf("left_right_arrow"))

  public val leftwardsArrowWithHook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("↩️", listOf("leftwards_arrow_with_hook"))

  public val arrowRightHook: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("↪️", listOf("arrow_right_hook"))

  public val arrowHeadingUp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⤴️", listOf("arrow_heading_up"))

  public val arrowHeadingDown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⤵️", listOf("arrow_heading_down"))

  public val arrowsClockwise: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔃", listOf("arrows_clockwise"))

  public val arrowsCounterclockwise: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔄", listOf("arrows_counterclockwise"))

  public val back: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔙", listOf("back"))

  public val end: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔚", listOf("end"))

  public val on: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔛", listOf("on"))

  public val soon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔜", listOf("soon"))

  public val top: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔝", listOf("top"))

  public val placeOfWorship: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛐", listOf("place_of_worship"))

  public val atomSymbol: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚛️", listOf("atom_symbol"))

  public val om: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕉️", listOf("om"))

  public val starOfDavid: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✡️", listOf("star_of_david"))

  public val wheelOfDharma: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☸️", listOf("wheel_of_dharma"))

  public val yinYang: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☯️", listOf("yin_yang"))

  public val latinCross: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✝️", listOf("latin_cross"))

  public val orthodoxCross: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☦️", listOf("orthodox_cross"))

  public val starAndCrescent: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☪️", listOf("star_and_crescent"))

  public val peaceSymbol: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☮️", listOf("peace_symbol"))

  public val menorah: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🕎", listOf("menorah"))

  public val sixPointedStar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔯", listOf("six_pointed_star"))

  public val khanda: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🪯", listOf("khanda"))

  public val aries: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♈", listOf("aries"))

  public val taurus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♉", listOf("taurus"))

  public val gemini: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♊", listOf("gemini"))

  public val cancer: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♋", listOf("cancer"))

  public val leo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♌", listOf("leo"))

  public val virgo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♍", listOf("virgo"))

  public val libra: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♎", listOf("libra"))

  public val scorpius: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♏", listOf("scorpius"))

  public val sagittarius: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♐", listOf("sagittarius"))

  public val capricorn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♑", listOf("capricorn"))

  public val aquarius: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♒", listOf("aquarius"))

  public val pisces: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♓", listOf("pisces"))

  public val ophiuchus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⛎", listOf("ophiuchus"))

  public val twistedRightwardsArrows: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔀", listOf("twisted_rightwards_arrows"))

  public val repeat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔁", listOf("repeat"))

  public val repeatOne: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔂", listOf("repeat_one"))

  public val arrowForward: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("▶️", listOf("arrow_forward"))

  public val fastForward: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏩", listOf("fast_forward"))

  public val nextTrackButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏭️", listOf("next_track_button"))

  public val playOrPauseButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏯️", listOf("play_or_pause_button"))

  public val arrowBackward: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("◀️", listOf("arrow_backward"))

  public val rewind: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏪", listOf("rewind"))

  public val previousTrackButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏮️", listOf("previous_track_button"))

  public val arrowUpSmall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔼", listOf("arrow_up_small"))

  public val arrowDoubleUp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏫", listOf("arrow_double_up"))

  public val arrowDownSmall: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔽", listOf("arrow_down_small"))

  public val arrowDoubleDown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏬", listOf("arrow_double_down"))

  public val pauseButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏸️", listOf("pause_button"))

  public val stopButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏹️", listOf("stop_button"))

  public val recordButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏺️", listOf("record_button"))

  public val ejectButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⏏️", listOf("eject_button"))

  public val cinema: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎦", listOf("cinema"))

  public val lowBrightness: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔅", listOf("low_brightness"))

  public val highBrightness: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔆", listOf("high_brightness"))

  public val signalStrength: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📶", listOf("signal_strength"))

  public val wireless: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🛜", listOf("wireless"))

  public val vibrationMode: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📳", listOf("vibration_mode"))

  public val mobilePhoneOff: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📴", listOf("mobile_phone_off"))

  public val femaleSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♀️", listOf("female_sign"))

  public val maleSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♂️", listOf("male_sign"))

  public val transgenderSymbol: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚧️", listOf("transgender_symbol"))

  public val heavyMultiplicationX: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✖️", listOf("heavy_multiplication_x"))

  public val heavyPlusSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("➕", listOf("heavy_plus_sign"))

  public val heavyMinusSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("➖", listOf("heavy_minus_sign"))

  public val heavyDivisionSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("➗", listOf("heavy_division_sign"))

  public val heavyEqualsSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟰", listOf("heavy_equals_sign"))

  public val infinity: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♾️", listOf("infinity"))

  public val bangbang: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("‼️", listOf("bangbang"))

  public val interrobang: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⁉️", listOf("interrobang"))

  public val question: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❓", listOf("question"))

  public val greyQuestion: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❔", listOf("grey_question"))

  public val greyExclamation: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❕", listOf("grey_exclamation"))

  public val exclamation: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❗", listOf("exclamation", "heavy_exclamation_mark"))

  public val wavyDash: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("〰️", listOf("wavy_dash"))

  public val currencyExchange: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💱", listOf("currency_exchange"))

  public val heavyDollarSign: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💲", listOf("heavy_dollar_sign"))

  public val medicalSymbol: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚕️", listOf("medical_symbol"))

  public val recycle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("♻️", listOf("recycle"))

  public val fleurDeLis: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚜️", listOf("fleur_de_lis"))

  public val trident: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔱", listOf("trident"))

  public val nameBadge: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("📛", listOf("name_badge"))

  public val beginner: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔰", listOf("beginner"))

  public val o: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⭕", listOf("o"))

  public val whiteCheckMark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✅", listOf("white_check_mark"))

  public val ballotBoxWithCheck: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("☑️", listOf("ballot_box_with_check"))

  public val heavyCheckMark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✔️", listOf("heavy_check_mark"))

  public val x: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❌", listOf("x"))

  public val negativeSquaredCrossMark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❎", listOf("negative_squared_cross_mark"))

  public val curlyLoop: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("➰", listOf("curly_loop"))

  public val loop: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("➿", listOf("loop"))

  public val partAlternationMark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("〽️", listOf("part_alternation_mark"))

  public val eightSpokedAsterisk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✳️", listOf("eight_spoked_asterisk"))

  public val eightPointedBlackStar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("✴️", listOf("eight_pointed_black_star"))

  public val sparkle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("❇️", listOf("sparkle"))

  public val copyright: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("©️", listOf("copyright"))

  public val registered: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("®️", listOf("registered"))

  public val tm: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("™️", listOf("tm"))

  public val hash: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("#️⃣", listOf("hash"))

  public val asterisk: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("*️⃣", listOf("asterisk"))

  public val zero: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("0️⃣", listOf("zero"))

  public val one: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("1️⃣", listOf("one"))

  public val two: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("2️⃣", listOf("two"))

  public val three: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("3️⃣", listOf("three"))

  public val four: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("4️⃣", listOf("four"))

  public val five: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("5️⃣", listOf("five"))

  public val six: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("6️⃣", listOf("six"))

  public val seven: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("7️⃣", listOf("seven"))

  public val eight: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("8️⃣", listOf("eight"))

  public val nine: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("9️⃣", listOf("nine"))

  public val keycapTen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔟", listOf("keycap_ten"))

  public val capitalAbcd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔠", listOf("capital_abcd"))

  public val abcd: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔡", listOf("abcd"))

  @JsName("_1234")
  public val `1234`: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔢", listOf("1234"))

  public val symbols: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔣", listOf("symbols"))

  public val abc: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔤", listOf("abc"))

  public val a: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🅰️", listOf("a"))

  public val ab: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆎", listOf("ab"))

  public val b: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🅱️", listOf("b"))

  public val cl: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆑", listOf("cl"))

  public val cool: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆒", listOf("cool"))

  public val free: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆓", listOf("free"))

  public val informationSource: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("ℹ️", listOf("information_source"))

  public val id: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆔", listOf("id"))

  public val m: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("Ⓜ️", listOf("m"))

  public val new: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆕", listOf("new"))

  public val ng: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆖", listOf("ng"))

  public val o2: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🅾️", listOf("o2"))

  public val ok: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆗", listOf("ok"))

  public val parking: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🅿️", listOf("parking"))

  public val sos: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆘", listOf("sos"))

  public val up: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆙", listOf("up"))

  public val vs: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🆚", listOf("vs"))

  public val koko: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈁", listOf("koko"))

  public val sa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈂️", listOf("sa"))

  public val u6708: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈷️", listOf("u6708"))

  public val u6709: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈶", listOf("u6709"))

  public val u6307: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈯", listOf("u6307"))

  public val ideographAdvantage: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🉐", listOf("ideograph_advantage"))

  public val u5272: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈹", listOf("u5272"))

  public val u7121: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈚", listOf("u7121"))

  public val u7981: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈲", listOf("u7981"))

  public val accept: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🉑", listOf("accept"))

  public val u7533: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈸", listOf("u7533"))

  public val u5408: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈴", listOf("u5408"))

  public val u7a7a: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈳", listOf("u7a7a"))

  public val congratulations: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("㊗️", listOf("congratulations"))

  public val secret: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("㊙️", listOf("secret"))

  public val u55b6: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈺", listOf("u55b6"))

  public val u6e80: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🈵", listOf("u6e80"))

  public val redCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔴", listOf("red_circle"))

  public val orangeCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟠", listOf("orange_circle"))

  public val yellowCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟡", listOf("yellow_circle"))

  public val greenCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟢", listOf("green_circle"))

  public val largeBlueCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔵", listOf("large_blue_circle"))

  public val purpleCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟣", listOf("purple_circle"))

  public val brownCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟤", listOf("brown_circle"))

  public val blackCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚫", listOf("black_circle"))

  public val whiteCircle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⚪", listOf("white_circle"))

  public val redSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟥", listOf("red_square"))

  public val orangeSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟧", listOf("orange_square"))

  public val yellowSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟨", listOf("yellow_square"))

  public val greenSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟩", listOf("green_square"))

  public val blueSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟦", listOf("blue_square"))

  public val purpleSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟪", listOf("purple_square"))

  public val brownSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🟫", listOf("brown_square"))

  public val blackLargeSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⬛", listOf("black_large_square"))

  public val whiteLargeSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("⬜", listOf("white_large_square"))

  public val blackMediumSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("◼️", listOf("black_medium_square"))

  public val whiteMediumSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("◻️", listOf("white_medium_square"))

  public val blackMediumSmallSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("◾", listOf("black_medium_small_square"))

  public val whiteMediumSmallSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("◽", listOf("white_medium_small_square"))

  public val blackSmallSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("▪️", listOf("black_small_square"))

  public val whiteSmallSquare: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("▫️", listOf("white_small_square"))

  public val largeOrangeDiamond: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔶", listOf("large_orange_diamond"))

  public val largeBlueDiamond: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔷", listOf("large_blue_diamond"))

  public val smallOrangeDiamond: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔸", listOf("small_orange_diamond"))

  public val smallBlueDiamond: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔹", listOf("small_blue_diamond"))

  public val smallRedTriangle: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔺", listOf("small_red_triangle"))

  public val smallRedTriangleDown: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔻", listOf("small_red_triangle_down"))

  public val diamondShapeWithADotInside: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("💠", listOf("diamond_shape_with_a_dot_inside"))

  public val radioButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔘", listOf("radio_button"))

  public val whiteSquareButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔳", listOf("white_square_button"))

  public val blackSquareButton: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🔲", listOf("black_square_button"))

  public val checkeredFlag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏁", listOf("checkered_flag"))

  public val triangularFlagOnPost: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🚩", listOf("triangular_flag_on_post"))

  public val crossedFlags: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🎌", listOf("crossed_flags"))

  public val blackFlag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏴", listOf("black_flag"))

  public val whiteFlag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏳️", listOf("white_flag"))

  public val rainbowFlag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏳️‍🌈", listOf("rainbow_flag"))

  public val transgenderFlag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏳️‍⚧️", listOf("transgender_flag"))

  public val pirateFlag: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏴‍☠️", listOf("pirate_flag"))

  public val ascensionIsland: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇨", listOf("ascension_island"))

  public val andorra: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇩", listOf("andorra"))

  public val unitedArabEmirates: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇪", listOf("united_arab_emirates"))

  public val afghanistan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇫", listOf("afghanistan"))

  public val antiguaBarbuda: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇬", listOf("antigua_barbuda"))

  public val anguilla: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇮", listOf("anguilla"))

  public val albania: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇱", listOf("albania"))

  public val armenia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇲", listOf("armenia"))

  public val angola: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇴", listOf("angola"))

  public val antarctica: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇶", listOf("antarctica"))

  public val argentina: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇷", listOf("argentina"))

  public val americanSamoa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇸", listOf("american_samoa"))

  public val austria: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇹", listOf("austria"))

  public val australia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇺", listOf("australia"))

  public val aruba: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇼", listOf("aruba"))

  public val alandIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇽", listOf("aland_islands"))

  public val azerbaijan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇦🇿", listOf("azerbaijan"))

  public val bosniaHerzegovina: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇦", listOf("bosnia_herzegovina"))

  public val barbados: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇧", listOf("barbados"))

  public val bangladesh: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇩", listOf("bangladesh"))

  public val belgium: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇪", listOf("belgium"))

  public val burkinaFaso: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇫", listOf("burkina_faso"))

  public val bulgaria: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇬", listOf("bulgaria"))

  public val bahrain: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇭", listOf("bahrain"))

  public val burundi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇮", listOf("burundi"))

  public val benin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇯", listOf("benin"))

  public val stBarthelemy: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇱", listOf("st_barthelemy"))

  public val bermuda: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇲", listOf("bermuda"))

  public val brunei: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇳", listOf("brunei"))

  public val bolivia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇴", listOf("bolivia"))

  public val caribbeanNetherlands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇶", listOf("caribbean_netherlands"))

  public val brazil: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇷", listOf("brazil"))

  public val bahamas: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇸", listOf("bahamas"))

  public val bhutan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇹", listOf("bhutan"))

  public val bouvetIsland: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇻", listOf("bouvet_island"))

  public val botswana: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇼", listOf("botswana"))

  public val belarus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇾", listOf("belarus"))

  public val belize: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇧🇿", listOf("belize"))

  public val canada: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇦", listOf("canada"))

  public val cocosIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇨", listOf("cocos_islands"))

  public val congoKinshasa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇩", listOf("congo_kinshasa"))

  public val centralAfricanRepublic: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇫", listOf("central_african_republic"))

  public val congoBrazzaville: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇬", listOf("congo_brazzaville"))

  public val switzerland: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇭", listOf("switzerland"))

  public val coteDivoire: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇮", listOf("cote_divoire"))

  public val cookIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇰", listOf("cook_islands"))

  public val chile: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇱", listOf("chile"))

  public val cameroon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇲", listOf("cameroon"))

  public val cn: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇳", listOf("cn"))

  public val colombia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇴", listOf("colombia"))

  public val clippertonIsland: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇵", listOf("clipperton_island"))

  public val costaRica: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇷", listOf("costa_rica"))

  public val cuba: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇺", listOf("cuba"))

  public val capeVerde: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇻", listOf("cape_verde"))

  public val curacao: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇼", listOf("curacao"))

  public val christmasIsland: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇽", listOf("christmas_island"))

  public val cyprus: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇾", listOf("cyprus"))

  public val czechRepublic: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇨🇿", listOf("czech_republic"))

  public val de: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇩🇪", listOf("de"))

  public val diegoGarcia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇩🇬", listOf("diego_garcia"))

  public val djibouti: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇩🇯", listOf("djibouti"))

  public val denmark: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇩🇰", listOf("denmark"))

  public val dominica: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇩🇲", listOf("dominica"))

  public val dominicanRepublic: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇩🇴", listOf("dominican_republic"))

  public val algeria: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇩🇿", listOf("algeria"))

  public val ceutaMelilla: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇪🇦", listOf("ceuta_melilla"))

  public val ecuador: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇪🇨", listOf("ecuador"))

  public val estonia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇪🇪", listOf("estonia"))

  public val egypt: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇪🇬", listOf("egypt"))

  public val westernSahara: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇪🇭", listOf("western_sahara"))

  public val eritrea: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇪🇷", listOf("eritrea"))

  public val es: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇪🇸", listOf("es"))

  public val ethiopia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇪🇹", listOf("ethiopia"))

  public val eu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇪🇺", listOf("eu", "european_union"))

  public val finland: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇫🇮", listOf("finland"))

  public val fiji: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇫🇯", listOf("fiji"))

  public val falklandIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇫🇰", listOf("falkland_islands"))

  public val micronesia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇫🇲", listOf("micronesia"))

  public val faroeIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇫🇴", listOf("faroe_islands"))

  public val fr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇫🇷", listOf("fr"))

  public val gabon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇦", listOf("gabon"))

  public val gb: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇧", listOf("gb", "uk"))

  public val grenada: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇩", listOf("grenada"))

  public val georgia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇪", listOf("georgia"))

  public val frenchGuiana: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇫", listOf("french_guiana"))

  public val guernsey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇬", listOf("guernsey"))

  public val ghana: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇭", listOf("ghana"))

  public val gibraltar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇮", listOf("gibraltar"))

  public val greenland: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇱", listOf("greenland"))

  public val gambia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇲", listOf("gambia"))

  public val guinea: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇳", listOf("guinea"))

  public val guadeloupe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇵", listOf("guadeloupe"))

  public val equatorialGuinea: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇶", listOf("equatorial_guinea"))

  public val greece: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇷", listOf("greece"))

  public val southGeorgiaSouthSandwichIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇸", listOf("south_georgia_south_sandwich_islands"))

  public val guatemala: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇹", listOf("guatemala"))

  public val guam: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇺", listOf("guam"))

  public val guineaBissau: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇼", listOf("guinea_bissau"))

  public val guyana: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇬🇾", listOf("guyana"))

  public val hongKong: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇭🇰", listOf("hong_kong"))

  public val heardMcdonaldIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇭🇲", listOf("heard_mcdonald_islands"))

  public val honduras: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇭🇳", listOf("honduras"))

  public val croatia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇭🇷", listOf("croatia"))

  public val haiti: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇭🇹", listOf("haiti"))

  public val hungary: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇭🇺", listOf("hungary"))

  public val canaryIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇨", listOf("canary_islands"))

  public val indonesia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇩", listOf("indonesia"))

  public val ireland: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇪", listOf("ireland"))

  public val israel: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇱", listOf("israel"))

  public val isleOfMan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇲", listOf("isle_of_man"))

  public val india: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇳", listOf("india"))

  public val britishIndianOceanTerritory: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇴", listOf("british_indian_ocean_territory"))

  public val iraq: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇶", listOf("iraq"))

  public val iran: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇷", listOf("iran"))

  public val iceland: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇸", listOf("iceland"))

  public val it: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇮🇹", listOf("it"))

  public val jersey: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇯🇪", listOf("jersey"))

  public val jamaica: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇯🇲", listOf("jamaica"))

  public val jordan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇯🇴", listOf("jordan"))

  public val jp: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇯🇵", listOf("jp"))

  public val kenya: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇪", listOf("kenya"))

  public val kyrgyzstan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇬", listOf("kyrgyzstan"))

  public val cambodia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇭", listOf("cambodia"))

  public val kiribati: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇮", listOf("kiribati"))

  public val comoros: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇲", listOf("comoros"))

  public val stKittsNevis: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇳", listOf("st_kitts_nevis"))

  public val northKorea: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇵", listOf("north_korea"))

  public val kr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇷", listOf("kr"))

  public val kuwait: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇼", listOf("kuwait"))

  public val caymanIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇾", listOf("cayman_islands"))

  public val kazakhstan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇰🇿", listOf("kazakhstan"))

  public val laos: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇦", listOf("laos"))

  public val lebanon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇧", listOf("lebanon"))

  public val stLucia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇨", listOf("st_lucia"))

  public val liechtenstein: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇮", listOf("liechtenstein"))

  public val sriLanka: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇰", listOf("sri_lanka"))

  public val liberia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇷", listOf("liberia"))

  public val lesotho: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇸", listOf("lesotho"))

  public val lithuania: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇹", listOf("lithuania"))

  public val luxembourg: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇺", listOf("luxembourg"))

  public val latvia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇻", listOf("latvia"))

  public val libya: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇱🇾", listOf("libya"))

  public val morocco: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇦", listOf("morocco"))

  public val monaco: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇨", listOf("monaco"))

  public val moldova: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇩", listOf("moldova"))

  public val montenegro: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇪", listOf("montenegro"))

  public val stMartin: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇫", listOf("st_martin"))

  public val madagascar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇬", listOf("madagascar"))

  public val marshallIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇭", listOf("marshall_islands"))

  public val macedonia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇰", listOf("macedonia"))

  public val mali: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇱", listOf("mali"))

  public val myanmar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇲", listOf("myanmar"))

  public val mongolia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇳", listOf("mongolia"))

  public val macau: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇴", listOf("macau"))

  public val northernMarianaIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇵", listOf("northern_mariana_islands"))

  public val martinique: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇶", listOf("martinique"))

  public val mauritania: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇷", listOf("mauritania"))

  public val montserrat: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇸", listOf("montserrat"))

  public val malta: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇹", listOf("malta"))

  public val mauritius: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇺", listOf("mauritius"))

  public val maldives: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇻", listOf("maldives"))

  public val malawi: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇼", listOf("malawi"))

  public val mexico: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇽", listOf("mexico"))

  public val malaysia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇾", listOf("malaysia"))

  public val mozambique: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇲🇿", listOf("mozambique"))

  public val namibia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇦", listOf("namibia"))

  public val newCaledonia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇨", listOf("new_caledonia"))

  public val niger: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇪", listOf("niger"))

  public val norfolkIsland: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇫", listOf("norfolk_island"))

  public val nigeria: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇬", listOf("nigeria"))

  public val nicaragua: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇮", listOf("nicaragua"))

  public val netherlands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇱", listOf("netherlands"))

  public val norway: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇴", listOf("norway"))

  public val nepal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇵", listOf("nepal"))

  public val nauru: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇷", listOf("nauru"))

  public val niue: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇺", listOf("niue"))

  public val newZealand: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇳🇿", listOf("new_zealand"))

  public val oman: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇴🇲", listOf("oman"))

  public val panama: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇦", listOf("panama"))

  public val peru: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇪", listOf("peru"))

  public val frenchPolynesia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇫", listOf("french_polynesia"))

  public val papuaNewGuinea: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇬", listOf("papua_new_guinea"))

  public val philippines: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇭", listOf("philippines"))

  public val pakistan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇰", listOf("pakistan"))

  public val poland: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇱", listOf("poland"))

  public val stPierreMiquelon: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇲", listOf("st_pierre_miquelon"))

  public val pitcairnIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇳", listOf("pitcairn_islands"))

  public val puertoRico: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇷", listOf("puerto_rico"))

  public val palestinianTerritories: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇸", listOf("palestinian_territories"))

  public val portugal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇹", listOf("portugal"))

  public val palau: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇼", listOf("palau"))

  public val paraguay: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇵🇾", listOf("paraguay"))

  public val qatar: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇶🇦", listOf("qatar"))

  public val reunion: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇷🇪", listOf("reunion"))

  public val romania: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇷🇴", listOf("romania"))

  public val serbia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇷🇸", listOf("serbia"))

  public val ru: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇷🇺", listOf("ru"))

  public val rwanda: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇷🇼", listOf("rwanda"))

  public val saudiArabia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇦", listOf("saudi_arabia"))

  public val solomonIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇧", listOf("solomon_islands"))

  public val seychelles: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇨", listOf("seychelles"))

  public val sudan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇩", listOf("sudan"))

  public val sweden: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇪", listOf("sweden"))

  public val singapore: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇬", listOf("singapore"))

  public val stHelena: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇭", listOf("st_helena"))

  public val slovenia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇮", listOf("slovenia"))

  public val svalbardJanMayen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇯", listOf("svalbard_jan_mayen"))

  public val slovakia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇰", listOf("slovakia"))

  public val sierraLeone: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇱", listOf("sierra_leone"))

  public val sanMarino: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇲", listOf("san_marino"))

  public val senegal: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇳", listOf("senegal"))

  public val somalia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇴", listOf("somalia"))

  public val suriname: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇷", listOf("suriname"))

  public val southSudan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇸", listOf("south_sudan"))

  public val saoTomePrincipe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇹", listOf("sao_tome_principe"))

  public val elSalvador: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇻", listOf("el_salvador"))

  public val sintMaarten: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇽", listOf("sint_maarten"))

  public val syria: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇾", listOf("syria"))

  public val swaziland: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇸🇿", listOf("swaziland"))

  public val tristanDaCunha: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇦", listOf("tristan_da_cunha"))

  public val turksCaicosIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇨", listOf("turks_caicos_islands"))

  public val chad: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇩", listOf("chad"))

  public val frenchSouthernTerritories: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇫", listOf("french_southern_territories"))

  public val togo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇬", listOf("togo"))

  public val thailand: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇭", listOf("thailand"))

  public val tajikistan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇯", listOf("tajikistan"))

  public val tokelau: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇰", listOf("tokelau"))

  public val timorLeste: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇱", listOf("timor_leste"))

  public val turkmenistan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇲", listOf("turkmenistan"))

  public val tunisia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇳", listOf("tunisia"))

  public val tonga: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇴", listOf("tonga"))

  public val tr: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇷", listOf("tr"))

  public val trinidadTobago: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇹", listOf("trinidad_tobago"))

  public val tuvalu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇻", listOf("tuvalu"))

  public val taiwan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇼", listOf("taiwan"))

  public val tanzania: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇹🇿", listOf("tanzania"))

  public val ukraine: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇺🇦", listOf("ukraine"))

  public val uganda: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇺🇬", listOf("uganda"))

  public val usOutlyingIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇺🇲", listOf("us_outlying_islands"))

  public val unitedNations: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇺🇳", listOf("united_nations"))

  public val us: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇺🇸", listOf("us"))

  public val uruguay: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇺🇾", listOf("uruguay"))

  public val uzbekistan: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇺🇿", listOf("uzbekistan"))

  public val vaticanCity: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇻🇦", listOf("vatican_city"))

  public val stVincentGrenadines: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇻🇨", listOf("st_vincent_grenadines"))

  public val venezuela: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇻🇪", listOf("venezuela"))

  public val britishVirginIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇻🇬", listOf("british_virgin_islands"))

  public val usVirginIslands: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇻🇮", listOf("us_virgin_islands"))

  public val vietnam: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇻🇳", listOf("vietnam"))

  public val vanuatu: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇻🇺", listOf("vanuatu"))

  public val wallisFutuna: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇼🇫", listOf("wallis_futuna"))

  public val samoa: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇼🇸", listOf("samoa"))

  public val kosovo: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇽🇰", listOf("kosovo"))

  public val yemen: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇾🇪", listOf("yemen"))

  public val mayotte: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇾🇹", listOf("mayotte"))

  public val southAfrica: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇿🇦", listOf("south_africa"))

  public val zambia: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇿🇲", listOf("zambia"))

  public val zimbabwe: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🇿🇼", listOf("zimbabwe"))

  public val england: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏴󠁧󠁢󠁥󠁮󠁧󠁿", listOf("england"))

  public val scotland: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏴󠁧󠁢󠁳󠁣󠁴󠁿", listOf("scotland"))

  public val wales: DiscordEmoji.Generic
    get() = DiscordEmoji.Generic("🏴󠁧󠁢󠁷󠁬󠁳󠁿", listOf("wales"))

  /**
   * Gets a discord emoji with the given [unicode].
   */
  @Deprecated(
    message = "Replaced by DiscordEmoji.findByUnicodeOrNull",
    replaceWith = ReplaceWith(expression = "DiscordEmoji.findByUnicodeOrNull(unicode)", imports =
          arrayOf("dev.kord.x.emoji.DiscordEmoji")),
  )
  public operator fun `get`(unicode: String): DiscordEmoji? =
      DiscordEmoji.findByUnicodeOrNull(unicode)
}

package com.techelevator;

public class Exercises {

    /**
     * For the purposes of this exercise, the following naming rules are tested:
     *
     * Variable names:
     *  - must start with a lowercase character a-z.
     *  - underscore ('_') characters are not allowed.
     *  - dollar sign ('$') characters are not allowed.
     *  - must be at least two characters in length.
     *  - You are encouraged to create descriptive names and are required to camel case them as appropriate.
     *
     * Constant names:
     *  - must start with an uppercase character A-Z.
     *  - dollar sign ('$') characters are not allowed.
     *  - must be at least two characters in length.
     *  - You are encouraged to create descriptive names and are required to upper case them as appropriate.
     *
     * Due to practical limitations, camel case and pascal case are not tested other than checking the first
     * character of the name is lower case for variables and upper case for constants. Your instructor will
     * manually review your solution checking for the correct casing.
     */

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;
		System.out.println(birdsRemaining);
        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
           System.out.println(numberOfExtraBirds);
        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
        int racoonsPlaying = 3;
		int racoonsGohome = 2;
		int racoonsLeftinWoods = racoonsPlaying - racoonsGohome;
			System.out.println(racoonsLeftinWoods);

        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
        int prettyFlowers = 5;
		int stingingBees = 3;
		int lessStinging = prettyFlowers - stingingBees;
			System.out.println(lessStinging);

        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int lonleyPigeon = 1;
		int hungryPigeon = 1;
		int sharingPigeonfriends = lonleyPigeon + hungryPigeon;
			System.out.println(sharingPigeonfriends);


        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int owlFriends = 3;
		int owlCouple = 2;
		int owlsFunParty = owlFriends + owlCouple;
			System.out.println(owlsFunParty);



        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int workingBeavers = 2;
		int swimmingBeaver = 1;
		int diligentBeaver = workingBeavers - swimmingBeaver;
			System.out.println(diligentBeaver);


        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int sittingToucans = 2;
		int friendlyToucan = 1;
		int toucanFriendsNow = sittingToucans + friendlyToucan;
			System.out.println(toucanFriendsNow);



        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int foragingSquirrels = 4;
		int tooFewNuts = 2;
		int hopeTheyShare = foragingSquirrels - tooFewNuts;
			System.out.println(hopeTheyShare);



        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?

         */
		double quatersFound = 0.25;
		double dimesFound = 0.10;
		double nickelsFound = 0.10;
		double changeFound = quatersFound + dimesFound + nickelsFound;






        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int mrsBrier = 18;
		int mrsMacadams =20;
		int mrsFlannery = 17;
		int muffinsBaked = mrsBrier + mrsMacadams + mrsFlannery;
			System.out.println(muffinsBaked);



        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		float yoyo = 0.24f;
		float whistle = 0.14f;
		float toyTotal = yoyo + whistle;
			System.out.println(toyTotal);



        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int largeMallows = 8;
		int miniMallows = 10;
		int totalMallows = largeMallows + miniMallows;
			System.out.println(totalMallows);


        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int noWorkToday = 29;
		int noSchoolToday = 17;
		int snowDay = noWorkToday - noSchoolToday;
			System.out.println(snowDay);


        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2.50 on a pencil
        case. How much money does she have left?
        */
		float startingFunds = 10.00f;
		float toyTruck = 3.00f;
		float pencilCase = 2.50f;
		float moneyLeft = startingFunds -(toyTruck + pencilCase);
			System.out.println(moneyLeft);




        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int joshsMarbles = 16;
		int joshsLostMarbles = 7;
		int marblesLeft = joshsMarbles - joshsLostMarbles ;
			System.out.println(marblesLeft);

        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int shellsByShore = 25;
		int megansShells = 19;
		int wantedShells = shellsByShore - megansShells;
			System.out.println(wantedShells);


        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int redBalloons = 8;
		int totalBallons = 17;
		int greenBalloons = totalBallons - redBalloons;
			System.out.println(greenBalloons);

        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int booksOnShelf = 38;
		int martaBooks = 10;
		int totalBooks = booksOnShelf + martaBooks;
			System.out.println(totalBooks);



        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int beeLegs = 6;
		int moreBees = 8;
		int moreLegs = beeLegs * moreBees;
			System.out.println(moreLegs);


        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		float iceCreamPurchased = 0.99f;
		float iceCreams = 2f;
		float twoIceCreams = (iceCreams * iceCreamPurchased);
			System.out.println(twoIceCreams);




        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int rocksHad = 64;
		int totalRocks = 125;
		int rocksNeeded = totalRocks - rocksHad;
			System.out.println(rocksNeeded);


        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int hadMarbels = 38;
		int lostMarbles = 15;
		int leftMarbles = hadMarbels - lostMarbles;
			System.out.println(leftMarbles);


        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int milesToConcert = 78;
		int milesDriven = 32;
		int milesLeft = milesToConcert - milesDriven;
			System.out.println(milesLeft);


        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
		int morningSnow = 90;
		int afternoonSnow = 45;
		int altogetherSnow = morningSnow + afternoonSnow;
			System.out.println(altogetherSnow);



        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		float boughtHotDogs = 6f;
		float hotDogPrice = 0.50f;
		float priceTotalHotDogs = boughtHotDogs * hotDogPrice;
			System.out.println(priceTotalHotDogs);



        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int moneyInPocket = 50;
		int pencilCost = 7;
		int manyPencil = moneyInPocket / pencilCost;
			System.out.println(manyPencil);



        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int totalButterflies = 33;
		int orangeButteflies = 20;
		int redButterflies = totalButterflies - orangeButteflies;
			System.out.println(redButterflies);


        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		float katesMoney = 1.00f;
		float candyCost = 0.54f;
		float changeBack = katesMoney - candyCost;
			System.out.println(changeBack);


        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int currentTrees = 13;
		int addTrees = 12;
		int totalTrees = currentTrees + addTrees;
			System.out.println(totalTrees);



        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int hoursInDay = 24;
		int daysToSeeGran = 2;
		int hoursTilGran = daysToSeeGran * hoursInDay;
			System.out.println(hoursTilGran);


        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int kimsCousins = 4;
		int piecesOfGum = 5;
		int kimsGift = kimsCousins * piecesOfGum;
			System.out.println(kimsGift);


        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		float dansMoney = 3.00f;
		float candyBar = 1.00f;
		float dansChange = dansMoney - candyBar;
			System.out.println(dansChange);



        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boatsInLake = 5;
		int peopleOnBoats = 3;
		int peopleOnLake = boatsInLake * peopleOnBoats;
			System.out.println(peopleOnLake);


        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int ellensLegos = 380;
		int lostLegos = 57;
		int totalLegos = ellensLegos - lostLegos;
			System.out.println(totalLegos);


        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int bakedMuffins = 35;
		int muffinGoals = 83;
		int muffinsNeeded = muffinGoals - bakedMuffins;
			System.out.println(muffinsNeeded);



        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willysCrayons = 1400;
		int lucysCrayons = 290;
		int moreCrayons = willysCrayons - lucysCrayons;
			System.out.println(moreCrayons);


        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersOnPage = 10;
		int pagesOfStickers = 22;
		int totalStickers = stickersOnPage * pagesOfStickers;
			System.out.println(totalStickers);



        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		double cupcakesForChildren = 100;
		double childrenForCupcakes = 8;
		double cupcakeSplit = cupcakesForChildren / childrenForCupcakes;
			System.out.println(cupcakeSplit);



        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */
		int gingyCookies = 47;
		int cookieSplit = 6;
		int cookieJars = gingyCookies % cookieSplit;




        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */
		int generousNeighbor = 59;
		int thankfulNeighbors = 8;
		int giftForNeighbors = generousNeighbor % thankfulNeighbors;
			System.out.println(giftForNeighbors);



        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int cookiesOnTray = 12;
		int oatmealCookies = 276;
		int traysForCookies = oatmealCookies / cookiesOnTray;
			System.out.println(traysForCookies);


        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int biteSizedPretzels = 480;
		int oneServing = 12;
		int totalServings = biteSizedPretzels / oneServing;
			System.out.println(totalServings);


        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int lemonCupcakes = 53;
		int boxCupcakes = 3;
		int leftbehinds = 2;
		int givenBoxes = (lemonCupcakes - leftbehinds) / boxCupcakes;
			System.out.println(givenBoxes);


        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int carrotSticks = 74;
		int twelvePeople = 12;
		int uneatenSticks = carrotSticks % twelvePeople;
			System.out.println(uneatenSticks);


        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int theirTeddies = 98;
		int shelfSpace = 7;
		int totalShelvesUsed = theirTeddies / shelfSpace;
			System.out.println(totalShelvesUsed);


        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int familyPictures = 480;
		int picturesPerAlbums = 20;
		int albumsNeeded = familyPictures / picturesPerAlbums;
			System.out.println(albumsNeeded);


        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int tradingCards = 94;
		int boxCapacity = 8;
		int boxesNeeded = tradingCards / boxCapacity;
		int partialBoxes= tradingCards % boxCapacity;
			System.out.println(boxesNeeded);
			System.out.println(partialBoxes);



        /* Exercise 49
        49. The Milky Way galaxy contains 300 billion stars. The Andromeda galaxy
        contains 1 trillion stars. How many stars do the two galaxies contain combined? (long data type)
        */
		long theMilkyWay = 300000000000L;
		long andromedaGalaxy = 1000000000000L;
		long twoGalaxiesTogether = theMilkyWay + andromedaGalaxy;
			System.out.println(twoGalaxiesTogether);


        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		double cristinasCroissants = 17;
		double brunchGuests = 7;
		double guestsServings = cristinasCroissants / brunchGuests;
			System.out.println(guestsServings);
			


	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a standard room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 standard rooms?
	    Hint: Calculate the rate at which each painter can complete a room (rooms / hour), combine those rates, 
	    and then divide the total number of rooms to be painted by the combined rate.
	    */
		double billsRate = 1 / 2.15;
		double jillsRate = 1 / 1.90;
		double roomsToPaint = 5;
		double combinedRates = roomsToPaint / (billsRate + jillsRate);
			System.out.println(combinedRates);

     

	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */
		String firstName = "Grace";
		String lastName = "Hopper, ";
		String middleInitial = " B.";
		String fullName = lastName + firstName + middleInitial;
			System.out.println(fullName);


	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
		double newYorkToChicago = 800.00;
		/*int  distanceBetween = (int)newYorkToChicago;*/
		double milesTraveled = 537.00;
		/*int howFarAreWe = (int)milesTraveled; */
		double percentage = 100;
        double areWeThereYet = (milesTraveled/ newYorkToChicago) * percentage;
		int weAreAlmostThere = (int)areWeThereYet;
			System.out.println(weAreAlmostThere);





	}

}

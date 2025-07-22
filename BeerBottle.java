public class BeerBottle {

    public static void verseSong(int bottle) {

        System.out.println(bottle+ "  bottles of beer on the wall");
        System.out.println(bottle + "  bottles of beer,");
        System.out.println("ya’ take one down,");
        System.out.println("ya’ pass it around,");
        System.out.println(bottle + "  bottles of beer on the wall.");
    }

    public static void lasttVerseSong() {
        System.out.println("No bottles of beer on the wall");
        System.out.println("No bottles of beer,");
        System.out.println("ya’ can't take one down,");
        System.out.println("ya’ can't pass it around,");
        System.out.println("'cause bottles of beer on the wall.");
    }

    public static void bottles(int bottleCount) {
        if (bottleCount == 0) {
            lasttVerseSong();
        } else {
            verseSong(bottleCount);
            System.out.println();
            bottles(bottleCount -1);

        }

    }
}

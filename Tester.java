import java.util.Scanner;

public class Tester {

//exercise 1.2
    public static void helloWorld(){
        System.out.println("Hello World!");
        System.out.println("How are you?");
    }
    /**
     * Starter code for the "Guess My Number" exercise.
     */
    // Exercise 3.4
    public static void guessStarter(Scanner scanner, int number) {
        System.out.println("---- NUMBER GUESSING GAME ----");
        System.out.println();
        System.out.println("I'm thinking of a number between 1 and 100\n" +
                "(including both). Can you guess what it is? ");
        System.out.print("Type a number: ");
        int num1 = scanner.nextInt();
        System.out.println("You guess is : " + num1);
        // pick a random number
        System.out.println("The number computer thinks is : " + number);
        System.out.println("You were off by : " + (num1 - number));
    }

    // exercise 5.7
    public static void guessMyNumber(Scanner scanner, int number) {
        System.out.println("---- NUMBER GUESSING GAMES ----\n");
        System.out.println("I'm thinking of a number between 1 and 100\n" +
                "(including both). Can you guess what it is? ");
        System.out.println("Type a number: ");
        int num1 = scanner.nextInt();
        // pick a random number
        System.out.println("The number computer thinks is : " + number);
        if (num1 == number) {
            System.out.println("Your guess is correct.");
        } else if (num1 < number) {
            System.out.println("Your guess is low");
        } else {
            System.out.println("Your guess is too high.");
        }
        if (num1 != number) {
            System.out.println("Try again.");
            // Recursive call
            guessMyNumber(scanner, number);
        }
    }


// exercise 5.1
    public static void logicalOperatorQuestion() {
        int x = 0;

        if (x > 0) {
            if (x < 10) {
                System.out.println("positive single digit number.");
            }
        }
        // the above code in one if statement:
            /*
            if(x > 0 && x < 10){
                System.out.println("positive single digit number.");
            }

             */
    }

    // exercise 5.4
    public static void checkFermat(int a, int b, int c , int n){
        System.out.println("CHECK FERMAT THEOREM");
        if(n > 2){
            if(Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n) ){
                System.out.println("Holy smokes, Fermat was wrong!");
            }
            else{
                System.out.println("No, that doesn't work");
            }
        }
    }

// exercise 5.6
    public class Buzz {
        public static void baffle(String blimp) {
            System.out.println(blimp);
            zippo("ping", -5);
        }
        public static void zippo(String quince, int flag) {
            if (flag < 0) {
                System.out.println(quince + " zoop");
            } else {

                System.out.println("ik");         // 2 is this line it prints
                baffle(quince);                    // 3 is this
                System.out.println("boo-wa-ha-ha");
            }
        }

    }

}






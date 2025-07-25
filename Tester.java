import java.util.Scanner;

public class Tester {
    //exercise 1.1
    public static void exerciseOne(){
        System.out.print("Exercise 1.1");
        System.out.println("1. Difference between Statement and Comment: \n");
        System.out.println("Statement is a part of a program that specifies one step of an algorithm.");
        System.out.println("Comment is a part of a program that contains information about the program but has no effect when the program runs. ");
        System.out.println("2. Portable means ability of a program to run on more than one kind of computer");
        System.out.println("3. Compile means to translate a program in a high-level language into a low-level language, all at once, in preparation for later execution.");
        System.out.println("4. Executable means an object code that is ready to run on specific hardware.");
    }

//exercise 1.2
    public static void helloWorld(){
        System.out.println("Hello World!");
        //This is a comment line.
        System.out.println("How are you?");
}   
//exercise 1.3

public static void errorFixing(){


System.out.println("1. Remove one of the open squiggly { braces: ");
System.out.println("It shows '{' or ';' expected(errors(1): 16:5-16:36");
System.out.println("2. Remove one of the close squiggly braces.");
System.out.println(" It shows '}' or ';' expected(errors(1): 16:5-16:36");
System.out.println("3. Instead of main, write mian ");
System.out.println(" Main.java:8: error: class Mian is public, should be declared in a file named Mian.java public class Mian { 1 error");
System.out.println("4. Remove the word static.");
System.out.println("Error: Main method not found in class Main, \n please define the main method as: \n public static void main(String[] args) \n or a JavaFX application class must extend javafx.application.Application");
System.out.println("5. Remove the word public  ");
System.out.println("Error: Main method not found in class Tester, please define the main method as:\n public static void main(String[] args)\n or a JavaFX application class must extend javafx.application.Application ");
System.out.println("6. Remove the word System ");
System.out.println(" Tester.java:64: error: cannot find symbol out.println \n You were off by :  + num1 - number symbol:   variable out location: class Tester 1 error ");
System.out.println("7. Replace println with Println.");
System.out.println(" Tester.java:38: error: cannot find symbol System.out.Println( 7. Replace println with Println. symbol: method Println(String) \n location: variable out of type PrintStream");
System.out.println("8. Replace println with print. ");
System.out.println(" It will print on the same line instead of new line");
System.out.println("9. Delete one of the parentheses. Add an extra one.");
System.out.println("')' or ',' expected(errors(1): 43:1-43:24) ");

}

//exercise 1.3


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
        public static void baffle(String blimp) {       //4
            System.out.println(blimp);                  //5
            zippo("ping", -5);                          //6
        }
        public static void zippo(String quince, int flag) {
            if (flag < 0) {
                System.out.println(quince + " zoop");       //7
            } else {

                System.out.println("ik");           // 2 is this line it prints
                baffle(quince);                      // 3 
                System.out.println("boo-wa-ha-ha");     //8
            }
        }

    }

}







//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void menu(Scanner scanner, int number){
        System.out.println("choose chapter wise exercise for solution  :-\n 1:chapter1 \n 2:chapter2 \n 3:chapter3 \n 4:chapter4 \n 5:chapter5 \n");
        System.out.print("Choose your option: ");
        int userInput = scanner.nextInt();

        if(userInput == 1){
            Tester.exerciseOne();
            Tester.helloWorld();
            Tester.errorFixing();
        }

        else if(userInput == 2){
            System.out.println();
            System.out.println("Exercise 2.2 ");
            MyData.myMethod();
            System.out.println();
            System.out.println("Exercise 2.3 ");
            Time.time();
        }
        else if(userInput == 3){
            System.out.println();
            System.out.println("Exercise 3.1 ");
            MyData.formaterExample();
            System.out.println("If you forget the printf, %d, %f then it will through an error.");
            System.out.println();
            System.out.println("Exercise 3.2 ");
            Convert.tempConvert(scanner);
            System.out.println();
            System.out.println("Exercise 3.3 ");
            Time.calculateHMS(scanner);
            System.out.println();
            System.out.println("Exercise 3.4 ");
            Tester.guessStarter(scanner, number);
        }
        else if(userInput == 4){
            System.out.println();
            System.out.println("Exercise 4.1");
            System.out.print("No, I ");
            MyData.zoop();
            System.out.print("I ");
            MyData.baffle();
            System.out.println("Exercise 4.1.3");
            System.out.println("If you invoke baffle() at the end of ping() method: ");
            System.out.println("It will go to an infinite loop.");
            System.out.println();
            System.out.println("Exercise 4.2 ");
            MyData.zool(6, "peggy", "roman");
            System.out.println();
            String day = "Saturday";
            String month = "July";
            int date = 22;
            int year = 2015;
            System.out.println("Exercise 4.3");
            System.out.println();
            MyData.printAmerican(day, month, date, year);
            MyData.printEuropean(day, date, month, year);

        }
        else if(userInput == 5){
            System.out.println();
            System.out.println("Exercise 5.1");
            Tester.logicalOperatorQuestion();
            System.out.println();
            System.out.println("Exercise 5.2");
            int bizz = 5;
            int buzz = 2;
            MyData.zoop("just for", bizz);
            MyData.clink(2 * buzz);
            System.out.println();
            System.out.println("Exercise 5.4");
            Tester.checkFermat(4,5,3,3);
            System.out.println();
            System.out.println("Exercise 5.5");
            System.out.println("Beer Bottle Game");
            BeerBottle.bottles(4);
            System.out.println();
            System.out.println("Exercise 5.6");
            System.out.println("Final output is :");
            Tester.Buzz.zippo("rattle", 13);    //This is 1 and it will run first.
            System.out.println();
            System.out.println("Exercise 5.7");
            Tester.guessMyNumber(scanner, number);

        }

        else{
            System.out.println("Invalid option. Please choose option between (1 - 5) : ");
            menu(scanner, number);
            //System.out.println("End of Programming...");
        }
    }


    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        menu(scanner,number);

        //Convert.calculateConversion(scanner);


        //MyData.formaterExample();
        scanner.close();

    }

}
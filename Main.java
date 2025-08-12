
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//import static Chapter7.check;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void menu(Scanner scanner, int number){
        System.out.println("choose chapter wise exercise for solution  :-\n 1:chapter1 \n 2:chapter2 \n 3:chapter3 \n 4:chapter4 \n 5:chapter5 \n 6:chapter6 \n 7:chapter7 \n 8:chapter8 \n 9:chapter9\n");
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
            Time.countup(3);
            double Area = Time.calculateArea(6);
            System.out.println("Area is : " + Area);
            Chapter6.add(4,8);
            
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
        else if(userInput == 6){
            //exercise 6.2
            System.out.println();
            System.out.println(Chapter6.isDivisible(3, 10));
            System.out.println(Chapter6.isTriangle(2,5,9));

            //exercise 6.4

            System.out.println("Result of 6.4.3");
            System.out.println("multadd test result is: "+ Multadd.multadd(1.0, 2.0, 3.0));
            System.out.println();
            System.out.println("Result of 6.4.4 for sin and log questions ");
            double pi = Math. PI;
            double result1 = Multadd.multadd (1.0, Math.sin(pi / 4), Math.cos (pi / 4) / 2);
            System.out.println("Result 1" + result1);
            double result2 = Multadd.multadd(1.0, Math.log(10), Math.log(20));
            System.out.println("Result 2 is:" + result2);

            System.out.println();
            System.out.println("Result of 6.4.5");
            System.out.println("Result 3 is: "+ Multadd.expSum(2.0));

            //exercise 6.5
            boolean flag1 = Chapter6.isHoopy(202);
            boolean flag2 = Chapter6.isFrabjuous(202);
            System.out.println(flag1);
            System.out.println(flag2);
            if (flag1 && flag2) {
            System.out.println("ping!");
            }
            if (flag1 || flag2) {
            System.out.println("pong!");
            }
            System.out.println();
            System.out.println("Output of exercise 6.6 is : ");
            System.out.println(Chapter6.prod(1, 4));
            System.out.println();

            //Exercise 6.7
            System.out.println("Odd Integers: ");
            int totalSum = Chapter6.oddSum(5);
            
            System.out.println ("Total sum of odd integers = " + totalSum);
            System.out.println();

            //Exercise 6.8
            System.out.println("Ackermann Function");
            System.out.println("Ackermann Function(O, 1) = " + Chapter6.ack(0, 1));
            System.out.println();

            //Exercise 6.9
            System.out.println("Power Function: " +Chapter6.power(2,0));


        }
        else if(userInput == 7){
            System.out.println();
            System.out.println("Output Of Exercise 7.1");
            Chapter7.loop(10);
            System.out.println("Square Root Finder Program");

            System.out.println("Please enter a number to find the square root : ");
            double number1 = scanner.nextDouble();
            double result = Chapter7.squareRoot(number1,scanner);
            System.out.println();
            System.out.println("The square root of " + number1 + " is " + result);
            System.out.println();
            System.out.println("Factorial Using Recursive Method is:  " +Chapter7.factorial(5));
            System.out.println();
            System.out.println("Iterative Factorial Method : " + Chapter7.factorialIterative(5));
            System.out.println();
            System.out.println("Power Iterative Method " +Chapter7.powerIterativeMethod(2, 10));
            System.out.println();
            //int n = 20;
            System.out.println("Exponential Check "+Chapter7.myexp(result, 20));
            System.out.println();
            double mathResult = Math.exp(result);
            System.out.println();
            System.out.println("Math Exponential Result Check Using Math.exp() is " + mathResult);
            System.out.println();
            
    
        
        }
        else if(userInput == 8){
            
            System.out.println("Testing for cube");
            double[] a = {1.0, 2.0, 3.0};
            double[] cubes = Chapter8.powArray(a, 3);
            for (double cube : cubes) {
                System.out.print(" cube is " + cube);
            
            }
            System.out.println();
            System.out.println("Histogram ");
            int[] scores = Chapter8.randomArray(10);
            //int a = Chapter8.inRange(scores, 90, 100);
            int b = Chapter8.inRange(scores, 80, 90);
            int c = Chapter8.inRange(scores, 70, 80);
            int d = Chapter8.inRange(scores, 60, 70);
            int f = Chapter8.inRange(scores, 0, 60);
            int[] result = Chapter8.histogram(scores, 100);
            for(int score : result){
                System.out.println("histogram score " + score);
            }
            System.out.println();
            System.out.println("The output is: ");
            int[] bob = Chapter8.make(5);
            Chapter8.dub(bob);
            System.out.println(Chapter8.mus(bob));
            System.out.println();
            System.out.println("Testing Factors ");
            int [] factor1 = {3,5,7};
            System.out.println(Chapter8.areFactors(factor1, 60));
            System.out.println();
            int[] max = {2,6,5,9};
            System.out.println("prime number check is  " + Chapter8.arePrimeFactors(30, max));
            System.out.println();
            int[] maxIndexNo = {2,4,3,8,9};
            System.out.println("Largest index number is " +Chapter8.indexOfMax(maxIndexNo));


        }
        else if(userInput == 9){
            
            String s1 = "Hello" + 'A';
            System.out.println("To add string with a char is : " + s1);   //It will concatenate.
            System.out.println();
            System.out.println("Histogram of letter in the string.");
            Chapter9.letterHist("hello");
            System.out.println();
            System.err.println("Abecedarian " + Chapter9.isAbecedarian("hello"));
            System.out.println();
            System.out.println("Is Doubloon " + Chapter9.doubloon("world"));
            System.out.println();
            System.out.println("Check Anargam " + Chapter9.anagrams("stop", "spot"));
            System.out.println();
            System.out.println("Check Spelling  " + Chapter9.canSpell("gifnas", "fangsu"));
            System.out.println();
            System.out.println("Test to return the first character in 'Hello' is : " + Chapter9.first("Hello"));
            System.out.println();
            System.out.println("Test to returns all except first in given String is : " + Chapter9.rest("hello"));
            System.out.println();
            System.out.println("Test to return all except first and last in given string is : " +Chapter9.middle("Hello"));
            System.out.println();
            System.out.println("Test to return the length of given string is : "+ Chapter9.length("hello"));
            System.out.println();
            Chapter9.printString("hello");
            System.out.println();
            Chapter9.printBackward("hello");
            
        }

        else{
            System.out.println("Invalid option. Please choose option between (1 - 9) : ");
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
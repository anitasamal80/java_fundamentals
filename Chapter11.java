import java.util.Scanner;

public class Chapter11{
    public static void chapter11(Scanner scanner){
        //Shopping Cart Program
        String item;
        double price;
        int quantity;
        char currency = '£';
        double total;

        System.out.print("What item  would you like to buy?: ");
        item = scanner.next();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought "+ quantity + " "+ item +"/s");
        System.out.println("Your total is " + currency + total);

        
    }

}
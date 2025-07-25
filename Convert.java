

import java.util.Scanner;

public class Convert {
    /*
     Converts centimeters to feet and inches.

    public static void calculateConversion(Scanner scanner) {
        double cm;
        int feet, inches, remainder;
        final double CM_PER_INCH = 2.54;
        final int IN_PER_FOOT = 12;

        // prompt the user and get the value
        System.out.print("Enter a number for conversion to feet and inches : ");
        cm = scanner.nextDouble();

        // convert and output the result
        inches = (int) (cm / CM_PER_INCH);
        feet = inches / IN_PER_FOOT;
        remainder = inches % IN_PER_FOOT;
        System.out.printf("%.2f cm = %d ft, %d in\n",
                cm, feet, remainder);
    }
*/
    // Exercise - 3.1 Program to convert a temperature from Celsius to Fahrenheit.

    public static void tempConvert(Scanner scanner) {
        System.out.println("---- TEMPERATURE CONVERTER PROGRAM ----");
        System.out.println();
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        // Conversion formula: Fahrenheit = (Celsius × 9/5) + 32
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("%.1f°C = %.1f°F.\n", celsius, fahrenheit);

    }




}



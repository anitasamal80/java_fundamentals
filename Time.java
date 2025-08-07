import java.util.Scanner;

public class Time {
    public static void time() {
        // exercise no 2.3

        System.out.println("Hello World!");

        int currentHour = 22;
        int currentMinute = 15;
        int currentSecond = 30;
        int secondsFromMidnight = (currentHour*60*60)+ (60 * currentMinute) + currentSecond;
        int timeLeftInTheDay = (59-currentSecond ) +(59-currentMinute)* 60 + (23-currentHour)*60*60;
        int totalTime = 24 * 60 * 60;

        System.out.println("No. of seconds since midnight: " + secondsFromMidnight );
        System.out.println("No of seconds remaining in a day: " + timeLeftInTheDay );
        float percentageTimePassed = secondsFromMidnight * 100 /totalTime ;
        System.out.println("% of day passed: " + percentageTimePassed);
        int endHour = 23;
        int endMinute = 5;
        int endSecond = 45;
        int timeSpend = (endSecond - currentSecond) + (endMinute - currentMinute ) * 60 + (endHour - currentHour) * 60 * 60;

        System.out.println("Elapsed time in seconds: " + timeSpend);


    }
// Exercise 3.3
    public static void calculateHMS(Scanner scanner) {
        System.out.println("--- PROGRAM CONVERT SECONDS TO HOUR, MINUTES, SECONDS ---");
        System.out.print("enter seconds: ");
        int totalSeconds = scanner.nextInt();
        scanner.nextLine();
        int hour = totalSeconds / (3600);
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = (totalSeconds % 3600) % 60;
        System.out.printf("%d seconds = %d hour,  %d minutes, %d seconds", totalSeconds, hour, minutes, seconds);
        System.out.println("\n");

    }

    public static void countup(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            countup(n - 1);
            System.out.println(n);
        }

}

public static double calculateArea(double radius){
    double result = Math.PI * radius * radius;
    return result;
    
}
//And here is how it is invoked:
//countup(3);
//System.out.println("Have a nice day.");



}

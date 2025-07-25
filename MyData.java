

public class MyData {
//Exercise 2.2

    public static void myMethod(){
        //System.out.println("Hello World!\n");
        String day = "Thursday";
        int date = 16;
        String month = "July";
        int year = 2015;
        System.out.println("American Format: ");
        System.out.println(day + ", " + month + date + ", " + year + ".");
        System.out.println("Europeon Format: ");
        System.out.println(day + " " + date +" " + month + " " + year );

    }

//exercise 4.3 Method to print date in American format :

    public static void printAmerican(String day, String month, int date, int year) {
        System.out.println("American Format: ");
        System.out.println(day + ", " + month + date + ", " + year + ".");
        System.out.println();

    }

// exercise 4.3 method to print date in European Format:
public static void printEuropean(String day, int date,String month, int year) {
    System.out.println("European Format: ");
    System.out.println(day + " " + date +" " + month + " " + year );

}

// exercise 4.2 Invoke methods that takes parameters:
    public static void zool(int num1, String petName, String streetName){
        System.out.println(num1 + " " + petName + " " + streetName );
    }


    //exercise 4.1

public static void zoop() {
baffle();
System.out.print("You wugga ");
baffle();
}

    public static void baffle() {
        System.out.print("wug");
        ping();
    }
public static void ping() {
        System.out.println(".");
    }



    // Exercise 3.1 program for data format

    public static void formaterExample(){
        String name = "Robin";
        char firstName = 'R';
        int age = 35;
        double height = 44.0;
        

// \n to add a line manually after every sentence

        System.out.printf("Hello %s\n ",name);
        System.out.printf("Your name start with letter %c and you are %d years old. You are %.1f tall.\n ",firstName, age, height);
        // Through an error if you forget to give placeholder.
        //Exception in thread "main" java.util.UnknownFormatConversionException: Conversion = '.'
        //at java.base/java.util.Formatter.parse(Formatter.java:2818)
        //at java.base/java.util.Formatter.format(Formatter.java:2744)
        //at java.base/java.io.PrintStream.format(PrintStream.java:1183)
        //at java.base/java.io.PrintStream.printf(PrintStream.java:1081)
        //at MyData.formaterExample(MyData.java:71)
        

    }



//exercise 5.2

    public static void zoop(String fred, int bob) {
        System.out.println(fred);
        if (bob == 5) {
            ping("not ");
        } else {
            System.out.println("!");
        }
    }

    public static void clink(int fork) {
        System.out.print("It's ");
        zoop("breakfast ", fork);
    }
    public static void ping(String strangStrung) {
        System.out.println("any " + strangStrung + "more ");
    }

}

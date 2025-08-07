import java.util.Scanner;

public class Chapter7{
    
    public static void loop(int n) {
    int i = n;
    while (i > 1) {
        System.out.println(i);
        if (i % 2 == 0) {
            i = i / 2;
        } 
        else {
            i = i + 1;
        }
    }   
    }
// exercise 7.2
public static double squareRoot(double a, Scanner scanner) {
       // System.out.println("Choose a number to find its square root: ");
        //double scanner = scanner.nextDouble();
        double x0 = a / 2.0;
        double x1;
        while (true){
            x1 = (x0 + a / x0) / 2.0;
            if(Math.abs(x1 - x0) < 0.0001) {
                break;
            }
            x0 = x1;
            
        }
        return x1;        
    }
//Exercise 7.3
public static double powerIterativeMethod (double x, int n){
    if (n == 0){
     return 1;
    }
    //boolean isNegative = n < 0;
    n = Math.abs(n);
    double result = 1.0;
    while (n > 0){

        if (n % 2 == 1){
        result *= x;
        }

    x *= x;
    n /= 2;
    }
    return result;
}

// Exercise 7.4   
public static int factorial(int n) {
if (n == 0) {
return 1;
}
int recurse = factorial(n - 1);
int result = n * recurse;
return result;
}
//7.5
public static int factorialIterative(int n){
    int factorialResult = 1;
    
    for (int i = 2; i <= n; i++){

        factorialResult *=i;
    }
    return factorialResult;
}
//exercise 7
public static double myexp(double x, int n) {

    double sum = 1.0;
    double term = 1.0;

    //Chapter7.factorialIterative(n);

    for (int i = 1; i < n; i++) {
        term *= x / i; 
        sum += term;
    }
    
    return sum;
}

}

  




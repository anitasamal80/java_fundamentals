
public class Chapter6 { 
    
    public static void add(int x, int y){
        int result = x + y;
        System.out.println("Result is: " + result);

    }
    //program for exercise 6.2

    public static boolean isDivisible(int n, int m){
        if (n%m == 0){
            return true;
        }
        else{
            return false;
        }
    }

    //Exercise 6.3
    public static boolean isTriangle(int a, int b, int c){
        if ((a+b>c ) && (b+c >a) && (c+a >b)){
            return true;

        }
        else{
            return false;
        }

    }
//Exercise 6.5
public static boolean isHoopy(int x) {
boolean hoopyFlag;
if (x % 2 == 0) {
hoopyFlag = true;
} else {
hoopyFlag = false;
}
return hoopyFlag;
}
public static boolean isFrabjuous(int x) {
boolean frabjuousFlag;
if (x > 0) {
frabjuousFlag = true;
} else {
frabjuousFlag = false;
}
return frabjuousFlag;
}
//Exercise 6.6

public static int prod(int m, int n) {
if (m == n) {
return n;
} else {
//int recurse = prod(m, n - 1);
//int result = n * recurse;
//return result;

//Instead of above 3 lines we can write in one line for exercise 6.6.4 as follows:
return prod(m, n-1) * n;
}
}
//Exercise 6.7
public static int oddSum(int n){
    System.out.println("Value of n= " + n); 
    if (n == 1) {
    return 1; 
    }
    else {
    // recursive call    
    int temp = oddSum(n - 2); 
    //System.out.println(temp);
    int result = n + temp;
    
    // Add current odd number to result
    return result;

    }
    
    }
//Exercise 6.8
public static int ack(int m, int n){
if (m == 0) {

    return n + 1;
} 
else if (m > 0 && n == 0) {
    return ack(m - 1, 1);
}
else {

    return ack(m - 1, ack(m, n - 1)) ;

    }  
 } 

 //Exercise 6.9
public static double power(double x, int n){
    if (n == 0){
        return 1;
    }
    else{
        return power(x , n - 1) * x;
    }
}
}
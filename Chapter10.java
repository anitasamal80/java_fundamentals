
import java.awt.Point;
import java.awt.Rectangle;
import java.math.BigInteger;


public class Chapter10 {

//Exercise 10.1
    public static int riddle(int x, Point p) {
        x = x + 7;
        return x + p.x + p.y;
    }

//Exercise 10.2
    public static double distance(Point p1, Point p2) {
        int dx = p2.x - p1.x;
        int dy = p2.y - p1.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static Point findCenter(Rectangle box) {
        int x = box.x + box.width / 2;
        int y = box.y + box.height / 2;
        return new Point(x, y);
    }

    public static void printPoint(Point p) {
        System.out.println("(" + p.x + ", " + p.y + ")");
    }

//Exercise 10.4
    public static BigInteger factorialIterative(int n) {
        //BigInteger big = BigInteger.valueOf(n);
        //BigInteger are immutable.
        BigInteger factorialResult = BigInteger.valueOf(1);
        
        for (int i = 0; i <= n; i++) {
            if (i > 0) {
                factorialResult = factorialResult.multiply(BigInteger.valueOf(i));
            }
            System.out.println(factorialResult);
        }
        return factorialResult;
    }

//Exercise 10.5

    public static BigInteger pow(int x, int n) {

        if (n == 0) {
            return BigInteger.valueOf(1);
        }
// find x to the n/2 recursively
// Autocast to bigInteger.
        BigInteger t = pow(x, n / 2);
// if n is even, the result is t squared
// if n is odd, the result is t squared times x
        if (n % 2 == 0) {
            return t.multiply(t);
        } else {
            return t.multiply(t).multiply(BigInteger.valueOf(x));
        }
    }

}

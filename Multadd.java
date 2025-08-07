public class Multadd {


    public static double multadd(double a, double b, double c){
        return a * b + c;

    }

    public static double expSum(double x){
        double term1 = x * Math.exp(-x);
        double term2 = Math.sqrt(1 - Math.exp(-x));
        return multadd(x, term1, term2);

    }
    
    
}

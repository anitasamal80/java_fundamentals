import java.util.Random;
public class Chapter8{

    public static double[] powArray(double[] input, int raisedto) {
        double[] result = new double[input.length];
        
        for (int i = 0; i< input.length; i++ ) {
            System.out.println("input " + input[i]);
            result[i] = Math.pow(input[i], raisedto);
            
        }
        return result;
    }


    public static int banana(int[] a) {
        int kiwi = 1;
        int i = 0;
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }
    public static int grapefruit(int[] a, int grape) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i;
            }
        }
        return -1;
    }
    public static int pineapple(int[] a, int apple) {
        int pear = 0;
        for (int pine: a) {
            if (pine == apple) {
                pear++;
            }
        }
        return pear;
    }

    public static int[] make(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
            return a;
        }
    public static void dub(int[] jub) {
        for (int i = 0; i < jub.length; i++) {
            jub[i] *= 2;
        }
}

public static int mus(int[] zoo) {
    int fus = 0;
        for (int i = 0; i < zoo.length; i++) {
            fus += zoo[i];
        }

    return fus;
}

//Histogram
/**
     * Returns an array of random integers.
     */
    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }

    /**
     * Computes the number of array elements in [low, high).
     */
    public static int inRange(int[] a, int low, int high) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= low && a[i] < high) {
                count++;
            }
        }
        return count;
    }

public static int[] histogram(int[] scores, int noOfCounter){
        // histogram with enhanced for loop
        int[] counts = new int[noOfCounter];
        for (int score : scores) {
            System.out.println("input " + score);
            counts[score]++;
        }
        return counts;
    }
//Exercise 8.4
    public static int indexOfMax(int[] arr){
        int maxIndex = 0;
        for (int i=1; i < arr.length; i++){
            if (arr[i] > arr[maxIndex]){

                maxIndex = i;
            }
        }
    return maxIndex;
    // you cannot use an enhanced for loop because it iterates over value not on index but you need value and index no to track for maximum.


    }
// exercise 8.6
    public static boolean areFactors(int[] arrInt, int n){

        for(int i=0; i< arrInt.length; i++){
            if (i % n==0){
                return true;
            }
        }
        return false;
        }

  
//Enhanced for loop for fators:
/*
    for (int factor :arrInt) {
        if (n % factor == 0){
            return true;
        }
    }
    return false;
    }

    */
//exercise 8.7

// to check n is prime 
   public static boolean isPrime(int n){
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0){
                 return false;
            }
        return true;
        
    }
        return false;

   }

   public static boolean arePrimeFactors(int num, int[] arr) {
        

        int product = 1; 

        for (int value : arr) {
            if (!isPrime(value)) {
                return false; 
            }
            product *= value;
        }

   
    return product == num;
   }
    

}


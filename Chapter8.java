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

}
public class Chapter9{

    public static void jj(){
        System.out.println("hello");
    }
    // Exercise 9.2
    public static void letterHist(String word){
       
        word = word.toLowerCase();
        
        int[] histogram = new int[26];
        
        
        char[] alphabets = lowerAlphabets();
        for (int i =0; i< word.length(); i++){
            for(int j=0; j < alphabets.length ; j++) {
                if (word.charAt(i)== alphabets[j]){
                histogram[j]++;
            }
         }
        }
       
       //print the character and histogram
        for (int i=0; i< histogram.length; i++){
        System.out.println(alphabets[i] + " : "+ histogram[i]);
        }
    }

public static char[] lowerAlphabets() {
        char alpha = 'a';
        char[] alphabets = new char[26];
        for(int i=0; i< 26; i++){
            alphabets[i] = alpha;
            alpha++;
        }
        return alphabets;
    }
// Program to check Abecedarian

    public static boolean isAbecedarian(String s){
        boolean abecedarian= false;
        //  if the letters in the word appear in alphabetical order
        for (int i=1; i < s.length(); i++){
            // if next letter is one more than this letter
            if (s.charAt(i) <= s.charAt(i-1)){
                abecedarian = false;
                break;
            }
            abecedarian = true;
        }
        return abecedarian;
    }

    // program to check “doubloon”

    public static boolean  doubloon(String s){
        s = s.toLowerCase();
        boolean doubleChar = false;
    //check against the previous character
        for (int i=1; i < s.length(); i++){
            if (s.charAt(i)== (s.charAt(i-1))){
                doubleChar = true;
                break;
            }
        }
        return doubleChar;
    }

}


public class Chapter9{

    
    // Program  that returns a histogram of the letters in the string.
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


// program to check whether the word is an "anagrams" or not.

    public static boolean anagrams(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        boolean result = false;
            if (str1.length() == str2.length()){ 
                result = true;
                for (int i = 0; i < str1.length();i++) {
                   if( str2.indexOf(str1.charAt(i)) == -1){
                        result = false;
                        break;
                   }
                }    
            }      
        return result;
   
    }


// Program that takes two strings and checks whether the set of tiles can spell the word. 

public static boolean canSpell(String tile, String word){
    boolean result = true;
    tile = tile.toLowerCase();
    word = word.toLowerCase();
    for (int i=0; i < word.length(); i++){
//check each character of the word exist in the supplied tiles

        if (tile.indexOf(word.charAt(i)) == -1){
        return false; 
    }
    }
    return result;    
   }

// Returns the first character of the given String.

    public static char first(String s) {
        return s.charAt(0);
    }
    

// Returns all but the first letter of the given String.
    public static String rest(String s) {
        return s.substring(1);
    }

//Returns all but the first and last letter of the String.

    public static String middle(String s) {
        return s.substring(1, s.length() - 1);
    }

// Returns the length of the given String.

    public static int length(String s) {
        return s.length();
    }

// Print the string

    public static void printString(String s){
        for (int i=0; i<s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }

// Print the string in backword
    public static void printBackward(String s){
        for (int i=(s.length() -1); i>=0; i--){
            System.out.println(s.charAt(i));
        }

    }

}
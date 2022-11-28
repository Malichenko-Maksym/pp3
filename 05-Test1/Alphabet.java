public class Alphabet {
    public static boolean isAlphabet(String t) {
    String newWord = t.toLowerCase();
    char[] word = newWord.toCharArray();
       for(int charr=1; charr<word.length-1; charr+=1){
        if (word[charr]<word[charr-1]) {
            return false;
        }
       }
    return true;
    }
}

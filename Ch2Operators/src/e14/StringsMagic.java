package e14;

public class StringsMagic {
    //the == and != operators, compare references,
//and equals( ), which actually compares content.
    public static void compareStrings(String word, String word1) {
        System.out.println(word + " and " + word1);
        System.out.println(word == word1);
        System.out.println(word != word1);
        System.out.println(word.equals(word1));
    }

    public static void main(String[] args) {
        compareStrings("day", "day");
//  creation of separate object:
        String newWord = new String("day");
        compareStrings("day", newWord);
        compareStrings("car", "bus");
    }
}
package e10;

import java.util.Arrays;

public class VampireNum {
    public static void main(String[] args) {
        for (int x = 10; x < 100; x++) {
            String sx = Integer.toString(x);
            for (int y = x; y < 100; y++) {
                int vampire = x * y;
                String sy = Integer.toString(y);
                String sv = Integer.toString(vampire);
//                if (sortVampire(sx + sy).equals(sortVampire(sv))) {
                if (Arrays.equals(sortVampire(sx + sy), sortVampire(sv)))
                    System.out.println(vampire + " = " + x + " * " + y);
            }
        }
    }

    private static char[] sortVampire(String vampire) {
        System.out.println("The vampire numbers are: ");
        char[] sortedArray = vampire.toCharArray();
        Arrays.sort(sortedArray);
        return sortedArray;
    }

//    private static List<Character> sortVampire(String vampire) {
//        System.out.println("The vampire numbers are: ");
//        List<Character> vampireNumber = new ArrayList<Character>();
//        for (int i = 0; i < vampire.length(); i++) {
//            vampireNumber.add(vampire.charAt(i));
//        }
//        Collections.sort(vampireNumber);
//        return vampireNumber;
//    }
}
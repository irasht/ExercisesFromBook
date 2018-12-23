package e10;

import java.util.*;

public class VampireNumb {
    public static void main(String[] args) {
        for (int x = 10; x < 100; x++) {
            String sx = String.valueOf(x);
            for (int y = x; y < 100; y++) {
                int vampire = x * y;
                String sy = String.valueOf(y);
                String sv = String.valueOf(vampire);
                if (sortVampire(sx + sy).equals(sortVampire(sv))) {
                    System.out.println(x + " * " + y + " = " + vampire);
                }
            }
        }
    }

    private static List<Character> sortVampire(String vampire) {
        System.out.println("The vampire numbers are: ");
        List<Character> vampireNumber = new ArrayList<Character>();
        for (int i = 0; i < vampire.length(); i++) {
            vampireNumber.add(vampire.charAt(i));
        }
        Collections.sort(vampireNumber);
        return vampireNumber;
    }
}

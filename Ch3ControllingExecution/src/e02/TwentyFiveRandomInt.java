package e02;

import java.util.Random;

public class TwentyFiveRandomInt {
    static Random random = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < 25; i++) {
            compare();
        }
    }

    public static void compare() {
        int numb1 = random.nextInt();
        int numb2 = random.nextInt();
        System.out.println("numb1 = " + numb1);
        System.out.println("numb2 = " + numb2);
        if (numb1 < numb2)
            System.out.println("numb1 < numb2");
        else if (numb1 > numb2)
            System.out.println("numb1 > numb2");
        else
            System.out.println("numb1 = numb2");
    }
}


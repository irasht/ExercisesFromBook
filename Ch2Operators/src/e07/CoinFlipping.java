package e07;

import java.util.Random;

public class CoinFlipping {
    public static void main(String[] args) {
        Random random = new Random();
        boolean choice = random.nextBoolean();
        System.out.println(choice ? "Орел" : "Решка");
    }
}
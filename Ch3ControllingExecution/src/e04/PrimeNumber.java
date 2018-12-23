package e04;

public class PrimeNumber {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                }
            }
            if (prime) {
                System.out.print(i + " ");
            }
        }
    }
}

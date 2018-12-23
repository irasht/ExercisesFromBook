package e09;

public class FibonacciSequence {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++)
            System.out.print(findFibonacci(i) + ", ");
    }

    public static int findFibonacci(int number) {
        if (number <= 1) {
            return number;
        }
        return findFibonacci(number - 1) + findFibonacci(number - 2);
    }
}

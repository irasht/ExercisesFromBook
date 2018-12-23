package e09;

class Fibonacci {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 0; i < n; i++)
            System.out.print(findFibonacci(i) + ", ");
    }

    private static int findFibonacci(int n) {
        int a = 1;
        int b = 1;
        int c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

} 
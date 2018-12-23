package e07;

public class UseBreak {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i == 99) {
                break;
            }
            System.out.print(i + " ");
        }
    }
}
package e16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new Adapter(10));
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }
}

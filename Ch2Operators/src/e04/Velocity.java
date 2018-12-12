package e04;

import java.util.Scanner;

public class Velocity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter distance:");
        float distance = sc.nextFloat();
        System.out.print("Please enter time:");
        float time = sc.nextFloat();
        System.out.print("Velocity is " + distance / time + " m/s");
    }
}

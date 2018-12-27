package e04.pack;

import e04.Apple;

public class ApplePie extends Apple {
    public ApplePie() {
        System.out.println("ApplePie constructor");
    }

    public void chomp() {
        bite();
    }

    public static void main(String[] args) {
        ApplePie applePie = new ApplePie();
        applePie.chomp();
    }
}
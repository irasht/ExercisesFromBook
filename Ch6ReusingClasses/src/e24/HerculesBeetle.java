package e24;

public class HerculesBeetle extends Beetle {
    int a = printInit("HerculesBeetle.a initialized");

    HerculesBeetle() {
        System.out.println("a = " + a);
        System.out.println("j = " + j);
    }

    static int x3 = printInit("static HerculesBeetle.x3 initialized");

    public static void main(String[] args) {
        new HerculesBeetle();
    }
}

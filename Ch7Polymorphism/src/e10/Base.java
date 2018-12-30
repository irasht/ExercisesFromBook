package e10;

public class Base {
    public void method() {
        System.out.println("Base method() calling method1()");
        method1();
    }

    public void method1() {
        System.out.println("Base method1()");
    }
}

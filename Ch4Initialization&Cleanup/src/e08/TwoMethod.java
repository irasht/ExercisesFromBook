package e08;

public class TwoMethod {
    public void method() {
        method1();
        this.method1();
    }

    public void method1() {
        System.out.println("Call method1");
    }

    public static void main(String[] args) {
        new TwoMethod().method();
    }
}

package e13;

public class Outer {
    public AnInterface get() {
        return new AnInterface() {
            @Override
            public void method() {
                System.out.println("Inner.method()");
            }
        };
    }
}

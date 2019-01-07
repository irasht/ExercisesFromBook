package e09;

public class Outer {
    public AnInterface get() {
        class Inner implements AnInterface {
            @Override
            public void method() {
                System.out.println("Inner.method()");
            }
        }
        return new Inner();
    }
}

package e11;

public class Outer {
    private class Inner implements AnInterface {
        @Override
        public void method() {
            System.out.println("Inner.method()");
        }
    }
    public AnInterface get() { return new Inner(); }
    public Inner get2() { return new Inner(); }
}

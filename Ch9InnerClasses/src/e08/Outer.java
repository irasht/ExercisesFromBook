package e08;

public class Outer {
    class Inner {
        private int number;
        private void method() {
            System.out.println("Inner.method called");
            System.out.println("Inner.number = " + number);
        }
    }
    public void testInnerAccess() {
        Inner inner = new Inner();
        inner.number = 5;
        inner.method();
    }
}

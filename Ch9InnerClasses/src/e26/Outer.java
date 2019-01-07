package e26;

public class Outer {
    class Inner {
        int number;

        public Inner() {
            number = 13;
        }

        public Inner(int number) {
            this.number = number;
        }

        public void print() {
            System.out.println("Inner.print()");
        }
    }
}

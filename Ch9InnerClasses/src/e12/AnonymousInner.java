package e12;

public class AnonymousInner {
    private int number = 0;

    private void print() {
        System.out.println("AnonymousInner.print");
    }

    void method() {
        new Object() {
            void anonymousMethod() {
                number++;
                print();
            }
        }.anonymousMethod();
        System.out.println("number = " + number);
    }

    public static void main(String[] args) {
        AnonymousInner inner = new AnonymousInner();
        inner.method();
    }
}

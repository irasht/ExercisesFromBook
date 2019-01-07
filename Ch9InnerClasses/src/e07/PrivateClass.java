package e07;

public class PrivateClass {
    private int number = 0;

    private void print() {
        System.out.println("PrivateClass.print");
    }

    class Inner {
        void printInner() {
            number++;
            print();
        }
    }

    void getInner() {
        Inner inner = new Inner();
        inner.printInner();
        System.out.println("number = " + number);
    }

    public static void main(String[] args) {
        PrivateClass privateClass = new PrivateClass();
        privateClass.getInner();
    }
}

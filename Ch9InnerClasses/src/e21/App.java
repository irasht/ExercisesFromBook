package e21;

interface AnInterface {
    void method();

    void method1();

    class Nested {
        public static void run(AnInterface i) {
            System.out.println("AnInterface.method()");
            i.method();
            System.out.println("AnInterface.method1()");
            i.method1();
        }
    }
}

public class App {
    public static void main(String[] args) {
        AnInterface anI = new AnInterface() {
            @Override
            public void method() {
            }

            @Override
            public void method1() {

            }
        };
        AnInterface.Nested.run(anI);
    }
}

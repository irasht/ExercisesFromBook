package e18;

public class Nested {
    static class NestedClass {
        void method() {
            System.out.println("NestedClass.method()");
        }
    }

    public static void main(String[] args) {
        NestedClass nestedClass = new NestedClass();
        nestedClass.method();
    }
}

class Other {
    void method1() {
        Nested.NestedClass ne = new Nested.NestedClass();
    }
}

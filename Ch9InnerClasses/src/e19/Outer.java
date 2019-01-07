package e19;

class Outer {
    class Inner {
        {
            System.out.println("Inner class");
        }

        class Inner1 {
            void method() {
                System.out.println("Inner1.method()");
            }
        }
        Inner1 getInner1() {
            return new Inner1();
        }
    }

    Inner getInner() {
        return new Inner();
    }

    static class Nested {
        static class Nested1 {
            void methodNest() {
                System.out.println("Nested1.methodNest()");
            }
        }

        void methodNest() {
            System.out.println("Nested.methodNest()");
        }
    }

    public static void main(String[] args) {
        new Outer.Nested().methodNest();
        new Outer.Nested.Nested1().methodNest();
        Outer outer=new Outer();
        Outer.Inner outer1=outer.getInner();
        Outer.Inner.Inner1 o=outer1.getInner1();
        o.method();
    }
}

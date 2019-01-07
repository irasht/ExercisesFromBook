package e01;

class Outer {
    class Inner {
        {
            System.out.println("Inner class");
        }
    }

    Inner getInner() {
        return new Inner();
    }
}

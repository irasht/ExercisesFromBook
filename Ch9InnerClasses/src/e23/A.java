package e23;

class A {
    public U getU() {
        return new U() {
            @Override
            public void method1() {
                System.out.println("A.method1()");
            }

            @Override
            public void method2() {
                System.out.println("A.method2()");
            }

            @Override
            public void method3() {
                System.out.println("A.method3()");
            }
        };
    }
}

package e15;

public class Main {
    static void testInterface1(Interface1 i) {
        i.method1();
        i.methodOne();
    }

    static void testInterface2(Interface2 i) {
        i.method2();
        i.methodTwo();
    }

    static void testInterface3(Interface3 i) {
        i.method3();
        i.methodThree();
    }

    static void testAbstract(Abstract a) {
        a.abstractMethod();
    }

    static void testCombineClass(CombineClass combineClass) {
        combineClass.method1();
        combineClass.methodOne();
        combineClass.method2();
        combineClass.methodTwo();
        combineClass.method3();
        combineClass.methodThree();
        combineClass.inheritInterfaceMethod();
    }

    public static void main(String[] args) {
        CombineClass combineClass = new CombineClass();
        testInterface1(combineClass);
        testInterface2(combineClass);
        testInterface3(combineClass);
        testCombineClass(combineClass);
        testAbstract(combineClass);
    }
}
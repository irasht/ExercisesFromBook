package e14;

public class CombineClass extends Concrete implements InheritInterface {
    public CombineClass() {
        super("CombineClass");
    }

    @Override
    public void inheritInterfaceMethod() {
        System.out.println("CombineClass.inheritInterfaceMethod()");
    }

    @Override
    public void method1() {
        System.out.println("CombineClass.method1()");
    }

    @Override
    public void methodOne() {
        System.out.println("CombineClass.methodOne()");
    }

    @Override
    public void method2() {
        System.out.println("CombineClass.method2()");
    }

    @Override
    public void methodTwo() {
        System.out.println("CombineClass.methodTwo()");
    }

    @Override
    public void method3() {
        System.out.println("CombineClass.method3()");
    }

    @Override
    public void methodThree() {
        System.out.println("CombineClass.methodThree()");
    }
}

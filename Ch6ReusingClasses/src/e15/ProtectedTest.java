package e15;

import e15.protect.ClassWithProtectedMethod;

public class ProtectedTest extends ClassWithProtectedMethod {
    public void method1() {
        System.out.println("Method from ProtectedTest");
        method();
    }
}

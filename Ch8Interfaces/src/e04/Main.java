package e04;

public class Main {
    public static void test1(Base base) {
        ((Derived) base).method();
    }

    public static void test2(BaseWithMethod baseWithMethod) {
        baseWithMethod.method();
    }

    public static void main(String args[]) {
        Base base = new Derived();
        test1(base);
        BaseWithMethod withMethod = new Derived2();
        test2(withMethod);
    }
}
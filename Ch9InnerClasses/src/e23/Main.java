package e23;

public class Main {
    public static void main(String[] args) {
        A[] a = {new A(), new A(), new A(), new A()};
        B b = new B(4);
        for (int i = 0; i < a.length; i++) {
            b.add(a[i].getU());
        }
        b.callMethods();
        System.out.println("-----------");
        b.setNull(2);
        b.callMethods();
    }
}

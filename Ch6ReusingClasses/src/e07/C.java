package e07;

public class C extends A {
    B bClass;

    public C(String string) {
        super(string);
        bClass = new B(string);
    }


    public static void main(String[] args) {
        new C("initialize");
    }
}

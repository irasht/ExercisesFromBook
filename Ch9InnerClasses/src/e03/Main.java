package e03;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer("Inner accessing outer!");
        Outer.Inner inner = outer.getInner();
        System.out.println(inner.toString());
    }
}

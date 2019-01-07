package e01;

public class Main {
    public static void main(String[] args) {
//        Outer outer = new Outer();
        Outer.Inner inner = new Outer().getInner();
    }
}

package e11;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        AnInterface anI = outer.get();
        anI = outer.get2();
        // Don't work - 'Inner' not visible:
        //! Inner i1 = out.get2();
        //! Inner i2 = (Inner)si;
    }
}
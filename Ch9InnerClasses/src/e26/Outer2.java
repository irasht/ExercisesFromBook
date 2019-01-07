package e26;

public class Outer2 {
    class Inner2 extends Outer.Inner {
        // Won't compile -- Outer not available:
        //! public Inner2(int i) {
        //! super(i); }
        public Inner2(Outer o, int numb) {
            o.super(numb);
        }

        @Override
        public void print() {
            System.out.println("Inner2.print()");
            super.print();
        }
    }

    public static void main(String args[]) {
        Outer outer = new Outer();
        Outer2 outer2 = new Outer2();
        Inner2 i2 = outer2.new Inner2(outer, 15);
        i2.print();
    }
}


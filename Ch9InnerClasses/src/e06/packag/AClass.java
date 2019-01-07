package e06.packag;

import e06.pack.AnInterface;

public class AClass {
    protected class Inner implements AnInterface {
        public Inner() {
        }

        @Override
        public void method() {
            System.out.println("Inner.method()");
        }
    }
}

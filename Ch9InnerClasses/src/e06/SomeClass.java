package e06;

import e06.pack.AnInterface;
import e06.packag.AClass;

public class SomeClass extends AClass {
    public AnInterface get(){
        return new Inner();
    }
    public static void main(String args[]) {
        new SomeClass().get().method();
    }
}

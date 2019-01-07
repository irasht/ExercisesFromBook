package e05;

import e05.com.AInterface;

public class AClass implements AInterface {

    @Override
    public void add() {
        System.out.println("add()");
    }

    @Override
    public void delete() {
        System.out.println("delete()");
    }

    @Override
    public void print() {
        System.out.println("print()");
    }
}

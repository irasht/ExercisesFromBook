package e04;

public class Rhombus extends Shape {
    @Override
    public void draw() {
        System.out.println("Rhombus.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Rhombus.erase()");
    }

    @Override
    public void doSomething() {
        System.out.println("Rhombus.doSomething()");
    }
}

package e12;

public class Mouse extends Rodent {
    Animal animal = new Animal("m1");
    Animal animal2 = new Animal("m2");

    public Mouse() {
        System.out.println("Mouse constructor");
    }

    @Override
    public void eat() {
        System.out.println("Mouse eating");
    }

    @Override
    public void run() {
        System.out.println("Mouse running");
    }

    @Override
    public void reproduce() {
        System.out.println("Making more Mice");
    }

    @Override
    public String toString() {
        return "Mouse";
    }
}

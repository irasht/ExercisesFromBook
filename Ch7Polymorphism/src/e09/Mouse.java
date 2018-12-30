package e09;

public class Mouse extends Rodent {
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

package e14;

public class Rodent {
    private Shared shared;
    Animal animal = new Animal("r1");
    Animal animal2 = new Animal("r2");

    public Rodent(Shared s) {
        System.out.println("Rodent constructor");
        shared = s;
        shared.addReference();
    }

    public void eat() {
        System.out.println("Rodent eating");
    }

    public void run() {
        System.out.println("Rodent running");
    }

    public void reproduce() {
        System.out.println("Making more Rodents");
    }

    protected void dispose() {
        System.out.println("Disposing " + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Rodent";
    }
}

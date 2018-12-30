package e12;

public class Rodent {
    Animal animal = new Animal("r1");
    Animal animal2 = new Animal("r2");

    public Rodent() {
        System.out.println("Rodent constructor");
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

    @Override
    public String toString() {
        return "Rodent";
    }
}

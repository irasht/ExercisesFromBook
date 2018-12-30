package e12;

public class Gerbil extends Rodent {
    Animal animal = new Animal("g1");
    Animal animal2 = new Animal("g2");

    public Gerbil() {
        System.out.println("Gerbil constructor");
    }

    @Override
    public void eat() {
        System.out.println("Gerbil eating");
    }

    @Override
    public void run() {
        System.out.println("Gerbil running");
    }

    @Override
    public void reproduce() {
        System.out.println("Making more Gerbils");
    }

    @Override
    public String toString() {
        return "Gerbil";
    }
}

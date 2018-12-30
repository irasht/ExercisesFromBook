package e12;

public class Hamster extends Rodent {
    Animal animal = new Animal("h1");
    Animal animal2 = new Animal("h2");

    public Hamster() {
        System.out.println("Hamster constructor");
    }
    @Override
    public void eat() {
        System.out.println("Hamster eating");
    }

    @Override
    public void run() {
        System.out.println("Hamster running");
    }

    @Override
    public void reproduce() {
        System.out.println("Making more Hamsters");
    }

    @Override
    public String toString() {
        return "Hamster";
    }
}

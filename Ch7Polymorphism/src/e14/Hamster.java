package e14;

public class Hamster extends Rodent {
    private Shared shared;
    Animal animal = new Animal("h1");
    Animal animal2 = new Animal("h2");

    public Hamster(Shared shared) {
        super(shared);
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

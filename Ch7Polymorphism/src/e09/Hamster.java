package e09;

public class Hamster extends Rodent {
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

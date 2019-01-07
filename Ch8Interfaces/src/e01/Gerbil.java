package e01;

public class Gerbil extends Rodent {
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
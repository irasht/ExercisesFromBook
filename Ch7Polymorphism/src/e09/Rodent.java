package e09;

public class Rodent {
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

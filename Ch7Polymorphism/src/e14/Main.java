package e14;

public class Main {

    public static void main(String[] args) {
        Shared shared = new Shared();
        Rodent[] rodents = {
                new Hamster(shared),
                new Gerbil(shared),
                new Mouse(shared)
        };
        for (Rodent rodent : rodents) {
            System.out.println(rodent);
            rodent.dispose();

        }
    }
}

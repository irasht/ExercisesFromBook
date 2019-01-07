package e07;

public class Main {
    public static void main(String[] args) {
        Rodent[] rodents = {
                new Mouse(),
                new Hamster(),
                new Gerbil()
        };
        for (Rodent rodent : rodents) {
            System.out.println(rodent);
            rodent.eat();
            rodent.run();
            rodent.reproduce();

        }
    }
}
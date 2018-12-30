package e16;

public class Main {

    public static void main(String[] args) {
        Starship starship = new Starship();
        System.out.println(starship);
        starship.setStatus(new YellowAlert());
        System.out.println(starship);
        starship.setStatus(new RedAlert());
        System.out.println(starship);
    }
}

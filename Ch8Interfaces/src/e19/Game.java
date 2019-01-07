package e19;

public class Game {
    public static void play(TossingFactory factory) {
        Tossing tossing = factory.getTossing();
        while (tossing.event()) ;
    }

    public static void main(String[] args) {
        play(new CoinTossingFactory());
        play(new DiceTossingFactory());
    }
}
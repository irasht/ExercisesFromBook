package e17;

public class Game {
    public static void play(TossingFactory factory) {
        Tossing tossing = factory.getTossing();
        while (tossing.event()) ;
    }

    public static void main(String[] args) {
        play(CoinTossing.factory);
        play(DiceTossing.factory);
    }
}
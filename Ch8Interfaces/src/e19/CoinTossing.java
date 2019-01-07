package e19;

public class CoinTossing implements Tossing {
    private int events;
    private static final int EVENTS = 2;

    @Override
    public boolean event() {
        System.out.println("Coin tossing " + events);
        return ++events != EVENTS;
    }
}

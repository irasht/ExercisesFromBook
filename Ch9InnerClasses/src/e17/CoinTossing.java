package e17;

public class CoinTossing implements Tossing {
    private int events;
    private static final int EVENTS = 2;

    @Override
    public boolean event() {
        System.out.println("Coin tossing " + events);
        return ++events != EVENTS;
    }

    public static TossingFactory factory = new TossingFactory() {
        @Override
        public CoinTossing getTossing() {
            return new CoinTossing();
        }
    };
}

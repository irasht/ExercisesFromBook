package e19;

public class CoinTossingFactory implements TossingFactory{
    @Override
    public Tossing getTossing() {
        return new CoinTossing();
    }
}

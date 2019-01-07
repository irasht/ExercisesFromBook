package e19;

public class DiceTossingFactory implements TossingFactory {
    @Override
    public Tossing getTossing() {
        return new DiceTossing();
    }
}

package e17;

public class DiceTossing implements Tossing{
    private int events;
    private static final int EVENTS = 6;
    @Override
    public boolean event() {
        System.out.println("Dice tossing " + events);
        return ++events != EVENTS;
    }
    public static TossingFactory factory=new TossingFactory() {
        @Override
        public DiceTossing getTossing() {
            return new DiceTossing();
        }
    };
}

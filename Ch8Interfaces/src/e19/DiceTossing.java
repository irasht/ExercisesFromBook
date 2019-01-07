package e19;

public class DiceTossing implements Tossing{
    private int events;
    private static final int EVENTS = 6;
    @Override
    public boolean event() {
        System.out.println("Dice tossing " + events);
        return ++events != EVENTS;
    }
}

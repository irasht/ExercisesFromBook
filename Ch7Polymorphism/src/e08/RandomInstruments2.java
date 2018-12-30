package e08;

import java.util.Random;

public class RandomInstruments2 {
    Random random = new Random();
    Class<?> instruments[] = {
            Wind.class,
            Percussion.class,
            Stringed.class,
            Brass.class,
            Woodwind.class,
            Pincers.class,
    };

    public Instrument next() {
        try {
            int idx = Math.abs(random.nextInt(instruments.length));
            return (Instrument) instruments[idx].newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Cannot Create", e);
        }
    }
}

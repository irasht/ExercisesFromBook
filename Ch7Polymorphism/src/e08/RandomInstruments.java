package e08;

import java.util.Random;

public class RandomInstruments {
    Random random = new Random();

    public Instrument next() {
        switch (random.nextInt(6)) {
            default:
            case 0:
                return new Wind();
            case 1:
                return new Percussion();
            case 2:
                return new Stringed();
            case 3:
                return new Brass();
            case 4:
                return new Woodwind();
            case 5:
                return new Pincers();
        }
    }
}

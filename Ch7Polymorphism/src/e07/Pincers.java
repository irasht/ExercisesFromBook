package e07;

public class Pincers extends Instrument {

    void play(Note n) {
        System.out.println("Pincers.play() " + n);
    }

    void adjust() {
        System.out.println("Adjusting Pincers");
    }

    @Override
    public String toString() {
        return "Pincers";
    }
}

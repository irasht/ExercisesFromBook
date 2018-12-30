package e07;

public class Main {
    static Instrument[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind(),
            new Pincers()
    };

    public static void main(String args[]) {
        for (Instrument instrument : orchestra) {
            instrument.play(Note.B_FLAT);
            instrument.adjust();
            System.out.println(instrument);
        }
    }
}

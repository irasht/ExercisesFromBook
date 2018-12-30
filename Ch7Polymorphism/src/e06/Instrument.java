package e06;

class Instrument {
    void play(Note n) {
        System.out.println("Instrument.play() " + n);
    }

    @Override
    public String toString() {
        return "Instrument{}";
    }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }
}
package e08;

import e07.Note;

class Instrument {
    void play(Note n) {
        System.out.println("Instrument.play() " + n);
    }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }

    @Override
    public String toString() {
        return "Instrument";
    }
}
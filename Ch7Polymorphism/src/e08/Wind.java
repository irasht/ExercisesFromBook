package e08;

import e07.Note;

class Wind extends Instrument {

    void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    void adjust() {
        System.out.println("Adjusting Wind");
    }

    @Override
    public String toString() {
        return "Wind";
    }
}
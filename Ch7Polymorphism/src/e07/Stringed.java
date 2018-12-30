package e07;

class Stringed extends Instrument {

    void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    void adjust() {
        System.out.println("Adjusting Stringed");
    }

    @Override
    public String toString() {
        return "Stringed";
    }
}
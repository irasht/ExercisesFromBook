package e10;

class Wind implements Instrument, Playable {
    @Override
    public void adjust() {
        System.out.println(this + ".adjust() ");
    }

    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    public String toString() {
        return "Wind";
    }
}
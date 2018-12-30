package e07;

class Brass extends Wind {
    void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    void adjust() {
        System.out.println("Adjusting Brass");
    }

    @Override
    public String toString() {
        return "Brass";
    }
}
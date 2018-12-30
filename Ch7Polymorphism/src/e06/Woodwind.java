package e06;

class Woodwind extends Wind {
    void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    String what() {
        return "Woodwind";
    }

    @Override
    public String toString() {
        return "Woodwind{}";
    }
}
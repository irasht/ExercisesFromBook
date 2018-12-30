package e06;

public class Main {
    static Instrument[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind()
    };

    public static void printAll(Instrument[] orch) {
        for (Instrument i : orch)
            System.out.println(i);
    }

    public static void main(String args[]) {
        printAll(orchestra);
    }
}

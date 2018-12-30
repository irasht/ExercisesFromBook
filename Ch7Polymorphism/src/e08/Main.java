package e08;

public class Main {
    public static void main(String args[]) {
        RandomInstruments random1 = new RandomInstruments();
        for (int i = 0; i < 12; i++) {
            System.out.println(random1.next());
        }
        System.out.println("--Second variant--");
        RandomInstruments2 random2 = new RandomInstruments2();
        for (int i = 0; i < 12; i++) {
            System.out.println(random2.next());
        }
    }
}

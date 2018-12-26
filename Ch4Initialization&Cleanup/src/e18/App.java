package e18;

public class App {
    public static void main(String args[]) {
        Run[] array = new Run[3];
        for (int i = 0; i < array.length; i++)
            array[i] = new Run(i + ";");
    }
}

class Run {
    Run(String st) {
        System.out.println("String constructor; st = " + st);
    }
}
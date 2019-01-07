package e10;

public class Main {
    public static void main(String[] args) {
        AnInterface anInterface = new Outer().get();
        anInterface.method();
    }
}
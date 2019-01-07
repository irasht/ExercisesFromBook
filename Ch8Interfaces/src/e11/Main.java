package e11;

public class Main {
    public static void main(String[] args) {
        Apply.process(new Adapter(), "waterfall");
        Apply.process(new Adapter(), "reactor");
    }
}

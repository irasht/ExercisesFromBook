package e01;

public class App {
    Simple simple;
    String string;

    public App(String string) {
        this.string = string;
    }

    private Simple initializeSimple() {
        if (simple == null) {
            System.out.println("not initialized");
            System.out.println("Creating Simple/ lazy");
            simple = new Simple(string);
        }
        return simple;
    }

    public Simple getSimple() {
        return initializeSimple();
    }

    public void setSimple(String str) {
        initializeSimple().setString(str);
    }

    @Override
    public String toString() {
        return initializeSimple().toString();
    }
}

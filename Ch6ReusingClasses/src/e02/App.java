package e02;

public class App extends Detergent {
    public void scrub() {
        append(" App.scrub()");
        super.scrub();
    }

    public void sterilize() {
        append(" sterilize()");
    }

    public static void main(String[] args) {
        App app = new App();
        app.dilute();
        app.scrub();
        app.sterilize();
        System.out.println(app);
    }
}

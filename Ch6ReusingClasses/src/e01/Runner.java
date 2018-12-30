package e01;

public class Runner {
    public static void main(String[] args) {
        App app = new App("App string");
        System.out.println(app.getSimple());
        System.out.println(app.toString());
        app.setSimple("New String Simple");
        System.out.println(app);
    }
}

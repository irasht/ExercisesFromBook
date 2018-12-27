package e08.connection;

public class Connection {
    private static int counter = 1;
    private int id = counter++;

    Connection() {
    }

    public String toString() {
        return "Connection " + id;
    }

    public void doMethod() {
        System.out.print("* ");
    }
}
package e08.connection;

public class ConnectionManager {
    private static Connection[] connections = new Connection[5];
    private static int counter = 0;

    static {
        for (int i = 0; i < connections.length; i++)
            connections[i] = new Connection();
    }

    public static Connection getConnection() {
        if (counter < connections.length)
            return connections[counter++];
        return null;
    }
}
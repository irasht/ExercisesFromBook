package e08;

import e08.connection.*;

public class ConnectionRunner {
    public static void main(String args[]) {
        Connection connection = ConnectionManager.getConnection();
        while (connection != null) {
            connection.doMethod();
            System.out.println(connection);
            connection = ConnectionManager.getConnection();
        }
    }
}

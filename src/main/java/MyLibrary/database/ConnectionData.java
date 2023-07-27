package MyLibrary.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionData {
    Statement stm;
    public Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mylibrary", "root", "");
            Statement stm = connection.createStatement();
            System.out.println("Success");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
}

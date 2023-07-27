package MyLibrary;

import MyLibrary.database.ConnectionData;
import MyLibrary.interfaces.Menu;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        ConnectionData connection = new ConnectionData();
        Menu menu = new Menu();
        menu.menuApp();
        try (Connection connect = connection.getConnection()) {

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

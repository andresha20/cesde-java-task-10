package MyLibrary.database;

import MyLibrary.models.UserModel;

import java.sql.Connection;
import java.sql.PreparedStatement;

public interface CustomerDAO {
    // Data access object
    public static void createCustomerDB(UserModel object) {
        ConnectionData connection = new ConnectionData();
        try(Connection connect = connection.getConnection()) {
            PreparedStatement statement = null;
            String query = "INSERT INTO user (doc_id, doc_type, name, lastname, email, class)VALUES(?, ?, ?, ?, ?, ?)";
            statement = connect.prepareStatement(query);
            statement.setInt(1, object.getDoc_id());
            statement.setInt(2, object.getDoc_type());
            statement.setString(3, object.getName());
            statement.setString(4, object.getSurname());
            statement.setString(5, object.getEmail());
            statement.setString(6, object.getProgram());
            statement.executeUpdate();
            System.out.println("Successful registry");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void getCustomerDB() {

    }

    public static void updateCustomerDB() {

    }

    public static void deleteCustomerDB() {

    }
}

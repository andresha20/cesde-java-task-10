package MyLibrary.database;

import MyLibrary.models.UserModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public interface CustomerDAO {
    // Data access object
    public static void createCustomerDB(UserModel object) {
        ConnectionData connection = new ConnectionData();
        try(Connection connect = connection.getConnection()) {
            PreparedStatement statement = null;
            String query = "INSERT INTO user (doc_id, doc_type, name, lastname, email, program)VALUES(?, ?, ?, ?, ?, ?)";
            statement = connect.prepareStatement(query);
            statement.setInt(1, object.getDoc_id());
            statement.setString(2, object.getDoc_type());
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
        ConnectionData connection = new ConnectionData();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try(Connection connect = connection.getConnection()) {
            String query = "SELECT * FROM user";
            statement = connect.prepareStatement(query);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.println("ID " + resultSet.getInt("doc_id"));
                System.out.println("Type " + resultSet.getString("doc_type"));
                System.out.println("Name " + resultSet.getString("name"));
                System.out.println("Lastname " + resultSet.getString("lastname"));
                System.out.println("Email " + resultSet.getString("email"));
                System.out.println("Program " + resultSet.getString("program"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void updateCustomerDB() {

    }

    public static void deleteCustomerDB() {

    }
}

package MyLibrary.database;

import MyLibrary.models.UserModel;

import java.util.Scanner;

public class CustomerService {
    static Scanner parser = new Scanner(System.in);
    public static void createCustomer() {
        System.out.println("ID");
        int id = parser.nextInt();
        System.out.println("Doc type");
        String doc_type = parser.next();
        System.out.println("Name");
        String name = parser.next();
        System.out.println("Surname");
        String surname = parser.next();
        System.out.println("Email");
        String email = parser.next();
        System.out.println("Program");
        String program = parser.next();

        UserModel user = new UserModel();
        user.setDoc_id(id);
        user.setDoc_type(doc_type);
        user.setName(name);
        user.setSurname(surname);
        user.setEmail(email);
        user.setProgram(program);
        CustomerDAO.createCustomerDB(user);
    }

    public static void getCustomer() {
        CustomerDAO.getCustomerDB();
    }

    public static void updateCustomer() {

    }

    public static void deleteCustomer() {

    }
}

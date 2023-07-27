package MyLibrary.interfaces;

import MyLibrary.database.CustomerService;

import java.util.Scanner;

public class Menu {

    CustomerService customerService = new CustomerService();
    public void menuApp() {
        int option;
        try (Scanner parser = new Scanner(System.in)) {
            do {
                System.out.println("Insert an option: 1. Register | 2. List users | 3. Update user data | 4. Delete user data | 5. Exit");
                option = parser.nextInt();
                switch(option) {
                    case 1:
                        System.out.println("Register user");
                        customerService.createCustomer();
                        break;
                    case 2:
                        System.out.println("User list");
                        break;
                    case 3:
                        System.out.println("Update user data");
                        break;
                    case 4:
                        System.out.println("Delete user data");
                        break;
                    default:
                        System.out.println("Invalid option");
                        System.exit(-1);
                        break;
                }
            } while (option != 5);
        }

    }
}

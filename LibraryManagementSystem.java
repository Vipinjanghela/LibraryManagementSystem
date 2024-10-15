import java.util.Scanner;

public class LibraryManagementSystem {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\nDigital Library Management System");
                System.out.println("1. Admin Login");
                System.out.println("2. User Login");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");

                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                switch (choice) {
                    case 1:
                        adminLogin(scanner);
                        break;
                    case 2:
                        userLogin(scanner);
                        break;
                    case 3:
                        System.out.println("Exiting the system. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 3);
        }

        private static void adminLogin(Scanner scanner) {
            // Implement admin login logic
            System.out.println("Admin Login");
            // ...
        }

        private static void userLogin(Scanner scanner) {
            // Implement user login logic
            System.out.println("User Login");
            // ...
        }
    }


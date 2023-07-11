
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Display Employees");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter employee name: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.print("Enter employee ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter employee salary: ");
                    double salary = scanner.nextDouble();
                    Employee employee = new Employee(name, id, salary);
                    ems.addEmployee(employee);
                    break;
                case 2:
                    System.out.print("Enter employee ID to remove: ");
                    int removeId = scanner.nextInt();
                    ems.removeEmployee(removeId);
                    break;
                case 3:
                    ems.displayEmployees();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

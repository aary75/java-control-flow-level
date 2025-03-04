import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Get the salary and years of service from the user
        System.out.print("Enter the employee's salary: ");
        double salary = scanner.nextDouble();
        
        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = scanner.nextInt();

        // Calculate bonus if years of service is more than 5
        double bonus = 0.0;
        if (yearsOfService > 5) {
            bonus = salary * 0.05;  // 5% bonus
        }

        // Print the bonus amount
        if (bonus > 0) {
            System.out.println("The employee's bonus is: " + bonus);
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }

        
    }
}

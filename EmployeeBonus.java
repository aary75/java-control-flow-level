import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the salary and years of service
        System.out.print("Enter the salary of the employee: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter the years of service: ");
        int yearsOfService = scanner.nextInt();

        // Check if the years of service is more than 5 years
        if (yearsOfService > 5) {
            // Calculate the bonus as 5% of the salary
            double bonus = salary * 0.05;
            System.out.println("The bonus is: " + bonus);
        } else {
            System.out.println("No bonus for employees with 5 years or less of service.");
        }

    }
}

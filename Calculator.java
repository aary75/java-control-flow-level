import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create variables
        double first, second;
        String op;

        // Create Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Get input for first number, second number, and operator
        System.out.print("Enter the first number: ");
        first = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        second = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        op = scanner.next();

        // Run a loop for a fixed number of times (example: loop from 1 to 1)
        for (int i = 1; i < 2; i++) {  // i < 2, so it runs only once
            // Perform operations based on operator using switch-case
            switch (op) {
                case "+":
                    System.out.println("Result: " + (first + second));
                    break;
                case "-":
                    System.out.println("Result: " + (first - second));
                    break;
                case "*":
                    System.out.println("Result: " + (first * second));
                    break;
                case "/":
                    // Handle division by zero
                    if (second != 0) {
                        System.out.println("Result: " + (first / second));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    // Handle invalid operator
                    System.out.println("Invalid Operator");
            }
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

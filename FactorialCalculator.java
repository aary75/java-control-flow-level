import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the integer input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the user entered a positive integer
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
            return;  // Exit if the number is negative
        }

        // Initialize the variable to store the factorial result
        long factorial = 1;

        // Use a while loop to compute the factorial
        int i = 1;
        while (i <= number) {
            factorial *= i;  // Multiply the current value of factorial by i
            i++;  // Increment i to move to the next number
        }

        // Display the computed factorial
        System.out.println("The factorial of " + number + " is: " + factorial);

    }
}

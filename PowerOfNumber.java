import java.util.Scanner;

public class PowerOfNumber {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Get the base number and the power (exponent) from the user
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the power (exponent): ");
        int power = scanner.nextInt();

        // Check if the power is a positive integer
        if (power < 0) {
            System.out.println("Please enter a positive integer for the power.");
        } else {
            // Initialize the result to 1 (since any number raised to the power of 0 is 1)
            int result = 1;

            // Loop to multiply the result by the number, power times
            for (int i = 1; i <= power; i++) {
                result *= number;
            }

            // Output the result
            System.out.println(number + " raised to the power of " + power + " is: " + result);
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

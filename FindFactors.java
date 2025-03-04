import java.util.Scanner;

public class FindFactors {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a positive integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");

            // Loop through numbers from 1 to the number
            for (int i = 1; i <= number; i++) {
                // If the number is divisible by i, i is a factor
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

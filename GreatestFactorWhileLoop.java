import java.util.Scanner;

public class GreatestFactorWhileLoop {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input an integer number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a valid positive integer.");
        } else {
            // Define a variable to store the greatest factor
            int greatestFactor = 1;

            // Loop from number - 1 down to 1
            int i = number - 1;
            while ( i >= 1 ) {
                // Check if the number is divisible by i
                if (number % i == 0) {
                    greatestFactor = i;
                    break; // Exit the loop as we found the greatest factor
                }
             i--;
            }

            // Output the greatest factor
            System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);
        }

      
    }
}

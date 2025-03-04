import java.util.Scanner;

public class MultiplesBelow100 {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Enter a positive integer less than 100: ");
        int number = scanner.nextInt();

        // Check if the number is positive and less than 100
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            // Initialize the counter starting from number - 1
            int counter = 100;

            // Print the multiples of the given number less than 100
            System.out.println("Multiples of " + number + " below 100 are:");

            // Use while loop to find multiples of the number below 100
            while (counter > 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--; // Decrease counter to move towards 1
            }
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}


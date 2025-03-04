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
            System.out.println("Please enter a positive integer that is less than 100.");
        } else {
            // Loop from 100 down to 1
            System.out.println("Multiples of " + number + " below 100 are:");

            for (int i = 100; i >= 1; i--) {
                // If i is divisible by the number, print it
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

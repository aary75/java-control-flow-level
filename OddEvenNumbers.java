import java.util.Scanner;

public class OddEvenNumbers {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        // Check if the number is a positive integer (natural number)
        if (number <= 0) {
            System.out.println("Please enter a valid natural number (positive integer).");
            return;  // Exit if the number is not a valid natural number
        }

        // Loop from 1 to the number entered by the user
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                // If the number is divisible by 2, it's even
                System.out.println(i + " is an even number.");
            } else {
                // If the number is not divisible by 2, it's odd
                System.out.println(i + " is an odd number.");
            }
        }

        
    }
}

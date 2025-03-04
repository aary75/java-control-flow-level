import java.util.Scanner;

public class SumUntilZeroOrNegative {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Initialize total as a int variable and set it to 0
        int total = 0;

        // Start an infinite loop
        while (true) {
            // Ask the user to enter a number
            System.out.print("Enter a number (or 0 or a negative number to stop): ");
            double number = scanner.nextInt();
            
            // If the entered number is 0 or negative, break the loop
            if (number <= 0) {
                break;
            }
            
            // Add the entered number to the total sum
            total += number;
        }

        // Display the total sum after exiting the loop
        System.out.println("The total sum is: " + total);

    }
}

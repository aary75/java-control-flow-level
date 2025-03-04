import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Initialize total as a int variable and set it to 0
        int total = 0;
        
        // Create a variable to store the user input
        int number;

        // Use a while loop to keep asking for numbers until the user enters 0
        do {
            System.out.print("Enter a number (or 0 to stop): ");
            number = scanner.nextInt();
            
            // If the number is not 0, add it to the total
            if (number != 0) {
                total += number;
            }

        } while (number != 0);  // Loop continues as long as the entered number is not 0

        // Display the total sum after exiting the loop
        System.out.println("The total sum is: " + total);

        
    }
}

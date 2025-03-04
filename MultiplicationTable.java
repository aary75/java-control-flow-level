import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Use a for loop to print the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            // Print the multiplication result in the format: number * i = result
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

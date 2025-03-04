import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the number to generate multiplication table
        System.out.print("Enter a number to find its multiplication table from 6 to 9: ");
        int number = scanner.nextInt();

        // Loop through values 6 to 9 to print the multiplication table
        for (int i = 6; i <= 9; i++) {
            // Print the multiplication result
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

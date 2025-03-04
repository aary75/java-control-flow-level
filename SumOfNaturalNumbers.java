import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask for user input for the number n
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if the input number is a valid natural number (positive integer)
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (positive integer).");
            return;  // Exit if the number is not a natural number
        }

        // Compute the sum using the while loop
        int sumUsingWhileLoop = 0;
        int i = 1;
        while (i <= n) {
            sumUsingWhileLoop += i;
            i++;
        }

        // Compute the sum using the formula n * (n + 1) / 2
        int sumUsingFormula = n * (n + 1) / 2;

        // Compare the results
        System.out.println("Sum using while loop: " + sumUsingWhileLoop);
        System.out.println("Sum using formula: " + sumUsingFormula);

        // Check if the results are the same
        if (sumUsingWhileLoop == sumUsingFormula) {
            System.out.println("The results match, the computations are correct.");
        } else {
            System.out.println("There is an error in the computations.");
        }

        
    }
}

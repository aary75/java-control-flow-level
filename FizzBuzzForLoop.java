import java.util.Scanner;

public class FizzBuzzForLoop {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Loop through numbers from 1 to the input number
            int i = 1;
            while (i <= number) {
                // If the number is divisible by both 3 and 5, print "FizzBuzz"
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // If the number is divisible by 3, print "Fizz"
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // If the number is divisible by 5, print "Buzz"
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Otherwise, print the number
                else {
                    System.out.println(i);
                }
             i++;
            }
        }

    }
}

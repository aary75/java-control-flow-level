// Creating the clss LargestNumberCheck to check which number is largest
import java.util.Scanner;

public class LargestNumberCheck {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the three numbers
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int number3 = scanner.nextInt();

        // Check and display which number is the largest
        System.out.println("Is the first number the largest? " + (number1 >= number2 && number1 >= number3));
        System.out.println("Is the second number the largest? " + (number2 >= number1 && number2 >= number3));
        System.out.println("Is the third number the largest? " + (number3 >= number1 && number3 >= number2));

        // Close the scanner to avoid memory leak
        scanner.close();
    }
}

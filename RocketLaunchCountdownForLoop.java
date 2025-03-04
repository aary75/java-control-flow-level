import java.util.Scanner;

public class RocketLaunchCountdownForLoop {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the user input for the countdown start value
        System.out.print("Enter the starting countdown value: ");
        int counter = scanner.nextInt();

        // Use a for loop to countdown from the input value to 1
        for(int i = counter; i>=1;i--) {
            System.out.println(i);  // Print the current value of the i
          
        }

        // Print a message when the countdown is finished
        System.out.println("Rocket launched!");

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

import java.util.Scanner;

public class RocketLaunchCountdown {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the user input for the countdown start value
        System.out.print("Enter the starting countdown value: ");
        int counter = scanner.nextInt();

        // Use a while loop to countdown from the input value to 1
        while (counter >= 1) {
            System.out.println(counter);  // Print the current value of the counter
            counter--;  // Decrement the counter by 1
        }

        // Print a message when the countdown is finished
        System.out.println("Rocket launched!");

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}


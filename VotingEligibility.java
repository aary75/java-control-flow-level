//Creating the votingEligibility class to check which person can vote or not
import java.util.Scanner;

public class VotingEligibility {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get the age input from the user
        System.out.print("Enter the person's age: ");
        int age = scanner.nextInt();

        // Check if the age is 18 or older
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

      
    }
}

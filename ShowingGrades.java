// Creating a ShowingGrades class to show the grades of a student
import java.util.Scanner;

public class ShowingGrades {
     public static void main(String[] args){
        // Creating a scanner class to get input from user
        Scanner scanner = new Scanner(System.in);

        // Getting the marks 
        System.out.print("Enter physics marks: ");
        int physicsMarks = scanner.nextInt();

        System.out.print("Enter chemistry marks: ");
        int chemistryMarks = scanner.nextInt();

        System.out.print("Enter math marks:; ");
        int mathMarks = scanner.nextInt();
        
        // Calculate the average marks
        int averageMarks = (physicsMarks + chemistryMarks + mathMarks) / 3;

        // Printing the average marks
        System.out.println(averageMarks);

        // Checking what grades achieved by student
        if( averageMarks >= 80 ){
            System.out.print("Level 4, above agency-normalized standards");
        }

        else if( averageMarks >= 70 && averageMarks <=79 ) {
            System.out.print("Level 3, at above agency-normalized standards");
        }

        else if( averageMarks >= 60 && averageMarks <= 69 ) {
            System.out.print("Level 2, below but approaching agency-normalized standards");
        }

        else if( averageMarks >= 50 && averageMarks <= 59 ) {
             System.out.print("Level 1, well below agency-normalized standards");
        }

        else if( averageMarks >= 40 && averageMarks <= 49 ) {
              System.out.print("Level 1-, too below agency-normalized standards");
        }

        else {
           System.out.print("Remedial Standards");
        }
}}

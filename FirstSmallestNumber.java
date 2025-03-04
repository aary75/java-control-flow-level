// Creating the class FirstSmallestNumber to check the first number is smallest or not
import java.util.Scanner;

public class FirstSmallestNumber{
     public static void main(String[] args){
         // Creating the scanner class to get ihe input
         Scanner scanner = new Scanner(System.in);

         // Getting 3 input values for numbers
         int number1 = scanner.nextInt();
         int number2 = scanner.nextInt();
         int number3 = scanner.nextInt();

        // Check that the first number is smallest or not and printing the answer
        if(number1 <= number2 && number1 < number3){
            System.out.print("Is the first number the smallest " + "Yes");
        }
        else{
             System.out.print("Is the first number was smallest " +"No");
        }
}}

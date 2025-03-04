//Creating a class CountTheDigits to calculate number of digits in an integer
import java.util.Scanner;

public class CountTheDigits{
     public static void main(String[] args){
         // Creating a scanner class to get user's input
         Scanner scanner = new Scanner(System.in);

         // Creating a variable to get user's input
         System.out.print("Enter the number: ");
         int number = scanner.nextInt();
         
        
         // Creating a variable count and value is 0
         int count = 0;

         // counting of all digits 
         while(number > 0) {
            int digit = number % 10;

            count++;

           number /= 10;
        }

       // Printing the number of digits in an integer
       System.out.print("The number of digits is: " + Ycount);
}}

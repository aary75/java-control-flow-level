//Creating a class ArmstrongNumber to check a number is armstrong or not
import java.util.Scanner;

public class ArmstrongNumber{
     public static void main(String[] args){
         // Creating a scanner class to get user's input
         Scanner scanner = new Scanner(System.in);

         // Creating a variable to get user's input
         System.out.print("Enter the number: ");
         int number = scanner.nextInt();
         
         // Creating a variable duplicate to get a copy of number
         int duplicate = number;
 
         // Creating a variable sum and value is 0
         int sum = 0;

         // summation of all digits with their cubes
         while(number > 0) {
            int digit = number % 10;

            sum += Math.pow(digit,3);

           number /= 10;
        }

       // Checking the number is armstrong or not
       if(sum == duplicate) {
          System.out.print("This is an armstrong number");
       }
       else {
           System.out.print("This is not an armstrong number");
       }
}}

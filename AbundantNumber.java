//Creating a class AbundantNumber to check a number is abundant or not
import java.util.Scanner;

public class AbundantNumber{
     public static void main(String[] args){
         // Creating a scanner class to get user's input
         Scanner scanner = new Scanner(System.in);

         // Creating a variable to get user's input
         System.out.print("Enter the number: ");
         int number = scanner.nextInt();
         
 
         // Creating a variable sum and value is 0
         int sum = 0;

         for(int i = 1;i<= number/2;i++){
            if(number % i == 0) sum += i;
         }


       // Checking the number is abundant or not
       if(sum > number) {
          System.out.print("This is an abundant number");
       }
       else {
           System.out.print("This is not an abundant number");
       }
}}

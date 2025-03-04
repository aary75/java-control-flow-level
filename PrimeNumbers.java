// Creating a PrimeNumbers class to find the prime numbers
import java.util.Scanner;

public class PrimeNumbers {
     public static void main(String[] args){
        // Creating a scanner class to get user's input
        Scanner scanner = new Scanner(System.in);

        // Creating a variable number to get input from user
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        // Creating a variable count as a mark
        int count = 1;
        
        // Checking the number is prime or not
        for(int i = 2;i< number - 1; i++) {
           if(number % i == 0) {
              count++;
 
           }
        }
 
        // Printing the answer that number is prime or not
        if(count == 1){
           System.out.print("This is a prime number");
        }
        else{
           System.out.print("This is not a prime number");
        }
}}

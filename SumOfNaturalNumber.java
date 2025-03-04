// Creating the class SumOfNaturalNumber to find the sum of natural numbers
import java.util.Scanner;

public class SumOfNaturalNumber{
    public static void main(String[] args){
       // Create scanner class to get input
       Scanner scanner = new Scanner(System.in);
       
//     Creating the print statement for input
       System.out.print("The number is ");

       // creating the variable number to get the input
       int number = scanner.nextInt();
       
       // Creating the variable sumOfNumber to get the sum of natural numbers
       int sumOfNumber = (number * (number + 1)) / 2;
 
       // Priting the sum of natural numbers
       System.out.print("The sum of " + number + " natural numbers is " + sumOfNumber);
}}

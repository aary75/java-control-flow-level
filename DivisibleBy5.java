// Creating the class DivisibleBy5 to find the number is divisible by 5 or not
import java.util.Scanner;

public class DivisibleBy5{
    public static void main(String[] args){
          // Creating the scanner class to get ihe input
          Scanner input = new Scanner(System.in);

          // Getting input value for the number
          int number = input.nextInt();

           // Checking and printing whether a number is divisible by 5 or not
          if(number%5 == 0){
                  System.out.print("Is the number " + number +" divisible by 5 " + "Yes");
          }
          else{
                 System.out.print("Is the number " + number +" divisible by 5 " + "No");
          }
}};

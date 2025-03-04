// Creating class PowerOfNumberWhileLoop to create the power of number using while loop
import java.util.Scanner;

public class PowerOfNumberWhileLoop{
     public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);


      // Taking the input values
       System.out.print("Enter the base: ");
      int base = scanner.nextInt();
      
      System.out.print("Enter the exponent: ");
      int exponent = scanner.nextInt();

      // Creating a variable answer with value 1
      int answer = 1;
       
       // Printing 1 if exponent is 0
      if(exponent == 0) System.out.print(1);
      else{
          int minus = exponent;
          /// Calculating the power of base using while loop
          while(minus >= 1){
            answer *= base;
            minus--;
         }
}
       // Printing the answer after calculting the power
       System.out.print("Power of "+base+" to the " + exponent + " is: " + answer);
   }}
       

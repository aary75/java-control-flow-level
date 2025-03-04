//Creating a class LearYearUsingLogicalOperator to check a year is a leap year or not
import java.util.Scanner;

public class LeapYearUsingLogicalOperator {

    public static void main(String[] args){
         // Creating a scanner class to get input
         Scanner scanner = new Scanner(System.in);

         // Getting the value of year
         System.out.print("Enter the year: ");
         int year = scanner.nextInt();
        
         // Checking the year is leap year or not
         if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
           System.out.print("Year " + year + " is a leap year");
         }
         else{
           System.out.print("Year " + year + " is not a leap year");
         }
}}

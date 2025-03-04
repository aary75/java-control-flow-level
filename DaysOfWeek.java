// Creating the class DaysOfWeek to find the which day on that particular date
import java.util.Scanner;

public class DaysOfWeek{
     public static void main(String[] args){
        // Creating a scanner class to get the input
        Scanner scanner = new Scanner(System.in);
 
         // Create the variable date to get date from user
         System.out.print("Enter the date: ");
        int day = scanner.nextInt();

        // Create the variable month to get month from user
        System.out.print("Enter the month: ");
        int month = scanner.nextInt();

        // Create the variable year to get year from user
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

 
        // Using greek's formulas to find the day on that date
        int y0 = year - (14 - month)/ 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month ) / 12) - 2;
        int d0 = ( day + x + 31*m0/12) % 7;


        // Alloting the days according to that particular date
        switch(d0) {
             case 0:
                    System.out.print("Sunday");
                    break;
             case 1:
                    System.out.print("Monday");
                    break;
             case 2:
                    System.out.print("Tuesday");
                    break;
             case 3:
                    System.out.print("Wednesday");
                    break;
             case 4:
                    System.out.print("Thrusday");
                    break;
             case 5:
                    System.out.print("Friday");
                    break;
             case 6:
                    System.out.print("Saturday");
                    break;
             default:
                    System.out.print("Not a day"); 

           }
}}

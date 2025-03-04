//Creating a BMICalculator class to calculate the BMI of a person
import java.util.Scanner;

public class BMICalculator {
     public static void main(String[] args) {
        // Creating a scanner class to get user's input
        Scanner scanner = new Scanner(System.in);

        // Creating the variables weight and height
       System.out.print("Enter weight(in kgs): "); 
        double weight = scanner.nextDouble();

        System.out.print("Enter height(in cms): ");
        double height = scanner.nextDouble();
       
        // Calculate the bmi of a person
        double bmi = weight / (height * height);

        // Printing the category of the person according to its bmiPY
        if(bmi <= 18.4) {
            System.out.print("Underweight");
        }
        else if(bmi >= 18.5 && bmi <= 24.9) {
             System.out.print("Normal");
        }
        else if(bmi >= 25.0 && bmi <= 39.9) {
            System.out.print("Overweight");
        }
        else {
           System.out.print("Obese");
       }
}}

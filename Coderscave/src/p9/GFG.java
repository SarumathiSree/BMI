package p9;
import java.util.Scanner;

public class GFG {

   // method to check bmi category
   public static String bmiCategory(double weight, 
                                    double height) {

      // calculate bmi
      double bmi = weight / ( height * height) ;

      // check range
      if(bmi < 18.5)
         return "Thinness";
      else if(bmi < 25)
         return "Normal";
      else if(bmi < 30)
         return "Overweight";
      else
         return "Obese";
   }

   public static void main(String[] args) {

      // declare variables
      double weightInKg = 0.0f;
      double heightInMeters = 0.0f;
      String result = null;

      // create Scanner class object to
      // take input
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter weight in Kg: ");
      weightInKg = scan.nextDouble();
      System.out.print("Enter height in meters: ");
      heightInMeters = scan.nextDouble();

      // calculate BMI index
      result = bmiCategory( weightInKg, 
                           heightInMeters );

      // display result
      System.out.println(result);

      // close Scanner class object
      scan.close();
   }
}
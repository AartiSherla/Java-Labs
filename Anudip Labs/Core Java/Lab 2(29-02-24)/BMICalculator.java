/*A program that calculates body mass index (BMI) based on user input of weight and height, 
and then categories the BMI into underweight, normal, overweight, or obese categories using
 if-else statements in java*/



import java.util.Scanner;         //imported Scanner

class BMICalculator                //class
{
    public static void main(String[] args)            //main method
	{
        Scanner sc = new Scanner(System.in);           //creating scanner object

        // Prompt the user to enter weight in kilograms
		
        System.out.print("Enter your weight in kilograms: ");
        double weight = sc.nextDouble();

        // Prompt the user to enter height in meters
		
        System.out.print("Enter your height in meters: ");
        double height = sc.nextDouble();

        // Calculating BMI
        double bmi = weight / (height * height);     //formula for calculating BMI
		
        System.out.println("Your BMI is: " + bmi);             //Displaying the BMI
      
	   // Determine the BMI category using If-Else 
        if (bmi < 18.5) 
		{
            System.out.println("Your Category is Underweight");            //printing statements
        } 
		else if (bmi >= 18.5 && bmi < 25) 
		{
            System.out.println("Your Category is Normal weight");
        } 
		else if (bmi >= 25 && bmi < 30) 
		{
            System.out.println("Your Category is Overweight");
        } 
		else
		{
           System.out.println("Your Category is Obese");
        }
		
        sc.close();
    }
}



/*
OUTPUT:

E:\Anudip>javac BMICalculator.java

E:\Anudip>java BMICalculator
Enter your weight in kilograms: 80
Enter your height in meters: 2.90
Your BMI is: 9.512485136741974
BMI Category: Underweight

E:\Anudip>java BMICalculator
Enter your weight in kilograms: 70
Enter your height in meters: 1.75
Your BMI is: 22.857142857142858
BMI Category: Normal weight

E:\Anudip>java BMICalculator
Enter your weight in kilograms: 85
Enter your height in meters: 1.75
Your BMI is: 27.755102040816325
BMI Category: Overweight

E:\Anudip>java BMICalculator
Enter your weight in kilograms: 100
Enter your height in meters: 1.75
Your BMI is: 32.6530612244898
BMI Category: Obese

*/




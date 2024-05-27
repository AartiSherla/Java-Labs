/*write a program to create a simple calculator program that takes user input
for two numbers and an operator(+,-,*,/) and performs the corresponding arithmetic operations 
using conditional statements.*/


import java.util.Scanner;

class Calculator               // class
{
    public static void main(String[] args)              //main method
	{
        
        int n1, n2, result;                               // instance variables
        char operator;
		
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first and second number: ");
        n1 = input.nextInt();
        n2 = input.nextInt();
		
        System.out.println("Enter an operator to perform operation(+, -, *, /): ");
        operator = input.next().charAt(0);

        switch (operator)
		{
            case '+':
                result = n1 + n2;             //addition operation between n1 and n2
				System.out.println("The Addition of two numbers is:" +result);                //printing result
                break;
				
            case '-':
                result = n1 - n2;              //substraction operation between n1 and n2
				System.out.println("The Substraction of two numbers is:" +result);
                break;
				
            case '*':
                result = n1 * n2;              //Multification operation between n1 and n2
				System.out.println("The Multiplication of two numbers is:" +result);
                break;
				
            case '/':
                if (n2 != 0)                    //checking the enterd no.is 0
				{
                    result = n1 / n2;            //division operation between n1 and n2
					System.out.println("The Division of two numbers is:" +result);
                } 
				else
				{
                    System.out.println("Error: Division by zero is not allowed");
                    return;
                }
                break;
				
            default:
                System.out.println("Error: Invalid operator");        // if the operator other than (+,-,*,/) then it will show error
                return;
        }
    }
}
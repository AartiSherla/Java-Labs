/*WAP for creating the mini calculator.
you have to perform an operation on the basis of user choice until 
the user press yes to continue(add, mul, sub ,div)*/


import java.util.Scanner;            //Scanner imported 
class MiniCalculator           // class
{
    public static void main(String[] args)        // main method
	{
	                             
		//taking the input from the user
        Scanner scanner = new Scanner(System.in);
        char choice;                //instance variables
		double result;  
        
        do{ 
		    //printing the all operation to perform
            System.out.println("\nChoose an operation:");              
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");

            System.out.print("\nEnter your choice (1/2/3/4): ");        //getting the user choice
            int operation = scanner.nextInt();

            System.out.print("Enter the first number: ");            // from user getting first input
            double n1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");          // from user getting second input
            double n2 = scanner.nextDouble();

            switch (operation) 
			{
                case 1:
                    result = n1 + n2;             //addition operation between n1 and n2
				    System.out.println("\nThe Addition of two numbers is:" +result);            //printing result
                    break;
                case 2:
                   result = n1 - n2;              //substraction operation between n1 and n2
				   System.out.println("\nThe Substraction of two numbers is:" +result);
                   break;
                case 3:
                    result = n1 * n2;              //Multification operation between n1 and n2
				    System.out.println("\nThe Multiplication of two numbers is:" +result);
                    break;
                case 4:
                    if (n2 != 0)                  //checking the enterd denominator is not 0
					{
                      result = n1 / n2;            //division operation between n1 and n2
					  System.out.println("\nThe Division of two numbers is:" +result);         //printing result
                    } 
					else 
					{
                        System.out.println("\nError: Division by zero!");             //if the denominator is zero then prints the Error
                    }
                    break;
                default:
                    System.out.println("\nInvalid operation!");              // if the operator other than (+,-,*,/) then it will show invalid
            }

            System.out.print("\nDo you want to continue (yes/no)?");        // asking user to continue or not
            choice = scanner.next().charAt(0);
        }while (choice == 'y' || choice == 'Y');

        System.out.println("Thank You.");                //if we say no then it prints Thank You
        scanner.close();
    }
}



/*
OUTPUT:

E:\Anudip>javac MiniCalculator.java

E:\Anudip>java MiniCalculator

Choose an operation:
1. Addition (+)
2. Subtraction (-)
3. Multiplication (*)
4. Division (/)

Enter your choice (1/2/3/4): 1
Enter the first number: 10
Enter the second number: 20

The Addition of two numbers is:30.0

Do you want to continue (yes/no)?
y

Choose an operation:
1. Addition (+)
2. Subtraction (-)
3. Multiplication (*)
4. Division (/)

Enter your choice (1/2/3/4): 2
Enter the first number: 20
Enter the second number: 10

The Substraction of two numbers is:10.0

Do you want to continue (yes/no)?
yes

Choose an operation:
1. Addition (+)
2. Subtraction (-)
3. Multiplication (*)
4. Division (/)

Enter your choice (1/2/3/4): 3
Enter the first number: 3
Enter the second number: 4

The Multiplication of two numbers is:12.0

Do you want to continue (yes/no)?
y

Choose an operation:
1. Addition (+)
2. Subtraction (-)
3. Multiplication (*)
4. Division (/)

Enter your choice (1/2/3/4): 4
Enter the first number: 10
Enter the second number: 2

The Division of two numbers is:5.0

Do you want to continue (yes/no)?
y

Choose an operation:
1. Addition (+)
2. Subtraction (-)
3. Multiplication (*)
4. Division (/)

Enter your choice (1/2/3/4): 4
Enter the first number: 10
Enter the second number: 0

Error: Division by zero!

Do you want to continue (yes/no)?
yes

Choose an operation:
1. Addition (+)
2. Subtraction (-)
3. Multiplication (*)
4. Division (/)

Enter your choice (1/2/3/4): 5
Enter the first number: 3
Enter the second number: 5

Invalid operation!

Do you want to continue (yes/no)?
no
Thank You.

*/
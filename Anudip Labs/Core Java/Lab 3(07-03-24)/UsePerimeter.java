/* Write a class with the name Perimeter using function overload that 
computes the perimeter of a square, a rectangle and a circle.
Formula:
Perimeter of a square = 4 * s
Perimeter of a rectangle = 2 * (l + b)
Perimeter of a circle = 2 * (22/7) * r 
*/

import java.util.Scanner;          // Scanner imported 

class Perimeter            // class
{
	// method to calculate perimeter of square
    public void calPeri(int s)                
	{
        int persqr = 4 * s;                                    // calculating perimeter of square
        System.out.println("\nPerimeter of Square is:" + persqr);        // printing perimeter of square
    }
    
	// method to calculate perimeter of rectangle
    public void calPeri(int l, int b)          // method overloading  
	{
        int perrect = 2 * (l + b);                            // calculating perimeter of rectangle
        System.out.println("\nPerimeter of Rectangle is:" + perrect);     // printing perimeter of rectangle
    }

    // method to calculate perimeter of circle
    public void calPeri(double r)             // method overloading 
	{
        double percircle = 2 * (22/7) * r;                  // Calculating perimeter of circle
        System.out.println("\nPerimeter of Circle is:" + percircle);     // printing perimeter of circle
    }
}

class UsePerimeter           // main class
 {
    public static void main(String[] args)       // main method
	{
		// taking the input from the user
        Scanner sc = new Scanner(System.in);    
		
        Perimeter p1 = new Perimeter();        //creating object of class Perimeter
        char choice;           //variable

        do 
		{
			//printing the all options  
            System.out.println("Choose an option to calculate perimeter:");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
			
			System.out.print("\nEnter your choice (1/2/3): ");        // taking the user choice
            int ch = sc.nextInt();

            switch (ch) 
			{
                case 1:
				
                    System.out.println("Enter the side: ");         // from user getting side
                    int s = sc.nextInt();
                    p1.calPeri(s);                // calling the calPeri(s) method from Perimeter Class
                    break;
					
                case 2:
				
                    System.out.println("Enter length: ");           // from user getting length
                    int l = sc.nextInt();
                    System.out.println("Enter breadth: ");          // from user getting breadth
                    int b = sc.nextInt();
                    p1.calPeri(l, b);             // calling the calPeri(l,b) method from Perimeter Class
                    break;
					
                case 3:
				
                    System.out.println("Enter radius for circle: ");      // from user getting radius
                    double r = sc.nextDouble();
                    p1.calPeri(r);                // calling the calPeri(r) method from Perimeter Class
                    break;
					
                default:
				
                    System.out.println("\nInvalid Choice!");   // if the choice other than (1,2,3) then it will show invalid choice
                    System.out.println("\nPlease Enter Valid Choice...!");    
                    break;
            }

            System.out.print("\nDo you want to continue? (y/n): ");          // asking user to continue or not
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
		
		System.out.println("Thank You.");                // if we say no then it prints Thank You
		sc.close();
    }
}



/*
OUTPUT:

E:\Anudip>javac UsePerimeter.java

E:\Anudip>java UsePerimeter
Choose an option to calculate perimeter:
1. Square
2. Rectangle
3. Circle

Enter your choice (1/2/3): 1
Enter the side:
10

Perimeter of Square is:40

Do you want to continue? (y/n): y
Choose an option to calculate perimeter:
1. Square
2. Rectangle
3. Circle

Enter your choice (1/2/3): 2
Enter length:
10
Enter breadth:
20

Perimeter of Rectangle is:60

Do you want to continue? (y/n): y
Choose an option to calculate perimeter:
1. Square
2. Rectangle
3. Circle

Enter your choice (1/2/3): 3
Enter radius for circle:
10

Perimeter of Circle is:62.83185307179586

Do you want to continue? (y/n): y
Choose an option to calculate perimeter:
1. Square
2. Rectangle
3. Circle

Enter your choice (1/2/3): 4

Invalid Choice!

Please Enter Valid Choice...!

Do you want to continue? (y/n): n
Thank You.

*/
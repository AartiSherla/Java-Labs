/* Write a program to demonstrate static block take two static variables name and id and print them. */


import java.util.Scanner;           // Scanner imported

class StaticBlock            // Class
{
	// Declaring static variables name and id
    static int id; 
    static String name; 


    static {               // Creating Static block
        
        Scanner sc = new Scanner(System.in);           // Creating the Scanner object 'sc'
     
        System.out.println("Enter ID: ");                // Taking input from the user to enter an ID
        id = sc.nextInt();       // Reading the input entered by the user and store it in the 'id' variable
               
        System.out.println("Enter name: ");             // Taking input from the user to enter a name
        name = sc.next();         // Reading the input entered by the user and store it in the 'name' variable
		
    }
	
    public static void main(String[] args)            // Main method
	{      
        System.out.println("ID: " + id);             // Printing the value of the 'id' variable
		System.out.println("Name: " + name);         // Printing the value of the 'name' variable
    }
}




/*

OUTPUT:

E:\Anudip\Thursday Lab>javac StaticBlock.java

E:\Anudip\Thursday Lab>java StaticBlock
Enter ID: 101
Enter name: Aarti

ID: 101
Name: Aarti


*/
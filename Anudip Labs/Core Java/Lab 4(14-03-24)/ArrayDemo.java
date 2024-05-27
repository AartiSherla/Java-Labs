/* Create a class Student and implement array and display details of student. */

import java.util.Scanner;    // importimg scanner

class ArrayExample         // class ArrayExample
{
	// instance variables
    int id; 
    String name;

    ArrayExample(int id, String name)     // parameterized constructor
	{
        this.id = id;          // Assigning the id parameter to the id instance variable
        this.name = name;      // Assigning the name parameter to the name instance variable
    }
}

class ArrayDemo          // main class
 {
    public static void main(String args[])    // main method
	{
        Scanner sc = new Scanner(System.in);       // Creating object of Scanner 

        System.out.println("Enter the number of students:");    // Taking input from user to enter the number of students
        int numStudents = sc.nextInt();          // Read the number of students entered by the user

        ArrayExample arr[] = new ArrayExample[numStudents];    // Array to store student objects

        
        for (int i = 0; i < numStudents; i++)     // Loop to iterate through each student
			{
            System.out.println("Enter student ID:");       // Taking input from the user to enter the student ID
            int id = sc.nextInt();            // Read the student ID entered by the user
            System.out.println("Enter student name:");     // Taking input from the user to enter the student Name
            String name = sc.next();           // Read the student Name entered by the user
            arr[i] = new ArrayExample(id, name);      // Create a new ArrayExample object with the entered ID and name, and add it to the array
        }

        for (ArrayExample a : arr)        // Loop through each ArrayExample object in the arr array
		{
            System.out.println("ID: " + a.id + "\tName: " + a.name);    // Print the ID and name of each student
        }

        
    }
}


/*
OUTPUT:

E:\Anudip\Thursday Lab>javac ArrayDemo.java

E:\Anudip\Thursday Lab>java ArrayDemo
Enter the number of students: 5
Enter student ID: 1
Enter student name: Aarti
Enter student ID: 2
Enter student name: Sona
Enter student ID: 3
Enter student name: Anjali
Enter student ID: 4
Enter student name: Meena
Enter student ID: 5
Enter student name: Akshaya
ID: 1   Name: Aarti
ID: 2   Name: Sona
ID: 3   Name: Anjali
ID: 4   Name: Meena
ID: 5   Name: Akshaya

*/
/* Write a program using Vector to store the list of students details and print the details. */

package com.collectionexample;   // Package declaration

import java.util.Vector; // Importing the Vector class from java.util package

// Represents a student with id, name, email, and contact details
class Student 
{
    public int id;          // Declaring public integer variable id
    public String name;     // Declaring public String variable name
    public String email;    // Declaring public String variable email
    public String contact;  // Declaring public String variable contact

    // Constructor to initialize student details
    public Student(int id, String name, String email, String contact) 
    {
        this.id = id;           // Assigning id parameter to id variable
        this.name = name;       // Assigning name parameter to name variable
        this.email = email;     // Assigning email parameter to email variable
        this.contact = contact; // Assigning contact parameter to contact variable
    }
}

public class VectorExample1 
{
    public static void main(String[] args) 
    {
        Vector<Student> students = new Vector<>(); // Creating a new Vector to store Student objects

        // Adding students to the Vector
        students.add(new Student(1, "Aarti", "aaru@gmail.com", "5253653532"));    // Adding Aarti's details
        students.add(new Student(2, "Akshaya", "Akshu@gmail.com", "9876543210")); // Adding Akshaya's details
        students.add(new Student(3, "Bhavana", "bhanu@gamil.com", "4567890123")); // Adding Bhavana's details
        students.add(new Student(3, "Sapana", "sapana@gamil.com", "6523421472"));  // Adding Sapana's details

        // Printing student details
        for (Student student : students) 
        {
            System.out.println("ID: " + student.id);           // Printing student's ID
            System.out.println("Name: " + student.name);       // Printing student's name
            System.out.println("Email: " + student.email);     // Printing student's email
            System.out.println("Contact: " + student.contact); // Printing student's contact number
            System.out.println(); // Printing a blank line for formatting
        }
    }
}
   

/*
 
OUTPUT:

ID: 1
Name: Aarti
Email: aaru@gmail.com
Contact: 5253653532

ID: 2
Name: Akshaya
Email: Akshu@gmail.com
Contact: 9876543210

ID: 3
Name: Bhavana
Email: bhanu@gamil.com
Contact: 4567890123

ID: 3
Name: Sapana
Email: sapana@gamil.com
Contact: 6523421472

*/

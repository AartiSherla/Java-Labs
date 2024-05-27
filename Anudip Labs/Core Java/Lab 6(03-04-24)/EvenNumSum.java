/* Write a java program that calculates the sum of all even numbers present in an ArrayList of integers. 
 * Sample Input:
2,5,8,10,15

Expected Output :sum of even number is 20 */

package com.collectionexample; // Package declaration

import java.util.ArrayList; // Importing ArrayList class from java.util package

public class EvenNumSum // Class declaration
{
    public static void main(String[] args) // Main method declaration
    {
        // Creating an ArrayList of integers
        ArrayList<Integer> n = new ArrayList<>(); // Creating an ArrayList to store integers

        n.add(2);   // Adding 2 to the ArrayList
        n.add(5);   // Adding 5 to the ArrayList
        n.add(8);   // Adding 8 to the ArrayList
        n.add(10);  // Adding 10 to the ArrayList
        n.add(15);  // Adding 15 to the ArrayList
        
        // Printing the elements of the ArrayList
        System.out.println("Array Elements:" + n);

        // Calculating the sum of even numbers
        int sum = 0; // Initializing sum to 0
        for (int num : n) // Looping through each element of the ArrayList
        {
            if (num % 2 == 0) // Checking if the number is even
            {
                sum += num; // Adding the even number to sum
            }
        }

        // Printing the sum of even numbers
        System.out.println("Sum of all even numbers is: " + sum); // Printing the sum of even numbers
    }
}

/*

OUTPUT:

Array Elements:[2, 5, 8, 10, 15]
Sum of all even numbers is: 20

*/
/* Create a program with a logic that throws the ArrayIndexOutOfBoundsException. 
 * while accessing elements in an array.
[Hint: Use array and loop and try to access the element beyond the last index] */


package com.exceptionexample;

import java.util.Scanner;   // Importing scanner

public class ArrayIndexOutOfBoundsExceptionDemo   // Class ArrayIndexOutOfBoundsExceptionDemo defined
{
    public static void main(String[] args)   // Main method
    {       
        Scanner sc = new Scanner(System.in);      // Creating Scanner object  
  
        System.out.println("Enter the length of the array: ");    // Prompting user to enter the length of the array     
        int length = sc.nextInt();      // Reading the length of the array from the user     
        int[] arr = new int[length];      // Creating an array with the specified length to store integers
               
        for (int i = 0; i < length; i++)   // Iterate over each index of the array
        {
            System.out.println("Enter element at index " + i + ": ");   // Prompting user to enter an element 
            arr[i] = sc.nextInt();  // Reading an integer from the user and assign it to the array at index i
        }        
       
        System.out.println("Enter an extra element to insert into the array: ");  // Prompting user to enter an extra element to insert into the array  
        int extraElement = sc.nextInt();  // Reading an extra element from the user
        
        // This will throw an ArrayIndexOutOfBoundsException if the index is out of bounds
        try   // try block
        {
            arr[length] = extraElement;   // Trying to insert the extra element into the array    
        } catch (ArrayIndexOutOfBoundsException e)   // catch block
        {
            // Handling the exception by printing an error message
        	System.out.println("Sorry, The array size is " + arr.length + ". Cannot insert an extra element.");
            System.out.println("ArrayIndexOutOfBounds Exception is fired.");
           
        }
    }
}


/*
OUTPUT:

Enter the length of the array: 
5
Enter element at index 0: 
10
Enter element at index 1: 
20
Enter element at index 2: 
30
Enter element at index 3: 
40
Enter element at index 4: 
50
Enter an extra element to insert into the array: 
60
Sorry, The array size is 5. Cannot insert an extra element.
ArrayIndexOutOfBounds Exception is fired.


Enter the length of the array: 
2
Enter element at index 0: 
15
Enter element at index 1: 
25
Enter an extra element to insert into the array: 
35
Sorry, The array size is 2. Cannot insert an extra element.
ArrayIndexOutOfBounds Exception is fired.


*/
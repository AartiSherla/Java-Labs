/* write a program to declare stack, store 10 elements into it, remove 4 elements from stack and display it. */

package com.collectionexample; // Package declaration

import java.util.Stack; // Importing Stack class from java.util package

public class StackEx // Class declaration
{
    public static void main(String[] args) // Main method declaration
    {
        Stack<Integer> stack = new Stack<>(); // Creating a Stack to store integers
        
        // Storing 10 elements into the stack
        stack.push(1); // Pushing 1 onto the stack
        stack.push(2); // Pushing 2 onto the stack
        stack.push(3); // Pushing 3 onto the stack
        stack.push(4); // Pushing 4 onto the stack
        stack.push(5); // Pushing 5 onto the stack
        stack.push(6); // Pushing 6 onto the stack
        stack.push(7); // Pushing 7 onto the stack
        stack.push(8); // Pushing 8 onto the stack
        stack.push(9); // Pushing 9 onto the stack
        stack.push(10); // Pushing 10 onto the stack
        
        // Printing the elements of the stack
        System.out.println("Stack elements: " + stack);
        
        // Removing 4 elements from the stack
        int s1 = stack.pop(); // Popping the top element and storing it in s1
        System.out.println("Element Popped:" + s1); // Printing the popped element
        int s2 = stack.pop(); // Popping the top element and storing it in s2
        System.out.println("Element Popped:" + s2); // Printing the popped element
        int s3 = stack.pop(); // Popping the top element and storing it in s3
        System.out.println("Element Popped:" + s3); // Printing the popped element
        int s4 = stack.pop(); // Popping the top element and storing it in s4
        System.out.println("Element Popped:" + s4); // Printing the popped element
        
        // Printing the stack after removing 4 elements
        System.out.println("Stack after removing 4 elements: " + stack);
    }
}


/*
 OUTPUT:

Stack elements: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Element Popped:10
Element Popped:9
Element Popped:8
Element Popped:7
Stack after removing 4 elements: [1, 2, 3, 4, 5, 6]

*/

/*  Write a program using ArrayDeque to add book names and add,delete the values from both ends of que. */

package com.collectionexample;   // Package declaration

import java.util.ArrayDeque; // Importing the ArrayDeque class from java.util package

public class BookQueueExample 
{
    public static void main(String[] args)  // Main method
    {
        // Create a new ArrayDeque to store book names
        ArrayDeque<String> bookQueue = new ArrayDeque<>(); // Creating a new ArrayDeque to store book names

        // Adding books to the deque
        bookQueue.add("Book1"); // Adding Book1 to the queue
        bookQueue.add("Book2"); // Adding Book2 to the queue
        bookQueue.add("Book3"); // Adding Book3 to the queue

        // Printing the initial queue
        System.out.println("Initial Queue: " + bookQueue); // Printing the initial queue

        // Adding a book at the front of the queue
        String newBookFront = "Book0"; // New book to add at the front
        bookQueue.addFirst(newBookFront); // Adding Book0 at the front
        System.out.println("After adding '" + newBookFront + "' at the front: " + bookQueue); // Printing the queue after adding a book at the front

        // Adding a book at the end of the queue
        String newBookEnd = "Book4"; // New book to add at the end
        bookQueue.addLast(newBookEnd); // Adding Book4 at the end
        System.out.println("After adding '" + newBookEnd + "' at the end: " + bookQueue); // Printing the queue after adding a book at the end

        // Removing a book from the front of the queue
        String removedFromFront = bookQueue.removeFirst(); // Removing Book0 from the front
        System.out.println("Removed from the front: " + removedFromFront); // Printing the book removed from the front
        System.out.println("After removing from the front: " + bookQueue); // Printing the queue after removing a book from the front

        // Removing a book from the end of the queue
        String removedFromEnd = bookQueue.removeLast(); // Removing Book4 from the end
        System.out.println("Removed from the end: " + removedFromEnd); // Printing the book removed from the end
        System.out.println("After removing from the end: " + bookQueue); // Printing the queue after removing a book from the end
    }
}

/*
OUTPUT:

Initial Queue: [Book1, Book2, Book3]
After adding 'Book0' at the front: [Book0, Book1, Book2, Book3]
After adding 'Book4' at the end: [Book0, Book1, Book2, Book3, Book4]
Removed from the front: Book0
After removing from the front: [Book1, Book2, Book3, Book4]
Removed from the end: Book4
After removing from the end: [Book1, Book2, Book3]

*/
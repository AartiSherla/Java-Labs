/* write a java program to check whether a HashMap contains key-value mappings(empty) or not.  */

package com.collectionexample; // Package declaration

import java.util.HashMap; // Importing the HashMap class from the java.util package

public class CheckHashMapEmpty     // Class declaration
{ 
    public static void main(String[] args) // Main method declaration
    { 
        // Create a HashMap
        HashMap<String, String> map = new HashMap<>(); // Creating a new HashMap object with keys and values of type String

        // Add some key-value mappings
        map.put("key1", "value1");          // Adding a key-value pair to the HashMap
        map.put("key2", "value2");          // Adding another key-value pair to the HashMap

        // Check if the HashMap is not empty
        if (!map.isEmpty())  // Checking if the HashMap is not empty using the isEmpty() method
        {
            System.out.println("The HashMap is not empty."); // Printing a message if the HashMap is not empty
            System.out.println("Contains " + map.size() + " key-value mappings."); // Printing the number of key-value mappings in the HashMap
        } else 
        {
            System.out.println("The HashMap is empty."); // Printing a message if the HashMap is empty
        }
    }
}





/*
OUTPUT:

The HashMap is not empty.
Contains 2 key-value mappings.
	
*/
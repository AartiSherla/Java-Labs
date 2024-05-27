/*  write a program in Java to create a Map Interface where we can store the cricketer name in it 
 along with his scores and search for the batsman name and display his score. */

package com.collectionexample; // Package declaration

import java.util.HashMap; // Importing HashMap class from java.util package
import java.util.Map; // Importing Map interface from java.util package
import java.util.Scanner; // Importing Scanner class from java.util package

public class MapInterfaceExample  // Class declaration
{

    public static void main(String[] args)  // Main method declaration
    {
        // Create a Map to store cricketer names and scores
        Map<String, Integer> scoresMap = new HashMap<>(); // Creating a HashMap instance to store cricketer names and scores

        // Add some initial data
        scoresMap.put("Virat Kohli", 105); // Adding cricketer name "Virat Kohli" with score 105
        scoresMap.put("Rohit Sharma", 68); // Adding cricketer name "Rohit Sharma" with score 68
        scoresMap.put("MS Dhoni", 42); // Adding cricketer name "MS Dhoni" with score 42
        scoresMap.put("KL Rahul", 91); // Adding cricketer name "KL Rahul" with score 91

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read user input

        System.out.print("Enter the name of the batsman: "); // Prompting the user to enter the batsman's name
        String batsmanName = scanner.nextLine(); // Reading the batsman's name from user input

        // Search for the batsman name in the Map
        if (scoresMap.containsKey(batsmanName))  // Checking if the batsman's name is present in the Map
        {
            // If found, display the batsman's score
            int score = scoresMap.get(batsmanName); // Retrieving the score of the batsman
            System.out.println("Score of " + batsmanName + ": " + score); // Displaying the batsman's name and score
        } else
        {
            // If not found, display a message
            System.out.println("Batsman not found in the records."); // Displaying a message indicating batsman not found
        }

        // Close the Scanner
        scanner.close(); // Closing the Scanner to release resources
    }
}



/*
OUTPUT:

Enter the name of the batsman: Virat Kohli
Score of Virat Kohli: 105


Enter the name of the batsman: Arjun
Batsman not found in the records.



*/

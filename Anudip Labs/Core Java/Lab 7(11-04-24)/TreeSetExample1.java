/* Write a program using TreeSet insert Integer values and print them. */

package com.collectionexample;    // Package declaration

import java.util.TreeSet; // Importing the TreeSet class from java.util package

public class TreeSetExample1 
{
    public static void main(String[] args) // Main method
    {
        // Create a TreeSet to store integer values
        TreeSet<Integer> treeSet = new TreeSet<>(); // Creating a new TreeSet to store integer values

        // Inserting integer values
        treeSet.add(10); // Adding 5 to the TreeSet
        treeSet.add(30); // Adding 3 to the TreeSet
        treeSet.add(80); // Adding 8 to the TreeSet
        treeSet.add(50); // Adding 1 to the TreeSet
        treeSet.add(40); // Adding 10 to the TreeSet

        // Printing the TreeSet
        System.out.println("TreeSet values: " + treeSet); // Printing the values in the TreeSet
    }
}

/*

OUTPUT:

TreeSet values: [10, 30, 40, 50, 80]

*/
/* Create two thread, one thread is finding the average of the first 10 numbers and 
 another thread is printing the square of the number stored in array arr={1,20,50,15,30) 
 and make sure both threads can execute simultaneously. */


package com.threadpackage;

class AverageThread extends Thread    // Defining the AverageThread class for calculating the average of the first 10 numbers
{
    
    public void run()    // Run method for the thread
    {
        double sum = 0;          // Initializing sum variable         
        for (int i = 1; i <= 10; i++)   // Calculate the sum of the numbers from 1 to 10
        {
            sum += i;       // Adding the current number i to the sum
        }
       
        double average = sum / 10;       // Formula for calculate the average 
        System.out.println("Average of first 10 numbers: " + average);     // Printing the average of first 10 numbers
    }
}


class SquareThread extends Thread   // Defining the SquareThread class for printing the squares of numbers in an array
{
    int[] arr;    // Declaring an array variable to store numbers
   
    public SquareThread(int[] arr)   // Constructor to initialize the array
    {
        this.arr = arr;    // Assigning the parameter array to the instance variable arr
    }
  
    public void run()     // Run method for the thread
    {   	
    	for (int i = 0; i < arr.length; i++)    // Iterating each element of the array 
    	{
    	    int num = arr[i];     // Getting the current element from the array
    	    System.out.println("Square of " + num + " is: " + num * num);     // Calculating and printing the square of the current element
    	}
    }
}

public class MultiThreadDemo // Main class
{
   
    public static void main(String[] args)     // Main thread is created
    {
        int[] arr = {1, 20, 50, 15, 30};       // Array of numbers
        
        // child thread is created
        AverageThread a1 = new AverageThread();    // Creating an object of class AverageThread       
        SquareThread s1 = new SquareThread(arr);     // Creating an object of class SquareThread with the array as an argument

        
        a1.start();        // To Start the AverageThread  
        s1.start();        // To Start the SquareThread
    }
}




/*
OUTPUT: The output of this program is changing when we are runnnung it's because of Thread Scheduler.
Thread Scheduler: It is responsible to schedule thread

Square of 1 is: 1
Square of 20 is: 400
Square of 50 is: 2500
Square of 15 is: 225
Square of 30 is: 900
Average of first 10 numbers: 5.5

Square of 1 is: 1
Square of 20 is: 400
Square of 50 is: 2500
Average of first 10 numbers: 5.5
Square of 15 is: 225
Square of 30 is: 900

Square of 1 is: 1
Average of first 10 numbers: 5.5
Square of 20 is: 400
Square of 50 is: 2500
Square of 15 is: 225
Square of 30 is: 900

Square of 1 is: 1
Square of 20 is: 400
Square of 50 is: 2500
Square of 15 is: 225
Average of first 10 numbers: 5.5
Square of 30 is: 900

Average of first 10 numbers: 5.5
Square of 1 is: 1
Square of 20 is: 400
Square of 50 is: 2500
Square of 15 is: 225
Square of 30 is: 900

*/
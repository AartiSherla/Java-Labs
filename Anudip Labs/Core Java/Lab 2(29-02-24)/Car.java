/*Create a class named Car with attributes make, model, year, and color.
 Include a method start() that prints "Car started" and a method stop() that prints "Car stopped".*/



class Car          //class
{
    // Attributes
    String make;
    String model;
    int year;
    String color;

    public Car(String make, String model, int year, String color)           //parameterized constructor
	{
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    
    public void start()      // Created start method to start the car
	{
        System.out.println("\nCar started");     
    }

    
    public void stop()       // Created stop method to stop the car
	{
        System.out.println("Car stopped\n");
    }
     
	void printData()       // to print the data 
	{
	    System.out.println("Make of Car:"+this.make+"\nModel of Car:"+this.model+"\nYear of Car:"+this.year+"\nColor of Car:"+this.color);
	}
    
    public static void main(String[] args)         // Main method 
	{
        // Creating an instance of Car
        Car c1 = new Car("Tesla", "Model S", 2022, "Red");        //creating  the object of class with parameterized constructor
		c1.printData();       // calling the print method
		c1.start();          // calling the start method
		c1.stop();          // calling the stop method
		
		Car c2 = new Car("Toyota", "Camry", 2021, "Blue");        //calling the new object with parameterized constructor
		c2.printData();       // calling the print method
		c2.start();          // calling the start method
		c2.stop();          // calling the stop method
    }
}




/*
OUTPUT:

E:\Anudip>javac Car.java

E:\Anudip>java Car
Make of Car:Tesla
Model of Car:Model S
Year of Car:2022
Color of Car:Red

Car started
Car stopped

Make of Car:Toyota
Model of Car:Camry
Year of Car:2021
Color of Car:Blue

Car started
Car stopped

*/



/* Define interfaces 'Flyable and Swimmable with methods fly() and swim() respectively.
 Implement these interfaces in a class Bird to demonstrate multiple interface implementation */



interface Flyable       // Defining the Flyable interface
{
    public void fly();         // Method declaration for flying
}


interface Swimmable      // Defining the Swimmable interface
{
    public void swim();         // Method declaration for flying
}

// Implementing the Flyable and Swimmable interfaces in the Bird class
class Bird implements Flyable, Swimmable    
{
	
    public void fly()                    // Implementing of the fly method from the Flyable interface
	{
        System.out.println("Bird is Flying");      // Printing Bird is Flying
    }

    public void swim()                 // Implementing of the swim method from the Swimmable interface
	{
        System.out.println("Bird is Swimming");    // Printing Bird is Swimmimg
    }
}

class UseInterface     // Main class
{
    public static void main(String[] args)    // Main method
	{
        Bird bird = new Bird();     // Creating object of class Bird
        bird.fly();                // calling the fly method 
        bird.swim();               // calling the swim method
    }
}



/*
OUTPUT:

E:\Anudip\Thursday Lab>javac UseInterface.java

E:\Anudip\Thursday Lab>java UseInterface
Bird is flying
Bird is swimming

*/

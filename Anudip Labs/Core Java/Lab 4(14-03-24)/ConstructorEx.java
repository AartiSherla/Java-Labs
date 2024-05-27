/* Create a base class with constructor and inherit it in the derived class and 
call the base class constructor in derived class */

// super(): this is used to call parent class constructor


class Base                          // Base class
{
	// Declaring instance variables
    int id;                          
    String name;                     

    public Base(int id, String name)     // Constructor of Base class with parameters 'id' and 'name'
	{
        this.id = id;                 // Assigning the id parameter to the id instance variable
        this.name = name;             // Assigning the name parameter to the name instance variable
        System.out.println("Base class constructor called");  // Printing a message
    }

    public void display()           // Method to display 
	{
        System.out.println("ID: " + id);        // Printing the value of 'id'
        System.out.println("Name: " + name);    // Printing the value of 'name'
    }
}

class Derived extends Base       // Derived class inheriting from Base class
{ 
    String email;                    // Declaring instance variable 'email' in Derived class
    int contact;                     // Declaring instance variable 'contact' in Derived class

    public Derived(int id, String name, String email, int contact) {  // Constructor of Derived class with parameters 'id', 'name', 'email', and 'contact'
        super(id, name);             // Calling the base class constructor with 'id' and 'name'
        this.email = email;          // Assigning the email parameter to the email instance variable
        this.contact = contact;      // Assigning the contact parameter to the contact instance variable
        System.out.println("Derived class constructor called");  // Printing a message
    }
	
    public void display()           // Overriding the display method to include 'email' and 'contact'
	{
        super.display();             // Calling the base class display method
        System.out.println("Email: " + email);      // Printing the value of 'email'
        System.out.println("Contact: " + contact);  // Printing the value of 'contact'
    }
}

class ConstructorEx              // Main class
{
    public static void main(String[] args)    // Main method
	{
        Derived derived = new Derived(101, "Aarti", "Aarti@gmail.com", 561536538);  // Creating an object of Derived class by passing parameters
        derived.display();           // Calling the display method of Derived class to display details
    }
}

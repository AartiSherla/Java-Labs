/*   Define a class Address representing an address with attributes such as street, city, state, and zip code.
 Provide constructors to initialize these attributes.*/
 
class Address       //class
{
    String street;    // instance variables
	String city;
	String state;
	String zipcode;
	
	Address()         // no-argument constructor
	{
	    this.street="Tulshanti Nagar";
		this.city="Solapur";
		this.state="Maharashtra";
		this.zipcode="413005";
		System.out.println("No argument constructor is called....");
	}
	
	Address(String street,String city,String state,String zipcode)        //parameterized constructor
	{
	    this.street=street;
		this.city=city;
		this.state=state;
		this.zipcode=zipcode;
		System.out.println("\nParameterized Constructor is called...");
	}
	void printData()       // to print the data of the object
	{
	    System.out.println("Street :"+this.street+"\nCity:"+this.city+"\nState:"+this.state+"\nZip Code:"+this.zipcode);
	}
}
class AddressDemo
{
    public static void main(String args[])         //main method
    {
       Address a1 = new Address();      // creating the object of the class Default Constructor
	   a1.printData();       	         // calling the printData method
	   Address a2 = new Address("Priydarshani Nagar","Solapur","Maharashtra","413005");     // creating the object of class with parameterized constructor
	   a2.printData();                   // calling the printData method
	   
	}
}

/*
OUTPUT:

E:\Anudip>javac AddressDemo.java

E:\Anudip>java AddressDemo
No argument constructor is called....
Street :Tulshanti Nagar
City:Solapur
State:Maharashtra
Zip Code:413005

Parameterized Constructor is called...
Street :Priydarshani Nagar
City:Solapur
State:Maharashtra
Zip Code:413005

*/
   
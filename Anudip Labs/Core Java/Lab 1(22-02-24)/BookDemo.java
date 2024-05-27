/*create a class named Book with attributes title, author, ISBN, and price. 
Include methods to get and set the attributes.*/


import java.util.Scanner;

class Book           //class name
{
    String title;    //data members
	String author;
	int isbn;
    Double price;	
	
	void getData()   //to insert the data from the user
	{
	    //taking the input from the user
	    Scanner sc=new Scanner(System.in);
	    System.out.println("\nEnter Title of Book:");
	    this.title=sc.next();
	    System.out.println("Enter Author of Book:");
	    this.author=sc.next();
	    System.out.println("Enter ISBN:");
	    this.isbn=sc.nextInt();
		System.out.println("Enter Price of Book:");
	    this.price=sc.nextDouble();
	}
	
	void setData()   // to print the data of the object
	{
	    System.out.println("\nTitle of Book:"+this.title+"\nAuthor Name:"+this.author+"\nISBN:"+this.isbn+"\nPrice of Book:"+this.price);
	}
}

class BookDemo
{
    public static void main(String args[])       //main method
    {
	    Book b1 = new Book();
		b1.getData();           //calling the insert method
		b1.setData();           //calling the print method
		
		Book b2 = new Book();     
		b2.getData();           //calling the insert method
		b2.setData();
		
	}
}
   
	
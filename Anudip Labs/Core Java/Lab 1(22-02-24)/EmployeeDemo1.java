/*create a class named Employee with attributes name, employeeid, 
designation and salary. include a method calculateBonus() 
that returns 5% of the salary as bonus.*/



import java.util.Scanner;

class Employee4      //class name
{
    String ename;    //data members
	String employeeId;
	String designation;
    Double salary;	
	
	void getData()   //to insert the data from the user
	{
	    //taking the input from the user
	    Scanner sc=new Scanner(System.in);
	    System.out.println("\nEnter Name of Employee:");
	    this.ename=sc.next();
	    System.out.println("Enter Employee Id:");
	    this.employeeId=sc.next();
	    System.out.println("Enter Designation:");
	    this.designation=sc.next();
		System.out.println("Enter Salary of Employee:");
	    this.salary=sc.nextDouble();
	}
	
	void printData() // to print the data of the object
	{
	    System.out.println("\nName of Employee:"+this.ename+"\nEmployee Id:"+this.employeeId+"\nEmployee Designation:"+this.designation+"\nSalary of Employee:"+this.salary);
	}
	
	void calculateBonus()
	{
		Double bonus = 0.05 * salary;
		System.out.println("The 5% bonus of a salary of Employee is:" +bonus);
	}
}

class EmployeeDemo1
{
    public static void main(String args[])       //main method
    {
	    Employee4 ee1 = new Employee4();
		ee1.getData();           //calling the insert method
	    ee1.printData();
        ee1.calculateBonus();		
		
		Employee4 ee2 = new Employee4();     
		ee2.getData();           //calling the insert method
		ee2.printData();
		ee2.calculateBonus();
		
		Employee4 ee3 = new Employee4();     
		ee3.getData();           //calling the insert method
		ee3.printData();
		ee3.calculateBonus();
		
	}
}
   
	
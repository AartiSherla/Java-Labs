/* Create a program in java to implement multilevel inheritance and hierarchical inheritance.
Take classes like : Doctor , Surgeon, Nurse
Create methods and show method overriding. */

class Doctor                        // Parent class Doctor
{
    void treatPatient()             // method
	{
		System.out.println("Im from Doctor class...");
        System.out.println("Doctor is treating the patient.");
		
    }
}

class Surgeon extends Doctor              // subclass Surgeon extending Doctor class
{
    
    void treatPatient()              // Overriding treatPatient method from Doctor class
	{
		System.out.println("\nIm extending from Doctor class...");
        System.out.println("Surgeon is treating the patient.");
	    
    }

    void performSurgery()             // Additional method of surgeon class
	{
		System.out.println("Im from Surgeon class...");
        System.out.println("Surgeon is performing surgery to patient.");
				
    }
}

class Nurse extends Surgeon           // subclass Nurse extending Surgeon class
 {
    
    void treatPatient()             // Overriding treatPatient method from Doctor class and surgeon class
	{
		System.out.println("\nIm extending from Surgeon class...");
        System.out.println("Nurse is taking care of patient.");
		
    }
	
	void performSurgery()           // Overriding performSurgery method from surgeon class
	{
		System.out.println("Im from Nurse class...");
        System.out.println("Surgeon is managing medical conditions.");				
    }

    void provideMedication()       // Overriding provideMedication method from surgeon class
	{
        System.out.println("Nurse is providing medication to the patient.");
    }

}

class MultilevelDemo                       // Main Class
 {
    public static void main(String[] args)           // Main Method
	{
        Doctor doctor = new Doctor();          // Creating object of Doctor class
		doctor.treatPatient();                 // Calling treatPatient method from Doctor class
		
        Surgeon surgeon = new Surgeon();       // Creating object of Surgeon class
		surgeon.treatPatient();                // Calling treatPatient method from Surgeon class
		surgeon.performSurgery();              // Calling performSurgery method from Surgeon class
		
        Nurse nurse = new Nurse();              // Creating object of Nurse class
		nurse.treatPatient();                   // Calling treatPatient method from Nurse class
		nurse.performSurgery();                 // Calling performSurgery method from Nurse class
	    nurse.provideMedication();                  // Calling provideMedication method from Nurse class
    }
}



/* 
OUTPUT:

E:\Anudip>javac MultilevelDemo.java

E:\Anudip>java MultilevelDemo
Im from Doctor class...
Doctor is treating the patient.

Im extending from Doctor class...
Surgeon is treating the patient.
Im from Surgeon class...
Surgeon is performing surgery to patient.

Im extending from Surgeon class...
Nurse is taking care of patient.
Im from Nurse class...
Surgeon is managing medical conditions.
Nurse is providing medication to the patient.

*/
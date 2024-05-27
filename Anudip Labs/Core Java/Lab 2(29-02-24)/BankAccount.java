/*Implement a bank account class showing method overloading with methods for deposit, withdrawal and balance inquiry.
Use method overloading to handle different types of transactions.*/



import java.util.Scanner;          //imported scanner

class BankAccount                  //class
{
    String accountNo;              //instance variables
    double balance;
 
    public BankAccount(String accountNo, double initialBalance)      // Parameterized Constructor
	{
        this.accountNo = accountNo;
        this.balance = initialBalance;
    }
   
   // Method overloading for deposit 
    public void transaction(String accountNo, double amount) 
	{
		balance += amount;             //adding the amount into balance amount
        System.out.println(amount + " deposited into account " + accountNo + " successfully.");       //printing the deposited amount from the account 
		System.out.println("Current balance: " + balance);           //dsplaying the current balance fron the account
    }

    // Method overloading for withdrawal 
    public void transaction(double amount)
	{
       if (balance >= amount)       //checking the balance amount
		{
            balance -= amount;          //decrementing the amount from the balance
            System.out.println(amount + " withdrawn successfully.");        //printing the withdrawal amount
        } 
		else 
		{
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    // Method overloading for balance inquiry 
    public void transaction(String accountNo)
	{
        System.out.println("Balance for account " + accountNo + ": " + balance);         //printing the balance amount with account no
    }

    public static void main(String[] args)          // main method
	{
		//taking the input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("************** MINI BANK **************");
        System.out.print("Enter account number: ");
        String accountNo = scanner.next();
        
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(accountNo, initialBalance);        //creating object of class with passing parameters

        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        account.transaction(accountNo, depositAmount);

        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();
        account.transaction(withdrawalAmount);

        account.transaction(accountNo);
		
		System.out.println("Thank You for your transactions!");

        scanner.close();
    }
}



/*
OUTPUT:

E:\Anudip>javac BankAccount.java

E:\Anudip>java BankAccount
************** MINI BANK **************
Enter account number: BJK1223
Enter initial balance: 5000
Enter deposit amount: 2000
2000.0 deposited into account BJK1223 successfully.
Current balance: 7000.0
Enter withdrawal amount: 1000
1000.0 withdrawn successfully.
Balance for account BJK1223: 6000.0
Thank You for your transactions!

E:\Anudip>java BankAccount
************** MINI BANK **************
Enter account number: JKE56253
Enter initial balance: 1500
Enter deposit amount: 5000
5000.0 deposited into account JKE56253 successfully.
Current balance: 6500.0
Enter withdrawal amount: 7000
Insufficient funds. Withdrawal failed.
Balance for account JKE56253: 6500.0
Thank You for your transactions!
*/
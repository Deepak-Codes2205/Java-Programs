/*HIERARCHY INTERFACE PDF QUESTION
**Bank Account Management**
   - Create a base class called `BankAccount` with properties like `accountNumber`, `balance`, and methods like `deposit()` and `withdraw()`.
   - Derive classes like `SavingsAccount` and `CheckingAccount` from the `BankAccount` class.
   - Add additional properties and methods to the derived classes specific to their account types (e.g., `interestRate` for `SavingsAccount`, `overdraftFee` for `CheckingAccount`).
   - Create objects of the derived classes and test their methods, including method overriding if applicable.
*/

import java.util.Scanner;

interface BankAccount
{
	void input();
	void transaction();
	void interestrate();
	void overdraftFee();
}

class SavingsAccount implements BankAccount
{
	int bal,Acno,dep,with,r,Sbal;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the accountNumberand balance of the account : ");
		Acno=sc.nextInt();
		bal=sc.nextInt();
		System.out.println("Account number : "+Acno+" current balance : "+bal);
	}
	public void transaction()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount you want to deposit :");
		dep=sc.nextInt();
		bal=bal+dep;
		System.out.println("The account balance after deposit : "+bal);
		System.out.println("Enter the amount you want to withdraw :");
		with=sc.nextInt();
		bal=bal-with;
		System.out.println("The account balance after withdraw is : "+bal);
	}
	public void interestrate()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rate of interest :");
		r=sc.nextInt();
		Sbal=bal+(bal*5)/100;
		System.out.println("The total balance is : "+Sbal);
	}
	public void overdraftFee()
	{
	}	
}

class CheckingAccount implements BankAccount
{
	int bal,Acno,dep,with,r,Sbal,f;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the accountNumberand balance of the account : ");
		Acno=sc.nextInt();
		bal=sc.nextInt();
		System.out.println("Account number : "+Acno+" current balance : "+bal);
	}
	public void transaction()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount you want to deposit :");
		dep=sc.nextInt();
		bal=bal+dep;
		System.out.println("The account balance after deposit : "+bal);
		System.out.println("Enter the amount you want to withdraw :");
		with=sc.nextInt();
		bal=bal-with;
		System.out.println("The total account balance after withdraw is : "+bal);
	}
	public void interestrate()
	{
	}
	public void overdraftFee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the overdraft fees :");
		f=sc.nextInt();
		Sbal=bal-f;
		System.out.println("The total account balance after overdraft fees is : "+bal);
	}
	public static void main(String [] ar)
	{
		CheckingAccount ob1=new CheckingAccount();
		ob1.input();
		ob1.transaction();
		ob1.interestrate();
		ob1.overdraftFee();
		SavingsAccount ob2=new SavingsAccount();
		ob2.input();
		ob2.transaction();
		ob2.interestrate();
		ob2.overdraftFee();
	}
	
}

		
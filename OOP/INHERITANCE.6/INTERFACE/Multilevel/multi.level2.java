/* MULTIPLE LEVEL INTERFACE */

import java.util.Scanner;

interface Bank
{
	void B_name();
}

interface customar extends Bank
{
	void Accountno();
	void Transactions();
}

class bank_details implements customar
{
	String b,nm;
	int acc,bal,with,dep;
	public void B_name()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name and branch of the bank resp. :");
		nm=sc.nextLine();
		b=sc.nextLine();
		System.out.println("Bank name : "+nm+"Branch : "+b);
	}
	
	public void Accountno()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account no:");
		acc=sc.nextInt();
	}
	
	public void Transactions()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account balance :");
		bal=sc.nextInt();
		System.out.println("Account balance :"+ bal);
		System.out.println("Enter the amount you want to withdraw :");
		with=sc.nextInt();
		bal=bal-with;
		System.out.println("Balance after withdraw : "+with);
		System.out.println("Enter the amount you want to deposit :");
		dep=sc.nextInt();
		bal=bal+dep;
		System.out.println("The total balance is : "+bal);
	}
	
	public static void main(String [] ar)
	{
		bank_details ob=new bank_details();
		ob.B_name();
		ob.Accountno();
		ob.Transactions();
	}
}
		
		
		
		
		

/*INHERITANCE 
PDF QUESTION 5*/


import java.util.Scanner;
class Account
{
	int accno,bal,w,dep,amt,r;
	void input(int a,int b)
	{
		Scanner sc=new Scanner(System.in);
		accno =a;
		bal=b;
		System.out.println("The account no is :"+accno);
		System.out.println("The account balance is :"+bal);
	}
		
	void withdraw()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount you want to withdraw");
		Scanner sc=new Scanner(System.in);
		bal=bal-w;
		System.out.println("The new balance amount after deduction is :"+bal);
	}
	void deposit(int d)
	{
		dep=d;
		bal=bal+dep;
		System.out.println("The new balance amount after deposit is :"+bal);
	}
	
class Calculate extends Account
{
	void accept(int x)
	{
		int si,t;
		r=x;
		System.out.println("Enter the time period ");
		t=sc.nextInt();
		si=(bal*r*t)/100;
		System.out.println("The simple interest generated is :"+si);
		bal=bal+si;
	}
	int ac,bala;
	void display()
	{
		System.out.println("The simple interest generated is :"+si);
		System.out.println("The total amount is :"+bal);
	}
	
	public static void main(String [] ar)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account no");
		ac=nextInt();
		System.out.println("Enter the account balance");
		bala=nextInt();
		statement ob=new statement();
		ob.input(ac,bala);
		ob.withdraw();
		ob.deposit();
		ob.accept();
		ob.display();
	}
}
			
	
	
	
		
		
		
		
		
	
	
		
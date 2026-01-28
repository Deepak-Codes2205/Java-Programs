/* CONSTRUCTOR OVERRIDING
	1-Parent Parameterized, Child Default
	2-Parent Parameterized, Child Parameterized 
*/

import java.util.Scanner;

class Account
{
	int accno,bal,wd,dep;
	Account(int a,int b)
	{
		accno=a;
		bal=b;
		System.out.println("Account no is : "+accno+" and balance is :"+bal);
	}
	
	void withdraw(int x)
	{
		Scanner sc=new Scanner(System.in);
		int wd=x;
		bal=bal-wd;
		System.out.println("Account balance after withdrawing rupees :"+wd+" is :"+bal);
	}
	void deposit(int t)
	{
		dep=t;
		bal=bal+dep;
		System.out.println("Account balance after depositing rupees :"+dep+" is :"+bal);
	}
}

class Calculate extends Account
{
	int r,t,si;
	Calculate()
	{
		super(300131101,90000000);
	}
	void accept(int x,int y)
	{
		r=x;
		t=y;
	}
	
	void compute()
	{
		si=(bal*r*t)/100;
		bal=bal+si;
	}
	void display()
	{
		System.out.println("Account no is :"+accno);
		System.out.println("The simple interset generated is :"+si);
		System.out.println("the total balance amount is :"+bal);
	}
	public static void main(String [] ar)
	{
		Calculate ob=new Calculate();
		ob.withdraw(10000);
		ob.deposit(25000);
		ob.accept(5,2);
		ob.compute();
		ob.display();
	}
}
		
		
		
		
	

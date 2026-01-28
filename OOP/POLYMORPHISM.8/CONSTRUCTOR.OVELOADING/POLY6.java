/*POLYMORPHISM
 CONSTRUCTOR OVERLOADING */

import java.util.Scanner;

class Bill
{
	String nm;
	int  b_no,noc;
	double amt=0;
	Bill()
	{
		nm="";
		b_no=0;
		noc=0;
	}
	
	Bill(String name,int billno,int no_calls)
	{
		nm=name;
		b_no=billno;
		noc=no_calls;
		System.out.println(nm+" your bill no is : "+b_no+" your no of calls are : "+noc);
	}
	
	void calculate()
	{
		if(noc<=100)
			amt=noc*0.60;
		else if(noc>100 && noc<=200)
			amt=noc*0.80;
		else if(noc>200 && noc<=300)
			amt=noc*1.20;
		else if(noc>300)
			amt=noc*1.50;
		System.out.println("Your bill amount to : "+amt+" dollors");
	}
			
	public static void main(String [] ar)
	{
		int c,b;
		String n;
		Bill ob;
		ob=new Bill();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name,bill no ,no of calls of the customar");
		n=sc.nextLine();
		b=sc.nextInt();
		c=sc.nextInt();
		ob=new Bill(n,b,c);
		ob.calculate();
	}
}
		
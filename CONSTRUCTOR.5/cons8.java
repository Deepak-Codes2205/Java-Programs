/* CONSTRUCTOR 
PDF QUESTION NO 11 : TELEPHONE BILL*/

import java.util.Scanner;

class Bill
{
	String name;
	int bno,call;
	double amt;
	Bill(String nm ,int bill_no,int nocall)
	{
		name=nm;
		bno=bill_no;
		call=nocall;
	}
	void Calculate()
	{
		if(call<=100)
			amt=call*0.60;
		else if(call>=101 && call<200)
			amt=call*0.80;
		else if(call>=201 && call<300)
			amt=call*1.20;
		else if(call>=301)
			amt=call*1.50;
		System.out.println("CUSTOMER NAME :"+name+" BILL NO :"+bno+" CONSISTS OF NO OF CALLS :"+call+" THERFORE YOUR BILL AMOUNTS TO RUPEES :"+amt);
	}
	public static void main(String [] ar)
	{
		int bill_num,clls;
		String naam;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		naam =sc.nextLine();
		System.out.println("Enter the bill_no");
		bill_num=sc.nextInt();
		System.out.println("Enter the no of calls");
		clls=sc.nextInt();
		Bill ob=new Bill(naam,bill_num,clls);
		ob.Calculate();
	}
}
		
		
	
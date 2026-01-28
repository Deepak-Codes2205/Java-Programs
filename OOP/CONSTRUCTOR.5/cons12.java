/*CONSTRUCTOR 
PDF QUESTON NO 9 */

import java.util.Scanner;

class Grade_rev
{
	String name;
	int bas,expn;
	double inc ,nbas;
	Grade_rev()
	{
		name="";
		bas=0;
		expn=0;
		inc=0;
		nbas=0;
	}
	
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the employee");
		name=sc.nextLine();
		System.out.println("Enter the base salary:");
		bas=sc.nextInt();
		System.out.println("Enter the experience:");
		expn=sc.nextInt();
	}
	
	void increment()
	{
		if(expn<=3)
			inc=1000+(bas*10)/100;
		else if(expn>3 && expn<=5)
			inc=3000+(bas*12)/100;
		else if(expn>5 && expn<=10)
			inc=5000+(bas*15)/100;
		else if(expn>10)
			inc=8000+(bas*20)/100;
		nbas=bas+inc;
	}
	void display()
	{
	System.out.println("EMPLOYEE NAME :"+name+" "+"BASIC SALARY :"+bas+" "+"EXPERIENCE :"+expn+" "+"INCREMENT:"+inc+" "+"NEW SALARY :"+nbas);
	}
	public static void main(String [] ar)
	{
		Grade_rev ob=new Grade_rev();
		ob.accept();
		ob.increment();
		ob.display();
	}
}
		
			
		
		
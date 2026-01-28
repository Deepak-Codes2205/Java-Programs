/* CONSTRUCTOR 
QUESTION NO 2:TO PRINT THE BILL OF LAPTOP AFTER DISCOUNT WHICH DEPENDS UPON THE PRICE OF LAPTOP */

import java.util.Scanner;

class Laptop
{
	String name;
	int price;
	double dis,amt;
	
	Laptop(String n,int p)
	{
		name=n;
		price=p;
	}
	void calculate()
	{
		if(price<=25000)
			dis=(price*5)/100;
		else if(price>=25001 && price<=50000)
			dis=(price*7.5)/100;
		else if(price>=50001 && price<=100000)
			dis=(price*10)/100;
		else if(price>100000)
			dis=(price*15)/100;
		amt=price-dis;
		System.out.println("the discount is :"+dis+" and the amount is :"+amt);
	}
	public static void main(String [] ar)
	{
		String nm;
		int pr;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your name");
		nm=sc.nextLine();
		System.out.println("enter the price of the laptop");
		pr=sc.nextInt();
		Laptop ob=new Laptop(nm,pr);
		ob.calculate();
	}
}
		
		
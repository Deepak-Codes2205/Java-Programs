/*CONSTRUCTOR 
PDF QUESTION NO 12 */

import java.util.Scanner;

class Bookfair
{
	String bname;
	double price,nprice;
	Bookfair()
	{
		bname=" ";
		price=0.0;
		nprice=0.0;
	}
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name of the book");
		bname=sc.nextLine();
		System.out.println("enter the price of the book");
		price=sc.nextInt();
	}
	void calculate()
	{
		if(price>=1000)
			nprice=price-(price*2)/100;
		else if(price>1000 && price<=3000)
			nprice=price-(price*10)/100;
		else if(price>=1000)
			nprice=price-(price*15)/100;
	}
	void display()
	{
		System.out.println("BOOK NAME :"+bname+" "+"PRICE BEFORE DISCOUNT :"+price+" "+"PRICE AFTER DISCOUNT"+nprice);
	}
	public static void main(String [] ar)
	{
		Bookfair ob=new Bookfair();
		ob.input();
		ob.calculate();
		ob.display();
	}
}
		
		
		
		
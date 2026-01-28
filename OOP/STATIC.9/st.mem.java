/* STATIC 
   DATA MEMBERS */

import java.util.Scanner;

class ABC
{
	int a=10;
	static int b=10; /*STATIC VARIABLE INICIALIZATION */

	void Add()
	{
		a+=10;
		b+=10;
	}

	void display()
	{
		System.out.println("the value of a is : "+a);
		System.out.println("the value of b is : "+b);
	}

	public static void main(String [] ar)
	{
		System.out.println("the inicial values b is :"+b); /* STATIC VARIABLE CAN BE ACCESED INSIDE MAIN */
		ABC ob1=new ABC();
		ABC ob2=new ABC();
		ABC ob3=new ABC();
		
		ob1.Add();
		ob1.display();
		
		ob2.Add();
		ob2.display();
		
		ob3.Add();
		ob3.display();
	}
}

	
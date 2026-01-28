/* POLYMORPHISM  
1.1 FUNCTION OVERLOADING PDF QUESTION 4 */

import java.util.Scanner;

class shapes
{
	double ar1,ar2,ar3;
	void area(double r)
	{
		ar1=3.14*r*r;
		System.out.println("The area of circle is : "+ar1);
	}
	
	void area(int l,int b)
	{
		ar2=l*b;
		System.out.println("The area of rectangle is : "+ar2);
	}
	
	void area(int s)
	{
		ar3=s*s;
		System.out.println("The area of square is : "+ar3);
	}

	public static void main(String [] ar)
	{
		shapes ob=new shapes();
		ob.area(4d);
		ob.area(10,20);
		ob.area(4);
	}
}
	
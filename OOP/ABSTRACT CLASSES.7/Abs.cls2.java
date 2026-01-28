/* ABSTRACT CLASS */

import java.util.Scanner;

abstract class shape
{
	abstract void calculate_area();
	abstract void calculate_perimeter();
}

class Circle extends shape
{
	double r,ar,pr;
	void calculate_area()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the circle :");
		r=sc.nextInt();
		ar=3.14*r*r;
	}
	
	void calculate_perimeter()
	{
		pr=2*3.14*r;
		System.out.println("The area of circle is : "+ar+" and its perimeter is : "+pr);
	}
}

class Rectangle extends shape
{
	double l,b,ar,pr;
	void calculate_area()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and breadth of the Rectangle :");
		l=sc.nextInt();
		b=sc.nextInt();
		ar=l*b;
	}
	
	void calculate_perimeter()
	{
		pr=2*(l+b);
		System.out.println("The area of rectangle is : "+ar+" and its perimeter is : "+pr);
	}
	
	public static void main(String [] ar)
	{
		Rectangle ob1=new Rectangle();
		ob1.calculate_area();
		ob1.calculate_perimeter();
		Circle ob2=new Circle();
		ob2.calculate_area();
		ob2.calculate_perimeter();
	}
		
		
}

		
	
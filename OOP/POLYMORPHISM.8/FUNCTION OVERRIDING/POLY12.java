/*FUNCTION OVERRIDNIG EXAMPLE */
import java.util.Scanner;

class circle
{
	double ar1=0.0d;
	void area()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the  circle :");
		int r=sc.nextInt();
		ar1=3.14*r*r;
		System.out.println("Area of Circle : "+ar1);
	}
}

class rectangle extends circle 
{
	double ar2=0.0d;
	void area()
	{
		super.area();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the lenghth and breadth of the rectangle :");
		int l=sc.nextInt();
		int b=sc.nextInt();
		ar2=l*b;
		System.out.println("Area of Rectangle :"+ar2);
	}
}

class square extends rectangle
{
	double ar3=0.0d;
	void area()
	{
		super.area();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of the square :");
		int s=sc.nextInt();
		ar3=s*s;
		System.out.println("Area or Square : "+ar3);
	}
	
	public static void main(String [] ar)
	{
		square ob=new square();
		ob.area();
	}
}
	
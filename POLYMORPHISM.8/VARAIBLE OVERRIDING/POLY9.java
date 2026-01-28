/* VARIABLE  OVERRIDING AND FUNCTION OVERRIDNIG EXAMPLE */
import java.util.Scanner;

class circle
{
	double ar=0.0d;
	void area()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the  circle :");
		int r=sc.nextInt();
		ar=3.14*r*r;
	}
}

class rectangle extends circle 
{
	double ar=0.0d;
	void area()
	{
		super.area();
		System.out.println("Area of Circle "+super.ar);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the lenghth and breadth of the rectangle :");
		int l=sc.nextInt();
		int b=sc.nextInt();
		ar=l*b;
	}
}

class square extends rectangle
{
	double ar=0.0d;
	void area()
	{
		super.area();
		System.out.println("Area of Rectangle "+super.ar);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of the square :");
		int s=sc.nextInt();
		ar=s*s;
		System.out.println("Area or Square "+ar);
	}
	
	public static void main(String [] ar)
	{
		square ob=new square();
		ob.area();
	}
}
	
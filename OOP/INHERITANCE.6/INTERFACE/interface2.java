/* SINGLE LEVEL INTERFACE */
import java.util.Scanner;

interface triangle
{
	void area();
	void perimeter();
}

class calculate implements triangle
{
	double a,b,c,ar,per,s;
	Scanner sc=new Scanner(System.in);
	
	void input()
	{
		System.out.println("Enter the sides of the triangle :");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sides of the triangle :");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		s=(a+b+c)/2;
	}
	public void area()
	{
		ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("the area of the triangle is : "+ar);
	}
	public void perimeter()
	{
		per=a+b+c;
		System.out.println("the area of the triangle is : "+per);
	}
	public static void main(String [] ar)
	{
		calculate ob=new calculate();
		ob.input();
		ob.area();
		ob.perimeter();
	}
}
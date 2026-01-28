/* INTERFACE QUESTION
. **Shape Hierarchy**
   - Create a base class called `Shape` with properties like `color` and methods like `getArea()` and `getPerimeter()`.
   - Derive classes like `Circle`, `Rectangle`, and `Triangle` from the `Shape` class.
   - Implement the `getArea()` and `getPerimeter()` methods in each derived class based on their respective formulas.
   - Create objects of the derived classes and test their methods */
   
import java.util.Scanner;

interface Shape
{
	void getArea();
	void getPerimeter();
}

class Circle implements Shape
{
	double ar,pr,r=0;
	public void getArea()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		r=sc.nextInt();
		ar=3.14*r*r;
		System.out.println("The area of the circle is :"+ar);
	}
	public void getPerimeter()
	{
		pr=2*3.14*r;
	}	
}

class Triangle implements Shape
{
	double ar,pr,s,a,b,c;
	public void getArea()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sides of the triangle :");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		s=(a+b+c)/2;
		ar=Math.sqrt((s*(s-a)*(s-b)*(s-c)));
		System.out.println("The area of the triangle is :"+ar);
	}
	public void getPerimeter()
	{
		pr=a=b+c;
		System.out.println("The perimeter of the tringle is : "+pr);
	}	
}
class Rectangle implements Shape
{
	double ar,pr,l,b;
	public void getArea()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and breath of the triangle:");
		l=sc.nextInt();
		ar=l*b;
		System.out.println("The area of the Rectangle is :"+ar);
	}
	public void getPerimeter()
	{
		pr=2*(l+b);
		System.out.println("The perimeter of the Rectangle is : "+pr);
	}	
	public static void main(String [] ar)
	{
		Circle ob=new Circle();
		ob.getArea();
		ob.getPerimeter();
		Triangle ob1=new Triangle();
		ob1.getArea();
		ob1.getPerimeter();
		Rectangle ob2=new Rectangle();
		ob2.getArea();
		ob2.getPerimeter();
	}
}
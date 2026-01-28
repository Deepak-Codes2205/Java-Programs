/* MULTIPLE INHERITANCE */

import java.util.Scanner;

interface Rectangle
{
	void R_area();
	void R_perimeter();
}

interface Circle
{
	void C_area();
	void C_perimeter();
}

class calculate implements Rectangle ,Circle
{
	int l,b,r;
	double C_ar,C_pr,R_ar,R_pr;
	
	public void R_area()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and breadth of the recatangle :");
		l=sc.nextInt();
		b=sc.nextInt();
		R_ar=l*b;
	}
	public void R_perimeter()
	{
		R_pr=2*(l+b);
		System.out.println("The area of rectangle is : "+R_ar+" and its perimeter is : "+R_pr);
	}
	
	public void C_area()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the circle :");
		r=sc.nextInt();
		C_ar=3.14*r*r;
	}
	public void C_perimeter()
	{
		C_pr=2*3.14*r;
		System.out.println("The area of circle is : "+C_ar+" and its perimeter is : "+C_pr);
	}
	public static void main(String []  ar)
	{
		calculate ob=new calculate();
		ob.R_area();
		ob.R_perimeter();
		ob.C_area();
		ob.C_perimeter();
	}
}
	
	 
		
	
/* POLYMORPHISM  
1.1 FUNCTION OVERLOADING */

import java.util.Scanner;

class ABC
{
	void sum()
	{
		int a,b,c;
		a=10;
		b=20;
		c=a+b;
		System.out.println("The sum of the two no's is : "+c);
	}
	
	void sum(int x,int y)
	{
		int z=x+y;
		System.out.println("The sum of the two no's :"+z);
	}
	
	void sum(int x,int y,int d)
	{
		int p=x+y+d;
		System.out.println("The sum of the two no's :"+p);
	}
	
	public static void main(String [] ar)
	{
		ABC ob=new ABC();
		ob.sum();
		ob.sum(30,90);
		ob.sum(10,30,100);
	}
}
		
		

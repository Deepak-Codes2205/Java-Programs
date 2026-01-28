/*POLYMORPHISM
 CONSTRUCTOR OVERLOADING */

import java.util.Scanner;

class ABC
{
	int x,y,z;
	ABC()
	{
		x=0;
		y=0;
		z=0;
		
	}
	
	ABC(int p,int q)
	{
		x=p;
		y=p;
		z=0;
	}
	void sum()
	{
		z=x+y;
		System.out.println("The sum of two no's is : "+z);
	}
	public static void main(String [] ar)
	{
		ABC ob;
		ob=new ABC();
		ob=new ABC(10,20);
		ob.sum();
	}
}
/*CONSTRUCTOR 

DEFAULT CONSTRUCTOR */

import java.util.Scanner;

class ABC
{
	int x,y,z;
	void sum()
	{
		x=10;
		y=20;
		z=x+y;
		System.out.println("sum of two no's is :"+z);
	}
	public static void main(String [] ar)
	{
		ABC ob=new ABC();
		ob.sum();
	}
}
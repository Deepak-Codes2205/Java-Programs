/* ABSTRACT CLASS */

import java.util.Scanner;

abstract class ABC 
{
	int x,y;
	void input()
	{
		x=10;
		y=20;
	}
	abstract void sum();
}

class xyz extends ABC
{
	int z=0;
	void sum()
	{
		z=x+y;
		System.out.println("The sum of two no's is : "+z);
	}
	public static void main(String [] ar)
	{
		xyz ob=new xyz();
		ob.input();
		ob.sum();
	}
}
		
		
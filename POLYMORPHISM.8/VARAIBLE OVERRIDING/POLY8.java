/*VARIABLE OVERRIDING */

import java.util.Scanner;

class ABC
{
	int a=10;
}

class xyz extends ABC
{
	int a=15;
	void display(int a)
	{
		System.out.println("value of  a[display] is "+a);
		System.out.println("value of  a[this] is "+this.a);
		System.out.println("value of  a[super] is "+super.a);
	}
	public static void main(String [] ar)
	{
		xyz ob=new xyz();
		ob.display(20);
	}
	
}
		
		


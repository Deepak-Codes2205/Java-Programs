/*INHERITANCE 

-> Class Level Inheritance 
	1.1 : SINGLE LEVEL
*/

import java.util.Scanner;

class ABC
{
	int a,b;
	void input()
	{
		a=10;
		b=20;
	}
	
}
class xyz extends ABC
{
	int c=0;
	void sum()
	{
		c=a+b;
		System.out.println("The sum of two no's is :"+c);
	}
	public static void main(String [] ar)
	{
		xyz ob=new xyz();
		ob.input();
		ob.sum();
	}
	
}

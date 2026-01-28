/* SINGLE LEVEL INTERFACE */

import java.util.Scanner;
	
interface A
{
	int a=10;
	void input();
	void sum();
}

class xyz implements A
{
	int x,y,z;
	public void input()
	{
		x=10;
		y=20;
	}
	public void sum()
	{
		z=x+y+a;
		System.out.println("The sum of the no's is : "+z);
	}
	public static void  main(String [] ar)
	{
		xyz ob =new xyz();
		ob.input();
		ob.sum();
	}
}
	
	

/* CONSTRUCTORS 
DEFUALT/NON_PARAMETERIZED CONSTUCTOR 
*/


import java.util.Scanner;

class ABC
{
	int x,y,z;
	ABC()
	{
		x=25;
		y=20;
		z=0;
	}
	void sum()
	{
		z=x+y;
		System.out.println("sun of two no's is :"+z);
	}
	public static void main(String [] ar)
	{
		ABC ob=new ABC();
		ob.sum();
	}
}
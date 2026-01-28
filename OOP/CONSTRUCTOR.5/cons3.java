/* CONSTRUCTORS 
PARAMETERIZED */
import java.util.Scanner;

class ABC
{
	int x,y,z;
	ABC(int a,int b)
	{
		x=a;
		y=b;
	}
	void sum()
	{
		z=x+y;
		System.out.println("sum of two no's is :"+z);
	}
	public static void main(String [] ar)
	{
		ABC ob=new ABC(20,60);
		ob.sum();
	}
	/*2nd method for line 19 and 20 
	{
		ABC ob;
		ob=new ABC(20,60);
		ob.sum();
	}
	*/
}

	
/* CONSTRUCTOR 
COPY CONSTRUCTOR */

import java.util.Scanner;

class ABC
{
	int a,b;
	ABC()
	{
		a=10;
		b=30;
	}
	ABC(ABC x)
	{
		a=x.b;
		b=x.a;
	}
	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String [] ar)
	{
		ABC ob=new ABC();
		ABC ob1=new ABC(ob);
		ABC ob2=ob1;
		ABC ob3=ob;
		
		ob.display();
		ob1.display();
		ob2.display();
		ob3.display();	
	}
}
		
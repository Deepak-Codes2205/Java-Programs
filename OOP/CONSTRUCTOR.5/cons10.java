/* CONSTRUCTOR 
PDF QUESTION NUMBER 7 */

import java.util.Scanner;

class quad
{
	int a,b,c,d;
	quad(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
		d=0;
	}
	
	void calculate()
	{
		double r1=0,r2=0;
		d=(b*b)-(4*a*c);
		if(d<0)
			System.out.println("Roots not possibile");
		else 
		{
			r1=-(b+Math.sqrt(d))/(2*a);
			r2=-(b-Math.sqrt(d))/(2*a);
		}
		System.out.println("THE ROOTS ARE :"+r1+" "+r2);
	}
	public static void main(String [] ar)
	{
		int A,B,C;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the cofficients  of the expression ");
		A=sc.nextInt();
		B=sc.nextInt();
		C=sc.nextInt();
		quad ob=new quad(A,B,C);
		ob.calculate();
	}
}
		
			
			


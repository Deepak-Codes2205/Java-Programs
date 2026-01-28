/* BASIC */

import java.util.Scanner;

class ABC
{
	void calculate()
	{
		int h=0,j=0,c=0,f=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the hieght of the pole :");
		h=sc.nextInt();
		while(j!=h)
		{
			j=j-f;
			j=j+5;
			f=(j*20)/100;
			c=c+1;
		}
		System.out.println("It took "+c+" attempts to climb up the pole");
	}
	public static void main(String [] ar)
	{
		ABC ob=new ABC();
		ob.calculate();
	}
}
		
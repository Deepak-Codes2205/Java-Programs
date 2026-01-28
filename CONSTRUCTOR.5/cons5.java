/* CONSTRUCTOR */

import java.util.Scanner;

class HCFLCM 
{
	int a,b;
	
	HCFLCM(int x,int y)
	{
		a=x;
		b=y;
	}
	
	void calculate()
	{
		int hcf=0,lcm=0,r=1;
		int x=a;
		int y=b;
		while(r!=0)
		{
			r=a%b;
			a=b;
			b=r;
		}
		
		System.out.println("THE HCF OF THE TWO NO'S IS :"+a);
		lcm=(x*y)/a;
		System.out.println("THE LCM OF THE TWO NO'S IS :"+lcm);
	}	
	
	public static void main(String [] ar)
	{
		HCFLCM ob=new HCFLCM(5,4);
		ob.calculate();
	}
}		
		
			
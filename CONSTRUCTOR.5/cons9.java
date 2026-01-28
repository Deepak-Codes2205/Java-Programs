/*CONSTRUCTOR 
PDF QUESTION NO 6 */

import java.util.Scanner;

class Population
{
	float p,r;
	Population(int po,int rt)
	{
		p=po;
		r=rt;
	}
	void calculate()
	{
		float pt;
		pt=p*(1+r/100);
		System.out.println("THE POPULATION AT THE END OF THE YEAR IS :"+pt);
	}
	public static void main(String [] ar)
	{
		int i=2001,popu,rate;
		Scanner sc=new Scanner(System.in);
		while(i<=2007)
		{
			System.out.println("enter the initial population");
			popu=sc.nextInt();
			System.out.println("enter the rate at which  the growth occured");
			rate=sc.nextInt();
			Population ob=new Population(popu,rate);
			ob.calculate();
			i++;
		}
	}
}
			
			
			
			
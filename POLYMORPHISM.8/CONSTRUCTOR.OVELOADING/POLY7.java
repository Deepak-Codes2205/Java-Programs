/*POLYMORPHISM
 CONSTRUCTOR OVERLOADING */
 
import java.util.Scanner;

class people
{
	int p,r,s,e,pop;
	Population()
	{
		r=0;
	}
	Population(int R,int pop,int s,int f)
	{
		p=pop;
		y=s;
		e=f;
		r=R;S
		while(y<=e)
		{
			p=p*(1+(r/100));
			System.out.println("Population at the end of the year : "+y+" is "+p);
			y++;
		}
	}
	
	public static void main(String [] ar)
	{
		int rate,populat,start,end;
		ob=new people();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start and end year you want to calculate :");
		start=nextInt();
		end=nextInt();
		System.out.println("Enter the inicial population and rate of growth :");
		populat=sc.nextInt();
		rate=sc.nextInt();
		ob.Population();
		ob.Population(rate,populat,start,end);
	}
}
		
		
		
	
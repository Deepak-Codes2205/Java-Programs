/* POLYMORPHISM  
1.1 FUNCTION OVERLOADING PDF QUESTION 2 */

import java.util.Scanner;

class factors
{	
	void fact(int n)
	{
		int i=2,j=0;
		
		while(true)
		{
			if(n%i==0)
			{
				j=n/i;
				break;
			}
			i++;
		}
		System.out.println("First Factor is : "+i+" Second Factor is : "+j);
	}
	public static void main(String [] ar)
	{
		int num,k;
		factors ob=new factors();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no you want to check :");
		num=sc.nextInt();
		ob.fact(num);
	}
}

		
		
		
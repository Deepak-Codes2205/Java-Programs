/*INHERITANCE 
PDF QUESTION 1 */

import java.util.Scanner;

class number
{
	int n;
	void  input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		n=sc.nextInt();
	}
}
class prime extends number
{
	int i=1,c=0;
	void check()
	{
		while(i<n)
		{
			if(n%i==0)
				c++;
			i++;
		}
		if(c<=1)
			System.out.println("PRIME NUMBER :"+n);
		else 
			System.out.println("NOT A PRIME NO :");
	}
		
	public static void main(String [] ar)
	{
	prime ob=new prime();
	ob.input();
	ob.check();
	}
}
		
			
		
	
	
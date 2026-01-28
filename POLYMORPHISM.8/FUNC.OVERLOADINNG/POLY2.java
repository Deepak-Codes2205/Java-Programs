/* POLYMORPHISM  
1.1 FUNCTION OVERLOADING QUESTION */

import java.util.Scanner;

class ABC
{	
	int Pronic(int n)
	{
		int i=0,p=0;
		while(i<n)
		{
			p=i*(i+1);
			if(p==n)
				return (1);
			else
				return (0);
		}
	}
	public static void main(String [] ar)
	{
		int num,k;
		ABC ob=new ABC();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no you want to check :");
		num=sc.nextInt();
		k=ob.Pronic(num);
		if(k==1)
			System.out.println("It is a pronic number :");
		else if(k==0);
			System.out.println("Not a pronic number :");	
	}
}

		
		
		
/*INHERITANCE 
PDF QUESTION 2 */

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
class factorial extends number
{
	int i=1,fact=1;
	void calculate()
	{
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		
		System.out.println("THE FACTORIAL OF THE NUMBER IS:"+fact);
	}
		
	public static void main(String [] ar)
	{
		factorial ob=new factorial();
		ob.input();
		ob.calculate();
	}
}
		
			
		
	
	
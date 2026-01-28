/* TO PRINT THE FIRST CHARACTERS OF THE LETTERS OF THE STRING */

import java.util.Scanner;

class stringss
{
	public static void main(String [] ar)
	{
		String s1;
		char Ch;
		int m=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		s1=sc.nextLine();
		/*s1=" "+s1;
		System.out.println("The string is :"+s1);
		for(int i=0;i<s1.length();i++)
		{
			Ch=s1.charAt(i);
			if(Ch==' ')
				System.out.print(Ch+" ");
		}*/
		System.out.println("The string is :"+s1);
		for(int i=0;i<s1.length();i++)
		{
			Ch=s1.charAt(i);
			if(m==0)
				System.out.print(Ch+" ");
				m++;
			if(Ch==' ')
				m=0;
			else 
				m=1;
		}	
	}
}
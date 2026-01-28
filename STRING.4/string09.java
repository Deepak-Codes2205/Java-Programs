/* TO PRINT THE ASCII VALUES OF THE LETTERS OF THE STRING */

import java.util.Scanner;

class stringss
{
	public static void main(String [] ar)
	{
		String s1;
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string :");
		s1=sc.nextLine();
		System.out.println("The string is :"+s1);
		for(i=0;i<s1.length();i++)
		{
			char Ch=s1.charAt(i);
			int p=Ch;
			System.out.println(Ch+" :"+p);
		}
	}
}
				
				
			
		
			
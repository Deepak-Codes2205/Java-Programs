/* TO MAKE A NEW WORD FROM THE FIRST LETTERS OF ALL THE WORDS OF THE STRING */

import java.util.Scanner;

class stringss
{
	public static void main(String [] ar)
	{
		String s1;
		int m=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		s1=sc.nextLine();
		System.out.println("The string is :"+s1);
		for(int i=0;i<s1.length();i++) 
		{
			char Ch=s1.charAt(i);
			if(m==0)
				System.out.print(Ch);
			if(Ch==' ')
				m=0;
			else 
				m=1;
		}
	}
}
			
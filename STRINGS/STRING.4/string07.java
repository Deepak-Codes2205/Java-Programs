/* TO PLACE THE LAST WORD OF THE STRING AT THE FIRST */

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
		System.out.println("The string is :"+s1);
		int j=s1.length();
		Ch=s1.charAt(j);
		while(Ch!=' ')
		{
			j--;
			Ch=s1.charAt(j);
		}
		for(int i=j+1;i<=s1.length();i++)
		{
			Ch=s1.charAt(i);
			System.out.println(Ch);
		}
		for(int i=0;i<=j;i++)
		{
			Ch=s1.charAt(i);
			System.out.println(Ch);
		}
	}
}
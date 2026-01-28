/* TO PRINT THE NO OF WORDS AND NO OF LETTERS IN A STRING */

import java.util.Scanner;

class stringss
{
	public static void main(String [] ar)
	{
		String s1;
		int w=0,l=0;
		char Ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		s1=sc.nextLine();
		System.out.println("The string is :"+s1);
		for(int i=0;i<s1.length();i++)
		{
			Ch=s1.charAt(i);
			if(Character.isWhitespace(Ch))
				w++;
		}
		w++;
		
		System.out.println("the no of words are :"+w);
		for(int i=0;i<s1.length();i++)
		{
			Ch=s1.charAt(i);
			if(Character.isLetter(Ch))
				l++;
		}
		System.out.println("the no of letters are :"+l);
	}
}
		
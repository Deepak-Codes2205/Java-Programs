/* TO REMOVE THE VOWELS AND  */

import java.util.Scanner;

class stringss
{
	public static void main(String [] ar)
	{
		String s1;
		char Ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		s1=sc.nextLine();
		System.out.println("The string is :"+s1);
		for(int i=0;i<s1.length();i++)
		{
			Ch=s1.charAt(i);
			if(Ch!='a'&& Ch!='e'&& Ch!='i'&& Ch!='o'&& Ch!='u'&& Ch!='A'&& Ch!='E'&& Ch!='I'&& Ch!='O'&& Ch!='U')
				System.out.println(Ch);
		}
	}
}
				
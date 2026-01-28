/* TO REPLACE ALL THE VOWELS OF THE STRING  BY * */

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
			if(Ch!='a'&& Ch!='e'&& Ch!='i'&& Ch!='o'&& Ch!='u'&& Ch!='A'&& Ch!='E'&& Ch!='I'&& Ch!='O'&& Ch!='U')
				System.out.print(Ch);
			else 
				System.out.println("*");
		}
	}
}
				
				
			
		
			
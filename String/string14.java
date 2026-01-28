

/* TO ENTER A STRING AND PRINT THE ELEMENTS WHICH ARE PALLINDROME LIKE MOM,DAD,POP,TAT etc */

import java.util.Scanner;

class stringss
{
	public static void main(String [] ar)
	{
		String s1,s3,s4;
		char f='d',l='e';

		 
		int i=0,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		s1=sc.nextLine();
		s1=s1+" ";
		System.out.println("The String is :"+s1);
		System.out.println("The Palindrome Elements Are :");
		while(i<s1.length())
		{
			s3="";
			s4="";
			do
			{
				char ch=s1.charAt(i);
				s3=s3+ch;
				s4=ch+s4;
				i++;
			}while(s1.charAt(i)!=' ');
			
			if(s3.equals(s4))
				System.out.println(s3);
			
		}
	}
}
				
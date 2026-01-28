/* TO PRINT THE LONGEST WORD IN A STRING */

import java.util.Scanner;

class stringss
{
	public static void main(String [] ar)
	{
		String s1,s2="",s3="";
		int max=0,prev=0,i=0;
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		s1=sc.nextLine();
		System.out.println("The String is :"+s1);
		
		while(i<s1.length())
		{
			ch=s1.charAt(i);
			while(ch!=' ');
			{
				s2=s2+ch;
				i++;
				ch=s1.charAt(i);
			}
			max=s2.length();
			if(prev>=max)
			{
				max=prev;
				s3=s3;
			}
			else
			{
				prev=max;
				s3="";
				s3=s2;
			}
			s2="";
			i++;
		}
		System.out.println("the largest word is :"+s3);
	}
}
	
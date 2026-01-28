/* WRITE A PROGRAM TO ACCEPT A WORD AND CONVERT IT INTO LOWER CASE  IF IT IS IN UPPER CASE REPLACE ALL THE VOWELS BY THE LETTERS
FOLLOWING IT */

import java.util.Scanner;

class stringss
{
	public static void main(String [] ar)
	{
		String s1,s2="",s3="";
		int i=0,v,prev=0,p=0;
		char ch,ch2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		s1=sc.nextLine();
		System.out.println("The String is :"+s1);
		
		i=0;
		
		while(i<s1.length())
		{
			ch=s1.charAt(i);
			if(ch=='a'|| ch=='e'||ch =='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'||ch=='I'|| ch=='O'||ch=='U')
			{
				ch++;
				s2=s2+ch;
			}
			else 
			{
				s2=s2+ch;
			}
			i++;
		}
		System.out.println("The string after changes is :"+s2);
	}
}
					
/* TO PRINT THE WORD THAT CONTANS THE MAXIMUM NUMBERS OF VOWELS */

import java.util.Scanner;

class stringss
{
	public static void main(String [] in)
	{
		String s1,s2="",s3="";
		int i=0,v,prev=0;
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		s1=sc.nextLine();
		s1=s1+" ";
		System.out.println("The String is :"+s1);
		while(i<s1.length())
		{
			v=0;
			while(s1.charAt(i)!=' ')
			{
				ch=s1.charAt(i);
				s2=s2+ch;
				if(ch=='a'&& ch=='e'&& ch =='i'&& ch=='o'&& ch=='u'&& ch=='A'&& ch=='E'&& ch=='I'&& ch=='O'&& ch=='U')
					v=v+1;
				i++;
			}
			if(v>=prev)
			{
				prev=v;
				s3=s2;
			}
			s2=" ";
			s3=s3+" ";
			i++;
		}
		System.out.println("The word with maximum vowels is :"+s3);
	}
}
				
			

				
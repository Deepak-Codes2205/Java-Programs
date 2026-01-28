/* TO PRINT THE LONGEST WORD IN A STRING */

import java.util.Scanner;

class stringss
{
	public static void main(String [] ar)
	{
		String s1,s2="",s3="";
		String max="";
		
		int prev=0,i=0;
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		s1=sc.nextLine();
		s1=s1+" ";
		System.out.println("The String is :"+s1);
		
		while(i<s1.length())
		{
			do
			{
				ch=s1.charAt(i);
				s2=s2+ch;
				i++;
				
			}while(s1.charAt(i)!=' ');
			System.out.println(s2+":"+s2.length());
			
			if(max.length()<s2.length()) 
				max=s2;
		
			s2="";
			i++;
		}
		System.out.println("the largest word is :"+max);
	}
}
	
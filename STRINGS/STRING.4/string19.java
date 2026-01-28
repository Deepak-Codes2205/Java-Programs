/* WRITE A PROGRAM TO CHECK WHETHER A STRING IS UNIQUE(NO LETTER GETS REPEATED) */

import java.util.Scanner;

class stringss
{
	public static void main(String [] ar)
	{
		String s1,s2="",s3="";
		int i=0,c=0,j=0;
		char ch1,ch2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		s1=sc.nextLine();
		s1=s1+" ";
		System.out.println("The String is :"+s1);
		while(i<s1.length())/* here we have taken till (s1.length()) but we can also take it till =(s1.length()-1)*/
		{
			j=i+1;
			ch1=s1.charAt(i);
			while(j<s1.length())
			{
				ch2=s1.charAt(j);
				if(ch1==ch2)
					c=c+1;
				j++;
			}
			i++;
		}
		if(c==0)
			System.out.println("It is a unique string");
		else 
			System.out.println("Not a unique string");
	}	
}

					
/* TO ENTER A STRING AND PRINT THE WORDS OF THE STRING FROM END 
EXAMPLE : COMPUTER IS FUN PRINT IT AS FUN IS COMPUTER */ 

import java.util.Scanner;

class stringss
{
	public static void main(String [] ar)
	{
		String s1,s2="";
		char ch;
		int i=1,k=0,j=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		s1=sc.nextLine();
		s1=" "+s1;
		System.out.println("The String is :"+s1);
		k=s1.length();
		while(i>0)
		{
			i=k-1;
			while(s1.charAt(i)!=' ')
				i--;
				
			for(j=i+1;j<k;j++)
			{
				ch=s1.charAt(j);
				s2=s2+ch;
			}
			System.out.println(s2);
			s2=s2+" ";
			k=i;
		}
		i=0;
		System.out.println("the reverse string is :"+s2);
	}
}
				
				
				
/* TO ENTER A STRING AND DISPLAY THE LONGEST WORD AND THE LENGTH OF THAT WORD PRESENT IN THE STRING */

import java.util.Scanner;

class stringss
{
	public static void main(String [] ar)
	{
		string s1;
		int i=0,j=0,l=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string :");
		s1=sc.nextLine();
		System.out.println("The string is :"+s1);
		char Ch1=s1.charAt(i);
		int I=0,J=0,max=0;
		while(i<=s1.length())
		{
			Ch=s1.charAT(max);
			j=i=l;
			while(Ch1!=' ')
			{
				m++;
				j++;
				i++;
				char Ch1=s1.charAt(i);
			}
			j++;
			Ch1=s1.charAt(j);
			while(Ch1!=' ')
			{
				l=l+1;
				j=j+1;
				char Ch1=s1.charAt(j);
			}
			if(m<l)
				max=l;
		}
	}
}
				
				
			
		
			
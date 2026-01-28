/* WRITE A PROGRAM TO COUNT THE PAIRS OF SIMILAR LETTER WHICH ARE OCCURING SIMULTANIOUSLY IN A STRING */

import java.util.Scanner;

class stringss
{
	public static void main(String [] ar)
	{
		String s1;
		int i=0,c=0,j=0;
		char ch1,ch2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		s1=sc.nextLine();
		s1=s1+" ";
		System.out.println("The String is :"+s1);
		
		while(j<s1.length())
		{
			j=i+1;
			ch1=s1.charAt(i);
			ch2=s1.charAt(j);

			if(ch1==ch2)
				c=c+1;
			j++;
			i++;
		}
		System.out.println("THE NO OF PAIRS OF SIMILAR LETTER WHICH ARE OCCURING SIMULTANIOUSLY IN A STRING ARE :"+c);
	}	
}

					
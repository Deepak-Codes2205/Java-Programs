/* WRITE A PROGRAM TO PRINT THE FREQUENCY OF EACH LETTER OF THE STRING IN A ALPHABETICAL ORDER */

import java.util.Scanner;

class stringss
{
	public static void main(String [] ar)
	{
		String s1,s2="",s3="";
		int i=0,j=0;
		char ch1,ch2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		s1=sc.nextLine();
		s1=s1.toUpperCase();
		System.out.println("The String is :"+s1);
		
		for(ch1='A';ch1<='Z';ch1++)
		{
			int c=0;
			j=0;
			while(j<s1.length())
			{
				ch2=s1.charAt(j);
				if(ch1==ch2)
					c=c+1;
			
				j++;
			}
			if(c>=1)
				System.out.println("letter :"+ch1+" frequency :"+c);
		}
	}	
}


					
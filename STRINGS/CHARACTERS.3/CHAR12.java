/* TO TAKE TWO INPUT LETTER AND PRINT ALL THE CHARACTER BETWEEN THEM INCLUDING FIRST AND LAST */

import java.util.Scanner;

class characters
{
	public static void main(String [] ar)
	{
		char Ch1,Ch2;
		int p1=0,p2=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first character");
		Ch1=sc.next().charAt(0);
		p1=Ch1;
		
		System.out.println("enter the last character");
		Ch2=sc.next().charAt(0);
		p2=Ch2;
		while(p1<=p2)
		{
			System.out.println(Ch1);
			p1=p1+1;
			Ch1=(char)p1;
		}
	}
}
	
		
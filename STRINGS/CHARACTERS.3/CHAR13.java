/* TO TAKE TWO INPUT LETTER AND SUBSTRACT THEM AND PRINT THE CHARACTER VALUE OF THE RESULT */

import java.util.Scanner;

class characters
{
	public static void main(String [] ar)
	{
		char Ch1,Ch2,Ch3;
		int p1=0,p2=0,p=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first character");
		Ch1=sc.next().charAt(0);
		p1=Ch1;
		System.out.println(p1);
		System.out.println("enter the last character");
		Ch2=sc.next().charAt(0);
		p2=Ch2;
		System.out.println(p2);
		p=p2-p1;
		Ch3=(char)p;
		System.out.println("the result character value is :"+Ch3);
	}
}
	
		
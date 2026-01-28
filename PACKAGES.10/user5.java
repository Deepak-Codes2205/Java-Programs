/* PACKAGES */
/* mypack5 */

import java.util.Scanner;

import mypack5.*;

class user5
{
	public static void main(String [] ar)
	{
		int num,i;
		char Ch1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no yoyu want to check :");
		num=sc.nextInt();
		System.out.println("Enter the character you want to check :");
		Ch1=sc.next().charAt(0);
		lib5 ob=new lib5();
		i=ob.check(num,Ch1);
		if(i<=2)
		{
			if(i==1)
				System.out.println("The character is s and the number is divisible by 7:");
			else if(i==2)
				System.out.println("The character is s and the number is not divisible by 7:");
		}
		else if(i>2)
		{
			if(i==3)
				System.out.println("The character is not s and the last digit is 7:");
			else if(i==4)
				System.out.println("The character is not s and the last digit is not 7:");
		}
	}
}

			
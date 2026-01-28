/*TO CHECK WHETHER A CHARACTER IS UPPER CASE */

import java.util.Scanner;

class characters
{
	public static void main(String [] ar)
	{
		char Ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the character");
		Ch=sc.next().charAt(0);
		System.out.println("the charcter is :"+Ch);
		if(Character.isUpperCase(Ch))
			System.out.println("TRUE");
		else 
			System.out.println("FALSE");
	}	
}
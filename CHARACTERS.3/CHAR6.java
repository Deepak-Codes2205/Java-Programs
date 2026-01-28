/*TO CHECK WHETHER A CHARACTER IS WHITESPACE */

import java.util.Scanner;

class characters
{
	public static void main(String [] ar)
	{
		char Ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the character");
		Ch=sc.nextLine().charAt(0);
		System.out.println("the charcter is :"+Ch);
		if(Character.isWhitespace(Ch))
			System.out.println("TRUE");
		else  
			System.out.println("FALSE");
	}	
}
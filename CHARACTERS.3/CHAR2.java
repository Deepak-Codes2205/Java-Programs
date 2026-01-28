// TO CHECK WHEATHER A CHARACTER IS LETTER OR DIGIT OR NOT 

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
		if(Character.isLetterOrDigit(Ch))
			System.out.println("TRUE");
		else 
			System.out.println("FALSE");
	}
		
		
}
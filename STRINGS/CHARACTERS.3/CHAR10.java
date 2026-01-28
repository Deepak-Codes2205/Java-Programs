/* INPUT A CHARACTER AND CHECK THE CHARACTER IS LETTER OR DIGIT OR SPACE OR SPECIAL CHARACTER  IF IT IS A LETTER THEN CHECK WHETHER UPPER CASE OR
LOWER CASE LETTER AND AND IF UPPER CONVERT TO LOWER AND VISA VERSA*/

import java.util.Scanner;

class characters
{
	public static void main(String [] ar)
	{
		char Ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the chracter");
		Ch=sc.nextLine().charAt(0);
		int p=Ch;
		System.out.println("the character is :"+Ch);
		if(Character.isLetter(Ch))
		{
			System.out.println("LETTER");
			if(Character.isUpperCase(Ch))
			{
				p=p+32;
				Ch=(char)p;
				System.out.println("the character after the conversion into lower case :"+Ch);
			}	
			else 
			{
				p=p-32;
				Ch=(char)p;
				System.out.println("the character after the conversion into upper case:"+Ch);
			}
		}
		else if(Character.isDigit(Ch))
			System.out.println("DIGIT");
		else if(Character.isWhitespace(Ch))
			System.out.println("SPACE");
		else 
			System.out.println("SPECIAL CHARACTER");
	}
}
			
		
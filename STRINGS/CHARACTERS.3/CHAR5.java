/*TO CHECK WHETHER A CHARACTER IS LOWER CASE */

import java.util.Scanner;

class characters
{
	public static void main(String [] ar)
	{
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the character");
		ch=sc.next().charAt(0);
		System.out.println("the charcter is :"+ch);
		if(Character.isLowerCase(ch))
			System.out.println("TRUE");wite
		else 
			System.out.println("FALSE");
	}	
}

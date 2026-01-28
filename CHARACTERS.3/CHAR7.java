/*TO CONVERT THE CHARACTER FROM UPPER TO LOWER AND VISE VERSA */

import java.util.Scanner;

class characters
{
	public static void main(String [] ar)
	{
		char Ch1,Ch2;;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a lower case character");
		Ch1=sc.next().charAt(0);
		System.out.println("the charcter is :"+Ch1);
		Ch1=Character.toUpperCase(Ch1);
		System.out.println("the charcter after conversion is :"+Ch1);
		
		System.out.println("enter a upper case character");
		Ch2=sc.next().charAt(0);
		System.out.println("the charcter is :"+Ch2);	
		Ch2=Character.toLowerCase(Ch2);
		System.out.println("the character after conversion is :"+Ch2);
		
	}	
}
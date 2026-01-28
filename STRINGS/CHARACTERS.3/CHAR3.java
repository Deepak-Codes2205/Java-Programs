// TO CHECK A CHARACTER IS DIGIT OR NOT
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
		if(Character.isDigit(Ch))
			System.out.println("TRUE");
		else 
			System.out.println("FALSE");
	}		
}
/* INPUT A CHARACTER AND PRINT ITS ASCII VALUE AND ITS */

import java.util.Scanner;

class characters 
{
	public static void main(String [] ar)
	{
		char Ch;
		int p;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		Ch=sc.next().charAt(0);
		System.out.println("the character is :"+Ch);
		p=Ch;
		System.out.println("the ASCII value of Ch is :"+p);
	}
}
		
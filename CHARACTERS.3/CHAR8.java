/* IMPLICIT TYPE OF CONVERSION*/

import java.util.Scanner;

class characters
{
	public static void main(String [] ar)
	{
		char Ch='z';
		int p;
		Scanner sc = new Scanner(System.in);
		p=Ch;
		System.out.println("the converted value of ch is :"+p);
	}
}

/* EXPLICIT TYPE OF CONVERSION
	public static void main(String[] args) 
	{
			int num = 65; // ASCII value of 'A'
			char ch1 = (char) num; // Explicit casting from int to char
			System.out.println("The character for ASCII value " + num + " is: " + ch1);
	}
*/
/* PREDEFINED FUNCTIONS 
reverse(): USED TO REVERSE THE STRING */

import java.util.Scanner;
class stringss
{
	public static void main(String [] ar)
	{
		String s1="computer application";
		StringBuffer sb=new StringBuffer(s1);
		System.out.println("The buffer string is :"+sb);
		sb.reverse();
		System.out.println("The buffer string after insert is :"+sb);
	}
}

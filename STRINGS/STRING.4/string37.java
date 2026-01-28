/* PREDEFINED FUNCTIONS 
setLength(): USED TO TRUNCATE BUFFER STRING */

import java.util.Scanner;
class stringss
{
	public static void main(String [] ar)
	{
		String s1="computer application";
		StringBuffer sb=new StringBuffer(s1);
		System.out.println("The buffer string is :"+sb);
		sb.setLength(6);
		System.out.println("The buffer string after insert is :"+sb);
		System.out.println("the original string is :"+s1);
	}
}
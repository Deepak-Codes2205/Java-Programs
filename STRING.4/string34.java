/* String Buffer Functions 
setCharAt() */

import java.util.Scanner;
class stringss
{
	public static void main(String [] ar)
	{
		String s1="computer";
		StringBuffer sb=new StringBuffer(s1);
		System.out.println("The buffer string is :"+sb);
		/* THIS WILL NOT MAKE ANY CHANGES IN THE ORIGINAL STRING IT IS JUST FOR THE UFFER STRING sb*/
		sb.append(" program");
		sb.setCharAt(12,'j');
		System.out.println("The buffer string after append  and character change is :"+sb);
		/* TO MAKE CHANGES IN THE ORIGINAL STRING PERFORM THE STEPS AT LINE NO 19 and 20*/
		System.out.println("the original string before :"+s1);
		s1=sb.append(" application").toString();
		s1=sb.toString();
		System.out.println("the original string after is :"+s1);
	}
}
		

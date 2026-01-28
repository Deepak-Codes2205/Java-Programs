/* String Buffer Functions 
append(): */

import java.util.Scanner;

class stringss
{
	public static void main(String [] ar)
	{
		String s1="comp";
		StringBuffer sb=new StringBuffer(s1);
		System.out.println(sb);
		/* THIS APPEND WILL NOT MAKE ANY CHANGES IN THE ORIGINAL STRING IT IS JUST FOR THE UFFER STRING sb*/
		sb.append("uter");
		System.out.println(sb);
		/* TO MAKE CHANGES IN THE ORIGINAL STRING PERFORM THE STEP AT LINE NO 18 */
		System.out.println("the original string before :"+s1);
		s1=sb.append(" application").toString();
		System.out.println("the original string after is :"+s1);
	}
}
		

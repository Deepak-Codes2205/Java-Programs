/* PREDEFINED FUNCTIONS 
insert() :*/

import java.util.Scanner;
class stringss
{
	public static void main(String [] ar)
	{
		String s1="comp";
		StringBuffer sb=new StringBuffer(s1);
		System.out.println("The buffer string is :"+sb);
		/* THIS WILL NOT MAKE ANY CHANGES IN THE ORIGINAL STRING IT IS JUST FOR THE UFFER STRING sb*/
		sb.insert(4,"uter");
		System.out.println("The buffer string after insert is :"+sb);
		/* TO MAKE CHANGES IN THE ORIGINAL STRING PERFORM THE STEPS AT LINE NO 19 and 20 */
		System.out.println("the original string before :"+s1);
		s1=sb.insert(8," application").toString();
		System.out.println("the original string after is :"+s1);
	}
}
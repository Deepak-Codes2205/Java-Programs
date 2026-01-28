/* PREDEFINED FUNCTIONS 
delete() :*/

import java.util.Scanner;
class stringss
{
	public static void main(String [] ar)
	{
		String s1="computer application";
		StringBuffer sb=new StringBuffer(s1);
		System.out.println("The buffer string is :"+sb);
		/* THIS WILL NOT MAKE ANY CHANGES IN THE ORIGINAL STRING IT IS JUST FOR THE UFFER STRING sb*/
		sb.delete(4,8);/* here the last value ie 8 which is not included while deleting */
		System.out.println("The buffer string after insert is :"+sb);
		/* TO MAKE CHANGES IN THE ORIGINAL STRING PERFORM THE STEPS AT LINE NO 18*/
		System.out.println("the original string before :"+s1);
		s1=sb.delete(3,6).toString();
		System.out.println("the original string after is :"+s1);
	}
}
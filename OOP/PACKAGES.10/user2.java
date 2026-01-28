/* PACKAGES */
/* mypack2 */

import java.util.Scanner;

import mypack2.*;

class user2
{
	public static void main(String [] ar)
	{
		lib2 ob=new lib2();
		int f=ob.firstfact(21);
		System.out.println("the first factor is : "+f);
		int s=ob.secondfact();
		System.out.println("the second factor is : "+s);
	}
}
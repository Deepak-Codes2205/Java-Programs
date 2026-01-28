/* mypack1 */

import java.util.Scanner;

import mypack1.*;

class user1
{
	public static void main(String [] ar)
	{
		lib1 ob=new lib1();
		double ar1=ob.circle(4);
		System.out.println("The area of circle is : "+ar1);
		
		int ar2=ob.rectangle(10,20);
		System.out.println("The area of rectangle is : "+ar2);
		
		int ar3=ob.square(10);
		System.out.println("The area of square is : "+ar3);
	}
}
		
		
		
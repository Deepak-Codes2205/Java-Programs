/* PREDEFINED METHODS
TO COMPARE TWO STRINGS */

import java.util.Scanner;

class stringss
{
	public static void main(String [] ar)
	{
		String s1="TATA STEEL IS IN JAMSHEDPUR";
		String s2="TATA STEEL IS IN JAMSHEDPUR";
		String s3="TATA STEEL IS IN JAIPUR";
		if(s1.equals(s2))
			System.out.println("s1 is equal to s2");
		else 
			System.out.println("s1 is not equal to s2");
		
		if(s1.equals(s3))
			System.out.println("s1 is equal to s3");
		else 
			System.out.println("s1 is not equal to s3");
		
	}
}
		
/* PREDEFINED METHODS
equalsIgnoreCase ( ) :Returns true, if al and a2 are equal after ignoring cases of the strings and false, it they are unequal 
al="Computer Application": 
a2-"COMPUTER APPLICATION": 
al.equalsIgnoreCase(a2); 
Output: true */

import java.util.Scanner;

class stringss
{
	public static void main(String [] ar)
	{
		String s1="Tata Steel Is In Jamshedpur";
		String s2="TATA STEEL IS IN JAMSHEDPUR";
		if(s1.equalsIgnoreCase(s2))
			System.out.println("true");
		else 
			System.out.println("false");
	}
}
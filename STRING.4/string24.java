/* PATTERNS*/

import java.util.Scanner;

class stringss
{
	public static void main(String [] ar)
	{
		int i=0,j=0;
		String str = "bluej";
		for(i = str.length()-1; i >= 0; i--) {
			for(j = 0; j <= i; j++) {
				System.out.print(str.charAt(j)+" ");
			}
			System.out.println();
		}
	}
}

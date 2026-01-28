/* PACKAGES */
/* mypack6 */

import java.util.Scanner;
import mypack6.*;

class lib6
{
	public static void main(String [] ar)
	{
		int n;
		String b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a integer no you want to convert :");
		n=sc.nextInt();
		lib6 ob=new lib6();
		b=ob.binary(n);
		System.out.println("The binary conversion of the number : "+n+" is : "+b);
	}
}

		
		
	
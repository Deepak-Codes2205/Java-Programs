/* PACKAGES */

import java.util.Scanner;

import mypack3.*;

class user3
{
	public static void main(String [] ar)
	{
		String str;
		int r;
		lib3 ob=new lib3();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string :");
		str=sc.nextLine();
		r=ob.magic(str);
		if(r==1)
			System.out.println("Consequestive letters exists in the string :");
		else if(r==0)
			System.out.println("Consequestive letters does not exists in the string :");
	}
}
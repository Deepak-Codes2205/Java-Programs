/* STATIC

STATIC FUNCTION */

import java.util.Scanner;

class ABC
{
	int a=10;
	static int b=20;
	static void display()
	{
		System.out.println("Display : ABC");
		System.out.println(b);
	}
	public static void main(String [] ar)
	{
		display();/* FOR STATIC VARIABLE NO NEED FOR CREATING OBJECTS FOR THE FUNTION */
	}
}

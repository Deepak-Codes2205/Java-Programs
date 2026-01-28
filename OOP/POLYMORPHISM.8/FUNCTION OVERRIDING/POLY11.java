/* FUNCTION OVERRIDING */

import java.util.Scanner;

class Animal
{
	String sd;
	void communicate()
	{
		System.out.println("function for animal sound :");
	}
}

class Dog extends Animal
{
	String sd;
	void communicate()
	{
		super.communicate();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sound the dog makes :");
		sd=sc.nextLine();
		System.out.println("Dog :"+sd);
	}
}

class Tiger extends Dog
{
	String sd;
	void communicate()
		{
			super.communicate();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the sound the tiger makes :");
			sd=sc.nextLine();
			System.out.println("tiger:"+sd);
		}
		
		public static void main(String [] ar)
		{
			Tiger ob=new Tiger();
			ob.communicate();
		}
}
		
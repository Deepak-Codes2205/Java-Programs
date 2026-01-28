/* Accessing input values from input function in output function from another class */

import java.io.*;
import java.util.*;
class Student
{
	String nm;
	int roll,mo;

	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\n\tenter name : ");
		nm=sc.nextLine();
		System.out.println("\n\tenter roll no and marks : ");
		roll=sc.nextInt();
		mo=sc.nextInt();
	}

	public void output()
	{
		System.out.println("\n\t"+nm+"\t"+roll+"\t"+mo);
	}
}

class j_005
{
	public static void main(String s[])
	{
	
		Student ob=new Student();
		ob.input();
		ob.output();
	}
}
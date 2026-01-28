/*
	1-Parent Default, Child Default
	2-Parent Default, Child Parameterized 
*/
import java.util.Scanner;

class abc
{
	abc()
	{
		System.out.println("Parent Constructor ");
	}
}
class cons_1 extends abc
{
	cons_1()
	{
		System.out.println("Default Constructor : Child Class ");
	}
	
	cons_1(int val)
	{
		System.out.println("Parameterized Constructor : Child Class ");
	}
	
	public static void main(String [] arg)
	{
		cons_1 ob1=new cons_1();
		cons_1 ob2=new cons_1(3);
	}
}
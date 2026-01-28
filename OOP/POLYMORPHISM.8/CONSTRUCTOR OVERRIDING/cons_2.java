/*
	1-Parent Parameterized, Child Default
	2-Parent Parameterized, Child Parameterized 
*/
import java.util.Scannner;

class abc
{
	abc(int k)
	{
		System.out.println("Parameterized :Parent Constructor ");
	}
}
class cons_2 extends abc
{
	cons_2()
	{
		super(10);
		System.out.println("Default Constructor : Child Class ");
	}
	
	cons_2(int val)
	{
		super(val);
		System.out.println("Parameterized Constructor : Child Class ");
	}
	
	public static void main(String [] arg)
	{
		cons_2 ob1=new cons_2();
		cons_2 ob2=new cons_2(3);
	}
}
/* HIERARCHY INTERFACE */

import java.util.Scanner;

interface common
{
	void input()
	void simpleinterest();
	void compoundinterest();
}

class interestType1 implements common
{
	double amt,si;
	
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount you want to calculate :");
		amt=sc.nextInt();
	}
	void simple
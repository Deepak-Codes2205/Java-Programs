/*INHERITANCE 
PDF QUESTION 3 */

import java.util.Scanner;

class basesalary
{
	int basic=0;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basic salary");
		basic=sc.nextInt();
	}
}
class salary extends basesalary
{
	int da,hra,gross;
	void display()
	{
		da=(basic*30)/100;
		hra=(basic*10)/100;
		gross=basic + da + hra;
		System.out.println("The gross salary is:"+gross);
	}
	public static void main(String [] ar)
	{
		salary ob=new salary();
		ob.input();
		ob.display();
	}
	
}
		
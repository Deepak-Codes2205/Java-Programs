/*INHERITANCE PDF QUESTION 2
**Employee Management System**
   - Create a base class called `Employee` with properties like `name`, `age`, and `salary`.
   - Derive classes like `Manager` and `Developer` from the `Employee` class.
   - Add additional properties and methods to the derived classes specific to their roles (e.g., `bonus` for `Manager`, `programmingLanguages` for `Developer`).
   - Create objects of the derived classes and demonstrate method overriding and access control.
 */

import java.util.Scanner;

interface Employee
{
	void input();
	void bonus();
	void planguage();
}

class Manager implements Employee
{
	String nm;
	int age,sal,b,sum;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the manager : ");
		nm=sc.nextLine();
		System.out.println("Enter the age and salary of the manager : ");
		age=sc.nextInt();
		sal=sc.nextInt();
		System.out.println("Manager name : "+nm+" age : "+age+" basic salary : "+sal);
	}
	public void bonus()
	{
		b=(sal*25)/100;
		sum=sal+b;
		System.out.println("the total salary becomes :"+sum);
	}
	
	public void planguage()
	{
	}
}

class Developer implements Employee
{
	String nm,l;
	int age,sal;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the Developer : ");
		nm=sc.nextLine();
		System.out.println("Enter the age and salary of the Developer : ");
		age=sc.nextInt();
		sal=sc.nextInt();
		System.out.println("Developer name : "+nm+" age : "+age+" basic salary : "+sal);
	}
	
	public void bonus()
	{
	}
	public void planguage()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your programing language");
		l=sc.nextLine();
		System.out.println("your programming Language is : "+l);
	}
	public static void main(String [] ar)
	{
		Manager ob=new Manager();
		ob.input();
		ob.bonus();
		ob.planguage();
		Developer ob1=new Developer();
		ob1.input();
		ob1.bonus();
		ob1.planguage();
	}
}

	
		
		
/* SINGLE LEVEL INTERFACE 
Exercise: Creating a Payable Interface and Implementing Classes
Create an interface called Payable with a single method calculatePayment() that returns a double value representing 
the payment amount.
Then, create three classes that implement the Payable interface:

HourlyEmployee: This class should have properties for the employee's name, hourly rate, and the number of hours 
worked. Implement the calculatePayment() method to calculate and return the employee's payment based on their hourly rate and
hours worked.

SalariedEmployee: This class should have properties for the employee's name and annual salary. Implement the calculatePayment() method to
calculate and return the employee's payment based on their annual salary divided by the number of pay periods in a year (assume 26 
bi-weekly pay periods).*/

import java.util.Scanner;

interface payable
{
	void calculatepayment();
}

class hourlyemployee implements payable
{
	String n;
	double hr,h,pay1;
	public void calculatepayment()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee name :");
		n=sc.nextLine();
		System.out.println("Enter the hourlyrate and no of hours worked :");
		hr=sc.nextInt();
		h=sc.nextInt();
		pay1=hr*h;
		System.out.println("Name :"+n+" your amount is :"+pay1);
	}
}
class salariedemployee implements payable
{
	String n;
	double Asal,sal;
	public void calculatepayment()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name :");
		n=sc.nextLine();
		System.out.println("enter the annual salary :");
		Asal=sc.nextInt();
		sal=Asal/12;
		System.out.println("Your monthly salary is :"+sal);	
	}
	public static void main(String [] ar)
	{
		salariedemployee ob=new salariedemployee();
		ob.calculatepayment();
		hourlyemployee ob1=new hourlyemployee();
		ob1.calculatepayment();
	}
}
	
	
		
		
	


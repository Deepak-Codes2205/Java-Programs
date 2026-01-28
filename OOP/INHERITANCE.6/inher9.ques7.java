 /*INHERITANCE 
PDF QUESTION 5*/

import java.util.Scanner;

class Number
{
	int n;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a integer no :");
		n=sc.nextInt();
	}
	void display()
	{
		System.out.println("The integer is :"+n);
	}
}

class Check extends Number
{
	int fact,revnum;
	void find()
	{
		int i=1;
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
	}
	void pallin()
	{
		int num=n;
		int r;
		while(num>0)
		{
			r=num%10;
			revnum=revnum*10+r;
			num=num/10;
		}
		if(revnum==n)
			System.out.println("The no is pallindrome");
		else 
			System.out.println("The no is not a pallindrome");
	}
	public static void main(String [] ar)
	{
		Check ob=new Check();
		ob.input();
		ob.display();
		ob.find();
		ob.pallin();
	}

}
		
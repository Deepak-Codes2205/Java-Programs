/* CONSTRUCTOR 
PDF QUESTION NO 10*/

import java.util.Scanner;

class Student
{
	String name;
	int mm,scm,comp;
	Student(String n,int mt,int sc,int cmp)
	{
		name=n;
		mm=mt;
		scm=sc;
		comp=cmp;
	}
	void check()
	{
		int marks;
		marks=((mm+scm+comp)/300)*100;
		if(mm>=90 && scm>=90 && comp>=90)
			System.out.println(name+" CAN TAKE SCIENCE AND COMPUTER");
		if(marks>=90)
			System.out.println(name+" CAN TAKE BIO-SCIENCE");
		if(marks >=80 && marks <90);
			System.out.println(name+" CAN TAKE SCIENCE WITH HINDI");
	}
	public static void main(String [] ar)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String nm=sc.nextLine();
		System.out.println("enter the marks of maths ,science and computer respectivily :");
		int mh=sc.nextInt();
		int se=sc.nextInt();
		int cp=sc.nextInt();
		Student ob=new Student(nm,mh,se,cp);
		ob.check();
	}
}

		
	
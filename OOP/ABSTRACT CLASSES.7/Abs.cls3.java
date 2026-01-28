/* ABSTRACT CLASS */

import java.util.Scanner;

abstract class Animal
{
	String name;
	abstract void make_sound();
	abstract void move();
	abstract void  eat();
}

class dog extends Animal
{
	String s,mov,e;
	void make_sound()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the species of the dog :");
		name=sc.nextLine();
		
		System.out.println("Enter the sound of the dog :");
		s=sc.nextLine();
	}
	
	void move()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how  the dog moves :");
		mov=sc.nextLine();
	}
	void eat()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter what the dog eats :");
		e=sc.nextLine();
		System.out.println("dog is : "+name+" makes : "+s+" sound ,moves on : "+mov+" eats :"+e);
	}
}

class birds extends Animal
{
	String s,mov,e;
	Scanner sc=new Scanner(System.in);
	
	void make_sound()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the bird :");
		name=sc.nextLine();
	
		System.out.println("Enter the sound of the bird :");
		s=sc.nextLine();
	}
	
	void move()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how  the bird moves :");
		mov=sc.nextLine(); 
	}
	void eat()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter what the bird eats :");
		e=sc.nextLine();
		System.out.println("bird is : "+name+" makes : "+s+" sound ,moves on : "+mov+" eats :"+e);
	}
	public static void main(String [] ar)
	{
		birds ob1=new birds();
		ob1.make_sound();
		ob1.move();
		ob1.eat();
		dog ob2=new dog();
		ob2.make_sound();
		ob2.move();
		ob2.eat();
	}
}
		
/* MULTIPLE LEVEL INTERFACE 
Question 1: Create a multi-level interface hierarchy where the base interface Animal has a method eat(). 
The second level interface Mammal extends Animal and adds a method walk(). 
The third level interface Human extends Mammal and adds a method speak(). 
Implement these interfaces in a class Person.*/

import java.util.Scanner;

interface Animal 
{
	void name();
	void eat();
}

interface Mammal extends Animal
{
	void walk();
}

interface human extends Mammal
{
	void speak();
}

class Person implements Mammal
{
	String e,nm,lang;
	int l;
	public void name()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name of the animal :");
		nm=sc.nextLine();
		System.out.println("Name : "+nm);
	}
	
	public  void eat()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the food of the animal:");
		e=sc.nextLine();
	}
	
	public void walk()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of legs on which the animal walk:");
		l=sc.nextInt();
		System.out.println("walks on : "+l+" legs");
	}
	
	public void speak()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the language the person speaks:");
		lang=sc.nextLine();
		System.out.println("speaks : "+lang);
	}
	public static void main(String [] ar)
	{
		Person ob=new Person();
		ob.name();
		ob.eat();
		ob.walk();
		ob.speak();
	}
}
		
		
		
		
		

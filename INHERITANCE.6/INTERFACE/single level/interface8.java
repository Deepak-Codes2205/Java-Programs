/*INHERITANCE 
**Animal Kingdom**
   - Create a base class called `Animal` with properties like `name`, `age`, and methods like `eat()` and `sleep()`.
   - Derive classes like `Mammal`, `Bird`, `Fish`, and `Reptile` from the `Animal` class.
   - Add additional properties and methods to the derived classes specific to their animal types (e.g., `wingSpan` for `Bird`, `waterType` for `Fish`).
*/

import jav.util.Scanner;

interface Animal
{
	void input();
	void eat();
	void sleep();
	void wingSpan();
	void landType();
	void waterType`();
}

class Mammal implements Animal
{
	String nm,e;
	int age,slp;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name and age of the mammal :");
		nm=sc.nextLine();
		age=sc.nextINt();
	}
	public void eat()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 
	
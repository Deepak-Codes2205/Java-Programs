/*INHERITANCE PDF QUESTION
**Vehicle Hierarchy**
   - Create a base class called `Vehicle` with properties like `make`, `model`, and `year`.
   - Derive classes like `Car`, `Truck`, and `Motorcycle` from the `Vehicle` class.
   - Add additional properties and methods to the derived classes specific to their types (e.g., `numberOfDoors` for `Car`, `payloadCapacity` for `Truck`).
   - Implement method overriding for a method like `startEngine()` in each derived class to simulate different engine startup behaviors.
*/
import java.util.Scanner;

interface vehicle
{
	void model();
	void numberOfDoors();
	void payloadCapacity();
}

class Car implements vehicle
{
	int y,d;
	String mk,m;
	public void model()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the making of the car :");
		mk=sc.nextLine();
		System.out.println("Enter the model and year of making of the car :");
		m=sc.nextLine();
		y=sc.nextInt();
		System.out.println("Making : "+mk+" Model : "+m+" Year : "+y);
	}
	public void numberOfDoors()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of doors of the car :");
		d=sc.nextInt();
		System.out.println("The no of doors are : "+d);
	}
	public void payloadCapacity()
	{
	}
}


class Truck implements vehicle
{
	int y,d;
	String mk,m;
	public void model()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the making of the Truck :");
		mk=sc.nextLine();
		System.out.println("Enter the model and year of making of the Truck :");
		m=sc.nextLine();
		y=sc.nextInt();
		System.out.println("Making : "+mk+" Model : "+m+" Year : "+y);
	}
	public void numberOfDoors()
	{
	}
	public void payloadCapacity()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the payloadCapacity of the Truck in kgs:");
		d=sc.nextInt();
		System.out.println("The payloadCapacity of the Truck: "+d+"  kg");
	}
	public static void main(String [] ar)
	{
		Truck ob1=new Truck();
		ob1.model();
		ob1.numberOfDoors();
		ob1.payloadCapacity();
		Car ob2=new Car();
		ob2.model();
		ob2.numberOfDoors();
		ob2.payloadCapacity();
	}
}
/*FUNCTION OVERRIDNIG EXAMPLE */
import java.util.Scanner;

class vehicle
{
	void calculateFuelEfficiency()
	{
		System.out.println("\n\nEnter the efficiency of the vehicles :");
	}
}

class Truck extends vehicle
{
	int cc1;
	void calculateFuelEfficiency()
	{
		super.calculateFuelEfficiency();
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\nEnter the efficiency of Truck with respect to gallon :");
		cc1=sc.nextInt();
		System.out.println("Efficiency of Truck is : "+cc1+" km per gallon");
	}
}

class Car extends Truck
{
	int cc2;
	void calculateFuelEfficiency()
	{
		super.calculateFuelEfficiency();
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\nEnter the efficiency of car with respect to gallon :");
		cc2=sc.nextInt();
		System.out.println("Efficiency of car is : "+cc2+" km per gallon");
	}
}

class Motercycle extends Car
{
	int cc3;
	void calculateFuelEfficiency()
	{
		super.calculateFuelEfficiency();
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\nEnter the efficiency of motercywith respect to gallon :");
		cc3=sc.nextInt();
		System.out.println("Efficiency of Motercycle is : "+cc3+" km per gallon");
	}
	public static void main(String [] ar)
	{
		Motercycle ob=new Motercycle();
		ob.calculateFuelEfficiency();
	}
}
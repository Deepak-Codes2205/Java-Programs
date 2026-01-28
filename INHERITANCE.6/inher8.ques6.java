/*INHERITANCE 
PDF QUESTION 5*/
import java.util.Scanner;

class Sale
{
	String  title,author,publication;
	double price;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name of the author ,title of the book and its publication");
		author=sc.nextLine();
		title=sc.nextLine();
		publication=sc.nextLine();
		System.out.println("Enter the price of the book:");
		price=sc.nextInt();
	}
	void display()
	{
		System.out.println("The author is : "+author+"  title is : "+title+"  publication : "+publication+"  price is : "+price);
	}
}

class Purchase extends Sale
{
	int noc;
	double amt;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of copies you want to purchase:");
		noc=sc.nextInt();
	}
	void calculate()
	{
		amt=noc*price;
	}
	void show()
	{
		System.out.println("The no of copies purchased are : "+noc+" which amounts to rupees : "+amt);
	}
	public static void main(String [] ar)
	{
		Purchase ob=new Purchase();
		ob.input();
		ob.display();
		ob.accept();
		ob.calculate();
		ob.show();
	}
}
		
	
		
	
		
		
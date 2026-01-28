/* CONSTRUCTOR 
PDF QUESTION NO 8 */

import java.util.Scanner;

class Fruitjuice
{
	String p_flav,p_type;
	int p_code,p_size,p_price;
	Fruitjuice()
	{
		p_code=0;
		p_size=0;
		p_price=0;
		p_flav="";
		p_type="";
	}
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the product code:");
		p_code=sc.nextInt();
		System.out.println("Enter the packing size:");
		p_size=sc.nextInt();
		System.out.println("Enter the product price:");
		p_price=sc.nextInt();
		sc=new Scanner(System.in;n
		System.out.println("Enter the product flavor:");
		p_flav=sc.nextLine();
		System.out.println("Enter the packaging type:");
		p_type=sc.nextLine();
	}
	void discount()
	{
		p_price=p_price-((p_price*10)/100);
	}
	void display()
	{
	System.out.println("PRODUCT CODE :"+p_code+" "+"PRODUCT FLAVOR :"+p_flav+" "+"PRODUCT PACKAGING TYPE :"+p_type+" "+"PACK SIZE :"+p_size+"mL"+" "+"PRODUCT PRICE :"+p_price);
	}
	public static void main(String [] ar)
	{
		Fruitjuice ob=new Fruitjuice();
		ob.input();
		ob.discount();
		ob.display();
	}
}
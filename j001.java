import java.util.Scanner;

class j001
{
	public static void main(String [] ar)
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value for a and b ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("Sum is "+c);
		System.out.println(a+"+"+b+" = "+c);
	}
}
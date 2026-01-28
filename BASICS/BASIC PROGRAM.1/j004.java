import java.util.Scanner;

class greatestno
{
	public static void main(String [] ar)
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three no's");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println("the no's are :"+" "+a+","+b+","+c);
		if(a!=b && b!=c && c!=a)
		{
			System.out.println("NO'S ARE UNEQUAL");
			if(a>b && a>c)
				System.out.println("a is the greatest no's"+" "+a);
			else if(b>a && b>c)
				System.out.println("b is the greatest no's"+" "+b);
			else if(c>b && c>a)
				System.out.println("c is the greatest no's"+" "+c);
		}
		else
			System.out.println("TWO OR MORE NO'S ARE EQUAL");
	}
}
				
			
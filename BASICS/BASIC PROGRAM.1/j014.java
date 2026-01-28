import java.util.Scanner;

class digits
{
	public static void main(String [] ar)
	{
		int n=0,c=0,r=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no you want to check");
		n=sc.nextInt();
		while(n>0)
		{
			r=n%10;
			n=n/10;
			c++;
		}
		if(c%2==0)
			System.out.println("THE NO OF DIGITS ARE"+":"+c+" "+"AND HAS EVEN NO OF DIGITS");
		else
			System.out.println("THE NO OF DIGITS ARE"+":"+c+" "+"AND HAS ODD NO OF DIGITS");
	}
}

			
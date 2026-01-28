import java.util.Scanner;

class fibo
{
	public static void main(String [] ar)
	{
		int x=0,y=1,z=0,n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the last digit till you want to print the series");
		n=sc.nextInt();
		while(z<=n)
		{
			if(x==0)
			{
				System.out.println(x+"\n"+y);
				z=x+y;
			}
			else
			{
				System.out.println(z);
			}
			z=x+y;
			x=y;
			y=z;
		}
	}
}
				
				
		
		
	
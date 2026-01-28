import java.util.Scanner;

class series
{
	public static void main(String [] ar)
	{
		int i=0,n=0,j=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the last value till you want to print");
		n=sc.nextInt();
		for(i=0;i<=n;i=i+2)
		{
			System.out.println(i);
			j=j+1;
			i=i+j;
		}
	}
}
	
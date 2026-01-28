import java.util.Scanner;

class sum
{
	public static void main(String [] ar)
	{
		 int n,r=0,s=0,m=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the no");
		 n=sc.nextInt();
		 m=n;
		 while(n>0)
		 {
			 r=n%10;
			 s=s+r;
			 n=n/10;
		 }
		 System.out.println("the sum of the digits of no's :"+s);
	}
}
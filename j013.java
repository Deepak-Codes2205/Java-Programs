import java.util.Scanner;

class buzzno
{
	public static void main(String [] ar)
	{
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a digit");
		n=sc.nextInt();
		if(n%10==7 || n%7==0)
			System.out.printf(n+":"+"IS A BUZZ NO");
		else 
			System.out.println(n+":"+"IS A NOT A BUZZ NO");
	}
}
import java.util.Scanner;

class divisibilty
{
	public static void main(String [] ar)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no you want to check");
		n=sc.nextInt();
		if(n%3==0 && n%5==0)
			System.out.println("DIVISIBLE BY BOTH 3 AND 5");
		else if(n%3==0 && n%5!=0)
			System.out.println("DIVISIBLE BY 3 BUT NOT BY 5");
		else if(n%3!=0 && n%5==0)
			System.out.println("DIVISIBLE BY 5 BUT NOT BY 3");
		else if(n%3!=0 && n%5!=0)
			System.out.println("NEITHER DIVISIBLE BY 3 NOR BY 5");
	}
}
		
		
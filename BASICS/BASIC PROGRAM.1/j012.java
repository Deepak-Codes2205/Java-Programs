import java.util.Scanner;

class pfsquare
{
	public static void main(String [] ar)
	{
		int i=1,n=0,j=0;
		Scanner sc=new Scanner(System.in);
		while(i<=5)
		{
			int k=0;
			System.out.println("\nENTER THE DIGIT YOU WANT TO CHECK\n");
			n=sc.nextInt();
			System.out.println("THE DIGIT IS"+":"+n);
			for(j=1;j<n;j++)
			{
				if(n/j==j)
				{
					System.out.println("THE DIGIT IS A PERFECT SQUARE"+":"+n);
					k=1;
					break;
				}
			}
			if(k==0)
				System.out.println("NOT A PERFECT SQUARE");
			i++;
		}
	}
}
					
		
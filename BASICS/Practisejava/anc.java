import java.util.Scanner;

class search
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		int n,i,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Elements:");
		for(i=0;i<5;i++)
			a[i]=sc.nextInt();
		
		System.out.println("Enter the no you want to find :");
		n=sc.nextInt();
		
		for(i=0;i<5;i++)
		{
			if(a[i]==n)
				c++;
		}
		if(c>0)
			System.out.println("Element found");
		else
			System.out.println("Element not found");
	}
}
			
		
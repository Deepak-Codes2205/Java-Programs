
import java.util.Scanner;

class arrays
{	
	public static void main(String [] ar)
	{
		int arr[]=new int[10];
		int i=0,c=0,f=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements of array");
		for(i=0;i<10;i++)
			arr[i]=sc.nextInt();
		System.out.println("The elements of array are");
		for(i=0;i<10;i++)
			System.out.println(arr[i]);
		
		System.out.println("enter the element you want to find");
		f=sc.nextInt();
		for(i=0;i<10;i++)
		{
			if(arr[i]==f)
				c=c+1;
		}
		if(c>=1)
			System.out.println("ELEMENTS EXISTS AND OCCURED "+c+" times");
		else
			System.out.println("ELEMENTS DOES NOT EXISTS");
	}
}
		
		
		
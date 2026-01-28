import java.util.Scanner;

class arrays
{	
	public static void main(String [] ar)
	{
		int arr[]=new int[10];
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements of array");
		for(i=0;i<10;i++)
			arr[i]=sc.nextInt();
		System.out.println("The elements of array are");
		for(i=0;i<10;i++)
			System.out.println(arr[i]);
	}
}
		
		
		
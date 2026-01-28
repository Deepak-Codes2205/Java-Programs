/* TO PRINT THE ODD AND EVEN ELEMENTS OF THE ARRAY */

import java.util.Scanner;

class arrays
{
	public static void main(String [] ar)
	{
		int arr1[]=new int[10];
		int odd[]=new int[10];
		int even[]=new int[10];
		int i=0,j=0,k=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements");
		for(i=0;i<10;i++)
			arr1[i]=sc.nextInt();
		
		System.out.println("The elements are");
		for(i=0;i<10;i++)
			System.out.println(arr1[i]);
		
		for(i=0;i<10;i++)
		{
			if(arr1[i]%2!=0)
			{
				odd[j]=arr1[i];
				j=j+1;
			}
			else
			{
				even[k]=arr1[i];
				k=k+1;
			}
		}
		System.out.println("THE ODD ELEMENTS ARE");
		for(i=0;i<j;i++)
			System.out.println(odd[i]);
		System.out.println("\nTHE EVEN ELEMENTS ARE\n");
		for(i=0;i<k;i++)
			System.out.println(even[i]);	
	}
}
				
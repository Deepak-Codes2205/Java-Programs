/* TO CHANGE THE ELEMENTS OF THE ARRAY */

import java.util.Scanner;

class arrays
{
	public static void main(String [] ar)
	{
		int arr1[]=new int[10];
		int i=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the elements");
		for(i=0;i<5;i++)
			arr1[i]=sc.nextInt();
		
		System.out.println("The elements before are");
		for(i=0;i<5;i++)
			System.out.println(arr1[i]);
		
		arr1[0]=90;
		arr1[3]=88;
		
		System.out.println("The elements after are");
		for(i=0;i<5;i++)
			System.out.println(arr1[i]);
	}
}


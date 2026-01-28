/* SECOND METHOD TO PRINT THE FIRST AND LAST POSITION OF OCCURANCE OF THE USER PROVIDED ELEMENT */

import java.util.Scanner;

class arrays
{
	public static void main(String [] ar)
	{
		int arr1[]={1,2,3,1,4,5,1,7,8,1};
		int pos[]=new int [10];
		int i=0,c=0,f=0,p=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nThe elements are\n");
		for(i=0;i<10;i++)
			System.out.println(arr1[i]);
		System.out.println("enter the element you want to find");
		f=sc.nextInt();
		for(i=0;i<10;i++)
		{
			if(f==arr1[i])
			{
				p=i;
				c=c+1;
				if(c==1)
					System.out.println("the first position of occurance of the element is :"+i);
			}
		}
		System.out.println("the last position of occurance of the element is :"+p);
	}
}
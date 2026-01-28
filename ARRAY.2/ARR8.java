
/* TO PRINT THE PRIME NO OF THE ARRAY */

import java.util.Scanner;

class arrays
{
	public static void main(String [] ar)
	{
		int arr[]=new int[10];
		int prime[]=new int[10];
		int i=0,j=0,k=0,c=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements");
		
		for(i=0;i<10;i++)
			arr[i]=sc.nextInt();
		
		for(i=0;i<10;i++)
		{
			if(arr[i]!=1)
			{
				k=2;
				c=0;
				while(k<arr[i])
				{
					if(arr[i]%k==0)
						c=1;
					k++;
				}
				if(c==0)
					prime[j++]=arr[i];
			}
		}
		
		System.out.println("THE PRIME ELEMENTS ARE");
		for(i=0;i<j;i++)
			System.out.println(prime[i]);
	}
}
				
				
				
			
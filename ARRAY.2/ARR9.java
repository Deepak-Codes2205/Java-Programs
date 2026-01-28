 /* BINARY SEARCH*/

import java.util.Scanner;

class binary
{
	public static void main(String [] ar)
	{
		int n=0,l=0,m=0,h=0,f=0,i=0;
		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements");
		for(i=0;i<10;i++)
			arr[i]=sc.nextInt();
		System.out.println("enter the element you want to find");
		f=sc.nextint();
		l=0;
		h=9;
		while(l<=h)
		{
			m=(l+h)/2;
			if(f==arr[m])
				System.out.println("element exists");
			// BINARY SEARCH WORKS FOR SORTED ARRAY 
			else if(f<arr[m])
				h=m-1;
			else if(f>arr[m])
				l=m+1;
		}
		if(l>h)
			System.out.println("element does not exists");
	}
}
			
		
		
		
		
import java.util.Scanner;

class arrays
{
	public static void main(String [] ar)
	{
		int arr1[]=new int[10];
		int pos[]=new int [10];
		int i=0,c=0,f=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements");
		for(i=0;i<10;i++)
			arr1[i]=sc.nextInt();
		System.out.println("\nThe elements are\n");
		for(i=0;i<10;i++)
			System.out.println(arr1[i]);
		System.out.println("enter the element you want to find");
		f=sc.nextInt();
		for(i=0;i<10;i++)
		{
			if(f==arr1[i])
			{
				pos[c]=i;
				c=c+1;
			}
		}
		if(c>=1)
		{
			System.out.println("ELEMENT EXISTS :"+" "+c+" times");
			System.out.println("THE POSITIONS AT WHICH THE ELEMENT EXISTS");
			for(i=0;i<c;i++)
				System.out.println(pos[i]);
		}
		else
			System.out.println("ELEMENT DOES NOT EXISTS");
	}
}

			
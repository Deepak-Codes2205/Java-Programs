/* TO PRINT THE FIRST AND LAST POSITION OF OCCURANCE OF THE USER PROVIDED ELEMENT */
import java.util.Scanner;

class arrays
{
	public static void main(String [] ar)
	{
		int arr1[]=new int[10];
		int pos[]=new int [10];
		int i=0,c=0,f=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements");
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
				c++;
				System.out.println("the first position of occurance of the element is :"+i);
				break;
			}
		}
		for(i=9;i>=0;i--)
		{
			if(f==arr1[i])
			{
				pos[c]=i;
				c++;
				System.out.println("the second position of occurance of the element is :"+i);
				break;
			}
		}
		for(i=0;i<pos.length;i++)
		{
			System.out.println(pos[i]);
		}
	}
}
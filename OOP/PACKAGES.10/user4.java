/* PACAKGES */
/* mypack4 */
import java.util.Scanner;
import mypack4.*;

class user4
{
	public static void main(String [] ar)
	{
		int ar1[]=new int[10];
		int i=0,n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements of the array :");
		for(i=0;i<10;i++)
		{
			ar1[i]=sc.nextInt();
		}
		System.out.println("enter the element you want to check :");
		n=sc.nextInt();
		lib4 ob=new lib4();
		int r=ob.Search(ar1,n);
		if(r==1)
			System.out.println("Element exists in the array :");
		else if(r==0)
			System.out.println("Element does not exists in the array :");
	}
}
		
/* EXCEPTION HANDLING */

import java.util.*;

class Array
{
	public static void main(String [] ar)
	{
		int arr[]={10,20,30,40,50,60,70};
		int idx=0;
		try	
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the index of the element you want to print :");
			idx=sc.nextInt();
			System.out.println("The value at the index :"+idx+" is : "+arr[idx]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("INVALID INPUT : only value less than or equal to index:");
		}
		catch(InputMismatchException e)
		{
			System.out.println("INVALID INPUT : Only interger value allowed :");
		}
		finally
		{
			
		}
	}
}

		
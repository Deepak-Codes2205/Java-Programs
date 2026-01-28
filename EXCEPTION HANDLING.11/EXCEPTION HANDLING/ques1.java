	
/* EXCEPTION HANDLING */

import java.util.*;

class equation
{
	public static void main(String [] ar)
	{
		int num=0,div=0,quo=0,rem=0,i=1;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the no you want to divide :");
			num=sc.nextInt();
			System.out.println("Enter the divisor :");
			div=sc.nextInt();
			
			quo=num/div;
			rem=num%div;
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid Input ! Only Numeric Values Allowed ");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid Input ! Zero not Allowed ");
		}
		finally
		{
			System.out.println("The quotient of the num is : "+quo+" and the remainder is : "+rem);
		}
	}
}

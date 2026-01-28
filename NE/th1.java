/* 
throw - throw keyword is used 
*/

import java.util.*;

class input
{
	public static void main(String [] ar)
	{
		String nm="";
		int age=0;
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the name and age of the person :");
			nm=sc.nextLine();
			sc=new Scanner(System.in);
			age=sc.nextInt();

		
			if(age<18)
				throw (new Exception());
			else	
				System.out.println("Welcome to Vote ");	
		}
		catch(InputMismatchException e)
		{
			System.out.println("INVALID INDEX : Only integer no allowed ");
		}
		catch(Exception e)
		{
			System.out.println("Invalid Age ");
		}		
		finally
		{
			
		}
	}
}
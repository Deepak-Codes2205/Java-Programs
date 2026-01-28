/*EXCEPTION HANDLING 
CUSTOM EXCEPTION */

import java.util.*;

class InsufficientFundsException extends Exception
{
	public String toString()
	{
		return"INSUFICIENT BALANCE : ENTER AMOUNT LESS OR EQUAL TO THE BALANCE AMOUNT ";
	}
}

class Transactions
{
	public static void main(String [] ar)
	{
		int amt=0,dep=0,withdraw=0;
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the account balance ");
			amt=sc.nextInt();
			System.out.println("Enter the amount you want to deposit :");
			dep=sc.nextInt();
			amt=amt+dep;
			System.out.println("The balance amount is :"+amt);
			System.out.println("Enter the amount you want to withdraw ");
			withdraw=sc.nextInt();
			if(withdraw<=amt)
			{
				amt=amt-withdraw;
				System.out.println("The account balance after withdrawing :"+withdraw+" is : "+amt);
			}
			else if(withdraw>amt)
			{
				throw (new InsufficientFundsException());
			}
		}
		catch(InsufficientFundsException e)
		{
			System.out.println(e);
		}
		finally
		{
			
		}
	}
}
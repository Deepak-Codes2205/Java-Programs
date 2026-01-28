/* 
throw - throw keyword is used 
custom exception 
*/

import java.util.*;

class emailException extends Exception
{
	public String toString()
	{
		return "Invalid Email! it Does't Contains @ and .com ";
	}
}

class lengthException extends Exception
{
	public String toString()
	{
		return "Minimum Required Length is 20";
	}
}


class input
{
	public static void main(String [] ar)
	{
		int j=0,c=0,i=0,f=0,k=0;
		String em="";
		String s1="@gmail.com";
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the email address :");
			em=sc.nextLine();
			
			
			/*
			
			for(i=0;i<em.length();i++)
			{
				char ch1=em.charAt(i);
				if(ch1=='@')
					c++;
			}
			
			for(i=em.length()-1,j=s1.length()-1,k=1;k<=4;i--,k++,j--)
			{
				char ch=em.charAt(i);
				char ch1=s1.charAt(j);
				if(ch!=ch1)
					f=1;
			}
			
			if(c==1 && f==0)
				System.out.println("Valid ");
			else 
				throw (new Exception());
			*/
			
			
			if(em.endsWith(".com") && em.contains("@"))
			{
				System.out.println("Valid Email ");
				if(em.length()<20)
					throw (new lengthException());
			}
			else	
				throw (new emailException());
		}
		catch(emailException e)
		{
			System.out.println(e);
		}
		catch(lengthException e)
		{
			System.out.println(e);
		}
		finally
		{
				
		}
	}
}
				
				
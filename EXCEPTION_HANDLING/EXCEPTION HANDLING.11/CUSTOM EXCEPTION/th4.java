/* EXCEPTION HANDLING 
CUSTON EXCEPTION */

import java.util.*;

class FileNotFoundException extends Exception 
{
	public String toString()
	{
		return"FileNameNotFound";
	}
}
	
class filename
{
	public static void main(String [] ar)
	{
		int i=0,c=0;
		String fnm="",cnm="th4";
		try
		{
			/*String fnm="",cnm="th4";*/
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the flie name ");
			fnm=sc.nextLine();
			for(i=0;i<fnm.length();i++)
			{
				if(fnm.charAt(i)!=cnm.charAt(i))
					c=c+1;
			}
			if(c==0)
			{
				System.out.println("VALID FILE NAME :");
			}
			else if(c>=1)
			{
				throw (new FileNotFoundException());
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		finally
		{
			
		}
	}
}
		
		
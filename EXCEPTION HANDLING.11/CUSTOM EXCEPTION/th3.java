/* /* 
throw - throw keyword is used 
custom exception 
QUES : PROGRAM TO ENTER A VALID PASSWORD 
*/
import java.util.*;

interface Error
{n
	String msg="Minimum 1 Uppercase Letter,1 Lowercase, 1 Special Character, 1 Digit & Min Length Must be >= 8 without Any Spaces ";
}

class LengthException extends Exception implements Error
{
	public String toString()
	{
		return msg;
	}
}

class SpecialCharacterException extends Exception implements Error
{
	public String toString()
	{
		return msg;
	}
}

class UpperCaseException extends Exception implements Error
{
	public String toString()
	{
		return msg;
	}
}

class LowerCaseException extends Exception implements Error
{
	public String toString()
	{
		return msg;
	}
}

class DigitException extends Exception implements Error
{
	public String toString()
	{
		return msg;
	}
}

class WhitespaceException extends Exception implements Error
{
	public String toString()
	{
		return msg;
	}
}


class input
{
	public static void main(String [] ar)
	{
		String spp="!@#$%^&*";
		int i=0,c=0,j=0,u=0,l=0,d=0,w=0;
		String pwd="";
		try
		{
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the password ");
			pwd=sc.nextLine();
			
			for(i=0;i<pwd.length();i++)
			{
				for(j=0;j<spp.length();j++)
				{
					if(pwd.charAt(i)==spp.charAt(j))
						c=c+1;
				}
				
				char ch=pwd.charAt(i);
				
				if(Character.isLetter(ch))
				{
					if(Character.isUpperCase(ch));
						u=u+1;
					if(Character.isLowerCase(ch));
						l=l+1;
				}
				else if(Character.isDigit(ch))
					d++;
				else if(Character.isWhitespace(ch))
					w++;
				else	
					continue;
			}
			if(pwd.length()>=8 && c>=1 && u>=1 && l>=1 && d>=1 && w<=0)
			{
				System.out.println("VALID PASSWORD ");
			}
			else if(pwd.length()<8)
			{
				throw (new LengthException());
			}
			else if(c<1)
			{
				throw (new SpecialCharacterException());
			}
			else if(u<1)
			{
				throw (new UpperCaseException());
			}
			else if(l<1)
			{
				throw (new LowerCaseException());
			}
			else if(d<1)
			{
				throw (new DigitException());
			}
			else if(w>=1)
			{
				throw (new WhitespaceException());
			}
			
		}
		catch(LengthException e)
		{
			System.out.println(e);
		}
		catch(SpecialCharacterException e)
		{
			System.out.println(e);
		}
		catch(UpperCaseException e)
		{
			System.out.println(e);
		}
		catch(LowerCaseException e)
		{
			System.out.println(e);
		}
		catch(DigitException e)
		{
			System.out.println(e);
		}
		catch(WhitespaceException e)
		{
			System.out.println(e);
		}
		
		finally
		{
			
		}
	}
}

		
		
		
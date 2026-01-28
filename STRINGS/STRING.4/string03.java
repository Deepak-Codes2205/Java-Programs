/* CONVERTION OF STRING INTO UPPER CASE AND LOWER CASE */
import java.util.Scanner;

class stringss
{
	public static void main(String [] ar)
	{
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		// UPPER CASE 
		System.out.println("enter the string");
		s1=sc.nextLine();
		System.out.println("The string is :"+s1);
		System.out.println("The string after conversion into upper case is :");
		for(int i=0;i<s1.length();i++)
		{
			char ch1=s1.charAt(i);
			System.out.println(Character.toUpperCase(ch1)); 
		}
		
		// LOWER CASE
		System.out.println("enter the second  string");
		s2=sc.nextLine();
		System.out.println("the string is :"+s2);
		System.out.println("the string after conversion into lower case is :");
		for(int i=0;i<s2.length();i++)
		{
			char ch2=s2.charAt(i);
			System.out.println(Character.toLowerCase(ch2));
		}
	}
}
		
		
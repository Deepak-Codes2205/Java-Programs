/* TO REPLACE A SPECIFIC WORD WITH ANOTHER WORD */
import java.util.Scanner;

class stringss
{
	public static void main(String [] in)
	{
		String s1,s2="",s3="",s4="",s5="";
		int i=0,v,prev=0;
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		s1=sc.nextLine();
		s1=s1+" ";
		System.out.println("The String is :"+s1);
		System.out.println("Enter the word you want to remove :");
		s2=sc.nextLine();
		System.out.println("The word you want to remove is :"+s2);
		System.out.println("The word that you want to insert :");
		s3=sc.nextLine();
		System.out.println("The word that you want to insert  is:"+s3);
		
		while(i<s1.length())
		{
			while(s1.charAt(i)!=' ')
			{
				ch=s1.charAt(i);
				s4=s4+ch;
				i++;
			}
			if(s4.equals(s2))
				s5=s5+s3;
			else 
				s5=s5+s4;
			s4="";
			s5=s5+" ";
			i++;
		}
		System.out.println("The string after replacement is :"+s5);
	}
}
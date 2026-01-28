import java .util.Scanner;

class stringss
{
	public static void main(String [] ar)
	{
		Scanner sc=new Scanner(System.in);
		//Run Time
		System.out.println("enter the string");
		String s1,s2;
		s1=sc.nextLine();
		System.out.println("the string is :"+s1);
		for(int i=0;i<s1.length();i++)
		{
			char ch1=s1.charAt(i);
			System.out.println(ch1+" ");
		}
		//Compile Time
		s2="welcome to the world";
		System.out.println(s2);
		for(int i=0;i<s2.length();i++)
		{
			char ch2=s2.charAt(i);
			System.out.println(ch2+" ");
		}
	}
}
		
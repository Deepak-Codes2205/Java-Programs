import java.util.Scanner; 

class string01
{
	public static void main(String [] ar)
	{
		//compile time 
		String s="Welcome to Gives Infotech ";
		System.out.println(s);
		
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			System.out.print(ch+" ");
		}									
		
		//Run Time 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name and Address ");
		s=sc.nextLine();
		
		System.out.println(s);
		
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			System.out.println(ch+" ");
		}
	}
}

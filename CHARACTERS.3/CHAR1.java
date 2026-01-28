import java.util.Scanner;

class characters
{
	public static void main(String [] ar)
	{
		char Ch1='1',Ch2,Ch3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the character Ch2");
		// TO INPUT A CHRACTER THROUGH USER
		Ch2=sc.next().charAt(0);
		
		System.out.println("enter the character Ch2");
		Ch3=sc.next().charAt(0);
		
		System.out.println("the charcter is Ch1 is :"+Ch1);
		System.out.println("the charcter is Ch2 is :"+Ch2);
		System.out.println("the charcter is Ch3 is :"+Ch3);
		
		System.out.println("check character Ch1");
		if(Character.isLetter(Ch1))
			System.out.println("TRUE");
		else 
			System.out.println("FALSE");
		
		
		System.out.println("check character Ch2");
		if(Character.isLetter(Ch2))
			System.out.println("TRUE");
		else 
			System.out.println("FALSE");
	}
		
		
}
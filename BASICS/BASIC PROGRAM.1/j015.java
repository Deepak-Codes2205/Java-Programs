import java.util.Scanner;

class reverse
{
	public static void main(String [] ar)
	{
		int n=0,r=0,s=0,diff=0,w=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no you want to check");
		n=sc.nextInt();
		w=n;
		while(n>0)
		{
			r=n%10;
			s=s*10+r;
			n=n/10;
		}
		if(s>w)
		{
			diff=s-n; 
			System.out.println("THE REVERSE OF THE DIGITS IS"+":"+s+" "+"AND THE DIFFERENCE IS"+":"+diff);
		}
		else
		{
			diff=n-s;
			System.out.println("THE REVERSE OF THE DIGITS IS"+":"+s+" "+"AND THE DIFFERENCE IS"+":"+diff);				
		}
	}
}

import java.io.*;
import java.util.Scanner;
class j_001
{
	public static void main(String [] ar)
	{
		int num,c=0,i=2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to check");
		num=sc.nextInt();
		while(i<num)
		{
			if(num%i==0)
				c=c+1;
			i++;
		}
		if(c>=1)
			System.out.println("Not a prime Number");
		else
			System.out.println("Prime no :"+num);
	}
	
}
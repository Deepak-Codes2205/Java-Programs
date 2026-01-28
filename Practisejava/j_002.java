import java.io.*;
import java.util.Scanner;
class j_002
{
	public static void main(String [] ar)
	{
		int num,f=1,i=1,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number whose factorial you want to find");
		num=sc.nextInt();
		temp=num;
		while(temp>0)
		{
			f=f*temp;
			temp=temp-1;
		}
		System.out.println("The factorial of the no :"+num+" is "+f);
	}
	
}
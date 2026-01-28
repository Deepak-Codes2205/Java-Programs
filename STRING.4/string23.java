/* Write a program to input a sentence. Convert the sentence into upper case letters
Display the words along with trequency of the words which have atleast a pair of consecutive letters. 
Sample Input: MODEM IS AN ELECTRONIC DEVICE 
Sample Output: MODEM ,DEVICE 
Number of words containing consecutive letters: 2 */
import java.util.Scanner;yy

class stringss
{
	public static void main(String [] ar)
	{
		String s1,s2="";
		char ch1,ch2,ch3;
		int i=0,c=0,p=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		s1=sc.nextLine();
		
		s1=s1.toUpperCase();
		System.out.println("The String is :"+s1);	
		while(i<s1.length())
		{
			while(s1.charAt(i)!=' ')
			{
				ch1=s1.charAt(i);
				s2=s2+ch1;
				ch2=s1.charAt(i+1);
				ch3=ch1++;
				if(ch3==ch2)
					c=c+1;
				i++;
			}
			if(c>p)
				System.out.println(s2);
			p=c;
			s2="";
			i++;
			
		}
		System.out.println("the no of pairs of consecutive letter are :"+c);
	}
}
			
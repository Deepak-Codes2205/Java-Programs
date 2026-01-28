/* PATTERNS*/

import java.util.Scanner;

class stringss
{
	public static void main(String [] ar)
	{
		int i=0,j=0,k=0;
		String str = "bluej";
		char ch1;
		for(i = str.length()-1; i >= 0; i--) {
			for(j = str.length(); j > i ; j--) {
				System.out.print(str.charAt(i));
			}
			System.out.println();
		}
		System.out.println("\n*************************************\n");
		String str1="ABCDE";
		for(i =0; i <= str1.length()-1 ; i++) {
			for(j = i; j <= str1.length()-1 ; j++) {
				System.out.print(str1.charAt(j));
			}
			System.out.println();	
		}
		System.out.println("\n*************************************\n");
		ch1='A';
		for(i = 4; i > k; i--) {
			for(j = 0; j <=k ; j--) {
				System.out.print(ch1++);
			}
			k++;
			System.out.println();
		}
	}
}

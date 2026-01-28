/* Special words are those words which start and end with the same letter  Example: EXISTENCE, COMIC, WINIXOW. 
Palindrome words are those words which read the same from lefet to right and visa versa Example:MADAM, LEVEL, ROTATOR.
All palindromes are special words but all special words are not palindrome.
Write a program to accepta word. Check and display whether the word is a pallindrome or only a special word or none of them.*/

import java.util.Scanner;

class stringss
{
	public static void main(String [] ar)
	{
		String s1,s2="",s3="",s4="";
		int i=0,k=0,j=0,c=0;
		char ch1,ch2='y',ch3='o';
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		s1=sc.nextLine();
		
		int index = 0;
		while(s1.length() > index) {
			s2 = s1.charAt(index) + s2;
			index++;
		}
		if(s1.equals4
		(s2)) {
			System.out.println("Ye bro "+s1+" is equal");
		} else {
			System.out.println("Chi bro "+s1+" is not equal");
		}

	}
}
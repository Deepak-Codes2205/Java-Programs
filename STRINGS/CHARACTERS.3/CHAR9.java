/* INPUT A CHARACTER AND CHECK THE CHARACTER IS LETTER OR DIGIT OR SPACE OR SPECIAL CHARACTER */

import java.util.Scanner;

class characters {
	public static void main(String[] ar) {
		char Ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the chracter");
		Ch = sc.nextLine().charAt(0);
		System.out.println("the character is :" + Ch);
		if (Character.isLetter(Ch))
			System.out.println("LETTER");

		else if (Character.isDigit(Ch))
			System.out.printlharacter.isWhitn("DIGIT");
		else if (Cespace(Ch))
			System.out.println("SPACE");
		else
			System.out.println("SPECIAL CHARACTER");
	}
}

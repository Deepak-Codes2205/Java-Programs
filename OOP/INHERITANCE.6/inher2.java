/*INHERITANCE 

-> Class Level Inheritance 
	1.1 : MULTIPLE LEVEL
*/

import java.util.Scanner;

class marks
{
	float mh,ch,ph,eg,h;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of maths ,chemistry,physics,english,hindi repectivily:");
		mh=sc.nextInt();
		ch=sc.nextInt();
		ph=sc.nextInt();
		eg=sc.nextInt();
		h=sc.nextInt();
	}
	
}
class result extends marks
{
	double per=0;
	void percentage()
	{
		per=((mh+ch+ph+eg+h)*100)/500;
		System.out.println("The percentage is :"+per);
	}
}
class Schoolership extends result
{
	void display()
	{
		if(per>=90)
			System.out.println("YOU WILL BE GIVEN 30 PERCENT SCHOOLERSHIP");
		else if(per>=80 && per<90)
			System.out.println("YOU WILL BE GIVEN 20 PERCENT SCHOOLERSHIP");
		else if(per>=70 && per<80)
			System.out.println("YOU WILL BE GIVEN 10 PERCENT SCHOOLERSHIP");
		else if(per<70)
			System.out.println("NO SCHOOLERSHIP :");
	}

	
	public static void main(String [] ar)
	{
		Schoolership ob=new Schoolership();
		ob.input();
		ob.percentage();
		ob.display();
	}
	
}

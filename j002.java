import java.util.Scanner;

class triangles
{
	public static void main(String [] ar)
	{
		int a,b,c;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter all the three angles of the triangle");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println("the angles are"+" "+a+","+b+","+c);
		if(a+b+c==180)
		{
			System.out.println("valid angles");
			if(a>0 && a<90 && b>0 && b<90 && c>0 && c<90)
				System.out.println("IT IS AND ACUTE ANGLE TRIANGLE");
			else if(a>90 && b<=90 && c<=90 || b>90 && a<=90 && c<=90|| c>90 && a<=90 && b<=90 )
				System.out.println("IT IS AND OBTUSE ANGLE TRIANGLE");
			else if(a==90 && b!=90 && c!=90 || b==90 && a!=90 && c!=90 || c==90 && b!=90 && a!=90)
				System.out.println("IT IS AND RIGHT ANGLE TRIANGLE");
		}
		else
			System.out.println("Invalid angles");
	}
}
import java.util.Scanner;

class volume
{
	public static void main(String [] ar)
	{
		int l=0,b=0,h=0,r=0,ch;
		double vol;
		Scanner sc=new Scanner(System.in);
		System.out.println("PRESS 1 FOR CUBOID:\nPRESS 2 FOR CYLINDER:\nPRESS 3 FOR CONE\n");
		ch=sc.nextInt();
		if(ch==1)
		{
			System.out.println("enter the length, breadth and height of the cuboid");
			l=sc.nextInt();
			b=sc.nextInt();
			h=sc.nextInt();
			vol=l*b*h;
			System.out.println("the volume of the given cuboid is "+" "+vol);
		}
		else if(ch==2)
		{
			System.out.println("enter the radius and height of the cylinder");
			r=sc.nextInt();
			h=sc.nextInt();
			vol=3.14*r*r*h;
			System.out.println("the volume of the given cylinder is "+" "+vol);
		}
		else if(ch==3)
		{
			System.out.println("enter the radius and height of the cone");
			r=sc.nextInt();
			h=sc.nextInt();
			vol=(3.14*r*r*h)/3;
			System.out.println("the volume of the given cone is "+" "+vol);
		}
	}
}
	
		
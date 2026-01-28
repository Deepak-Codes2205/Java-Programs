import java.util.Scanner;

class circuit
{
	public static void main(String [] ar)
	{
		int ch=0,r1=0,r2=0;
		double R=0;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("PRESS 1 FOR SERIES:\nPRESS 2 FOR PARALLEL:\n");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("enter the resistance of both the wire");
					r1=sc.nextInt();
					r2=sc.nextInt();
					R=r1+r2;
					System.out.println("THE COMBINE RESISTANCE OF THE CIRCUIT IS"+":"+R);
					break;
				
				case 2 :
					System.out.println("enter the resistance of both the wire");
					r1=sc.nextInt();
					r2=sc.nextInt();
					R=(r1*r2)/(r1+r2);
					System.out.println("THE COMBINE RESISTANCE OF THE CIRCUIT IS"+":"+R);
					break;
			}
		}while(ch<=2);
	}
}

			
			
			
			
import java.util.Scanner;

class discount
{
	public static void main(String [] ar)
	{
		int p,b=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount of shopping you did");
		p=sc.nextInt();
		if(p<=2000)
		{
			b=(p*95)/100;
			System.out.println("YOU GOT A DISCOUNT OF 5% ALONG WITH CALCULATER AS A GIFT AND YOUR BILL AMOUNT TO"+":"+b);
		}
		else if(p>=2001 && p<=5000)
		{
			b=(p*90)/100;
			System.out.println("YOU GOT A DISCOUNT OF 10% ALONG WITH SCHOOL BAG AS A GIFT AND YOUR BILL AMOUNT TO"+":"+b);
		}
		else if(p>=5001 && p<=10000)
		{
			b=(p*85)/100;
			System.out.println("YOU GOT A DISCOUNT OF 15% ALONG WITH WALL CLOCK AS A GIFT AND YOUR BILL AMOUNT TO"+":"+b);
		}
		else if(p>10000)
		{
			b=(p*80)/100;
			System.out.println("YOU GOT A DISCOUNT OF 20% ALONG WITH WRIST WATCH AS A GIFT AND YOUR BILL AMOUNT TO"+":"+b);
		}
	}
}
		
import java.util.Scanner;

class taxi
{
	public static void main(String [] ar)
	{
		int d=0,a=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the distane you want to cover");
		d=sc.nextInt();
		if(d<=5)
			a=d*100;
		else if(d>5 && d<=15)
			a=d*10;
		else if(d>15 && d<=25)
				a=d*8;
			else if(d>25)
				a=d*5;
			System.out.println("FOR COVERING DISTANCE OF"+" "+d+" "+"KM YOUR BILL AMOUNT TO RUPEES"+":"+a);
	}
}
			
	
		
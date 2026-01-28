import java.util.Scanner;

class profitloss
{
	public static void main(String [] ar)
	{
		int cp,sp,pp,lp,l,p;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the cost price and the selling price");
		cp=sc.nextInt();
		sp=sc.nextInt();
		System.out.println("The cost price and the selling price are  :"+cp+","+sp);
		int pr=(sp>cp)?sp-cp:cp-sp;
		if(sp>cp)
		{
			System.out.println("PROFIT OCCURED");
			p=(pr*100)/cp;
			pp=(p*100)/cp;
			System.out.println(pp+" "+"percent profit occured which amount to :"+p);
		}
		else if(sp<cp)
		{
			System.out.println("LOSS OCCURED");
			l=(pr*100)/cp;
			lp=(l*100)/cp;
			System.out.println(lp+" "+"percent loss occured which amount to :"+l);
		}
	}
}
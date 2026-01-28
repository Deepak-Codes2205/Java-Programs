import java.util.Scanner;

class digits
{
	public static void main(String [] ar)
	{
		int i,p=0,n=0,ps=0,ns=0;
		for(i=-20;i<30;i++)
		{
			if(i>=0)
			{
				p++;
				ps=ps+i;
			}
			else if(i<0)
			{
				n++;
				ns=ns+i;
			}
		}
		System.out.println("the no of positive no's are"+":"+p+" "+"and their sum is"+":"+ps);
		System.out.println("the no of negitive no's are"+":"+n+" "+"and their sum is"+":"+ns);
	}
}
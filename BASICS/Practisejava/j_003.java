import java.util.Scanner;

class j_003
{
	public static void main(String [] ar)
	{
		int n1,n2,i,k=0,m=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two no's");
		n1=sc.nextInt();
		n2=sc.nextInt();
		System.out.println("The two no's are"+","+n1+","+n2);
		if(n1>0)
		{
			for(i=1;i<n1;i++)
			{
				if(n1/i==i)
				{
					k=1;
					break;
				}
				else
					k=0;
			}
		}
		else 
			k=-1;
		
		if(n2>0)
		{
			for(i=1;i<n2;i++)
			{
				if(n2/i==i)
				{
					m=1;
					break;
				}
				else
					m=0;
			}
		}
		else 
			m=-1;
		
		if(k==1 && m==1)
			System.out.println("BOTH NO'S ARE PERFECT SQUARES");
		else if(k==1 && m==0)
			System.out.println(" FIRST NO IS ONLY THE PERFECT SQUARES");
		else if(k==0 && m==1)
			System.out.println("SECOND NO IS ONLY THE PERFECT SQUARES");
		else if(k==0 && m==0)
			System.out.println("NONE IS THE PERFECT SQUARE");
		else if(k==-1 || m==-1)
			System.out.println("ONE OF THE NO IS NEGATIVE");
	}
}
			
			
			
		
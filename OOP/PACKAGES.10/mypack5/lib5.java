/* PACKAGES */

package mypack5;

public class lib5
{
	public int check(int n,char Ch)
	{
		int c=0,r=0,k=0;
		
		if(Ch=='s')
		{
			if(n%7==0)
				c=1;
			else
				c=2;
			
		}
		else if(Ch!='s')
		{
			while(k<1)
			{
				r=n%10;
				n=n/10;
				k=k+1;
			}
			if(r==7)
				c=3;
			else if(r!=7)
				c=4;
		}
		return(c);
	}
}

				
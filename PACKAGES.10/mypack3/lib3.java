/* PACKAGES */

package mypack3;

public class lib3
{
	int n,p,m,i=0,val;
	char ch1;
	char ch2;
	public int magic(String s1)
	{
		for(i=0;i<s1.length()-1;i++)
		{
			ch1=s1.charAt(i);
			ch2=s1.charAt(i+1);
			val=ch2-ch1;
		}
		if(val==1)
			return(1);
		else 
			return(0);
	}
}
		
		
		
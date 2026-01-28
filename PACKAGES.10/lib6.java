/* PACKAGES */

package mypack;

public class lib6
{
	public String binary(int num)
	{
		String s1="";
		while(num!=0)
		{
			r=num%2;
			s1=s1+r;
			num=num/2;
		}
		return(s1);
	}
}
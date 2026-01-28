/* PACKAGES */

package mypack4;

public class lib4
{
	int i=0,c=0;
	
	public int Search(int arr[],int ns)
	{
		for(i=0;i<arr.length;i++)
		{
			if(ns==arr[i])
			{
				c=1;
				break;
			}
		}
		return(c);
	}
}
			
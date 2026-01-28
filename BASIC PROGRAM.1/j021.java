import java.util.Scanner;

class input
{
	public static void main(String [] ar)
	{
		int arr[]={1,1,2,2,3,3,3,4,4,5,5};
		//Arrays.sort(arr);2
		int i=0,c=0,k=0;
		int t=arr[k];
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==t)
				c=c+1;
			if(i==arr.length-1 && k<arr.length)
			{
				i=0;
				if(c%2==1)
					break;
				else
				{
					k++;
					t=arr[k];
					c=0;
				}
			}
		}
		
		System.out.println("The no with odd no of occurance is "+t);
	}
}
		
			
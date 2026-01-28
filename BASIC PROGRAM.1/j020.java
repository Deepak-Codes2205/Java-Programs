/* To find the first and last position of the given target element */
import java.util.Scanner;

class input
{
    public static void main(String [] ar)
    {
        int nums[]={1,2,3,4,5,3,3,6,7};
        int i=0,j=0,p=0,c=0,target=3;
        int nums2[]=new int[2];
        for(i=0;i<nums.length;i++)
	    {
		    if(nums[i]==target)
		    {
                p=i;
                c=c+1;
                if(c==1)
                {
                    nums2[j++]=i;
                }
    	    }
        }
        

        nums2[j++]=p;
        for(i=0;i<nums2.length;i++)
        {
            System.out.println(nums2[i]);
        }
    }
}
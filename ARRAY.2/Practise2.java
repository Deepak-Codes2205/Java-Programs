class Solution
 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int l=nums1.length,m=nums2.length,i=0,j=0,k=0,n;
        double med=0;
        int arr3[]=new int [20];
        
        i=0;
        if(l>m)
        {
            while(i<l)
            {
                if(nums1[i]<nums2[j])
                {
                    arr3[k]=nums1[i];
                    i++;
                }
                else if(nums1[i]>nums2[i])
                {
                    arr3[k]=nums2[j];
                    j++;
                }
                k++;
            }
			
            if(k%2==0)
            {
                n=k/2;
                med=(arr3[n]+arr3[n+1])/2;
            }
            else
            {
                n=k/2;
                med=arr3[k];
            }
        }

        else if(l<m)
        {
            while(j<m)
            {
                if(nums1[i]<nums2[j])
                {
                    arr3[k]=nums1[i];
                    i++;
                }
                else if(nums1[i]>nums2[i])
                {
                    arr3[k]=nums2[j];
                    j++;
                }
                k++;
            }
            if(k%2==0)
            {
                n=k/2;
                med=(arr3[n]+arr3[n+1])/2;
            }
            else
            {
                n=k/2;
                med=arr3[k];
            }
        }
        return med;
    }
}   
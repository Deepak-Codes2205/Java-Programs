class SecondHighest 
{
    public int secondMostFrequentElement(int[] nums) 
	{
        int i = 0, f1 = 0, f2 = 0, ele1 = -1, ele2 = -1, m = 0, c = 0;
        m = nums[0];
        for (i = 0; i < nums.length; i++) 
		{
            m = Math.max(nums[i], m);
        }        
        int[] hash = new int[m + 1];
        for (i = 0; i < nums.length; i++) 
		{
            hash[nums[i]]++;
        }
        for (i = 0; i <= m; i++) 
		{
            c = hash[i];
            if (c != 0) 
			{
                if (c > f1) 
				{
                    f2 = f1;
                    ele2 = ele1;
                    f1 = c;
                    ele1 = i;
                } 
				else if (c > f2) 
				{
                    f2 = c;
                    ele2 = i;
                }
            }
        }
        if (ele2 == -1)
            return -1;
        return ele2;
    }
    public static void main(String[] args) 
	{
        SecondHighest obj = new SecondHighest();

        int[] nums1 = {1, 2, 2, 3, 3, 4};       
        int[] nums2 = {5, 5, 5, 6, 6, 7};       
        int[] nums3 = {1, 1, 1};                
        int[] nums4 = {4, 4, 2, 2, 3, 3};       

        System.out.println("Result 1: " + obj.secondMostFrequentElement(nums1));
        System.out.println("Result 2: " + obj.secondMostFrequentElement(nums2));
        System.out.println("Result 3: " + obj.secondMostFrequentElement(nums3));
        System.out.println("Result 4: " + obj.secondMostFrequentElement(nums4));
    }

}
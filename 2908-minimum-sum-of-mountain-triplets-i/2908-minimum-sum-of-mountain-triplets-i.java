class Solution {
    public int minimumSum(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(nums[j]>nums[i] && nums[j]>nums[k])
                    {
                        int currentsum=nums[i]+nums[j]+nums[k];
                        min=Math.min(min,currentsum);
                    }
                }
            }
        }
        return min==Integer.MAX_VALUE ? -1 : min;
        
    }
}
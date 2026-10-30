class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if(n==1) return 0;
        int end=0;
        int jump=0;
        int far=0;
        for(int i=0;i<n-1;i++)
        {
            far=Math.max(far,nums[i]+i);
            if(i==end)
            {
                jump++;
                end=far;
            }
            if(end>=n-1)
            {
                break;
            }
        }
        return jump;
        
    }
}
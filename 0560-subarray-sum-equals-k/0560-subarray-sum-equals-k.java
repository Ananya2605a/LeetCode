class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int currentsum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int num:nums)
        {
            currentsum+=num;
            int neededsum = currentsum-k;
            if(map.containsKey(neededsum))
            {
                count+=map.get(neededsum);
            }
            map.put(currentsum,map.getOrDefault(currentsum,0)+1);
        }
        return count;
        
    }
}
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int currentsum=0;
        Map<Integer,Integer> prefixMap = new HashMap<>();
        prefixMap.put(0,1);
        for(int num:nums)
        {
            currentsum+=num;
            int neededsum=currentsum-k;
            if(prefixMap.containsKey(neededsum))
            {
                count+=prefixMap.get(neededsum);
            }
            prefixMap.put(currentsum,prefixMap.getOrDefault(currentsum,0)+1);
        }
        
        return count;
        
    }
}
class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> maxDequeue = new ArrayDeque<>();
        Deque<Integer> minDequeue = new ArrayDeque<>();
        int left = 0;
        int answer=0;
        for(int right=0;right<nums.length;right++)
        {
            while(!maxDequeue.isEmpty() && nums[maxDequeue.peekLast()]<nums[right])
            {
                maxDequeue.pollLast();
            }
            maxDequeue.addLast(right);

            while(!minDequeue.isEmpty() && nums[minDequeue.peekLast()]>nums[right])
            {
                minDequeue.pollLast();
            }
            minDequeue.addLast(right);

            while(nums[maxDequeue.peekFirst()]-nums[minDequeue.peekFirst()]>limit)
            {
                if(maxDequeue.peekFirst()==left)
                {
                    maxDequeue.pollFirst();
                }
                if(minDequeue.peekFirst()==left)
                {
                    minDequeue.pollFirst();
                }
                left++;
            }
            answer = Math.max(answer,right-left+1);


        }
        return answer;
        
    }
}
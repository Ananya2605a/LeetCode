class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Integer[] order = new Integer[n];
        for(int i=0;i<n;i++)
        {
            order[i]=i;
        }
        Arrays.sort(order,(a,b)->Integer.compare(intervals[a][1],intervals[b][1]));
        int total=0;
        int lastend = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int idx = order[i];
            if(intervals[idx][0]>=lastend)
            {
                total++;
                lastend=intervals[idx][1];
            }
        }
        return n-total;
        
    }
}
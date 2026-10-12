class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxprofit=0;
        int minprice=prices[0];
        for(int i=1;i<n;i++)
        {
            if(prices[i]<minprice)
            {
                minprice=prices[i];
            }
            int profit = prices[i]-minprice;
            if(profit>maxprofit)
            {
                maxprofit=profit;
            }
        }
        return maxprofit;
        
    }
}
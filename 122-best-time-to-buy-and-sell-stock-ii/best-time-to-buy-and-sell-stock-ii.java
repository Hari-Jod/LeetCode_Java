class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int n = prices.length;
        for(int i = 1; i < n; i++){
            if(prices[i - 1] < prices[i])
                profit += prices[i - 1] - prices[i];
        }
        return Math.abs(profit);
    }
}
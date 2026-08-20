class Solution {
    public int maxProfit(int[] prices) {
        int max = 0, mnc = Integer.MAX_VALUE;
        for( int i = 0; i < prices.length; i++) {
            max = Math.max(max, prices[i] - mnc);
            mnc = Math.min(mnc, prices[i]);
        }
        return max;
    }
}
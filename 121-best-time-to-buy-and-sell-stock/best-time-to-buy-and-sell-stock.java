class Solution {
    public int maxProfit(int[] prices) {
        // int max = Integer.MIN_VALUE;
        // for(int i = prices.length - 1; i >= 0; i--){
        //     for(int j = prices.length - 1; j >= 0; j--){
        //         max = Math.max(max, (prices[j] - prices[1])*(-1));
        //     }
        // }
        // return max;
        int mxp = 0, mnc = prices[0];
        for(int i = 0; i < prices.length; i++){
            mxp = Math.max(mxp, prices[i] - mnc);
            mnc = Math.min(mnc, prices[i]);
        }
        return mxp;
    }
}
class Solution {
    public int maximumAmount(int[][] coins) {
        int m = coins.length;
        int n = coins[0].length;
        Integer[][][] memo = new Integer[m][n][3];
        return solve(0, 0, 2, coins, memo);
    }
    private int solve(int i, int j, int k, int[][] coins, Integer[][][] memo) {
        int m = coins.length;
        int n = coins[0].length;
        if (i >= m || j >= n) return Integer.MIN_VALUE / 2;
        if (i == m - 1 && j == n - 1) {
            if (coins[i][j] < 0 && k > 0) return 0; 
            return coins[i][j];
        }
        if (memo[i][j][k] != null) return memo[i][j][k];
        int currentCoin = coins[i][j];
        int res = currentCoin + Math.max(solve(i + 1, j, k, coins, memo), 
                                       solve(i, j + 1, k, coins, memo));
        if (currentCoin < 0 && k > 0) {
            int neutralizeRes = Math.max(solve(i + 1, j, k - 1, coins, memo), 
                                         solve(i, j + 1, k - 1, coins, memo));
            res = Math.max(res, neutralizeRes);
        }
        return memo[i][j][k] = res;
    }
}
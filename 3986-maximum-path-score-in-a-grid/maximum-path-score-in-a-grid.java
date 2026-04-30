class Solution {
    public int maxPathScore(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        
        int[][] dp = new int[m][n];
        
        int[][][] memo = new int[m][n][k + 1];
        for (int[][] row : memo) for (int[] col : row) Arrays.fill(col, -1);

        int startVal = grid[0][0];
        int startCost = (startVal == 0) ? 0 : 1;
        if (startCost <= k) memo[0][0][startCost] = startVal;

        for (int c = 0; c <= k; c++) {
            for (int r = 0; r < m; r++) {
                for (int col = 0; col < n; col++) {
                    if (memo[r][col][c] == -1) continue;

                    int currentScore = memo[r][col][c];

                    if (col + 1 < n) {
                        update(grid, memo, r, col + 1, c, currentScore, k);
                    }
                    if (r + 1 < m) {
                        update(grid, memo, r + 1, col, c, currentScore, k);
                    }
                }
            }
        }

        int maxFinalScore = -1;
        for (int c = 0; c <= k; c++) {
            maxFinalScore = Math.max(maxFinalScore, memo[m - 1][n - 1][c]);
        }

        return maxFinalScore;
    }

    private void update(int[][] grid, int[][][] memo, int r, int c, int currentCost, int currentScore, int k) {
        int val = grid[r][c];
        int nextCost = currentCost + (val == 0 ? 0 : 1);
        if (nextCost <= k) {
            memo[r][c][nextCost] = Math.max(memo[r][c][nextCost], currentScore + val);
        }
    }
}
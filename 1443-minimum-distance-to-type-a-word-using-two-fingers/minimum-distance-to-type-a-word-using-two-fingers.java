import java.util.Arrays;
class Solution {
    public int minimumDistance(String word) {
        int n = word.length();
        int[][] dp = new int[n + 1][27];
        for (int[] row : dp) Arrays.fill(row, Integer.MAX_VALUE / 2);
        dp[0][26] = 0;
        for (int i = 0; i < n; i++) {
            int curr = word.charAt(i) - 'A';
            int prev = (i == 0) ? 26 : word.charAt(i - 1) - 'A';
            for (int other = 0; other <= 26; other++) {
                if (dp[i][other] == Integer.MAX_VALUE / 2) continue;
                dp[i + 1][other] = Math.min(dp[i + 1][other], dp[i][other] + getDist(prev, curr));
                dp[i + 1][prev] = Math.min(dp[i + 1][prev], dp[i][other] + getDist(other, curr));
            }
        }
        int minDistance = Integer.MAX_VALUE;
        for (int d : dp[n]) {
            minDistance = Math.min(minDistance, d);
        }
        return minDistance;
    }
    private int getDist(int c1, int c2) {
        if (c1 == 26) return 0;
        int x1 = c1 / 6, y1 = c1 % 6;
        int x2 = c2 / 6, y2 = c2 % 6;
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);  
    }
}
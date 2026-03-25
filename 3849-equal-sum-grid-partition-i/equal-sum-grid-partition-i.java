class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        long sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                sum += grid[i][j];
            }
        }
        if(sum % 2 != 0) return false;
        long target = sum / 2;
        long curr = 0;
        for(int i = 0; i < n; i++){
            long rowSum = 0;
            for(int j = 0; j < m; j++){
                rowSum += grid[i][j];
            }
            curr += rowSum;
            if(curr == target) return true;
        }
        curr = 0;
        for(int j = 0; j < m; j++){
            long colSum = 0;
            for(int i = 0; i < n; i++){
                colSum += grid[i][j];
            }
            curr += colSum;
            if(curr == target) return true;
        }
        return false;
    }
}
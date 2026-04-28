import java.util.*;

class Solution {
    public int minOperations(int[][] grid, int x) {
        int rows = grid.length, cols = grid[0].length;
        int[] flat = new int[rows * cols];
        int idx = 0;
        
        int firstMod = grid[0][0] % x;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] % x != firstMod) return -1;
                flat[idx++] = grid[i][j];
            }
        }
        
        Arrays.sort(flat);
        
        int median = flat[flat.length / 2];
        int operations = 0;
        
        for (int val : flat) {
            operations += Math.abs(val - median) / x;
        }
        
        return operations;
    }
}
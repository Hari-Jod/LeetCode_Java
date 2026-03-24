// class Solution {
//     public int[][] constructProductMatrix(int[][] grid) {
//         int n =  grid.length;
//         int m = grid[0].length;
//         int [][] arr = new int[n][m];
//         int product = 1;
//         int MOD = 12345;
//         if(m == 0 || n == 0) return arr;
//         for(int i = 0;i<n;i++){
//             for(int j = 0;j<m;j++){
//                 product = product*grid[i][j];
//             }
//         }
//         for(int i = 0;i<n;i++){
//             for(int j = 0;j<m;j++){
//                 // product = product*grid[i][j];
//                 arr[i][j] =  (product/grid[i][j])%MOD;
//                 // arr[i][j] =  product/grid[i][j];
//             }
//         }
//         return arr;
//     }
// }
class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int MOD = 12345;
        int n = grid.length;
        int m = grid[0].length;

        int[][] arr = new int[n][m];

        long product = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (int) product;
                product = (product * grid[i][j]) % MOD;
            }
        }

        product = 1; 
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                arr[i][j] = (int)((arr[i][j] * product) % MOD);
                product = (product * grid[i][j]) % MOD;
            }
        }

        return arr;
    }
}
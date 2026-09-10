class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int arr[][] = new int[m + 1][m + 1];
        for(int i = m - 1; i >= 0; i--)
            for(int j = 0; j <= i; j++)
                arr[i][j] = triangle.get(i).get(j) + Math.min(arr[i+1][j], arr[i+1][j+1]);
        return arr[0][0];
    }
}
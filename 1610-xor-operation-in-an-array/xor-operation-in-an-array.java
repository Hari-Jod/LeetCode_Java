class Solution {
    public int xorOperation(int n, int start) {
        int [] arr = new int[n];
        int result = 0;
        for(int j = 0; j < n; j++){
            result = result ^ (start + 2 * j);
        }
        return result;
    }
}
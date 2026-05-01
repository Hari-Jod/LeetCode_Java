class Solution {
    public int xorOperation(int n, int start) {
        int i = 0;
        int [] arr = new int[n];
        // while(i < n){
        //     i++;
        // }
        int result = 0;
        for(int j = 0; j < n; j++){
            arr[j] = start + 2 * j;
            result = result ^ arr[j];
        }
        return result;
    }
}
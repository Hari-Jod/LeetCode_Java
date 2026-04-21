class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;
        int pos = n - 1;
        int [] res = new int[n];
        while(i <= j){
            int lsq = nums[i]*nums[i];
            int rsq = nums[j]*nums[j];
            if(lsq > rsq){
                res[pos] = lsq;
                i++;
            } else{
                res[pos] = rsq;
                j--;
            }
            pos--;
        }
        return res;
    }
}
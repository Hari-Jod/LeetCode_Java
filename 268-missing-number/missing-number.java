class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length + 1;
        int miss = n - 1;
        int mis = 0;
        // for(int i = 0;i<n;i++){
        // }
        for(int i = 0;i<n-1;i++){
            miss += i;
            mis += nums[i];
        }
        return miss-mis;
    }
}
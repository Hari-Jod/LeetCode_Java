class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int n = nums.length;
       int l = 0;
       int max = 0;
       int currSum = 0;
       for(int i = 0;i<k;i++){
       currSum += nums[i];
       }
       max = currSum;
        for(int r = k;r < nums.length;r++){
            currSum -= nums[l];
            currSum += nums[r];
            max = Math.max(max, currSum);
            l++;
        }
        return (double) max/k;
    }
}
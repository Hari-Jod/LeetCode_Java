class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int max = 0;
        for(int i = 0; i < n - 1; i++) {
            if(nums[i] < nums[i + 1]) {
                max = i + 1;
            }
        }
        return max;
    }
}
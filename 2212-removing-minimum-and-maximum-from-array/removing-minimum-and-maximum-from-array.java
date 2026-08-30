class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIdx = 0;
        int maxIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < min) {
                min = nums[i];
                minIdx = i;
            }
            if(max < nums[i]) {
                max = nums[i];
                maxIdx  = i;
            }
        }
        int n = nums.length;
        int far = Math.max(minIdx, maxIdx);
int near = Math.min(minIdx, maxIdx);

return Math.min(
    far + 1,
    Math.min(n - near, near + 1 + n - far)
);
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
        int j = 0;
            int diff = target - nums[i];
            while(j < nums.length) {
            if (i != j && nums[j] == diff) return new int[]{i,j};
            j++;
            }
        }
        return new int[]{0,0};
    }
}
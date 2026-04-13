class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n = nums.length;
        int minDistance = n; 
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                int currentDistance = Math.abs(i - start);
                if (currentDistance < minDistance) {
                    minDistance = currentDistance;
                }
                if (minDistance == 0) return 0;
            }
        }
        return minDistance;
    }
}
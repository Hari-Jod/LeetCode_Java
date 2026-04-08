class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        long MOD = 1_000_000_007L;
        for (int[] query : queries) {
            int left = query[0];
            int right = query[1];
            int step = query[2];
            long multiplier = query[3];
            for (int i = left; i <= right; i += step) {
                long val = nums[i];
                nums[i] = (int) ((val * multiplier) % MOD);
            }
        }
        int resultXOR = 0;
        for (int num : nums) {
            resultXOR ^= num;
        } 
        return resultXOR;
    }
}
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        int less = 0; int count = 0;
        for (int i = 0;i < nums.length; i++) {
            if(nums[i] == target)
                count++;
            else if(nums[i] < target) {
                less++;
            }
        }
        for(int i = less;i < less + count;i++)
            res.add(i);
        return res;
    }
}
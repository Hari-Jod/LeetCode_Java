class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int ans[]=new int[nums.length];

        int sum=0;
        int s=0;

        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }

        for(int i=0;i<nums.length;i++){
            sum=sum-nums[i];
            ans[i]=Math.abs(sum-s);
            s=s+nums[i];
        }
        return ans;
    }
}
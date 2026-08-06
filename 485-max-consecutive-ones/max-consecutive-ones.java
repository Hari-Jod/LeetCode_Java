class Solution {
    static{
        for (int i=0;i<500;i+=1){
            findMaxConsecutiveOnes(new int [0]);
        }
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        int n = nums.length;
        if(n == 0) return 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 1){
            count++;
            }
            else{
            max = Math.max(max, count);
            count = 0;}
        }
        max = Math.max(max, count);
        return max;
    }
}
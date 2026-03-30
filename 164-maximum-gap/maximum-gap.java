import java.util.*;
class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int gap = 0;
        // int maxgap = 0;
        if(n<1) return 0;
        for(int i = 0; i<n-1;i++){
            int maxgap = Math.abs(nums[i] - nums[i+1]);
            gap = Math.max(gap,maxgap);
        } 
        return gap;
    }
}
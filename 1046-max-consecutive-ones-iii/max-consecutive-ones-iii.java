class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int left = 0, currLen = 0, zcnt = 0, mx = 0;
        for(int right = 0;right < n;right++){
            if(nums[right] == 0){
                zcnt++;
            }
            while(zcnt > k){
                if(nums[left] == 0){
                    zcnt--;
                }
                left++;
            }
            currLen = right - left + 1;
            mx = Math.max(mx, currLen);
        }
            return mx;
    }
}
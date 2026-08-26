class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int zcount = 0;
        for(int i = 0; i < nums.length; i++) 
            if(nums[i] != 0)
                prod *= nums[i];
            else 
                zcount++;
        for (int i = 0; i < nums.length; i++) {
            if(zcount == 0)
                nums[i] = (int)(prod / nums[i]);
            else if(zcount == 1){
                if(nums[i] == 0){
                    nums[i] = prod;
                } else {
                    nums[i] = 0;
                }
            } else 
                nums[i] = 0;
        }
        return nums;
    }
}
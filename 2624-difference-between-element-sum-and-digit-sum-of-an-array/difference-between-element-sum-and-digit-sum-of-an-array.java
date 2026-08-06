class Solution {
    public int differenceOfSum(int[] nums) {
       int sum = 0;
       int digsum = 0;
       int n = nums.length;
        for(int num : nums){
            sum += num;
            n = num;
            while(n > 0){
                digsum += n % 10;
                n = n/10;

            }
        }
        // for(int i = 0; i < n; i++){
        //     sum += nums[i];
        //     if(nums[i] > 0){
        //         digsum += nums[i] % 10;
        //         nums[i] = nums[i]/10;
        //         // digsum = digsum; 
        //     }
        // } 
        return sum - digsum;
    }
}
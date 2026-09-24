class Solution {
    public static int DigiSum(int n) {
        int temp = n;
        int sum = 0;
        while(temp > 0) {
            sum += temp % 10;
            temp = temp / 10; 
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(DigiSum(nums[i]) == i)
                min = Math.min(min, i);
        }
        if(min == Integer.MAX_VALUE) 
            return -1;
        return min;
    }
}
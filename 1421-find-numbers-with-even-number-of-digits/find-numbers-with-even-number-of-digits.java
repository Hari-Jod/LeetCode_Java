class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            int length = 0;
            int temp = nums[i];
            while (temp  > 0){
                temp = temp/10;
                length++;
            }
            if(length % 2 == 0) count++;

       } 
       return count;
    }
}
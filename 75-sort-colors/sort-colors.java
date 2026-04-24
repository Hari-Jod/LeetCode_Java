class Solution {
    public void sortColors(int[] nums) {
        // int ones = 0;
        // int twos = 0;
        // int zeroes = 0;
        // int n = nums.length;
        // for (int i = 0; i < n; i++) {
        //     if (nums[i] == 0) {
        //         zeroes++;
        //     } else if (nums[i] == 1) {
        //         ones++;
        //     } else
        //         twos++;
        // }
        // int b = 0;
        // for(int i = 0;i < zeroes;i++){
        //     nums[b++] = 0;

        // }
        // for(int i = 0;i < ones;i++){
        //     nums[b++] = 1;

        // }
        // for(int i = 0;i < twos;i++){
        //     nums[b++] = 2;  
        // }
        // while (b < n) {
        //     if (b < zeroes) {
        //         nums[b++] = 0;
        //     } else if (b < zeroes + ones) {
        //         nums[b++] = 1;
        //     } else {
        //         nums[b++] = 2;
        //     }
        // }

        int low = 0, mid = 0,high = nums.length-1;
        while(mid <= high){
            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                mid++;
                low++;
            } else if(nums[mid] == 1){
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}
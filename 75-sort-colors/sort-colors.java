class Solution {
    public void sortColors(int[] nums) {
        int ones = 0;
        int twos = 0;
        int zeroes = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zeroes++;
            } else if (nums[i] == 1) {
                ones++;
            } else
                twos++;
        }
        int b = 0;
        for(int i = 0;i < zeroes;i++){
            nums[b] = 0;
            b++;
        }
        for(int i = 0;i < ones;i++){
            nums[b] = 1;
            b++;
        }
        for(int i = 0;i < twos;i++){
            nums[b] = 2;
            b++;
        }
        // while (b < n) {
        //     if (b < zeroes) {
        //         nums[b] = 0;
        //         b++;
        //     } else if (b < zeroes + ones) {
        //         nums[b] = 1;
        //         b++;
        //     } else {
        //         nums[b] = 2;
        //         b++;
        //     }
        // }
    }
}
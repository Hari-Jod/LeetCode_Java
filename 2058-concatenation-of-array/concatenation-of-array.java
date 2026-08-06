class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] newArr = new int[n + n];
        int j = 0;
        for(int i = 0; i < n + n; i++){
            if(j > n - 1)
                j = 0;
            newArr[i] = nums[j];
            j++;
        }
        return newArr;
    }
}
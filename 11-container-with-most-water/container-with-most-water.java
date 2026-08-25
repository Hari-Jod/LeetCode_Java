class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n - 1;
        int left = height[i];
        int right = height[j];
        int max = 0;
        while(i < j) {
            int area  = 0;
            if(height[i] < height[j]){
                area = height[i] * (j - i);
                i++;
            max = Math.max(area, max);
            } else {
                area = height[j] * (j - i);
                j--;
            max = Math.max(area, max);
            }
        }   
        return max;
    }
}
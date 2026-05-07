class Solution {
    public int maxArea(int[] height) {
       int n = height.length;
       int max = 0;
       int i = 0;
       int j = n - 1;
       int area = 0;
       while(i < j){
            if(height[i] < height[j]){
            area = Math.min(height[i], height[j]) * (j - i);
            max = Math.max(max, area);
                i++;
            } else {
            area = Math.min(height[i], height[j]) * (j - i);
            max = Math.max(max, area);
                j--;
            }
       }
       return max;
    }
}
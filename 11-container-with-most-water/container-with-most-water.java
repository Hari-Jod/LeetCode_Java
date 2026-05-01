class Solution {
    public int maxArea(int[] height) {
       int n = height.length;
       int i = 0; 
       int j = n - 1; 
       int max = 0;
       while(i < j){
        int area = 0;
    //     int area = Math.min(height[i],height[j]) * (j - i);
    //     max = Math.max(max, area);
        if(height[i] < height[j]){
            area = height[i] * (j - i);
            i++;
        } else {
            area = height[j] * (j - i);
            j--;
        }
        max = Math.max(max, area);
       }
       return max;
    }
}
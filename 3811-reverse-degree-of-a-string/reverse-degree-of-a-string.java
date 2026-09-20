class Solution {
    public int reverseDegree(String s) {
        int prod = 0;
        for(int i = 0;i < s.length(); i++) {
            int diff = 26 - (s.charAt(i) - 'a');
            prod += (i + 1) * diff; 
        }   
        return prod;
    }
}
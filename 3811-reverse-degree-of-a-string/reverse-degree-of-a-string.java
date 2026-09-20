class Solution {
    public int reverseDegree(String s) {
        int product = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            product += (i + 1) * (26 - (s.charAt(i) - 'a'));
        }
        return product;
    }
}
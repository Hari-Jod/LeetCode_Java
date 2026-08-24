class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length(); 
        int l2 = word2.length(); 
        int j = 0;
        int i = 0;
        String str = "";
        while(i < l1 || j < l2) {
            if(i < l1) {
                str += word1.charAt(i);
            i++;
            }
            if(j < l2) {
                str += word2.charAt(j);
            j++;
            }
        }
        return str;
    }
}
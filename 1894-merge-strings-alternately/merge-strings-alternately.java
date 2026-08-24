class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length() + word2.length(); 
        // int j = 0;
        // int i = 0;
        String str = "";
        for (int i = 0; i < l1; i++){
        // while(i < l1 || j < l2) {
            if(i < word1.length()) {
                str += word1.charAt(i);
        //     i++;
            }
            if(i < word2.length()) {
                str += word2.charAt(i);
            // j++;
            }
        // }
        }
        return str;
    }
}
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1 = word1.length();
        int w2 = word2.length();
        int i = 0, j =0;
        StringBuilder res = new StringBuilder();
        while(i < w1 || j < w2){
            if(i < w1) res.append(word1.charAt(i++));
            if(j < w2) res.append(word2.charAt(j++));
        }
        return res.toString();
    }
}
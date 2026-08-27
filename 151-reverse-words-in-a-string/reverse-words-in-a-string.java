class Solution {
    public String reverseWords(String s) {
        s.trim();
        StringBuilder result = new StringBuilder();
        String [] word = s.split("\\s+");
        for (int i = word.length - 1; i >= 0; i--) {
            result.append(word[i]+ " ");
        if(i != 0) {
            result.append("");
        } 
        }
        return result.toString().trim();
    }
}
class Solution {
    public String reverseWords(String s) {
        s.trim();
        StringBuilder res = new StringBuilder();
        String[] word = s.split("\\s+");
        for(int i = word.length - 1; i >= 0; i--) {
            res.append(word[i] + " ");
            if(i != 0)
                res.append("");
        }
        return res.toString().trim();
    }
}
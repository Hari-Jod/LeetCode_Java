class Solution {
    public String sortSentence(String s) {
        String [] word = s.split(" ");
        String[] ans = new String[word.length];
        for(String wor : word) {
            int pos = wor.charAt(wor.length() - 1) - '1';
            ans[pos] = wor.substring(0, wor.length() - 1);
        }
        StringBuilder res = new StringBuilder();
        for(String wo : ans) {
            res.append(wo);
                if(ans[ans.length - 1] != wo)
                    res.append(' ');
        }
        return res.toString();
    }
}
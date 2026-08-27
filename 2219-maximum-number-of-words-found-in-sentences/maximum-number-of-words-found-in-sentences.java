class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 1;
        for(int i = 0; i <sentences.length; i++) {
            int count = 1;
            int j = 0;
            while(j < sentences[i].length()) {
                if(sentences[i].charAt(j) == ' ')
                    count++;
                j++;
            }
                max = Math.max(max, count);
        }
        return max;
    }
}
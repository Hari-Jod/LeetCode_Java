class Solution {
    public int scoreOfParentheses(String s) {
        int score = 0;
        int i = 0;
        int depth = 0;    
        while(i < s.length()) {
            if(s.charAt(i) == '('){
                depth++;
            
            } else {
                if (s.charAt(i - 1) == '(') {
                    score += 1 << (depth - 1);
                }

                // depth--;
                depth--;
                }// s☻core += depth;
                // depth--;
            i++;
        }
        return score;
    }
}
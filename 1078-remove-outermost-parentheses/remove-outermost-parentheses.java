class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        int sp = -1;
        for(char c: s.toCharArray()) {
            if(c=='('){
                sp++;
                if(sp>=1) sb.append(c);
                continue;
            }
            sp--;
            if(sp > -1) sb.append(c);
        }
        return sb.toString();
    }   
}
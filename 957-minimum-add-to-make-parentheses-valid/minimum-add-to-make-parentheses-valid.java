class Solution {
    public int minAddToMakeValid(String s) {
        int i = 0, depth = 0,add = 0;
        if(s.length() < 2)
            return 1;
        while(i < s.length()){
            if(s.charAt(i) == '(')
                depth++;
            else {
                if(depth > 0){
                    depth--;
                 } else
                    add++;
            }
            i++;
        }
        return Math.abs(depth + add);
    }
}
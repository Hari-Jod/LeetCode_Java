class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int n = moves.length();
        int rc = 0;
        int lc = 0;
        for(int i = 0;i<n;i++){
            if(moves.charAt(i) == 'R'){
                rc++;
            } else if (moves.charAt(i) == 'L'){
                lc++;
            } else{
                lc = lc;
            }
        }
        if(rc < lc){
            return n - 2*rc;
        } else return n - 2*lc;
    }
}
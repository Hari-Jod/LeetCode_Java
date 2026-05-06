class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        String s1 = s.trim();
        int n = s1.length();
        for(int i = n - 1; i >= 0; i--){
            if(s1.charAt(i) == ' '){
                break;
            }else count++;
        }
        return count;
    }
}
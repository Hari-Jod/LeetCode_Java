class Solution {
    public String convertToTitle(int cn) {
        StringBuilder sb = new StringBuilder();
        while(cn > 0) {
            cn--;
            int rem = cn % 26;
            char ch = (char)('A' + rem);
            sb.append(ch);
            cn /= 26;
        }
        return sb.reverse().toString();
    }
}
class Solution {
    public int compress(char[] chars) {
       int n = chars.length;
        int i = 0;
        int j = 0;
        // int c = 0;
        while(i < n){
            int count = 0;
            char ch = chars[i];
            while(i < n && ch == chars[i]){
                count++;
                i++;
            }
            // while(ch != chars[i]){
            //     i++;
            // }
            chars[j] = ch;
            j++;
            if(count > 1){
                String chcnt = String.valueOf(count);
                for(char digit : chcnt.toCharArray()){
                    chars[j] = digit;
                    j++;
                }
            }
            // c = count;
        }
        return j;
    }
}
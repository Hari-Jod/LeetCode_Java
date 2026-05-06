class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int n = s.length();
        // String s1 = "";
        // int max = 0;
        // Try solving using while loop
        // for(int i = 0; i < n;i++){
        //     if(s1.indexOf(s.charAt(i)) == -1){
        //          s1 += s.charAt(i);
        //          max = Math.max(max, s1.length)
        //     } else {
        //         break;
        //     }
        // }
        // return s1.length();
        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int max = 0;
        int n = s.length();
        for(int right = 0;right < n; right++){
            char ch = s.charAt(right);

            if(map.containsKey(ch)){
                left = Math.max(left, map.get(ch) + 1);
            }
            map.put(ch, right);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
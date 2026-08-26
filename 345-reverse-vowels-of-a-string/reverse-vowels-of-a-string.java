class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
        List<Character> vowels = List.of('a','A','e','E','i','I','o','O','u','U');
        while(i < j) {
            if(vowels.contains(s.charAt(i)) && vowels.contains(s.charAt(j))) {
                char temp = s.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;
            } else if (vowels.contains(s.charAt(i)) && !vowels.contains(s.charAt(j))){
                j--;
            } else i++;
        }
        return sb.toString();
    }
}
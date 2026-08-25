class Solution {
    public int maxVowels(String s, int k) {
    Set<Character> vowels = Set.of('a','e','i','o','u');
    int left = 0;
    int currlen = 0;
    int maxlen = 0;

    for(int i = 0; i < k; i++){ 
        if(vowels.contains(s.charAt(i))){
	    currlen++;
	    }	
    }
	maxlen = currlen;
    for(int right = k; right < s.length(); right++){
	    if(vowels.contains(s.charAt(left))){
	    currlen--;
        }
        if(vowels.contains(s.charAt(right))){
	    currlen++;
        }
    left++;
    maxlen = Math.max(maxlen, currlen);
    }
    return maxlen;
    }
}
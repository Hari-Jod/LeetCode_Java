class Solution {
    public void reverseString(char[] s) {
     int n = s.length;
     int i = 0;   
     int j = n - 1;
     char temp;
     while(i < j){
        temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        i++;
        j--;
     }
    }
}
public class Solution {
    public String generateString(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int totalLen = n + m - 1;
        char[] res = new char[totalLen];
        boolean[] fixed = new boolean[totalLen];
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == 'T') {
                for (int j = 0; j < m; j++) {
                    int idx = i + j;
                    if (res[idx] != 0 && res[idx] != str2.charAt(j)) {
                        return "";
                    }
                    res[idx] = str2.charAt(j);
                    fixed[idx] = true;
                }
            }
        }
        for (int i = 0; i < totalLen; i++) {
            if (res[i] == 0) {
                res[i] = 'a';
            }
        }
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == 'F') {
                while (isMatch(res, i, str2)) {
                    boolean changed = false;
                    for (int j = m - 1; j >= 0; j--) {
                        int idx = i + j;
                        if (!fixed[idx]) {
                            if (res[idx] == 'a') {
                                res[idx] = 'b';
                            } else {
                                res[idx] = (str2.charAt(j) == 'a') ? 'b' : 'a';
                            }
                            changed = true;
                            break;
                        }
                    }
                    if (!changed) return ""; 
                }
            }
        }
        for (int i = 0; i < n; i++) {
            boolean match = isMatch(res, i, str2);
            if (str1.charAt(i) == 'T' && !match) return "";
            if (str1.charAt(i) == 'F' && match) return "";
        }
        return new String(res);
    }
    private boolean isMatch(char[] res, int start, String str2) {
        for (int j = 0; j < str2.length(); j++) {
            if (res[start + j] != str2.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
import java.util.*;
class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> result = new ArrayList<>();
        for (String q : queries) {
            for (String d : dictionary) {
                if (canTransform(q, d)) {
                    result.add(q);
                    break; 
                }
            }
        }
        return result;
    }
    private boolean canTransform(String q, String d) {
        int diffs = 0;
        for (int i = 0; i < q.length(); i++) {
            if (q.charAt(i) != d.charAt(i)) {
                diffs++;
            }
            if (diffs > 2) {
                return false;
            }
        }
        return true;
    }
}
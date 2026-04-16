import java.util.*;
class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        List<Integer> result = new ArrayList<>();
        for (int qIdx : queries) {
            int val = nums[qIdx];
            List<Integer> indices = map.get(val);
            if (indices.size() == 1) {
                result.add(-1);
                continue;
            }
            int pos = Collections.binarySearch(indices, qIdx);
            int leftIdx = (pos == 0) ? indices.get(indices.size() - 1) : indices.get(pos - 1);
            int rightIdx = (pos == indices.size() - 1) ? indices.get(0) : indices.get(pos + 1);
            int distLeft = Math.abs(qIdx - leftIdx);
            distLeft = Math.min(distLeft, n - distLeft);
            int distRight = Math.abs(qIdx - rightIdx);
            distRight = Math.min(distRight, n - distRight);
            result.add(Math.min(distLeft, distRight));
        }
        return result;
    }
}
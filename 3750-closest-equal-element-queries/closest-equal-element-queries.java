import java.util.*;

class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;
        // 1. Group indices by their values: O(N)
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        List<Integer> result = new ArrayList<>();

        // 2. Process each query: O(M log N)
        for (int qIdx : queries) {
            int val = nums[qIdx];
            List<Integer> indices = map.get(val);

            // If no other occurrence exists
            if (indices.size() == 1) {
                result.add(-1);
                continue;
            }

            // 3. Find where the query index is in the list of indices
            int pos = Collections.binarySearch(indices, qIdx);

            // 4. Check the neighbors in the sorted list (Circularly)
            // Left neighbor (wrap around to the end if at start)
            int leftIdx = (pos == 0) ? indices.get(indices.size() - 1) : indices.get(pos - 1);
            // Right neighbor (wrap around to the start if at end)
            int rightIdx = (pos == indices.size() - 1) ? indices.get(0) : indices.get(pos + 1);

            // 5. Calculate circular distances
            int distLeft = Math.abs(qIdx - leftIdx);
            distLeft = Math.min(distLeft, n - distLeft);

            int distRight = Math.abs(qIdx - rightIdx);
            distRight = Math.min(distRight, n - distRight);

            result.add(Math.min(distLeft, distRight));
        }

        return result;
    }
}
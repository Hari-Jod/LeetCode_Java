import java.util.*;
class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            indexMap.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        int minDistance = Integer.MAX_VALUE;
        for (List<Integer> indices : indexMap.values()) {
            if (indices.size() < 3) continue;
            for (int h = 0; h < indices.size() - 2; h++) {
                int first = indices.get(h);
                int third = indices.get(h + 2);
                int currentDistance = 2 * (third - first);
                minDistance = Math.min(minDistance, currentDistance);
            }
        }
        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }
  }

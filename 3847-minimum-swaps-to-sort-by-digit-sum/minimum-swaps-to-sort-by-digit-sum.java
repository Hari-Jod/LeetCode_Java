import java.util.*;

class Solution {
    public int digi_sum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public int minSwaps(int[] nums) {
        int n = nums.length;
        Integer[] idx = new Integer[n];

        for (int i = 0; i < n; i++)
            idx[i] = i;

        Arrays.sort(idx, (a, b) -> {
            int x = digi_sum(nums[a]);
            int y = digi_sum(nums[b]);

            if (x != y)
                return x - y;

            return nums[a] - nums[b];
        });

        int swaps = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i] || idx[i] == i)
                continue;

            int j = i;
            int cycle = 0;

            while (!visited[j]) {
                visited[j] = true;
                j = idx[j];
                cycle++;
            }

            swaps += cycle - 1;
        }

        return swaps;
    }
}
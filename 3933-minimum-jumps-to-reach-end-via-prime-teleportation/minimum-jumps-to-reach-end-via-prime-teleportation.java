class Solution {

    public int minJumps(int[] nums) {

        int n = nums.length;

        if (n == 1) return 0;

        int max = 0;

        for (int x : nums) {
            max = Math.max(max, x);
        }

        // Smallest Prime Factor
        int[] spf = sieve(max);

        // prime -> indices divisible by prime
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            int val = nums[i];

            Set<Integer> factors = new HashSet<>();

            while (val > 1) {

                int p = spf[val];

                factors.add(p);

                while (val % p == 0) {
                    val /= p;
                }
            }

            for (int p : factors) {
                map.computeIfAbsent(p, k -> new ArrayList<>()).add(i);
            }
        }

        Queue<Integer> q = new LinkedList<>();

        boolean[] vis = new boolean[n];

        q.offer(0);

        vis[0] = true;

        int steps = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            while (size-- > 0) {

                int idx = q.poll();

                if (idx == n - 1) return steps;

                // left
                if (idx - 1 >= 0 && !vis[idx - 1]) {
                    vis[idx - 1] = true;
                    q.offer(idx - 1);
                }

                // right
                if (idx + 1 < n && !vis[idx + 1]) {
                    vis[idx + 1] = true;
                    q.offer(idx + 1);
                }

                // teleport
                int val = nums[idx];

                // only if prime
                if (val > 1 && spf[val] == val) {

                    if (map.containsKey(val)) {

                        for (int next : map.get(val)) {

                            if (!vis[next]) {
                                vis[next] = true;
                                q.offer(next);
                            }
                        }

                        // avoid repeated traversal
                        map.remove(val);
                    }
                }
            }

            steps++;
        }

        return -1;
    }

    private int[] sieve(int n) {

        int[] spf = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            spf[i] = i;
        }

        for (int i = 2; i * i <= n; i++) {

            if (spf[i] == i) {

                for (int j = i * i; j <= n; j += i) {

                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }

        return spf;
    }
}
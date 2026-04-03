import java.util.*;

class Solution {
    private Integer[][] memo;
    private int[][] robotData;
    private int[] sortedWalls;
    private int n;

    public int maxWalls(int[] robots, int[] distance, int[] walls) {
        n = robots.length;
        robotData = new int[n][2];
        for (int i = 0; i < n; i++) {
            robotData[i][0] = robots[i];
            robotData[i][1] = distance[i];
        }
        // Sort robots by position
        Arrays.sort(robotData, Comparator.comparingInt(a -> a[0]));
        // Sort walls for binary search
        Arrays.sort(walls);
        this.sortedWalls = walls;
        this.memo = new Integer[n][2];

        return dp(n - 1, 1); // Start from the last robot
    }

    private int dp(int i, int j) {
        if (i < 0) return 0;
        if (memo[i][j] != null) return memo[i][j];

        // Option 1: Fire Left
        int leftPos = robotData[i][0] - robotData[i][1];
        if (i > 0) {
            leftPos = Math.max(leftPos, robotData[i - 1][0] + 1);
        }
        int wallsLeft = countWalls(leftPos, robotData[i][0]);
        int resLeft = dp(i - 1, 0) + wallsLeft;

        // Option 2: Fire Right
        int rightPos = robotData[i][0] + robotData[i][1];
        if (i + 1 < n) {
            // Adjust right limit based on next robot's direction (j)
            int nextRobotLimit = (j == 0) ? (robotData[i + 1][0] - robotData[i + 1][1] - 1) : (robotData[i + 1][0] - 1);
            rightPos = Math.min(rightPos, nextRobotLimit);
        }
        int wallsRight = countWalls(robotData[i][0], rightPos);
        int resRight = dp(i - 1, 1) + wallsRight;

        return memo[i][j] = Math.max(resLeft, resRight);
    }

    private int countWalls(int start, int end) {
        if (start > end) return 0;
        int l = lowerBound(sortedWalls, start);
        int r = lowerBound(sortedWalls, end + 1);
        return r - l;
    }

    private int lowerBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) high = mid;
            else low = mid + 1;
        }
        return low;
    }
}
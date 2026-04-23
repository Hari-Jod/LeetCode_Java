// class Solution {
//     public long[] distance(int[] nums) {
//         int n = nums.length;
//         long [] arr = new long[n];
//         // int i = 0;
//         // while(i < n){
//         // int j = 0;
//         //     if(nums[i] == nums[j] && j < n){
//         //         arr[i] = Math.abs(i - j);
//         //             j++;
//         //     }
//         //     i++;
//         // }
//         for(int i = 0;i<n;i++){
//             for(int j = 0;j<n;j++){
//                 if(nums[i]== nums[j]){
//                     arr[i] += Math.abs(i - j);
//                 }
//         }
//         }
//         return arr;
//     }
// }
import java.util.*;
class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] res = new long[n];
        long[][] pairs = new long[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums[i];
            pairs[i][1] = i;
        }
        Arrays.sort(pairs, (a, b) -> Long.compare(a[0], b[0]));
        int i = 0;
        while (i < n) {
            int j = i;
            long totalSum = 0;
            while (j < n && pairs[j][0] == pairs[i][0]) {
                totalSum += pairs[j][1];
                j++;
            }
            int groupSize = j - i;
            long prefixSum = 0;
            int k = 0;
            while (k < groupSize) {
                long currentIdx = pairs[i + k][1];
                long suffixSum = totalSum - prefixSum - currentIdx;
                res[(int)currentIdx] = (k * currentIdx - prefixSum) + 
                                       (suffixSum - (long)(groupSize - 1 - k) * currentIdx);   
                prefixSum += currentIdx;
                k++;
            }
            i = j; 
        }
        return res;
    }
}
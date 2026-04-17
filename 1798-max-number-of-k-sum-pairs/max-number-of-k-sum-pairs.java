import java.util.*;
class Solution {
    public int maxOperations(int[] nums, int k) {
     Arrays.sort(nums);
     int n = nums.length;
     int i = 0;
     int count = 0;
     int j = n - 1;
     while(i < j){
            int sum = nums[i] + nums[j];
            if(sum == k){
                count++;
                i += 1;
                j -= 1;
            } else if(sum < k){
                i += 1;
            } else{
                j -= 1;
            }

        }
     return count;  
    }
}
class Solution {
    public int findGCD(int[] nums) {
    int smallest=Integer.MAX_VALUE,biggest=Integer.MIN_VALUE;
        for(int val:nums){
            if(val<smallest)smallest=val;
            if(val>biggest)biggest=val;
        }
        while (biggest != 0) {
            int temp = biggest;
            biggest = smallest % temp;
            smallest = temp;
        }
        return smallest;
    }
    
}
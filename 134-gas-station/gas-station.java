class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        // int m = cost.length;
        int gas1 = 0;
        int cost1 = 0;
        for(int i = 0;i<n;i++){
            gas1 += gas[i];
            cost1 += cost[i];
        }
        if(cost1 > gas1) return -1;
        int currgas = 0;
        int startidx = 0;
        for(int i = 0;i<n;i++){
            currgas += gas[i] - cost[i];
            if(currgas < 0){
                startidx = i+1;
                currgas = 0;
            }
        }
        return startidx;
    }
}
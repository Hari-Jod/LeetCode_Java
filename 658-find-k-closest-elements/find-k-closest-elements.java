class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        // int n = arr.length;
        List<Integer> list = new LinkedList<>();
        // for(int i = 0;i<n;i++){
        //     list.add(Math.abs(arr[i] - x));
        // }

        // int i = 0, j = n - 1;
        // while(i < n && j >= 0){
        //     if()
        // }
        int left = 0;
        int right = arr.length - 1;
        while(right - left + 1 > k){
            if(Math.abs(arr[left] - x) > Math.abs(arr[right] - x)){
                left++;
            } else {
                right--;
            }
        }
        for(int i = left; i <= right; i++){
            list.add(arr[i]);
        }
        return list;
    }
}
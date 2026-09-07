class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();

        int n = nums2.length;

        for (int i = 0; i < n; i++) {
            boolean found = false;

            for (int j = 0; j < nums1.length; j++) {
                if (nums1[j] == nums2[i]) {
                    found = true;
                    break;
                }
            }

            if (found) {
                list.add(nums2[i]);
            }
        }

        if (list.isEmpty()) {
            return new int[0];
        }

        List<Integer> res = new ArrayList<>();

        res.add(list.get(0));

        for (int i = 1; i < list.size(); i++) {
            if (!res.contains(list.get(i))) {
                res.add(list.get(i));
            }
        }

        int[] result = new int[res.size()];

        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }

        return result;
    }
}
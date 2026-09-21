class Solution:
    def findMedianSortedArrays(self, nums1: list[int], nums2: list[int]) -> float:
        res = []
        i = 0
        j = 0
        l1 = len(nums1)
        l2 = len(nums2)
        while i  < l1 and j < l2:
            if nums1[i] < nums2[j]:
                res.append(nums1[i])
                i += 1
            else:
                res.append(nums2[j])
                j += 1
        while i < l1:
            res.append(nums1[i])
            i += 1
        while j < l2:
            res.append(nums2[j])
            j += 1
        n = len(res)
        if n % 2 == 0:
            return (res[n//2] + res[n//2 - 1])/2
        return res[n//2]
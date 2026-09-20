class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            ans.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            ans.add(nums2[i]);
        }
        Collections.sort(ans);
        int size = ans.size();
        if (ans.size() % 2 == 0) {
            double median = (ans.get(size / 2 - 1) + ans.get(size / 2)) / 2.0;
            return median;
        }

        return ans.get(size / 2);

    }
}

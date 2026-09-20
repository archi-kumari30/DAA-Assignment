class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void mergeSort(int nums[], int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(nums, l, mid);
            mergeSort(nums, mid + 1, r);
            merge(nums, l, mid, r);
        }
    }

    public static void merge(int[] nums, int l, int m, int r) {
        int s1 = m - l + 1;
        int s2 = r - m;
        int[] left = new int[s1];
        int[] right = new int[s2];
        for (int i = 0; i < s1; i++) {
            left[i] = nums[l + i];
        }
        for (int i = 0; i < s2; i++) {
            right[i] = nums[m + 1 + i];
        }
        int i = 0, j = 0, k = l;
        while (i < s1 && j < s2) {
            if (left[i] <= right[j]) {
                nums[k] = left[i];
                i++;
            } else {
                nums[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < s1) {
            nums[k] = left[i];
            i++;
            k++;
        }
        while (j < s2) {
            nums[k] = right[j];
            j++;
            k++;
        }
    }
}

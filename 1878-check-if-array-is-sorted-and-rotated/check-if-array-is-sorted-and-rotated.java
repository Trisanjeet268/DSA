class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int[] nums1 = Arrays.copyOf(nums, n);

        Arrays.sort(nums1);
        for (int k = 0; k < n; k++) {

            if (Arrays.equals(nums, nums1)) {
                return true;
            }
            int first = nums1[0];
            for (int i = 0; i < n - 1; i++) {
                nums1[i] = nums1[i + 1];
            }
            nums1[n - 1] = first;
        }

        return false;
    }
}
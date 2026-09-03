class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean hasodd = false;
        boolean haseven = false;
        int minOdd = Integer.MAX_VALUE;

        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] % 2 == 0) {
                haseven = true;
            } else {
                hasodd = true;
                minOdd = Math.min(minOdd, nums1[i]);
            }
        }

        if (!haseven) {
            return true;
        }
        if (!hasodd) {
            return true;
        }


        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] % 2 == 0 && nums1[i] < minOdd) {
                return false;
            }
        }

        return true;
    }
}
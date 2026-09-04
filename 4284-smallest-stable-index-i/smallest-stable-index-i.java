class Solution {
    public int firstStableIndex(int[] nums, int k) {
         int instabilityScore;
        int max;
        int min ;
        int n=nums.length;
        for(int i=0;i< n;i++){
            max=nums[0];
            min=nums[i];
            for (int j = 0; j <= i; j++) {
                max = Math.max(max, nums[j]);
            }

            for (int j = i; j < n; j++) {
                min = Math.min(min, nums[j]);
            }

            instabilityScore=max-min;
            if(instabilityScore<=k){
                return i;
            }
        }
        return -1;
    }
}
class Solution {
    public int missingMultiple(int[] nums, int k) {
        int minimum=1;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=1;i<=nums.length+1;i++){
            minimum=k*i;
            if(!set.contains(minimum))
                return minimum;
        }
        return minimum * 2;
    }
}
class Solution {
    public int singleNumber(int[] nums) {
         Set<Integer> set=new HashSet<>();
        int i;
        Arrays.sort(nums);
        for( i=0;i<nums.length;i++){

            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        return set.iterator().next();
    }
}
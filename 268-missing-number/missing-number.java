class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer>set=new HashSet<>();
        int i;
        for( i=0;i<nums.length;i++){
            set.add(nums[i]);

        }
        for( i=0;i<nums.length;i++){
            if(!set.contains(i)){
                break;
            }
        }
        return i;
    }
}
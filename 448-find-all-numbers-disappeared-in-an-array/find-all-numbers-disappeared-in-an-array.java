class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
            Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);// Add all elements of nums in set
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){// compaire the index with the value
                list.add(i);// if the index not in the set, then add into list
            }
        }
        return list;
    }
}
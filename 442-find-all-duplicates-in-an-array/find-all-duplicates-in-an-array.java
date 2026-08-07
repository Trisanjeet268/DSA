class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         List<Integer> Answer=new ArrayList<>();
          Set<Integer> set=new HashSet<>();
          for(int i=0;i<nums.length;i++){
              if(!set.contains(nums[i])){
                  set.add(nums[i]);
              }else{
                  Answer.add(nums[i]);
              }
          }
          return Answer;
    }
}
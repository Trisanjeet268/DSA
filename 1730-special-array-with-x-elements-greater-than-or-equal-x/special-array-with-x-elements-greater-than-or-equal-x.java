class Solution {
    public int specialArray(int[] nums) {
          for(int x=0;x<=nums.length;x++){
           int count=0;
           for(int j=0;j<nums.length;j++){
               if(nums[j]>=x){
                   count++;
               }
           }
           if(count==x){
               return x;
           }
       }
       return -1;
    }
}
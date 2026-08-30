class Solution {
    public int minimumDeletions(int[] nums) {
         if(nums.length==1){
            return 1;
        }
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();
        int m=0,n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max){
                 m=i;
            }
            if(nums[i]==min){
                 n=i;
            }
        }

        int left = Math.min(m, n);
        int right = Math.max(m, n);
        int len = nums.length;

        int option1 = right + 1;
        int option2 = len - left;
        int option3 = (left + 1) + (len - right);

        return Math.min(option1, Math.min(option2, option3));
    }
}
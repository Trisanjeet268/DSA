class Solution {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);

    }   
    public long gcdSum(int[] nums) {
     int mxi=nums[0];
        long sum=0;
        int[]prefixGcd=new int[nums.length];
        for(int i=0;i< nums.length;i++){
            mxi= Math.max(mxi,nums[i]);
            prefixGcd[i]= gcd(mxi,nums[i]);
        }
        Arrays.sort(prefixGcd);
        int i=0;
        int j=prefixGcd.length-1;
        while(i<j){
            sum= sum+gcd(prefixGcd[i],prefixGcd[j]);
            i++;
            j--;
        }

        return sum;

    }
}
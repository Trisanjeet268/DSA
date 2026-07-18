class Solution {
    public static int gcd(int a, int b){
            if(b==0) return a;
             return gcd(b,a%b);
        }
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int GCD= gcd(nums[i],nums[j]);

        return GCD;
    }
}
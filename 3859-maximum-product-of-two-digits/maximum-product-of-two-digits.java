class Solution {
    public int maxProduct(int n) {
         String str=String.valueOf(n);
         int[] arr=new int[str.length()];
         for(int i=0;i<str.length();i++){
             arr[i]=str.charAt(i)-'0';
         }
         Arrays.sort(arr);
         int x=arr.length;
         int result=arr[x-1]*arr[x-2];
         return result;
    }
}
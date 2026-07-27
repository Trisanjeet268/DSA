class Solution {
    public int maxProduct(int n) {
         String str=String.valueOf(n);
         int[] arr=new int[str.length()];
         for(int i=0;i<str.length();i++){
             arr[i]=str.charAt(i)-'0';
         }
         int product=1;
         int maxp=0;
         for(int i=0;i<arr.length;i++){
             for(int j=i+1;j<arr.length;j++){
                 product= arr[i]*arr[j];
                 if(product>maxp){
                     maxp=product;
                 }
             }
         }
         return maxp;
    }
}
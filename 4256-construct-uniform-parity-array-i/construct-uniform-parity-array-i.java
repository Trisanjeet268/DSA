class Solution {
    public boolean uniformArray(int[] nums1) {
         boolean hasodd=false;
         boolean haseven=false;

         for(int i=0;i< nums1.length;i++){
             if(nums1[i]%2==0){
                 haseven=true;
             }else {
                 hasodd=true;
             }
         }
         if(hasodd==false){
             return true;
         }
         if(haseven == false){
             return true;
         }
         for(int i=0;i< nums1.length;i++){
             if(nums1[i]%2==0){
                 for(int j=0;j< nums1.length;j++){
                     if(nums1[j]%2!=0){
                         nums1[i]=nums1[i]-nums1[j];
                     }
                 }
             }
         }
         return true;
    }
}
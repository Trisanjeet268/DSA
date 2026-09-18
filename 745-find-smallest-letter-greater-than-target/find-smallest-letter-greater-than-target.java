class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char smallest='{';
        for(int i=0;i<letters.length;i++){
            if ( letters[i]>target && letters[i]<smallest){
                smallest=letters[i];
            }
        }
        if(smallest=='{'){
            return letters[0];
        }
        return smallest;
    }
}
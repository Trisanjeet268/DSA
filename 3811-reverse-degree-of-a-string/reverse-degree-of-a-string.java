class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int product;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {

            map.put(ch,'z'-ch+1);
        }
        for(int i=0;i<s.length();i++){
            product= map.get(s.charAt(i))*(i+1);
            sum+=product;
        }
        return sum;
    }
}
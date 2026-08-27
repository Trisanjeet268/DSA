class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] arr = new char[word1.length() + word2.length()];

        int i = 0;
        int k = 0;

        while (i < word1.length() && i < word2.length()) {
            arr[k++] = word1.charAt(i);
            arr[k++] = word2.charAt(i);
            i++;
        }

        while (i < word1.length()) {
            arr[k++] = word1.charAt(i);
            i++;
        }

        while (i < word2.length()) {
            arr[k++] = word2.charAt(i);
            i++;
        }

        return String.valueOf(arr);
    }
}
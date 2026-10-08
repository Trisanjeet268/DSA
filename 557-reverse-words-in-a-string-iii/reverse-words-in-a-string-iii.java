class Solution {
    public String reverseWords(String s) {
        String reverse = "";

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ' ') {
                String word = "";

                while (i < s.length() && s.charAt(i) != ' ') {
                    word = s.charAt(i) + word;
                    i++;
                }

                reverse += word;
            }

            if (i < s.length()) {
                reverse += " ";
            }
        }

        return reverse;
    }
}
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
              String[] words = (s1 + " " + s2).trim().split("\\s+");

        List<String> list = new ArrayList<>();
        List<String> res = new ArrayList<>();

        for (String word : words) {
            if (Collections.frequency(Arrays.asList(words), word) == 1) {
                if (!res.contains(word)) {
                    res.add(word);
                }
            }
        }

        return res.toArray(new String[0]);      
    }
}
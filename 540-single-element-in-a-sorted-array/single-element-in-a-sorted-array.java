class Solution {
    public int singleNonDuplicate(int[] nums) {
        int targetFrequency = 1;

        HashMap<Integer, Integer> map = new HashMap<>();


        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) == targetFrequency) {
                return key;
            }
        }
        return -1;
    }
}
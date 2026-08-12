class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answer = new int[nums.length];


        for (int i = 0; i < nums.length; i++) {
            answer[i] = nums[i];
        }
        Arrays.sort(nums);
        for (int i = 0; i < answer.length; i++) {

            for (int j = 0; j < nums.length; j++) {

                if (nums[j] == answer[i]) {
                    answer[i] = j;
                    break;
                }
            }
        }

        return answer;
    }
}
class Solution {
    public boolean rotateString(String s, String goal) {
        char[] arr = s.toCharArray();
        int n = arr.length;
          if (s.equals(goal)) {
        return true;
    }

        for (int j = 1; j < s.length(); j++) {
            char temp = arr[n - 1];

            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }

            arr[0] = temp;
            String s1 = new String(arr);
            if (s1.equals(goal)){
                return true;

              }

        }


        return false;
    }
}
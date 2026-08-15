class Solution {
    public static int SumOfSquare(int num){
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }

        return sum;

    }
    public  static boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();

        return check(n,set);
    }
    public static boolean check(int n, Set<Integer> set) {

        if (n == 1) {
            return true;
        }

        if (set.contains(n)) {
            return false;
        }

        set.add(n);

        int result = SumOfSquare(n);

        return check(result, set);
    }
}
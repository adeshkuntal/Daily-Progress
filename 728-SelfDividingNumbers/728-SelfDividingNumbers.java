// Last updated: 8/4/2025, 6:53:47 PM
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> r = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (find_number(i)) {
                r.add(i);
            }
        }
        return r;
    }
    public static boolean find_number(int i) {
        int n = i;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 0 || i % digit != 0) {
                return false;
            }
            n = n / 10;
        }
        return true;
    }
}
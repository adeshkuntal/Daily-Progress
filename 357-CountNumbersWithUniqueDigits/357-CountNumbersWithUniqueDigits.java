// Last updated: 8/4/2025, 6:55:45 PM
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;

        int total = 10;        // for n = 1
        int uniqueDigits = 9;  // choices for first digit (1-9)
        int available = 9;     // remaining digits to choose from

        for (int i = 2; i <= n && available > 0; i++) {
            uniqueDigits *= available;
            total += uniqueDigits;
            available--;
        }

        return total;
    }
}
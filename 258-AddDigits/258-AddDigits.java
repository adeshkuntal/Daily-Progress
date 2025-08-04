// Last updated: 8/4/2025, 6:56:23 PM
class Solution {
    public int addDigits(int n) {
        if(n==0){
            return 0;
        }
        if(n<=9){
            return n;
        }
        int sq = n;
        while (sq > 9) {
            sq = find_sum(sq);
            if (sq <=9 ) {
                return sq;
            }
        }
        return 0;
    }

    public static int find_sum(int n) {
        int sq = 0;
        String s = Integer.toString(n);
        for (char i : s.toCharArray()) {
            sq += Character.getNumericValue(i);
        }
        return sq;
    }
}
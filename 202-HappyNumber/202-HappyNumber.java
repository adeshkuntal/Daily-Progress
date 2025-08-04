// Last updated: 8/4/2025, 6:56:57 PM
class Solution {
    public boolean isHappy(int n) {
        if(n==1){
            return true;
        }
        boolean flag = false;
        int sq = n;
        while (sq != 1 && sq!=4) {
            sq = find_sum(sq);
            if (sq == 1) {
                flag = true;
                break;
            }
        }
        return flag;
    }
    public static int find_sum(int n) {
        int sq = 0;
        String s = Integer.toString(n);
        for (char i : s.toCharArray()) {
            sq += Math.pow(Character.getNumericValue(i), 2);
        }
        return sq;
    }
}
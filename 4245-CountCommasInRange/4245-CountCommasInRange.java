// Last updated: 3/25/2026, 10:01:25 PM
class Solution {
    public int countCommas(int n) {
        if(n>= 1000){
            return n-999;
        }
        return 0;
    }
}
// Last updated: 8/4/2025, 6:55:27 PM
class Solution {
    public int arrangeCoins(int n) {
        int a = 1;
        int count = 0;
        while(a<=n){
            n = n-a;
            a = a+1;
            count +=1;
        }
        return count;
    }
}
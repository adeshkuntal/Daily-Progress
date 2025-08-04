// Last updated: 8/4/2025, 6:49:45 PM
class Solution {
    public int sumBase(int n, int k) {
        String base = "";

        if (n == 0) {
            base = "0";
        } else {
            while (n > 0) {
                int remainder = n % k;
                base = remainder + base;
                n = n / k;
            }
        }

        int ans = 0;
        for(int i=0; i<base.length(); i++){
            ans += base.charAt(i) - '0';

        }

        return ans;
    }
}
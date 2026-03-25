// Last updated: 3/25/2026, 10:01:15 PM
class Solution {
    public long countCommas(long n) {
        long ans = 0;
        long start = 1000;
        int commas = 1;
        while(start <= n){
            long end = start*1000-1;
            long count = Math.min(n,end)-start+1;

            if(count > 0){
                ans += count*commas;
            }

            start *= 1000;
            commas++;
        }

        return ans;
    }
}
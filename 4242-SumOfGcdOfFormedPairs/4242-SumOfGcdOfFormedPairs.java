// Last updated: 3/25/2026, 10:01:23 PM
class Solution {
    public int gcd(int a,int b){
        while(b != 0){
            int t = a%b;
            a = b;
            
            b = t;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int mx = nums[0];
        for(int i=0; i<n; i++){
            mx = Math.max(mx,nums[i]);
            prefix[i] = gcd(nums[i],mx);
        }

        Arrays.sort(prefix);
        int l = 0;
        int r = n-1;
        long sum = 0;

        while(l < r){
            sum += gcd(prefix[l],prefix[r]);
            l++;
            r--;
        }
        return sum;
    }
}
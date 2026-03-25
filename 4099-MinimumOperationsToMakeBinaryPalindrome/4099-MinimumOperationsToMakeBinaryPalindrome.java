// Last updated: 3/25/2026, 10:01:49 PM
class Solution {
    public int[] minOperations(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] rave = nums;
        for(int i=0; i<n; i++){
            int v = rave[i];
            if(isPal(v)){
                ans[i] = 0;
                continue;
            }
            int d = 1;
            while(true){
                int low = v - d;
                int high = v + d;
                if(low >= 0 && isPal(low)){
                    ans[i] = d;
                    break;
                }
                if(isPal(high)){
                    ans[i] = d;
                    break;
                }
                d++;
            }
        }

        return ans;
    }

    public static boolean isPal(int x){
        String s = Integer.toBinaryString(x);
        int l = 0;
        int r = s.length() - 1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
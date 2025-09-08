// Last updated: 9/8/2025, 11:53:42 AM
class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] ans = new int[2];
        for(int i=1; i<= n/2; i++){
            int a = i;
            for(int j=1; j<=n; j++){
                int b = j;
                if(a + b == n && noZero(a) && noZero(b)){
                    ans[0] = a;
                    ans[1] = b;
                    return ans;
                }
            }
        }
        return ans;
    }

    private boolean noZero(int x) {
        while(x > 0){
            if(x % 10 == 0) return false;
            x /= 10;
        }
        return true;
    }
}

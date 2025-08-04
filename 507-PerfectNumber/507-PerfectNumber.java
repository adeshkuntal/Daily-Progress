// Last updated: 8/4/2025, 6:54:53 PM
class Solution {
    public boolean checkPerfectNumber(int n) {
        int c = 0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                c+=i;
            }
        }
        return n==c;
    }
}
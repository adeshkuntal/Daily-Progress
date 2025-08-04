// Last updated: 8/4/2025, 6:56:35 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1 || n==2){
            return true;
        }
        double s = Math.sqrt(n);
        for(int i=2;i<=s+1;i++){
            if(Math.pow(2,i)==n){
                return true;
            }
        }
        return false;
    }
}
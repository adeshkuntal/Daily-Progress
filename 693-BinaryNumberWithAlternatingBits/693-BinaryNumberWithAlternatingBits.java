// Last updated: 8/4/2025, 6:54:00 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
        if(n==1){
            return true;
        }
        String s = "";
        while (n > 0){
            int a = n%2;
            n = n/2;
            s = a + s;
        }
        boolean ans = false;
        for(int i=0; i<s.length()-1; i++){
            if((s.charAt(i)=='1' && s.charAt(i+1)=='0') || (s.charAt(i)=='0' && s.charAt(i+1)=='1')){
                ans = true;
            }
            else {
                return false;
            }
        }
        return ans;
    }
}
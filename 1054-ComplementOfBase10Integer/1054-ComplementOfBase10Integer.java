// Last updated: 8/4/2025, 6:52:20 PM
class Solution {
    public int bitwiseComplement(int n) {
        if(n==0){
            return 1;
        }
        String s = "";
        while (n > 0){
            int a = n%2;
            n = n/2;
            s = a + s;
        }
        String new_s = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                new_s+='0';
            }
            else {
                new_s+='1';
            }
        }
        int ans = 0;
        for(int i = 0; i < new_s.length(); i++){
            if(new_s.charAt(i) != '0'){
                int a = (int) Math.pow(2, new_s.length() - 1 - i);
                ans += a;
            }
        }
        return ans;
    }
}
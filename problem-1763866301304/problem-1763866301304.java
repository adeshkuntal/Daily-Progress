// Last updated: 11/23/2025, 8:21:41 AM
class Solution {
    public long sumAndMultiply(int n) {
        int sum = 0;
        String s = String.valueOf(n);
        String str = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '0'){
                continue;
            }
            else{
                str += s.charAt(i);
                int x = s.charAt(i) - '0';
                sum += x;
            }
        }
        if(str.length() == 0){
            str = "0";
        }
        long x = Long.parseLong(str);
        return x*sum;
        
    }
}
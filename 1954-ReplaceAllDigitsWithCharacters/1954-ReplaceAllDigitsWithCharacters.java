// Last updated: 8/4/2025, 6:49:49 PM
class Solution {
    public String replaceDigits(String s) {
        String ans = "";
        for(int i=0; i<s.length(); i++){
            if(i%2==0){
                ans+=s.charAt(i);
            }
            else {
                int ascii = (int) s.charAt(i-1);
                int digit = Integer.parseInt(String.valueOf(s.charAt(i)));
                int x = ascii + digit;
                ans+= (char) x;
            }
        }

        return ans;
    }
}
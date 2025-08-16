// Last updated: 8/16/2025, 11:47:10 AM
class Solution {
    public int maximum69Number (int num) {
        String str = Integer.toString(num);
        String ans = "";
        int count = 1;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='6' && count==1){
                ans = ans+'9';
                count--;
            }
            else{
                ans = ans+str.charAt(i);
            }
        }

        int n = Integer.parseInt(ans);
        return n;
    }
}
// Last updated: 9/4/2025, 7:17:02 PM
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
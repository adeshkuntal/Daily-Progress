// Last updated: 8/14/2025, 7:57:38 PM
class Solution {
    public String largestGoodInteger(String num) {
        String ans = "";
        int a = 0;
        for(int i=0; i<num.length()-2; i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i+1)==num.charAt(i+2)){
                if(num.charAt(i)-'0' >= a){
                    ans = "";
                    a = num.charAt(i)-'0';
                    ans+=num.charAt(i);
                    ans+=num.charAt(i+1);
                    ans+=num.charAt(i+2);
                }
            }
        }

        return ans;
    }
}
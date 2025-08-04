// Last updated: 8/4/2025, 6:50:44 PM
class Solution {
    public String thousandSeparator(int n) {
        String s = Integer.toString(n);
        String ans = "";
        int z = 0;
        for(int i=s.length()-1; i>=0; i--){
            if(z==3){
                ans="."+ans;
                z=0;
            }
            ans=s.charAt(i)+ans;
            z+=1;
        }

        return ans;
    }
}
// Last updated: 8/4/2025, 6:51:11 PM
class Solution {
    public int maxPower(String s) {
        int count = 1;
        int ans = 0;
        char a = s.charAt(0);
        for(int i=1; i<s.length(); i++){
            if(a==s.charAt(i)){
                count+=1;
            }
            else{
                if(count>ans){
                    ans = count;
                }
                a = s.charAt(i);
                count = 1;
            }
        }

        if(count > ans){
            ans = count;
        }

        return ans;
    }
}

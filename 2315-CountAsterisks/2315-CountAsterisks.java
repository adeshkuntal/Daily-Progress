// Last updated: 8/15/2025, 11:31:13 AM
class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '|'){
                ans++;
            } else if(s.charAt(i) == '*' && ans % 2 == 0){
                count++;
            }
        }

        return count;
    }
}
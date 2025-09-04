// Last updated: 9/4/2025, 7:16:10 PM
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
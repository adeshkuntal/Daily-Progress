// Last updated: 8/4/2025, 6:50:15 PM
class Solution {
    public int numberOfMatches(int n) {
        int matches = 0;
        int teamAdvance = 0;
        int count = 0;
        while(n > 1){
            if(n % 2 == 0){
                matches = n / 2;
                teamAdvance = n / 2;
                count += matches;
                n = teamAdvance;
            } else {
                matches = (n - 1) / 2;
                teamAdvance = ((n - 1) / 2) + 1;
                count += matches;
                n = teamAdvance;
            }
        }

        return count;
    }
}
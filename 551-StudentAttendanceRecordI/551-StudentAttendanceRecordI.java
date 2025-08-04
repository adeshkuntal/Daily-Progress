// Last updated: 8/4/2025, 6:54:35 PM
class Solution {
    public boolean checkRecord(String s) {
        int CA = 0;  // Counter for 'A's
        int CL = 0;  // Counter for consecutive 'L's

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'A') {
                CA++;
                // Reset the consecutive 'L' counter
                CL = 0;
            } else if(s.charAt(i) == 'L') {
                CL++;
                // If there are three consecutive 'L's
                if(CL >= 3) {
                    return false;
                }
            } else {
                // Reset the consecutive 'L' counter
                CL = 0;
            }

            // If there are more than one 'A'
            if(CA >= 2) {
                return false;
            }
        }

        return true;
    }
}
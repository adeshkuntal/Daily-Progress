// Last updated: 8/4/2025, 6:54:10 PM
class Solution {
    public boolean judgeCircle(String moves) {
        int vertical = 0; // Tracks vertical movement
        int horizontal = 0; // Tracks horizontal movement

        for (int i = 0; i < moves.length(); i++) {
            char ch = moves.charAt(i);
            if (ch == 'U') {
                vertical += 1;
            } else if (ch == 'D') {
                vertical -= 1;
            } else if (ch == 'R') {
                horizontal += 1;
            } else if (ch == 'L') {
                horizontal -= 1;
            }
        }

        // If both vertical and horizontal sums are zero, robot returns to origin
        return vertical == 0 && horizontal == 0;
    }
}
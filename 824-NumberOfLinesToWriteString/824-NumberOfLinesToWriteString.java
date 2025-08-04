// Last updated: 8/4/2025, 6:53:19 PM
class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int totalLines = 1; 
        int currentWidth = 0; 

        for (char c : s.toCharArray()) {
            int width = widths[c - 'a']; 

            if (currentWidth + width > 100) {
                totalLines++;
                currentWidth = width;
            } else {
                currentWidth += width;
            }
        }

        return new int[]{totalLines, currentWidth};
    }
}
// Last updated: 8/4/2025, 6:50:04 PM
class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int maxLen = 0;
        int count = 0;
        for(int i=0; i<rectangles.length; i++){
            int a = Math.min(rectangles[i][0],rectangles[i][1]);
            if(a>maxLen){
                maxLen = a;
            }
        }
        for(int i=0; i<rectangles.length; i++){
            if(Math.min(rectangles[i][0], rectangles[i][1]) == maxLen){
                count+=1;
            }
        }

        return count;
    }
}
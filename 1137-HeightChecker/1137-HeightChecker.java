// Last updated: 8/4/2025, 6:52:05 PM
class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        Arrays.sort(expected);
        int count = 0;
        for(int i=0; i< heights.length; i++){
            if(heights[i]!=expected[i]){
                count+=1;
            }
        }
        return count;
    }
}
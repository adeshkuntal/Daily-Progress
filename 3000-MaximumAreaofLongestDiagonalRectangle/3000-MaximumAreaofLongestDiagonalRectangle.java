// Last updated: 8/26/2025, 8:08:45 PM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxdiagonallength=-1;
        int marea=-1;
        for(int[] dm:dimensions){
                int length=dm[0];
                int width=dm[1];
                int area=length*width;
                int dl=length*length+width*width;
               if(dl>maxdiagonallength){
                maxdiagonallength=dl;
                marea=area;
             }else if(dl==maxdiagonallength && area>marea){
                marea=area;
            }
        }
        return marea;

    }
}
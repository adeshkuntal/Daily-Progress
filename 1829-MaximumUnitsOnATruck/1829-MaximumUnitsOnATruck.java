// Last updated: 8/4/2025, 6:50:08 PM
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int ans = 0;

        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        for(int i=0; i<boxTypes.length; i++){
            if(boxTypes[i][0]<truckSize){
                truckSize-=boxTypes[i][0];
                ans+=boxTypes[i][0]*boxTypes[i][1];
            }
            else{
                ans+=truckSize*boxTypes[i][1];
                break;
            }
        }

        return ans;
    }
}
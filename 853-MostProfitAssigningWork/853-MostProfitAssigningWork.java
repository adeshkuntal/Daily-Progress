// Last updated: 8/4/2025, 6:53:06 PM
class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int total = 0;
        int index = 0;
        for(int i=0; i<worker.length; i++){
            int a = worker[i];
            int maxProfit = 0;
            for(int j=0; j<difficulty.length; j++){
                if(difficulty[j] <= a && profit[j] > maxProfit){
                    maxProfit = profit[j];
                }
            }
            total += maxProfit;
        }
        return total;
    }
}
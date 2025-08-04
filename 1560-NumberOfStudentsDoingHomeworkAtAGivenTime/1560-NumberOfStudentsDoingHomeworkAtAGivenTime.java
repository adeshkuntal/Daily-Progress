// Last updated: 8/4/2025, 6:51:07 PM
class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;

        for(int i=0; i<startTime.length; i++){
            int a = startTime[i];
            int b = endTime[i];
            for(int k=a; k<=b; k++){
                if(k==queryTime){
                    count+=1;
                }
            }
        }

        return count;
    }
}
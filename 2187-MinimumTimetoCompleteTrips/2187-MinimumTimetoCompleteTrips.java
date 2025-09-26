// Last updated: 9/26/2025, 11:11:00 PM
class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        Arrays.sort(time);

        long lo = 1;
        long hi = (long)time[0] * totalTrips;
        while(lo < hi){
            long mid = lo + (hi - lo) / 2;
            long count = 0;
            for (int t : time) {
                count += mid / t;
            }
            if(count >= totalTrips){
                hi = mid;
            }
            else{
                lo = mid + 1;
            }
        }

        return lo;
    }
}

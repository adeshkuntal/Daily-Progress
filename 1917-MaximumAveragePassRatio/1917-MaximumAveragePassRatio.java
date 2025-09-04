// Last updated: 9/4/2025, 7:16:23 PM
class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Double.compare(
                (double)(b[0] + 1) / (b[1] + 1) - (double)b[0] / b[1],
                (double)(a[0] + 1) / (a[1] + 1) - (double)a[0] / a[1]
            )
        );
        for (int[] c : classes)
            pq.offer(c);
        while (extraStudents-- > 0){
            int[] c = pq.poll();
            c[0]++;
            c[1]++;
            pq.offer(c);
        }
        double sum = 0.0;
        for (int[] c : classes){
            sum += (double)c[0] / c[1];
        }
        return sum / classes.length;
    }
}
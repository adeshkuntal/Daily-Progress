// Last updated: 8/4/2025, 6:51:02 PM
class Solution {
    public double average(int[] salary) {
        int max = salary[0];
        int min = salary[0];
        int total = 0;

        for (int i = 0; i < salary.length; i++) {
            if (salary[i] > max) max = salary[i];
            if (salary[i] < min) min = salary[i];
            total += salary[i];
        }

        double ans = (double)(total - max - min) / (salary.length - 2);
        return ans;
    }
}

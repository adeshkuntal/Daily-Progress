// Last updated: 8/4/2025, 6:53:08 PM
class Solution {
    public int numFriendRequests(int[] ages) {
        int[] count = new int[121];
        for (int age : ages) {
            count[age]++;
        }

        int total = 0;
        for (int a = 1; a <= 120; a++) {
            for (int b = 1; b <= 120; b++) {
                if (count[a] == 0 || count[b] == 0) continue;
                if (b <= 0.5 * a + 7) continue;
                if (b > a) continue;
                if (b > 100 && a < 100) continue;
                if (a == b) total += count[a] * (count[a] - 1);
                else total += count[a] * count[b];
            }
        }
        return total;
    }
}

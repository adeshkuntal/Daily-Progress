// Last updated: 8/4/2025, 6:52:53 PM
class Solution {
    public int binaryGap(int n) {
        String s = "";
        while (n > 0){
            int a = n%2;
            n = n/2;
            s = a + s;
        }
        int last = -1;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                if (last != -1) {
                    int distance = i - last;
                    max = Math.max(max, distance);
                }
                last = i;
            }
        }
        return max;
    }
}
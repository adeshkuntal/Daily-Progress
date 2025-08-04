// Last updated: 8/4/2025, 6:54:05 PM
class Solution {
    public int calPoints(String[] ops) {
        int[] r = new int[ops.length];
        int a = 0;
        for (int i = 0; i < ops.length; i++) {
            if (ops[i].equals("C")) {
                a -= 1;
                r[a] = 0;
            } else if (ops[i].equals("D")) {
                r[a] = r[a - 1] * 2;
                a += 1;
            } else if (ops[i].equals("+")) {
                r[a] = r[a - 1] + r[a - 2];
                a += 1;
            } else {
                r[a] = Integer.parseInt(ops[i]);
                a += 1;
            }
        }
        int ans = 0;
        for (int i = 0; i < a; i++) {
            ans+=r[i];
        }
        return ans; 
    }
}
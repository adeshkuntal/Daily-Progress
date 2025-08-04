// Last updated: 8/4/2025, 6:54:59 PM
class Solution {
    public int[] nextGreaterElement(int[] num1, int[] num2) {
        int[] r = new int[num1.length];

        for (int i = 0; i < num1.length; i++) {
            boolean found = false;
            for (int j = 0; j < num2.length; j++) {
                if (num1[i] == num2[j]) {
                    found = true;
                    boolean nextGreaterFound = false;
                    for (int k = j + 1; k < num2.length; k++) {
                        if (num2[k] > num2[j]) {
                            r[i] = num2[k];
                            nextGreaterFound = true;
                            break;
                        }
                    }
                    if (!nextGreaterFound) {
                        r[i] = -1;
                    }
                }
            }
            if (!found) {
                r[i] = -1; 
            }
        }
        return r;
    }
}
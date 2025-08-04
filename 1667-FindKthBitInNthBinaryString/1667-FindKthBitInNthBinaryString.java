// Last updated: 8/4/2025, 6:50:42 PM
class Solution {
    public char findKthBit(int n, int k) {
        return findKthBitUtil(n, k);
    }

    private char findKthBitUtil(int n, int k) {
        if (n == 1) {
            return '0';
        }

        int length = (1 << n) - 1; // Length of Sn is 2^n - 1
        int mid = length / 2 + 1; // Mid point of Sn

        if (k == mid) {
            return '1'; // The middle element is always '1'
        } else if (k < mid) {
            return findKthBitUtil(n - 1, k); // If k is in the first half
        } else {
            // If k is in the second half, find the mirror position and invert the result
            return invert(findKthBitUtil(n - 1, length - k + 1));
        }
    }

    private char invert(char bit) {
        return bit == '0' ? '1' : '0';   
    }
}
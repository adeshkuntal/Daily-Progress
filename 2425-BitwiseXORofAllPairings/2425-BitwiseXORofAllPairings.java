// Last updated: 1/21/2026, 11:51:52 AM
1class Solution {
2    public int xorAllNums(int[] nums1, int[] nums2) {
3        int xor = 0;
4        if (nums2.length % 2 == 1) {
5            for (int i = 0; i < nums1.length; i++) {
6                xor ^= nums1[i];
7            }
8        }
9        
10        if (nums1.length % 2 == 1) {
11            for (int i = 0; i < nums2.length; i++) {
12                xor ^= nums2[i];
13            }
14        }
15        return xor;
16    }
17}
18
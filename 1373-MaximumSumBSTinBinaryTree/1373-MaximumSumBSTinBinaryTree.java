// Last updated: 2/10/2026, 12:47:18 PM
1class Solution {
2
3    int max = 0;
4
5    public int maxSumBST(TreeNode root) {
6        dfs(root);
7        return max;
8    }
9
10    private int[] dfs(TreeNode node) {
11        if (node == null) {
12            return new int[]{1, Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
13        }
14
15        int[] left = dfs(node.left);
16        int[] right = dfs(node.right);
17
18        if (left[0] == 1 && right[0] == 1 && node.val > left[2] && node.val < right[1]) {
19            int sum = left[3] + right[3] + node.val;
20            max = Math.max(max, sum);
21
22            int min = Math.min(node.val, left[1]);
23            int maxVal = Math.max(node.val, right[2]);
24
25            return new int[]{1, min, maxVal, sum};
26        }
27
28        return new int[]{0, 0, 0, 0};
29    }
30}
31
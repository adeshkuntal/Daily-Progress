// Last updated: 2/9/2026, 12:32:35 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    long MOD = 1000000007L;
18    long ans = 0;
19
20    private long dfs(TreeNode node) {
21        if (node == null){
22            return 0;
23        }
24        node.val += dfs(node.left) + dfs(node.right);
25        return node.val;
26    }
27
28    public int maxProduct(TreeNode root) {
29        long total = dfs(root);
30        Queue<TreeNode> q = new LinkedList<>();
31        q.add(root);
32
33        while (!q.isEmpty()) {
34            TreeNode node = q.poll();
35            if (node == null){
36                continue;
37            }
38
39            long cur = (total - node.val) * node.val;
40            ans = Math.max(ans, cur);
41            if (node.left != null){
42                q.add(node.left);
43            }
44            if (node.right != null){
45                q.add(node.right);
46            }
47        }
48        return (int)(ans % MOD);
49    }
50}
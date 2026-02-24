// Last updated: 2/24/2026, 7:02:04 PM
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
17    public boolean isSymmetric(TreeNode root) {
18        if(root == null){
19            return true;
20        }
21        return check(root.left, root.right);
22    }
23
24    public boolean check(TreeNode a, TreeNode b){
25        if(a == null && b == null){
26            return true;
27        }
28        if(a == null || b == null){
29            return false;
30        }
31        if(a.val != b.val){
32            return false;
33        }
34
35        return check(a.left, b.right) && check(a.right, b.left);
36    }
37}
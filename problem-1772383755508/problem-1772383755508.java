// Last updated: 3/1/2026, 10:19:15 PM
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
17    TreeNode nextNode = null;
18    public void flatten(TreeNode root) {
19        if(root == null){
20            return;
21        }
22        flatten(root.right);
23        flatten(root.left);
24
25        root.left = null;
26        root.right = nextNode;
27        nextNode = root;
28
29    }
30}
// Last updated: 2/13/2026, 9:43:46 PM
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
17    public int diameterOfBinaryTree(TreeNode root) {
18        if(root == null){
19            return 0;
20        }
21        int diam1 = diameterOfBinaryTree(root.left);
22        int diam2 = diameterOfBinaryTree(root.right);
23        int diam3 = heightOfTree(root.left) + heightOfTree(root.right);
24
25        return Math.max(diam3,Math.max(diam1,diam2));
26    }
27    public static int heightOfTree(TreeNode root){
28        if(root == null){
29            return 0;
30        }
31        int leftheight = heightOfTree(root.left);
32        int rightHeight = heightOfTree(root.right);
33
34        int h = Math.max(leftheight,rightHeight)+1;
35        return h;
36    }
37}
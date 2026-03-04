// Last updated: 3/4/2026, 3:36:55 PM
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
16/**
17 * Definition for a binary tree node.
18 * public class TreeNode {
19 *     int val;
20 *     TreeNode left;
21 *     TreeNode right;
22 *     TreeNode() {}
23 *     TreeNode(int val) { this.val = val; }
24 *     TreeNode(int val, TreeNode left, TreeNode right) {
25 *         this.val = val;
26 *         this.left = left;
27 *         this.right = right;
28 *     }
29 * }
30 */
31class Solution {
32    TreeNode prev = null;
33    TreeNode first = null;
34    TreeNode sec = null;
35
36    public void recoverTree(TreeNode root) {
37        inorder(root);
38        int temp = first.val;
39        first.val = sec.val;
40        sec.val = temp;
41    }
42
43    public void inorder(TreeNode root){
44        if(root == null){
45            return;
46        }
47
48        inorder(root.left);
49
50        if(prev != null && root.val < prev.val){
51            if(first == null){
52                first = prev;
53            }
54            sec = root;
55        }
56
57        prev = root;
58
59        inorder(root.right);
60    }
61}
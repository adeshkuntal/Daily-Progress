// Last updated: 3/2/2026, 8:09:58 PM
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
17    int count = 0;
18    public int kthSmallest(TreeNode root, int k) {
19        if(root == null){
20            return -1;
21        }
22        if(root.left != null){
23            int leftAns = kthSmallest(root.left,k);
24            if(leftAns != -1){
25                return leftAns;
26            }
27        }
28        count++;
29        if(count == k){
30            return root.val;
31        }
32        if(root.right != null){
33            int righftAns = kthSmallest(root.right,k);
34            if(righftAns != -1){
35                return righftAns;
36            }
37        }
38
39        return -1;
40    }
41}